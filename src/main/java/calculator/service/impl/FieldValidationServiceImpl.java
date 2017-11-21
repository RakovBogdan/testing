package calculator.service.impl;

import calculator.domain.ComplexObject;
import calculator.service.FieldValidationService;

import static calculator.domain.Service.*;

public class FieldValidationServiceImpl implements FieldValidationService {

    @Override
    public void validateFields(ComplexObject complexObject) {
        if (complexObject == null) {
            throw new IllegalArgumentException("ComplexObject cannot be null!");
        }

        if (CAMSUNG.equals(complexObject.getService()) &&
                (complexObject.getValueA() <= 0 || complexObject.getValueB() <= 0)) {
            throw new IllegalArgumentException("CAMSUNG - serviced objects must be postitve!");
        }

        if (HIAOMI.equals(complexObject.getService()) &&
                (complexObject.getValueA() <= -100 || complexObject.getValueA() >= 50 ||
                complexObject.getValueB() >= 0)) {
            throw new IllegalArgumentException("HIAOMI - serviced objects must be have value A in range -50;100" +
                    "and negative value B!");
        }


    }
}
