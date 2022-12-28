package ru.serzhe1.newsapp.web.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NewsDto {
    private String title;
    private String body;
}
