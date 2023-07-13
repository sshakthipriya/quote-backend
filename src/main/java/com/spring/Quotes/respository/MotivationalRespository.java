package com.spring.Quotes.respository;

import com.spring.Quotes.model.Motivational;
import com.spring.Quotes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotivationalRespository extends JpaRepository<Motivational, Integer> {
}
