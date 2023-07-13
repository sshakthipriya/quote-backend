package com.spring.Quotes.service;

import com.spring.Quotes.model.Emotional;
import com.spring.Quotes.model.Wisdom;
import com.spring.Quotes.respository.EmotionalRespository;
import com.spring.Quotes.respository.WisdomRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmotionalService {

    @Autowired
    private EmotionalRespository emotionalRespository;

    public List<Emotional> getQuotes()
    {
        List<Emotional> quotes = emotionalRespository.findAll();
        return quotes;
    }
}
