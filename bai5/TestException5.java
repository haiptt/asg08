/**
 * @(#)TestException5.java
 */


public class TestException5 {
	void someMethod() throws Exception{
		someMethod2();
	}
	void someMethod2() throws Exception{
		throw new Exception();
	}

	public static void main(String[] args) {
		TestException5 t = new TestException5();
		try{
			t.someMethod();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}