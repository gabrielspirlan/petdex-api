package com.petdex.api.application.services.Batimento;

import com.petdex.api.domain.contracts.dto.Batimento.BatimentoReqDTO;
import com.petdex.api.domain.contracts.dto.Batimento.BatimentoResDTO;
import com.petdex.api.domain.contracts.dto.PageDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBatimentoService {

     BatimentoResDTO save(BatimentoReqDTO batimentoReq);
     BatimentoResDTO fidById(String batimentoId);
     Page<BatimentoResDTO> findAllByAnimalId(String animalId, PageDTO pageDTO);
     Page<BatimentoResDTO> findAllByColeiraId(String coleiraId, PageDTO pageDTO);

}
