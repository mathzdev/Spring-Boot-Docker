package com.github.fenxlol.springbootdocker.domain;

import com.github.fenxlol.springbootdocker.domain.enums.Banco;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Usuario {

    @Id
    @Getter
    private String id;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String cep;

    @Getter
    @Setter
    private Banco banco;

    @Getter
    @Setter
    @DBRef
    private Agencia agencia;

    @Getter
    @Setter
    private Integer conta;

}
