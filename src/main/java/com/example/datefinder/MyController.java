package com.example.datefinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
@RestController
public class MyController {
    @GetMapping("/")
    public String getdate(){
        LocalDate today = LocalDate.now();
        LocalDate dateAfter100Days = today.plusDays (100);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return dateAfter100Days.format(formatter);
    }
}
