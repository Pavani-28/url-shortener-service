
package com.example.urlshortener.controller;

import com.example.urlshortener.model.UrlMapping;
import com.example.urlshortener.service.UrlService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Map;

@RestController
public class UrlController {

    private final UrlService service;

    public UrlController(UrlService service) {
        this.service = service;
    }

    @PostMapping("/api/shorten")
    public UrlMapping shorten(@RequestBody Map<String,String> body) {
        return service.createShortUrl(body.get("url"));
    }

    @GetMapping("/{code}")
    public ResponseEntity<?> redirect(@PathVariable String code) {
        return service.getByCode(code)
                .map(mapping -> {
                    mapping.incrementClicks();
                    return ResponseEntity.status(302)
                            .location(URI.create(mapping.getOriginalUrl()))
                            .build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
