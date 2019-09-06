package com.hotmart.handson.repository;

import com.hotmart.handson.entity.Idea;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdeaRepository extends MongoRepository<Idea, String> {

    /**
     * Buscará por registros onde o titulo contenha o parâmetro informado
     * @param title
     * @return
     */
    List<Idea> findByTitleLike(String title);

}