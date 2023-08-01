package geekbrains.homeworks.homework7;

import geekbrains.homeworks.homework7.factory.CalculableLoggerFactory;
import geekbrains.homeworks.homework7.factory.ICalculableFactory;
import geekbrains.homeworks.homework7.logger.ILogger;
import geekbrains.homeworks.homework7.logger.LoggerConsole;
import geekbrains.homeworks.homework7.view.CalculatorView;
import geekbrains.homeworks.homework7.view.ConsoleCalculatorView;

public class App {
    public static void main(String[] args) {
        ILogger logger = new LoggerConsole();
        ICalculableFactory calculableFactory = new CalculableLoggerFactory(logger);
        CalculatorView calculatorView = new ConsoleCalculatorView(calculableFactory);

        calculatorView.run();
    }
}