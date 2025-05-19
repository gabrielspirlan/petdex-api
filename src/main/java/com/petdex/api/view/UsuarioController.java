package com.petdex.api.view;

import com.petdex.api.domain.contracts.dto.usuario.UsuarioResDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {



    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResDTO> findById (@PathVariable String id) {

    }
}
