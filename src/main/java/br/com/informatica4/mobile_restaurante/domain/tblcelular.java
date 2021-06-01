package br.com.informatica4.mobile_restaurante.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class tblcelular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ccImei;
    private String ccCel_setor;

    @Temporal(TemporalType.DATE)
    private Date cdData_cadastro;
    private String ccRespon_setor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
