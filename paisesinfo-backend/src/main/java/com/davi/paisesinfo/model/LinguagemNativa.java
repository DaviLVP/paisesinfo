package com.davi.paisesinfo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class LinguagemNativa {
        private String isoAlpha3;
        private String isoAlpha2;
        private String isoNome;
        private String nomeNativo;
    }

