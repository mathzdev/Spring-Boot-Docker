package com.github.fenxlol.springbootdocker.domain;

import com.github.fenxlol.springbootdocker.domain.enums.Banco;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Agencia {

    @Id
    @Getter
    private String id;

    @Getter
    @Setter
    private Banco banco;

    @Getter
    @Setter
    private Integer codAgencia;

    @Getter
    @Setter
    private String endereco;

}