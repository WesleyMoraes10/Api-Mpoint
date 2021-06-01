package br.com.informatica4.mobile_restaurante.api;

import br.com.informatica4.mobile_restaurante.domain.tblcoletadado;
import br.com.informatica4.mobile_restaurante.domain.Service.tblcoletadadoservice;
import br.com.informatica4.mobile_restaurante.domain.dto.tblcoletadadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("GRPoint/api/TUSL_ColetaDado")
public class tblcoletadadocontroller {
    @Autowired
    private tblcoletadadoservice service = new tblcoletadadoservice();

    @GetMapping
    public ResponseEntity<List<tblcoletadadoDTO>> get(){
        return ResponseEntity.ok(service.listaDados());
        //return new ResponseEntity<>(coletaDadoService.listaDados(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity post(@RequestBody tblcoletadado tblcoletadado){
        try {
            tblcoletadadoDTO c = service.save(tblcoletadado);

            URI location = getUri(c.getId());
            return ResponseEntity.created(location).build();
        }catch (Exception erro){
            return ResponseEntity.badRequest().build();
        }
    }

    private URI getUri(Long id){
        return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
    }

}
