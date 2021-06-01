package br.com.informatica4.mobile_restaurante.api;


import br.com.informatica4.mobile_restaurante.domain.Service.tblcelularservice;
import br.com.informatica4.mobile_restaurante.domain.tblcelular;
import br.com.informatica4.mobile_restaurante.domain.dto.tblcelularDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("GRPoint/api/TUSL_Celular")
public class tblcelularcontroller {

    @Autowired
    private tblcelularservice service = new tblcelularservice();

    @GetMapping
    public ResponseEntity<List<tblcelularDTO>> get(){
        return ResponseEntity.ok(service.listaDados());
        //return new ResponseEntity<>(coletaDadoService.listaDados(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity post(@RequestBody tblcelular tblcelular){
        try {
            tblcelularDTO c = service.save(tblcelular);

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
