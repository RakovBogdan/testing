package calculator.service;

import calculator.service.impl.StatisticsServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class StatisticsServiceImplTest {

    private StatisticsService statisticsService = new StatisticsServiceImpl();

    @Test
    public void incrementingAdditionWorksTest() {
        statisticsService.incrementAdditionCount();

        Assert.assertEquals(1, statisticsService.getAdditionsCount());
    }

    @Test
    public void incrementingSubtractionWorksTest() {
        statisticsService.incrementSubtractionsCount();

        Assert.assertEquals(1, statisticsService.getSubtractionsCount());
    }

    @Test
    public void incrementingMultiplicationWorksTest() {
        statisticsService.incrementMultiplicationsCount();

        Assert.assertEquals(1, statisticsService.getMultiplicationsCount());
    }

    @Test
    public void incrementingDivisionWorksTest() {
        statisticsService.incrementDivisionsCount();

        Assert.assertEquals(1, statisticsService.getDivisionsCount());
    }
}
