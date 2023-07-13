package com.spring.Quotes.respository;

import com.spring.Quotes.model.Life;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LifeRespository extends JpaRepository<Life, Integer> {
}
