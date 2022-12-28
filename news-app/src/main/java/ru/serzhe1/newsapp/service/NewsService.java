package ru.serzhe1.newsapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.serzhe1.newsapp.model.News;
import ru.serzhe1.newsapp.repository.NewsRepository;
import ru.serzhe1.newsapp.web.dto.NewsDto;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsService {
    private final NewsRepository repository;

    public News save(NewsDto dto) {
        News news = new News()
                .setBody(dto.getBody())
                .setTitle(dto.getTitle())
                .setDate(LocalDateTime.now());
        return repository.save(news);
    }

    public News getNewsById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<News> getAll() {
        return repository.findAll();
    }
}
