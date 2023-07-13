package com.spring.Quotes.service;

import com.spring.Quotes.model.Motivational;
import com.spring.Quotes.respository.MotivationalRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MotivationalService {

    @Autowired
    private MotivationalRespository motivationalRespository;

    public List<Motivational> getQuotes()
    {
       List<Motivational> quotes = motivationalRespository.findAll();

        return quotes;
    }
}
