package com.bookstore.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({TYPE,FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidCategoryIdValidator.class)
public @interface ValidCategoryId {
    String message() default "Vui long chon danh muc";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
