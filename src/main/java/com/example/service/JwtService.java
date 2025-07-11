package com.example.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.function.Function;

public class JwtService {
    private SecretKey key;

//    @PostConstruct
//    public void init() {
//        byte[] bytes = Base64.getEncoder().withoutPadding().encode(secretKey.getBytes());
//        this.key = Keys.hmacShaKeyFor(bytes);
//    }

//    public String generate(Object subject, Purpose purpose, long expiry) {
//        return generate(subject, Map.of("purpose", purpose), expiry);
//    }

//    public String generate(Object subject, Map<String, Object> claims, long expiry) {
//        String token = Jwts.builder()
//                .subject(subject.toString())
//                .claims(claims)
//                .issuedAt(new Date(System.currentTimeMillis()))
//                .expiration(new Date(System.currentTimeMillis() + (expiry * 1000)))
//                .signWith(key)
//                .compact();
//
//        if (isLocal) System.out.println(token);
//
//        return token;
//    }

    public String extractSubject(String token) {
        return extractClaims(token, Claims::getSubject);
    }

    public Claims extractClaims(String token) {
        return extractAllClaims(token);
    }

    private <T> T extractClaims(String token, Function<Claims, T> resolver) {
        final Claims claims = extractAllClaims(token);
        return resolver.apply(claims);
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    private boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    private Date extractExpiration(String token) {
        return extractClaims(token, Claims::getExpiration);
    }
}
