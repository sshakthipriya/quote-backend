package com.spring.Quotes.service;

import com.spring.Quotes.model.Wisdom;
import com.spring.Quotes.model.Women;
import com.spring.Quotes.respository.WisdomRespository;
import com.spring.Quotes.respository.WomenRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WomenService {

    @Autowired
    private WomenRespository womenRespository;

    public List<Women> getQuotes()
    {
        List<Women> quotes = womenRespository.findAll();

        return quotes;
    }
}
