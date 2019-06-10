package com.github.fenxlol.springbootdocker.domain.enums;

public enum Banco {

    BANCO_DO_BRASIL("001", "BANCO_DO_BRASIL"),
    CAIXA_ECONOMICA_FEDERAL("104", "CAIXA_ECONOMICA_FEDERAL");

    /**
     * Campo codigo.
     */
    private String codigo;

    /**
     * Campo descricao.
     */
    private String descricao;

    /**
     * Instancia um novo objeto do tipo Banco.
     *
     * @param codigo    um codigo
     * @param descricao um descricao
     */
    Banco(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    /**
     * Retorna o codigo do banco
     *
     * @return codigo
     */
    public String getCodigo() {

        return codigo;
    }

    /**
     * Retorna a descricao do banco
     *
     * @return descricao
     */
    public String getDescricao() {

        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

}
