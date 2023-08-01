package geekbrains.homeworks.homework7.service;

import geekbrains.homeworks.homework7.logger.ILogger;
import geekbrains.homeworks.homework7.model.ComplexNumber;

public class LogCalculator implements ICalculatorService {
    private final ICalculatorService decorated;
    private final ILogger logger;

    public LogCalculator(ICalculatorService decorated, ILogger logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        logger.log("Called method sum with values re1 " + a.getRe() + " and im1 " + a.getIm() + " re2 " +
                b.getRe() + " and im2 " + b.getIm());
        return decorated.sum(a, b);
    }

    @Override
    public ComplexNumber multi(ComplexNumber a, ComplexNumber b) {
        logger.log("Called method multi with values re1 " + a.getRe() + " and im1 " + a.getIm() + " re2 " +
                b.getRe() + " and im2 " + b.getIm());
        return decorated.multi(a, b);
    }

    @Override
    public ComplexNumber div(ComplexNumber a, ComplexNumber b) {
        logger.log("Called method div with values re1 " + a.getRe() + " and im1 " + a.getIm() + " re2 " +
                b.getRe() + " and im2 " + b.getIm());
        return decorated.div(a, b);
    }
}