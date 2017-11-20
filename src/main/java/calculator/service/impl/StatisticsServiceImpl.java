package calculator.service.impl;

import calculator.service.StatisticsService;

public class StatisticsServiceImpl implements StatisticsService {

    private int additionsCount = 0;
    private int subtractionsCount = 0;
    private int multiplicationsCount = 0;
    private int divisionsCount = 0;

    public void incrementAdditionCount() {
        additionsCount++;
    }

    public void incrementSubtractionsCount() {
        subtractionsCount++;
    }

    public void incrementMultiplicationsCount() {
        multiplicationsCount++;
    }

    public void incrementDivisionsCount() {
        divisionsCount++;
    }

    @Override
    public int getAdditionsCount() {
        return additionsCount;
    }

    @Override
    public int getSubtractionsCount() {
        return subtractionsCount;
    }

    @Override
    public int getMultiplicationsCount() {
        return multiplicationsCount;
    }

    @Override
    public int getDivisionsCount() {
        return divisionsCount;
    }
}
