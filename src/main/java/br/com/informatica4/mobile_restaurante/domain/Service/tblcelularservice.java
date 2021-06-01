package br.com.informatica4.mobile_restaurante.domain.Service;


import br.com.informatica4.mobile_restaurante.domain.Repository.tblcelularRepository;
import br.com.informatica4.mobile_restaurante.domain.tblcelular;
import br.com.informatica4.mobile_restaurante.domain.dto.tblcelularDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class tblcelularservice {

    @Autowired
    private tblcelularRepository rep;

    public List<tblcelularDTO> listaDados(){
        return rep.findAll().stream().map(tblcelularDTO::create).collect(Collectors.toList());

    }


    public tblcelularDTO save(tblcelular tblcelular) {
        Assert.isNull(tblcelular.getId(), "Não foi possivel inserir");
        return tblcelularDTO.create(rep.save(tblcelular));
    }
}
