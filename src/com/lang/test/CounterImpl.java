package com.lang.test;

public class CounterImpl implements Counter {

	@Override
	public int add(int i,int j) {
		
		int result = i + j;
		System.out.println("add执行" + result);
		return result;
	}

	@Override
	public int sub(int i,int j) {
		
		int result = i - j;
		System.out.println("sub执行" + result);
		return result;
	}

	@Override
	public int mul(int i,int j) {
		
		int result = i * j;
		System.out.println("mul执行" + result);
		return result;
	}

	@Override
	public int div(int i,int j) {
		
		int result = i / j;
		System.out.println("div执行" + result);
		return result;
	}

}
