package de.neuefische.covidapi.controller;

import de.neuefische.covidapi.model.ConfirmedByDay;
import de.neuefische.covidapi.service.CovidCasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("covid/cases")
public class CovidCasesController {
    private CovidCasesService covidCasesService;

    @Autowired
    public CovidCasesController(CovidCasesService covidCasesService) {
        this.covidCasesService = covidCasesService;
    }

    @GetMapping
    public List<ConfirmedByDay> getConfirmedCases(){
        return covidCasesService.getConfirmedCases();
    }
}
