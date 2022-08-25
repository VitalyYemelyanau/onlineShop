package com.by.bookservice.dto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.Year;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class BookDTO {
    private Long Id;
    private String title;
    private String publishYear;
    private BigDecimal price;
    private String author;
    private byte[] image;
    private String genre;
}
