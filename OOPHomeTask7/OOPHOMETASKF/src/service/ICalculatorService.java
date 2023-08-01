package geekbrains.homeworks.homework7.service;

import geekbrains.homeworks.homework7.model.ComplexNumber;

public interface ICalculatorService {
    ComplexNumber sum(ComplexNumber a, ComplexNumber b);

    ComplexNumber multi(ComplexNumber a, ComplexNumber b);

    ComplexNumber div(ComplexNumber a, ComplexNumber b);
}