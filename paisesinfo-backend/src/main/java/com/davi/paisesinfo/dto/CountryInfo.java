package com.davi.paisesinfo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CountryInfo {
private String isoAlpha2;
private String isoAlpha3;
private String name;
private String isoName;
private String IsoNameFull;
private List<AdminLanguage> IsoAdminLanguages;
private String unRegion;
private Currency currency;
private String countryFlagEmoji;
private boolean isIndepedent;
}
