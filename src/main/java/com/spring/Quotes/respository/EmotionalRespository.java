package com.spring.Quotes.respository;

import com.spring.Quotes.model.Emotional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmotionalRespository extends JpaRepository<Emotional, Integer> {
}
