package com.petdex.api.view;

import com.petdex.api.application.services.usuario.UsuarioService;
import com.petdex.api.domain.contracts.dto.PageDTO;
import com.petdex.api.domain.contracts.dto.usuario.UsuarioReqDTO;
import com.petdex.api.domain.contracts.dto.usuario.UsuarioResDTO;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResDTO> findById (@PathVariable String id) {
        return new ResponseEntity<>(
                usuarioService.findById(id),
                HttpStatus.OK
        );
    }

    @GetMapping("")
    public ResponseEntity<Page<UsuarioResDTO>> findAll (@RequestParam @ParameterObject PageDTO pageDTO) {
        return new ResponseEntity<>(
                usuarioService.findAll(pageDTO),
                HttpStatus.OK
        );
    }

    @PostMapping("")
    public ResponseEntity<UsuarioResDTO> create (@RequestBody UsuarioReqDTO usuarioReqDTO) {
        return new ResponseEntity<>(
                usuarioService.create(usuarioReqDTO),
                HttpStatus.CREATED
        );
    }

    @PostMapping("/{id}")
    public ResponseEntity<UsuarioResDTO> update (@PathVariable String id, @RequestBody UsuarioReqDTO usuarioReqDTO){
        return new ResponseEntity<>(
                usuarioService.update(id, usuarioReqDTO),
                HttpStatus.CREATED
        );
    }

    public ResponseEntity delete (@PathVariable String id) {
        usuarioService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
