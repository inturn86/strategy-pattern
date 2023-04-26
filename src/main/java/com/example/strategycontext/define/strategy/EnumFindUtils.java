package com.example.strategycontext.define.strategy;

public class EnumFindUtils {
	public static <T extends Enum> T valueOfWithNotException(Class<T> enumClass, String name) {
		for(T c : enumClass.getEnumConstants()){
			if(c.name().equals(name))   return c;
		}
		return null;
	}

	public static <T extends Enum> T valueOfWithNotException(Class<T> enumClass, String name, T defaultEnum) {
		T findEnum = valueOfWithNotException(enumClass, name);
		return findEnum == null ? defaultEnum : findEnum;
	}
}