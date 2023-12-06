package com.example.demo10.domen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    long Id,PersonId,OrgRegistrationId,Leg_formId,NumberReg;
    String Namefull,Nameshort;
    LocalDate DataReg;
    Person person;
    OrgRegistration orgRegistration;
    Leg_form legForm;

    public Company(long id, long personId, long orgRegistrationId,
                   long leg_formId, long numberReg, String namefull,
                   String nameshort, LocalDate dataReg) {
        Id = id;
        PersonId = personId;
        OrgRegistrationId = orgRegistrationId;
        Leg_formId = leg_formId;
        NumberReg = numberReg;
        Namefull = namefull;
        Nameshort = nameshort;
        DataReg = dataReg;
    }
}
