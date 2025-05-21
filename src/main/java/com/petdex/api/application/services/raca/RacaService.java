package com.petdex.api.application.services.raca;

import com.petdex.api.domain.collections.Raca;
import com.petdex.api.domain.contracts.dto.PageDTO;
import com.petdex.api.domain.contracts.dto.raca.RacaReqDTO;
import com.petdex.api.domain.contracts.dto.raca.RacaResDTO;
import com.petdex.api.infrastructure.mongodb.RacaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class RacaService implements IRacaService{

    @Autowired
    ModelMapper mapper;

    @Autowired
    RacaRepository racaRepository;

    @Override
    public RacaResDTO findById(String id) {
        return mapper.map(racaRepository.findById(id), RacaResDTO.class);
    }

    @Override
    public Page<RacaResDTO> findAll(PageDTO pageDTO) {

        pageDTO.sortByName();

        Page<Raca> racaPage = racaRepository.findAll(pageDTO.mapPage());




        return null;
    }

    @Override
    public RacaResDTO create(RacaReqDTO racaReqDTO) {
        return null;
    }

    @Override
    public RacaResDTO update(RacaReqDTO racaReqDTO) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
