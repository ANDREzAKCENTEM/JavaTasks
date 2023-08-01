package geekbrains.homeworks.homework7.factory;

import geekbrains.homeworks.homework7.logger.ILogger;
import geekbrains.homeworks.homework7.service.Calculator;
import geekbrains.homeworks.homework7.service.ICalculatorService;
import geekbrains.homeworks.homework7.service.LogCalculator;

public class CalculableLoggerFactory implements ICalculableFactory {
    private final ILogger logger;

    public CalculableLoggerFactory(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public ICalculatorService create() {
        return new LogCalculator(new Calculator(), logger);
    }
}