package com.petdex.api.application.services.usuario;

import com.petdex.api.domain.collections.Usuario;
import com.petdex.api.domain.contracts.dto.PageDTO;
import com.petdex.api.domain.contracts.dto.usuario.UsuarioReqDTO;
import com.petdex.api.domain.contracts.dto.usuario.UsuarioResDTO;
import com.petdex.api.infrastructure.mongodb.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;

public class UsuarioService implements IUsuarioService {
    @Autowired
    ModelMapper mapper;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UsuarioResDTO findById(String id) {
        return mapper.map(usuarioRepository.findById(id), UsuarioResDTO.class);
    }

    @Override
    public Page<UsuarioResDTO> findAll(PageDTO pageDTO) {
        pageDTO.sortByName();

        Page<Usuario> usuariosPage = usuarioRepository.findAll(pageDTO.mapPage());
        List<UsuarioResDTO>  dtoList = usuariosPage.getContent().stream()
                .map(b -> mapper.map(b, UsuarioResDTO.class))
                .toList();

        return new PageImpl<UsuarioResDTO>(dtoList, pageDTO.mapPage(), usuariosPage.getTotalElements());
    }

    @Override
    public UsuarioResDTO create(UsuarioReqDTO usuarioReqDTO) {
        return mapper.map(usuarioRepository.save(mapper.map(usuarioReqDTO, Usuario.class)), UsuarioResDTO.class);
    }

    @Override
    public UsuarioResDTO update(String id, UsuarioReqDTO usuarioReqDTO) {

        Usuario usuarioUpdate = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Não foi possível contrar um usuário com este ID: " + id));

        if(!usuarioUpdate.getCpf().equals(usuarioReqDTO.getCpf())) usuarioUpdate.setCpf(usuarioReqDTO.getCpf());
        if (!usuarioUpdate.getEmail().equals(usuarioReqDTO.getEmail())) usuarioUpdate.setEmail(usuarioReqDTO.getEmail());
        if(!usuarioUpdate.getSenha().equals(usuarioReqDTO.getSenha())) usuarioUpdate.setSenha(usuarioReqDTO.getSenha());
        if(!usuarioUpdate.getNome().equals(usuarioReqDTO.getNome())) usuarioUpdate.setNome(usuarioReqDTO.getNome());
        if(!usuarioUpdate.getWhatsApp().equals(usuarioReqDTO.getWhatsApp())) usuarioUpdate.setWhatsApp(usuarioReqDTO.getWhatsApp());

        return mapper.map(usuarioRepository.save(mapper.map(usuarioUpdate, Usuario.class)), UsuarioResDTO.class);
    }

    @Override
    public void delete(String id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com id: " + id));
        usuarioRepository.delete(usuario);
    }
}
