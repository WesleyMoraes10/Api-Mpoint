package br.com.informatica4.mobile_restaurante.domain.dto;

import br.com.informatica4.mobile_restaurante.domain.tblcoletadado;
import lombok.Data;
import org.modelmapper.ModelMapper;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
public class tblcoletadadoDTO {

    private Long id;
    private String ccVarFunc;
    private String cdDataHora;
    private String cdDataHoraInte;
    private String ccManual;;
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

    public static tblcoletadadoDTO create(tblcoletadado c){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(c, tblcoletadadoDTO.class);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
