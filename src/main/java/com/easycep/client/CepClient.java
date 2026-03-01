package com.easycep.client;

import com.easycep.dto.ViaCepResponseDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class CepClient {

    private final RestClient restClient;

    public CepClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public ViaCepResponseDto searchCepOnApi(String cep) {
        return restClient.get()
                .uri("/{cep}/json", cep)
                .retrieve()
                .body(ViaCepResponseDto.class);
    }
}
