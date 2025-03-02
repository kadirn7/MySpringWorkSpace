package com.kadirpasaoglu.jwt;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtService {
    public static final String SECRET_KEY ="8Db+GKd6tgrv+hW1MxwQw+pJX/Ailtq4N38ZFopTUSQ=";
    public String generateToken(UserDetails userDetails){
        Map<String,Object> claimsMap= new HashMap<>();
        claimsMap.put("role", "ADMIN");

        return Jwts.builder()
        .setClaims(claimsMap)
        .setSubject(userDetails.getUsername())
        .setIssuedAt(new Date())
        .setExpiration(new Date(System.currentTimeMillis()+ 1000*60*60*2)) //token bitiş süresi
        .signWith(getKey(),SignatureAlgorithm.HS256)
        .compact();
    }

    public <T> T exportToken(String token, Function<Claims,T> claimsFunction){
        //token verip içindeki bilgileri almak için gereken yapi 
        //mesela subject i çekeceksin bu lazım
        Claims claims=Jwts
        .parserBuilder()
        .setSigningKey(getKey()) 
        .build()
        .parseClaimsJws(token).getBody();

        return claimsFunction.apply(claims);
    }

    public String getUsernameByToken(String token){
        return  exportToken(token, Claims::getSubject);
    }

    public boolean isTokenExpired(String token){
         Date expiredDate= exportToken(token,Claims::getExpiration );
        return new Date().before(expiredDate);    //zaman tokendan kücükse hala token geçerlidir.
    }

    public Key getKey(){
        byte[] keyBytes= Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);

    }
}
