package geekbrains.homeworks.homework7.factory;

import geekbrains.homeworks.homework7.service.Calculator;
import geekbrains.homeworks.homework7.service.ICalculatorService;

public class CalculableFactory implements ICalculableFactory {
    public ICalculatorService create() {
        return new Calculator();
    }
}