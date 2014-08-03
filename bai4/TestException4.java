/**
 * @(#)TestException4.java
 *
 */

class SomeException{
	SomeException() throws Exception{
		throw new Exception();
	}
}

public class TestException4 {
	public static void main(String[] args) {
		try{
			SomeException e = new SomeException();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
