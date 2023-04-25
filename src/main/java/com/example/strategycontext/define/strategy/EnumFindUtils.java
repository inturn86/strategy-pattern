package com.example.strategycontext.define.strategy;

public class EnumFindUtils {
	public static <T extends Enum<T>> T valueOfWithNotException(Class<T> enumClass, String name) {
		//enumClass.
		Enum.valueOf(enumClass, name);
		return null;
	}
}