package com.lang.test2;

public class CounterImpl implements Counter {

	private int Int1;
	private int Int2;
	
	@Override
	public int add() {
		
		int result = Int1+ Int2;
		System.out.println("addִ��" + result);
		return result;
	}

	@Override
	public int sub() {
		
		int result = Int1 - Int2;
		System.out.println("subִ��" + result);
		return result;
	}

	@Override
	public int mul() {
		
		int result = Int1 * Int2;
		System.out.println("mulִ��" + result);
		return result;
	}

	@Override
	public int div() {
		
		int result = Int1 / Int2;
		System.out.println("divִ��" + result);
		return result;
	}

	public int getInt1() {
		return Int1;
	}

	public void setInt1(int int1) {
		Int1 = int1;
	}

	public int getInt2() {
		return Int2;
	}

	public void setInt2(int int2) {
		Int2 = int2;
	}

}
