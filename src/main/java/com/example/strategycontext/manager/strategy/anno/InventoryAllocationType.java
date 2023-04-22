package com.example.strategycontext.manager.strategy.anno;

import com.example.strategycontext.define.strategy.EInventoryAllocationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InventoryAllocationType {

	EInventoryAllocationType value() default EInventoryAllocationType.TRAFFIC_LINE_GRADE;
}
