package com.mehdi.xparser.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Typed
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Number {
    boolean isLong() default false;
}
