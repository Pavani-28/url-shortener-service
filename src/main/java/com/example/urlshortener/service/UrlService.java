
package com.example.urlshortener.service;

import com.example.urlshortener.model.UrlMapping;
import com.example.urlshortener.repository.UrlRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UrlService {

    private final UrlRepository repository;

    public UrlService(UrlRepository repository) {
        this.repository = repository;
    }

    public UrlMapping createShortUrl(String url) {
        String code = UUID.randomUUID().toString().substring(0,6);
        UrlMapping mapping = new UrlMapping(url, code);
        return repository.save(mapping);
    }

    public Optional<UrlMapping> getByCode(String code) {
        return repository.findByShortCode(code);
    }
}
