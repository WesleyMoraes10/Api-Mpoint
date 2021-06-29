package br.com.informatica4.mobile_restaurante.domain.Service;

import br.com.informatica4.mobile_restaurante.domain.Repository.tblusuarioRepository;
import br.com.informatica4.mobile_restaurante.domain.tblusuario;
import br.com.informatica4.mobile_restaurante.domain.dto.tblusuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class tblusuarioservice {

    @Autowired
    private tblusuarioRepository rep;

    public List<tblusuarioDTO> listaDados(){
        return rep.findAll().stream().map(tblusuarioDTO::create).collect(Collectors.toList());
    }


    public tblusuarioDTO save(tblusuario tblusuario) {
        Assert.isNull(tblusuario.getId(), "Não foi possivel inserir");
        return tblusuarioDTO.create(rep.save(tblusuario));
    }


}
