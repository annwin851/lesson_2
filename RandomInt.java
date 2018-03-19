package ru.levelup.lesson3.random;


import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RandomInt {

    int min() default 10;

    int max() default 300;


}
