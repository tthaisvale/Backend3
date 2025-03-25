package br.uniesp.si.techback.controller;


import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired //Iremos remover essa anotação na próxma aula
    private FilmeService service;

    @GetMapping
    public List<Filme> listar(){
        return service.listar();
    }

    @PostMapping
    public Filme incluir(@RequestBody Filme filme) {
        return service.cadastrar(filme);
    }
    @PutMapping
    public Filme alterar(@RequestBody Filme filme){
        return service.alterar(filme);
    }

}
