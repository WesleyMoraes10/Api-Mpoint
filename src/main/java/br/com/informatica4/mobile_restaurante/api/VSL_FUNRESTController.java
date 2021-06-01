package br.com.informatica4.mobile_restaurante.api;

import br.com.informatica4.mobile_restaurante.domain.Service.VSLService;
import br.com.informatica4.mobile_restaurante.domain.dto.VSL_FUNRESTDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("GRPoint/api/TUSL_FunRest")
public class VSL_FUNRESTController {
    @Autowired
    private VSLService service = new VSLService();

    @GetMapping
    public ResponseEntity<List<VSL_FUNRESTDTO>> get(){
        return ResponseEntity.ok(service.listaDados());
        //return new ResponseEntity<>(coletaDadoService.listaDados(), HttpStatus.OK);
    }



    private URI getUri(Long id){
        return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
    }

}
