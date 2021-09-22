package de.neuefische.covidapi.service;

import de.neuefische.covidapi.api.CovidApiService;
import de.neuefische.covidapi.model.ConfirmedByDay;
import de.neuefische.covidapi.model.api.CovidApiCountryPerDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CovidCasesService {
    private CovidApiService covidApiService;
    private CovidCasesMapper covidCasesMapper;

    @Autowired
    public CovidCasesService(CovidApiService covidApiService, CovidCasesMapper covidCasesMapper) {
        this.covidApiService = covidApiService;
        this.covidCasesMapper = covidCasesMapper;
    }

    public List<ConfirmedByDay> getConfirmedCases() {
        CovidApiCountryPerDay[] covidApiCountryPerDay = covidApiService.getCovidApiCountryPerDay();
        return covidCasesMapper.mapToConfirmedByDay(covidApiCountryPerDay);
    }
}
