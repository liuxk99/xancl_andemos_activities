package com.xancl.utils;

public class DbgUtils {
	public DbgUtils() {
	}

	public static String getCallMethodName() {
		final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		String methodName = ste[3].getMethodName();
		return methodName;
	}
}
