package com.petdex.api.application.services.Movimento;

import com.petdex.api.domain.contracts.dto.Movimento.MovimentoReqDTO;
import com.petdex.api.domain.contracts.dto.Movimento.MovimentoResDTO;
import com.petdex.api.domain.contracts.dto.PageDTO;
import org.springframework.data.domain.Page;

public interface IMovimentoService {
    MovimentoResDTO save(MovimentoReqDTO movimentoReq);
    MovimentoResDTO fidById(String movimentoId);
    Page<MovimentoResDTO> findAllByAnimalId(String animalId, PageDTO pageDTO);
    Page<MovimentoResDTO> findAllByColeiraId(String coleiraId, PageDTO pageDTO);
}
