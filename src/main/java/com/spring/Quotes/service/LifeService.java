package com.spring.Quotes.service;

import com.spring.Quotes.model.Life;
import com.spring.Quotes.model.Wisdom;
import com.spring.Quotes.respository.LifeRespository;
import com.spring.Quotes.respository.WisdomRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LifeService {

    @Autowired
    private LifeRespository lifeRespository;

    public List<Life> getQuotes()
    {
        List<Life> quotes = lifeRespository.findAll();
        return quotes;
    }
}
