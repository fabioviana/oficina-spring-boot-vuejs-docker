package com.hotmart.handson.controller;

import com.hotmart.handson.entity.Idea;
import com.hotmart.handson.repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/idea")
@CrossOrigin(origins = "*",
        methods = {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.OPTIONS, RequestMethod.POST, RequestMethod.PUT},
        allowedHeaders = "*")
public class IdeaController {

    @Autowired
    private IdeaRepository ideaRepository;

    @PostMapping
    public void salvar(@RequestBody @Valid Idea idea) {
        ideaRepository.save(idea);
    }

    @GetMapping
    public List<Idea> listar() {
        return ideaRepository.findAll();
    }
}
