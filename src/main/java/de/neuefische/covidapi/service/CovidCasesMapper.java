package de.neuefische.covidapi.service;

import de.neuefische.covidapi.model.ConfirmedByDay;
import de.neuefische.covidapi.model.api.CovidApiCountryPerDay;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CovidCasesMapper {

    public List<ConfirmedByDay> mapToConfirmedByDay(CovidApiCountryPerDay[] covidApiCountryPerDays) {
        List<ConfirmedByDay> confirmedByDays = new ArrayList<>();
        for (CovidApiCountryPerDay apiCountryPerDay : covidApiCountryPerDays) {
            ConfirmedByDay confirmedByDay = new ConfirmedByDay(
                    apiCountryPerDay.getDate(),
                    apiCountryPerDay.getConfirmed()
            );
            confirmedByDays.add(confirmedByDay);
        }
        return confirmedByDays;
    }
}
