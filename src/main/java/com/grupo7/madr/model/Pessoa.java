package com.grupo7.madr.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private Long id;

    private String nome;
    private String cpf;
    private int idade;
    private String telefone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
