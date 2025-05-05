package com.petdex.api.application.services.Batimento;

import com.petdex.api.application.services.ValidationService;
import com.petdex.api.domain.collections.Animal;
import com.petdex.api.domain.collections.Batimento;
import com.petdex.api.domain.collections.Coleira;
import com.petdex.api.domain.contracts.dto.Batimento.BatimentoReqDTO;
import com.petdex.api.domain.contracts.dto.Batimento.BatimentoResDTO;
import com.petdex.api.domain.contracts.dto.PageDTO;
import com.petdex.api.infrastructure.mongodb.AnimalRepository;
import com.petdex.api.infrastructure.mongodb.BatimentoRepository;
import com.petdex.api.infrastructure.mongodb.ColeiraRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BatimentoService implements IBatimentoService {

    @Autowired
    private BatimentoRepository batimentoRepository;

    @Autowired
    private ValidationService validation;

    @Autowired
    private ModelMapper mapper;

    public BatimentoResDTO save(BatimentoReqDTO batimentoReq) {
//
//        if (!validation.existAnimal(batimentoReq.getAnimalId()) || !validation.existColeira(batimentoReq.getColeiraId())) {
//            return null; // Lançar excessão 404
//        }

        return mapper.map(batimentoRepository.save(mapper.map(batimentoReq, Batimento.class)), BatimentoResDTO.class);
    }

    public BatimentoResDTO fidById(String batimentoId) {
        return mapper.map(batimentoRepository.findById(batimentoId), BatimentoResDTO.class);
    }

    public Page<BatimentoResDTO> findAllByAnimalId(String animalId, PageDTO pageDTO) {

        Page<Batimento> batimentosPage = batimentoRepository.findAllByAnimalId(animalId, pageDTO.mapPage());

        List<BatimentoResDTO> dtoList = batimentosPage.getContent().stream()
                .map(b -> mapper.map(b, BatimentoResDTO.class))
                .toList();

        return new PageImpl<BatimentoResDTO>(dtoList, pageDTO.mapPage(), batimentosPage.getTotalElements());
    }

    public Page<BatimentoResDTO> findAllByColeiraId(String coleiraId, PageDTO pageDTO) {

        Page<Batimento> batimentosPage = batimentoRepository.findAllByColeiraId(coleiraId, pageDTO.mapPage());

        List<BatimentoResDTO> dtoList = batimentosPage.getContent().stream()
                .map(b -> mapper.map(b, BatimentoResDTO.class))
                .toList();

        return new PageImpl<BatimentoResDTO>(dtoList, pageDTO.mapPage(), batimentosPage.getTotalElements());
    }

}
