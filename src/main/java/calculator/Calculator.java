package calculator;

import calculator.domain.ComplexObject;
import calculator.service.CountingService;
import calculator.service.FieldValidationService;
import calculator.service.StatisticsService;

public class Calculator {

    private CountingService countingService;
    private FieldValidationService fieldValidationService;
    private StatisticsService statisticsService;

    public void setCountingService(CountingService countingService) {
        this.countingService = countingService;
    }

    public void setFieldValidationService(FieldValidationService fieldValidationService) {
        this.fieldValidationService = fieldValidationService;
    }

    public void setStatisticsService(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    public ComplexObject add(ComplexObject param1, ComplexObject param2) {
        statisticsService.incrementAdditionCount();

        if (!param1.getService().equals(param2.getService())) {
            throw new IllegalArgumentException();
        }

        fieldValidationService.validateFields(param1);
        fieldValidationService.validateFields(param2);

        return countingService.add(param1, param2);
    }

    public ComplexObject subtract(ComplexObject param1, ComplexObject param2) {
        statisticsService.getSubtractionsCount();

        if (!param1.getService().equals(param2.getService())) {
            throw new IllegalArgumentException();
        }

        fieldValidationService.validateFields(param1);
        fieldValidationService.validateFields(param2);

        return countingService.subtract(param1, param2);
    }

    public ComplexObject multiply(ComplexObject param1, ComplexObject param2) {
        statisticsService.getMultiplicationsCount();

        if (!param1.getService().equals(param2.getService())) {
            throw new IllegalArgumentException();
        }

        fieldValidationService.validateFields(param1);
        fieldValidationService.validateFields(param2);

        return countingService.multiply(param1, param2);
    }

    public ComplexObject divide(ComplexObject param1, ComplexObject param2) {
        statisticsService.getDivisionsCount();

        if (!param1.getService().equals(param2.getService())) {
            throw new IllegalArgumentException();
        }

        fieldValidationService.validateFields(param1);
        fieldValidationService.validateFields(param2);

        return countingService.divide(param1, param2);
    }
}
