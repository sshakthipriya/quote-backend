package com.spring.Quotes.respository;
import com.spring.Quotes.model.Wisdom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WisdomRespository extends JpaRepository<Wisdom, Integer> {
}
