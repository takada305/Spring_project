package com.example.demo.animalsAPI.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.animalsAPI.data.AnimalData;

@Repository
public class AnimalRepository {
    private final String ALL_ANIMALS_API_URL = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI";

    private final String ANIMAL_DETAIL_API_URL = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI?id=";

    public List<AnimalData> getAnimals() {
        RestTemplate restTemplate = new RestTemplate();
        AnimalData[] response = restTemplate.getForObject(ALL_ANIMALS_API_URL, AnimalData[].class);
        return Arrays.asList(response);
    }

    public AnimalData getAnimalById(int id) {
        String url = ANIMAL_DETAIL_API_URL + id;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, AnimalData.class);
    }
}
