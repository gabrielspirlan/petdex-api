package com.petdex.api.application.services.Localizacao;

import com.petdex.api.domain.contracts.dto.Localizacao.LocalizacaoReqDTO;
import com.petdex.api.domain.contracts.dto.Localizacao.LocalizacaoResDTO;
import com.petdex.api.domain.contracts.dto.PageDTO;
import org.springframework.data.domain.Page;

public interface ILocalizacaoService {
    LocalizacaoResDTO save(LocalizacaoReqDTO localizacaoReq);
    LocalizacaoResDTO fidById(String localizacaoId);
    Page<LocalizacaoResDTO> findAllByAnimalId(String animalId, PageDTO pageDTO);
    Page<LocalizacaoResDTO> findAllByColeiraId(String coleiraId, PageDTO pageDTO);
}
