package com.aluracurso.conversormoneda.models;

public record Currency(String baseCode,
                       String name,
                       String country,
                       double conversionRates) {
}
