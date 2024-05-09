package com.davi.paisesinfo.mapper;

import com.davi.paisesinfo.dto.AdminLanguage;
import com.davi.paisesinfo.model.LinguagemNativa;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LinguagemNativaMapper {
    public List<LinguagemNativa> toListLinguagensNativas(List<AdminLanguage> source){
        List<LinguagemNativa> destination = new ArrayList<>();

        for (AdminLanguage item : source){
            LinguagemNativa destinationItem = new LinguagemNativa();
            destinationItem.setIsoAlpha3(item.getIsoAlpha3());
            destinationItem.setIsoAlpha2(item.getIsoAlpha2());
            destinationItem.setIsoNome(item.getIsoName());
            destinationItem.setNomeNativo(item.getNativeName());
            destination.add(destinationItem);
        }
        return destination;
    }
}
