package br.com.informatica4.mobile_restaurante.api;

import br.com.informatica4.mobile_restaurante.domain.Service.tblusuarioservice;
import br.com.informatica4.mobile_restaurante.domain.tblusuario;
import br.com.informatica4.mobile_restaurante.domain.dto.tblusuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("GRPoint/api/TUSL_Usuario")
public class tblusuariocontroller {
    @Autowired
    private tblusuarioservice service = new tblusuarioservice();

    @GetMapping
    public ResponseEntity<List<tblusuarioDTO>> get(){
        return ResponseEntity.ok(service.listaDados());
        //return new ResponseEntity<>(coletaDadoService.listaDados(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity post(@RequestBody tblusuario tblusuario){
        try {
            tblusuarioDTO c = service.save(tblusuario);

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
