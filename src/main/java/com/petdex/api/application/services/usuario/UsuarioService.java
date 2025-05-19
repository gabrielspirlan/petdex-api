package com.petdex.api.application.services.usuario;

import com.petdex.api.domain.contracts.dto.usuario.UsuarioReqDTO;
import com.petdex.api.domain.contracts.dto.usuario.UsuarioResDTO;
import org.springframework.data.domain.Page;

public class UsuarioService implements IUsuarioService {


    @Override
    public UsuarioResDTO findById(String id) {
        return null;
    }

    @Override
    public Page<UsuarioResDTO> findAll() {
        return null;
    }

    @Override
    public UsuarioResDTO create(UsuarioReqDTO usuarioDTO) {
        return null;
    }

    @Override
    public UsuarioResDTO update(String id, UsuarioReqDTO usuarioReqDTO) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
