package com.spring.Quotes.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="emotional")
public class Emotional {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="quote_text",length=1000)
    private String quotes;

    @Column(name="author",length=1000)
    private String author;

    @Column(name="title",length=1000)
    private String title;

    @Column(name="story",length=1000)
    private String story;

}
