package br.com.informatica4.mobile_restaurante.domain.dto;

import br.com.informatica4.mobile_restaurante.domain.tblcelular;
import lombok.Data;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.util.Date;

@Data
public class tblcelularDTO {

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

    public static tblcelularDTO create(tblcelular c){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(c, tblcelularDTO.class);
    }

}
