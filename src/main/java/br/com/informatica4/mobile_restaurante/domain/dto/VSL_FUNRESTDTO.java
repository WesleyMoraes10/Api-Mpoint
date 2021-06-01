package br.com.informatica4.mobile_restaurante.domain.dto;


import br.com.informatica4.mobile_restaurante.domain.VSL_FUNREST;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class VSL_FUNRESTDTO {

    private Long id;
    private String VarFunc;
    private String ccNomFun;
    private int cvCodInfCpl;
    private int cvCodFun;
    private int cvCodCdc;

    public static VSL_FUNRESTDTO create(VSL_FUNREST u){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(u, VSL_FUNRESTDTO.class);
    }
}
