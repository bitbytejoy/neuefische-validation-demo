package de.neuefische.neuefischevalidationdemo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class CarFeatureConstraintValidator implements ConstraintValidator<CarFeatureConstraint, String> {
    private String myCustomAttribute;

    @Override
    public void initialize(CarFeatureConstraint constraintAnnotation) {
        myCustomAttribute = constraintAnnotation.myCustomAttribute();
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        System.out.println("myCustomAttribute = " + myCustomAttribute);
        return List.of("airbag", "abs", "esp").contains(value);
    }
}
