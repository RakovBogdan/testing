package calculator.service;

import calculator.service.impl.StatisticsServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class StatisticsServiceImplTest {

    private StatisticsService statisticsService = new StatisticsServiceImpl();

    @Test
    public void incrementingWorksTest() {
        statisticsService.incrementAdditionCount();

        Assert.assertEquals(1, statisticsService.getAdditionsCount());
    }
}
