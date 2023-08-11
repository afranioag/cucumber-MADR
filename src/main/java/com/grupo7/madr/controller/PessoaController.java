package com.grupo7.madr.controller;

import com.grupo7.madr.model.Pessoa;
import com.grupo7.madr.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<Pessoa> criar(@RequestBody Pessoa pessoa) {

        pessoa = pessoaService.createPessoa(pessoa);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(pessoa.getId())
                .toUri();

        return ResponseEntity.created(uri).body(pessoa);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pessoa> buscaPorId(@PathVariable Long id) {
        return ResponseEntity.ok().body(pessoaService.buscaPessoaPorId(id));
    }
}
