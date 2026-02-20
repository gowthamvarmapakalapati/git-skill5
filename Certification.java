package com.skill5;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id = 501;
    private String name = "Spring Professional";
    private String dateOfCompletion = "2026-02-19";

    public Certification() {
    }

    @Override
    public String toString() {
        return "Certification ID: " + id +
               "\nCertification Name: " + name +
               "\nDate Of Completion: " + dateOfCompletion;
    }
}
