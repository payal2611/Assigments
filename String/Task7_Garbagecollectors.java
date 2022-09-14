package com.yash.string.problem;

//WAP to demonstrate how garbage collector work when any memory is not 
//referenced by string object


public class Task7_Garbagecollectors {

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		// unreferance object
		Task7_Garbagecollectors s1 = new Task7_Garbagecollectors();
		Task7_Garbagecollectors s2 = new Task7_Garbagecollectors();
		s1 = null;
		s2 = null;
		System.gc();
		// now the first object referred by s3 is available for garbage collection
		//refenrace object
		Task7_Garbagecollectors s3 = new Task7_Garbagecollectors();
		Task7_Garbagecollectors s4 = new Task7_Garbagecollectors();
		s3 = s4;
	}
}
