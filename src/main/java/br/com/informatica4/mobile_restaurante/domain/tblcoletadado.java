package br.com.informatica4.mobile_restaurante.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class tblcoletadado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ccVarFunc;

    @Temporal(TemporalType.TIMESTAMP)
    private Date cdDataHora;

    @Temporal(TemporalType.TIMESTAMP)
    private Date cdDataHoraInte;

    private String ccManual;

    private String ccStatusInte;

    private String ccTipoRefeicao;

    private String ccTipoRest;

    private String ccUsuario;

    private String ccStatusInteForne_Usina = "N";

    private String ccNumCadastro;

    @Temporal(TemporalType.DATE)
    private Date cdDataColeta;

    @Temporal(TemporalType.DATE)
    private Date cdDataCadastro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
