package com.lang.test;

public class CounterImpl implements Counter {

	@Override
	public int add(int i,int j) {
		
		int result = i + j;
		System.out.println("addִ��" + result);
		return result;
	}

	@Override
	public int sub(int i,int j) {
		
		int result = i - j;
		System.out.println("subִ��" + result);
		return result;
	}

	@Override
	public int mul(int i,int j) {
		
		int result = i * j;
		System.out.println("mulִ��" + result);
		return result;
	}

	@Override
	public int div(int i,int j) {
		
		int result = i / j;
		System.out.println("divִ��" + result);
		return result;
	}

}
