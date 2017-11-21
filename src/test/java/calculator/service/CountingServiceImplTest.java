package calculator.service;

import calculator.domain.ComplexObject;
import calculator.service.impl.CountingServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class CountingServiceImplTest {

    private CountingService service = new CountingServiceImpl();

    @Test
    public void addTest() {
        //Given
        ComplexObject objectA = new ComplexObject(1, 2);
        ComplexObject objectB = new ComplexObject(3, 4);
        ComplexObject expectedObject = new ComplexObject(4, 6);

        //When
        ComplexObject result = service.add(objectA, objectB);

        //Then
        Assert.assertEquals(expectedObject, result);
    }

    @Test
    public void subtractTest() {
        //Given
        ComplexObject objectA = new ComplexObject(7, 8);
        ComplexObject objectB = new ComplexObject(-10, 11);
        ComplexObject expectedObject = new ComplexObject(17, -3);

        //When
        ComplexObject result = service.subtract(objectA, objectB);

        //Then
        Assert.assertEquals(expectedObject, result);
    }

    @Test
    public void multiplyTest() {
        //Given
        ComplexObject objectA = new ComplexObject(10, -2);
        ComplexObject objectB = new ComplexObject(3, -4);
        ComplexObject expectedObject = new ComplexObject(30, 8);

        //When
        ComplexObject result = service.multiply(objectA, objectB);

        //Then
        Assert.assertEquals(expectedObject, result);
    }

    @Test
    public void divisionTest() {
        //Given
        ComplexObject objectA = new ComplexObject(10, -7);
        ComplexObject objectB = new ComplexObject(3, -2);
        ComplexObject expectedObject = new ComplexObject(3, 3);

        //When
        ComplexObject result = service.divide(objectA, objectB);

        //Then
        Assert.assertEquals(expectedObject, result);
    }
}
