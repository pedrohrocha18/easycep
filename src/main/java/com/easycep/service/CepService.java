package com.easycep.service;

import com.easycep.client.CepClient;
import com.easycep.dto.CepResponseDto;
import com.easycep.dto.ViaCepResponseDto;
import org.springframework.stereotype.Service;

@Service
public class CepService {
    private final CepClient cepClient;

    public CepService(CepClient cepClient) {
        this.cepClient = cepClient;
    }

    public CepResponseDto buscaCep(String cep) {
        ViaCepResponseDto resposta = cepClient.searchCepOnApi(cep);

        return new CepResponseDto(
                resposta.cep(),
                resposta.logradouro(),
                resposta.bairro(),
                resposta.localidade(),
                resposta.uf());
    }
}
