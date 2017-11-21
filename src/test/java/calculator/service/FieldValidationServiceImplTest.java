package calculator.service;

import calculator.domain.ComplexObject;
import calculator.service.impl.FieldValidationServiceImpl;
import org.junit.Test;
import static calculator.domain.Service.*;

public class FieldValidationServiceImplTest {

    private FieldValidationService validationService = new FieldValidationServiceImpl();

    @Test(expected = IllegalArgumentException.class)
    public void complexObjectIsNullTest() {

        validationService.validateFields(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void camsungNegativeFieldsTest() {
        ComplexObject objectA = new ComplexObject(-1, 2, CAMSUNG);

        validationService.validateFields(objectA);
    }

    @Test
    public void camsungPositiveFieldsTest() {
        ComplexObject objectA = new ComplexObject(2, 2, CAMSUNG);

        validationService.validateFields(objectA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void hiaomiWrongFieldsTest() {
        ComplexObject objectA = new ComplexObject(101, -5, HIAOMI);

        validationService.validateFields(objectA);
    }

    @Test
    public void hiaomiFieldsInRangeTest() {
        ComplexObject objectA = new ComplexObject(5, -10, HIAOMI);

        validationService.validateFields(objectA);
    }
}
