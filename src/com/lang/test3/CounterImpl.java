package com.lang.test3;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("counter")
public class CounterImpl implements Counter {
	@Value("100") 
	private int Int1;
	@Value("50") 
	private int Int2;
	
	@Override
	public int add() {
		
		int result = Int1+ Int2;
		System.out.println("add执行" + result);
		return result;
	}

	@Override
	public int sub() {
		
		int result = Int1 - Int2;
		System.out.println("sub执行" + result);
		return result;
	}

	@Override
	public int mul() {
		
		int result = Int1 * Int2;
		System.out.println("mul执行" + result);
		return result;
	}

	@Override
	public int div() {
		
		int result = Int1 / Int2;
		System.out.println("div执行" + result);
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
