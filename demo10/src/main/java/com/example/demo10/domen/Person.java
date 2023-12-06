package com.example.demo10.domen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    long Id;
    long Shifer;
    long Inn;
    String Type;
    LocalDate Data;
}
