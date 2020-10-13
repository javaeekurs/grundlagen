package de.drv.tag1.examples;

public class SingletonSample {
	
	private static SingletonSample instance = null;
	private int zahl = 0;
	
	private SingletonSample(int zahl) {
		System.out.println("Instanzierung der Klasse");
		this.zahl = zahl;
	}

	public static SingletonSample getInstance(int zahl) {
		if (instance == null)  {		
			instance = new SingletonSample(zahl);
			// Auwendige Arbeit, bspw. Config laden, Datensätze etc.
		}
		
		return instance;
	}

	public int getZahl() {
		return zahl;
	}
	
	
}

