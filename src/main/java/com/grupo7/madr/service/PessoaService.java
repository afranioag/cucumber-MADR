package com.grupo7.madr.service;

import com.grupo7.madr.model.Pessoa;
import com.grupo7.madr.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa createPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa buscaPessoaPorId(Long id) {
        Optional<Pessoa> pessoaOpt = pessoaRepository.findById(id);
        if(pessoaOpt.isPresent()) {
            return pessoaOpt.get();
        }

        throw new RuntimeException("Não existe uma pessoa com o id " + id);
    }

}
