package com.cjc.logical;

//import javax.swing.undo.CannotUndoException;

class Exc0 extends Exception{}
class Exce1 extends Exc0{}
public class Test {
	
	public static void main(String[] args) {
		
		try {
			throw new Exce1();
		} catch (Exc0 e) {
			// TODO: handle exception
			System.out.println("Exc0 caught");
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Excdepto caught");
			
		}
	}

}
