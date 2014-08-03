/**
 * @(#)TestException6.java
 *
 */

import java.util.*;
public class TestException6 {

	void Test() throws RuntimeException{
		throw new RuntimeException();
	}
	void Test1() throws RuntimeException{
		try{
			Test();
			throw new NullPointerException();
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
	}
	public static void main (String args[]){
		TestException6 t = new TestException6();
		try{
			t.Test1();
		}
		catch(RuntimeException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Exit program!");
		}
	}

}