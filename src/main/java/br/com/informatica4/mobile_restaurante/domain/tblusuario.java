package br.com.informatica4.mobile_restaurante.domain;

import lombok.Data;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

//@Entity
//@Data
public class tblusuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ccVarFunc;
    private String ccLogin;
    private String ccNome;
    private String ccSenha;
    private String ccTipoAcesso;
    private String ccStatus;
    private String ccSistema;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
