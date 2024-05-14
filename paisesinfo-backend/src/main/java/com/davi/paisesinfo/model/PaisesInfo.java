package com.davi.paisesinfo.model;

import com.davi.paisesinfo.dto.AdminLanguage;
import com.davi.paisesinfo.dto.Currency;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class PaisesInfo {
    @Id
    private String id;
    private String isoAlfa2;
    private String isoAlfa3;
    private String nome;
    private String isoNome;
    private String isoNomeCompleto;
    private List<LinguagemNativa> isoLinguagensNativas;
    private String regiao;
    private Moeda moeda;
    private String emojiBandeira;
    private boolean independente;
}
