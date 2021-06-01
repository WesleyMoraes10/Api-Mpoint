package br.com.informatica4.mobile_restaurante.domain.dto;

import br.com.informatica4.mobile_restaurante.domain.tblusuario;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class tblusuarioDTO {

    private Long id;
    private String ccVarFunc;
    private String ccLogin;
    private String ccNome;
    private String ccSenha;
    private String ccTipoAcesso;
    private String ccStatus;
    private String ccSistema;


    public static tblusuarioDTO create(tblusuario u){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(u, tblusuarioDTO.class);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
