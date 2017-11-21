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
        validateComplexObjects(param1, param2);

        statisticsService.incrementAdditionCount();

        return countingService.add(param1, param2);
    }

    public ComplexObject subtract(ComplexObject param1, ComplexObject param2) {
        validateComplexObjects(param1, param2);

        statisticsService.incrementSubtractionsCount();


        return countingService.subtract(param1, param2);
    }

    public ComplexObject multiply(ComplexObject param1, ComplexObject param2) {
        validateComplexObjects(param1, param2);

        statisticsService.incrementMultiplicationsCount();

        return countingService.multiply(param1, param2);
    }

    public ComplexObject divide(ComplexObject param1, ComplexObject param2) {
        validateComplexObjects(param1, param2);

        statisticsService.incrementDivisionsCount();

        return countingService.divide(param1, param2);
    }

    private void validateComplexObjects(ComplexObject param1, ComplexObject param2) {
        if (!param1.getService().equals(param2.getService())) {
            throw new IllegalArgumentException();
        }

        fieldValidationService.validateFields(param1);
        fieldValidationService.validateFields(param2);
    }
}
