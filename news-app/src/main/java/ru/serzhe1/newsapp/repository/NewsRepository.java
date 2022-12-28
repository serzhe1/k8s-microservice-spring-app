package ru.serzhe1.newsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.serzhe1.newsapp.model.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
}
