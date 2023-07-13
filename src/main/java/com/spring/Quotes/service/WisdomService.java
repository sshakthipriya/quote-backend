package com.spring.Quotes.service;

import com.spring.Quotes.model.Motivational;
import com.spring.Quotes.model.Wisdom;
import com.spring.Quotes.respository.WisdomRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WisdomService {

    @Autowired
    private WisdomRespository wisdomRespository;

    public List<Wisdom> getQuotes()
    {
        List<Wisdom> quotes = wisdomRespository.findAll();

        return quotes;
    }
}
