package de.neuefische.neuefischevalidationdemo;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({
    ElementType.FIELD,
    ElementType.TYPE_USE
})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CarFeatureConstraintValidator.class)
@Documented
@Repeatable(CarFeatureConstraint.List.class)
public @interface CarFeatureConstraint {
    String message() default "Feature must be one of: airbag, abs, esp";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String myCustomAttribute() default "default value";

    @Target({
        ElementType.FIELD,
        ElementType.TYPE_USE
    })
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        CarFeatureConstraint[] value();
    }
}
