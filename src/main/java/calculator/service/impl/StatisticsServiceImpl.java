package calculator.service.impl;

import calculator.service.StatisticsService;

public class StatisticsServiceImpl implements StatisticsService {

    private int additionsCount;
    private int subtractionsCount;
    private int multiplicationsCount;
    private int divisionsCount;


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

    public void setAdditionsCount(int additionsCount) {
        this.additionsCount = additionsCount;
    }

    public void setSubtractionsCount(int subtractionsCount) {
        this.subtractionsCount = subtractionsCount;
    }

    public void setMultiplicationsCount(int multiplicationsCount) {
        this.multiplicationsCount = multiplicationsCount;
    }

    public void setDivisionsCount(int divisionsCount) {
        this.divisionsCount = divisionsCount;
    }
}
