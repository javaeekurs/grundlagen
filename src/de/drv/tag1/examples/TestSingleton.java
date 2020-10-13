package de.drv.tag1.examples;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingletonSample sm = new SingletonSample();
		SingletonSample sm = SingletonSample.getInstance(42);
		System.out.println(sm.getZahl());
		
		SingletonSample sm2 = SingletonSample.getInstance(55);
		System.out.println(sm2.getZahl());
	}

}
