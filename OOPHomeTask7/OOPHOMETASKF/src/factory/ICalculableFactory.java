package geekbrains.homeworks.homework7.factory;

import geekbrains.homeworks.homework7.service.ICalculatorService;

public interface ICalculableFactory {
    ICalculatorService create();
}