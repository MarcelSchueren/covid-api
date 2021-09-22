package de.neuefische.covidapi.api;

import de.neuefische.covidapi.model.api.CovidApiCountryPerDay;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CovidApiService {
    private final RestTemplate restTemplate = new RestTemplate();
    private static final String API_URL = "https://api.covid19api.com/country/germany";

    public CovidApiCountryPerDay[] getCovidApiCountryPerDay(){
        ResponseEntity<CovidApiCountryPerDay[]> response = restTemplate.getForEntity(API_URL, CovidApiCountryPerDay[].class);
        return response.getBody();
    }
}
