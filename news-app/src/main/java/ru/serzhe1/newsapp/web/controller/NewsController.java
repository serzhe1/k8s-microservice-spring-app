package ru.serzhe1.newsapp.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.serzhe1.newsapp.model.News;
import ru.serzhe1.newsapp.service.NewsService;
import ru.serzhe1.newsapp.web.dto.NewsDto;

import java.util.List;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsController {
    private final NewsService service;

    @GetMapping("/all")
    public List<News> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public News getById(@PathVariable Long id) {
        return service.getNewsById(id);
    }

    @PostMapping("/")
    public News save(@RequestBody NewsDto dto) {
        return service.save(dto);
    }
}
