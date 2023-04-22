package com.example.strategycontext.manager.strategy.anno;


import com.example.strategycontext.define.strategy.EPickingReleaseInstructionSelectionType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PickingReleaseInstructionSelectionType {

	EPickingReleaseInstructionSelectionType value() default EPickingReleaseInstructionSelectionType.PRIORITY;
}
