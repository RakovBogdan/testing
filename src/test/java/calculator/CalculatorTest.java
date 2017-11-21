package calculator;

import static calculator.domain.Service.*;
import calculator.domain.ComplexObject;
import calculator.service.CountingService;
import calculator.service.FieldValidationService;
import calculator.service.StatisticsService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Mock
    private CountingService countingService;

    @Mock
    private FieldValidationService validationService;

    @Mock
    private StatisticsService statisticsService;

    @InjectMocks
    private Calculator calculator;

    @Test(expected = IllegalArgumentException.class)
    public void complexObjectsWithDifferentServicesTest() {
        ComplexObject objectA = new ComplexObject(1, 2, APPHE);
        ComplexObject objectB = new ComplexObject(3, 4, CAMSUNG);

        Mockito.doNothing().when(validationService).validateFields(objectA);
        Mockito.doNothing().when(validationService).validateFields(objectB);
        Mockito.doNothing().when(statisticsService).incrementAdditionCount();

        calculator.add(objectA, objectB);
    }

    public void additionUpdatesMethodCallsCounter() {
        ComplexObject objectA = new ComplexObject(1, 2, APPHE);
        ComplexObject objectB = new ComplexObject(3, 4, CAMSUNG);

        Mockito.doNothing().when(validationService).validateFields(objectA);
        Mockito.doNothing().when(validationService).validateFields(objectB);

        calculator.add(objectA, objectB);
    }

    @Test
    public void addTest() {

        ComplexObject objectA = new ComplexObject(1, 2, APPHE);
        ComplexObject objectB = new ComplexObject(3, 4, APPHE);

        ComplexObject expectedResult = new ComplexObject(4,6);

        Mockito.doNothing().when(validationService).validateFields(objectA);
        Mockito.doNothing().when(validationService).validateFields(objectB);
        Mockito.doNothing().when(statisticsService).incrementAdditionCount();

        Mockito.when(countingService.add(objectA, objectB)).thenReturn(expectedResult);

        ComplexObject result = calculator.add(objectA, objectB);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void subtractTest() {

        ComplexObject objectA = new ComplexObject(3, 2, APPHE);
        ComplexObject objectB = new ComplexObject(3, 4, APPHE);

        ComplexObject expectedResult = new ComplexObject(0,-2);

        Mockito.doNothing().when(validationService).validateFields(objectA);
        Mockito.doNothing().when(validationService).validateFields(objectB);
        Mockito.doNothing().when(statisticsService).incrementAdditionCount();

        Mockito.when(countingService.subtract(objectA, objectB)).thenReturn(expectedResult);

        ComplexObject result = calculator.subtract(objectA, objectB);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyTest() {

        ComplexObject objectA = new ComplexObject(5, 2, APPHE);
        ComplexObject objectB = new ComplexObject(3, 4, APPHE);

        ComplexObject expectedResult = new ComplexObject(15,8);

        Mockito.doNothing().when(validationService).validateFields(objectA);
        Mockito.doNothing().when(validationService).validateFields(objectB);
        Mockito.doNothing().when(statisticsService).incrementAdditionCount();

        Mockito.when(countingService.multiply(objectA, objectB)).thenReturn(expectedResult);

        ComplexObject result = calculator.multiply(objectA, objectB);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void divideTest() {

        ComplexObject objectA = new ComplexObject(8, 10, APPHE);
        ComplexObject objectB = new ComplexObject(2, 5, APPHE);

        ComplexObject expectedResult = new ComplexObject(4,2);

        Mockito.doNothing().when(validationService).validateFields(objectA);
        Mockito.doNothing().when(validationService).validateFields(objectB);
        Mockito.doNothing().when(statisticsService).incrementAdditionCount();

        Mockito.when(countingService.divide(objectA, objectB)).thenReturn(expectedResult);


        ComplexObject result = calculator.divide(objectA, objectB);


        Assert.assertEquals(expectedResult, result);
    }



}
