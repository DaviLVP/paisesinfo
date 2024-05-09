package com.davi.paisesinfo.mapper;

import com.davi.paisesinfo.dto.AdminLanguage;
import com.davi.paisesinfo.dto.CountryInfo;
import com.davi.paisesinfo.dto.Currency;
import com.davi.paisesinfo.model.LinguagemNativa;
import com.davi.paisesinfo.model.PaisesInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor

public class PaisesInfoMapper {


    public PaisesInfo toPaisesInfo(CountryInfo source){

        PaisesInfo destination = new PaisesInfo();
        destination.setIsoAlpha2(source.getIsoAlpha2());
        destination.setIsoAlpha3(source.getIsoAlpha3());
        destination.setNome(source.getName());
        destination.setIsoNome(source.getIsoName());
        destination.setIsoNomeCompleto(source.getIsoNameFull());
        destination.setRegiao(source.getUnRegion());
        destination.setEmojiBandeira(source.getCountryFlagEmoji());
        destination.setIndependente(source.isIndepedent());

        return destination;
    }
}
