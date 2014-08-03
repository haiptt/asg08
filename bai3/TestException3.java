/**
 * @(#)TestException3.java
 *
 */

import java.util.*;
import java.io.IOException;

class ExceptionA extends Exception{
}
class ExceptionB extends ExceptionA{
}

public class TestException3 {
	public static void main(String [] args){
		try{
			Random rand = new Random();
			int n = rand.nextInt(4);
			if( n == 0 ) throw new ExceptionA();
			else if( n == 1 )throw new ExceptionB();
			else if( n == 2 )throw new NullPointerException();
			else if( n == 3 )throw new IOException();
		}
		catch(ExceptionB e){
			e.printStackTrace();
		}
		catch(ExceptionA e){
			e.printStackTrace();
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}