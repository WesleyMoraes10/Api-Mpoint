package br.com.informatica4.mobile_restaurante.domain.Service;

import br.com.informatica4.mobile_restaurante.domain.Repository.tblcoletadadoRepository;
import br.com.informatica4.mobile_restaurante.domain.tblcoletadado;
import br.com.informatica4.mobile_restaurante.domain.dto.tblcoletadadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class tblcoletadadoservice {

    @Autowired
    private tblcoletadadoRepository rep;

    public List<tblcoletadadoDTO> listaDados(){
        return rep.findAll().stream().map(tblcoletadadoDTO::create).collect(Collectors.toList());

    }


    public tblcoletadadoDTO save(tblcoletadado tblcoletadado) {
        Assert.isNull(tblcoletadado.getId(), "Não foi possivel inserir");
        return tblcoletadadoDTO.create(rep.save(tblcoletadado));
    }
}
