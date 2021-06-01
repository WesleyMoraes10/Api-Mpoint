package br.com.informatica4.mobile_restaurante.domain.Service;

import br.com.informatica4.mobile_restaurante.domain.Repository.VSL_FUNRESTRespository;
import br.com.informatica4.mobile_restaurante.domain.dto.VSL_FUNRESTDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class VSLService {

    @Autowired
    private VSL_FUNRESTRespository rep;

    public List<VSL_FUNRESTDTO> listaDados(){
        return rep.findAll().stream().map(VSL_FUNRESTDTO::create).collect(Collectors.toList());

    }



}
