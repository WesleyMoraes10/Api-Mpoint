package br.com.informatica4.mobile_restaurante.domain;

import lombok.Data;

import javax.persistence.*;

//@Entity
//@Data
public class VSL_FUNREST {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "ccNomFun")
    private String ccNomFun;

    @Column(name = "VarFunc")
    private String VarFunc;

    @Column(name = "cvCodInfCpl")
    private int cvCodInfCpl;

    @Column(name = "cvCodFun")
    private int cvCodFun;

    @Column(name = "cvCodCdc")
    private int cvCodCdc;

}
