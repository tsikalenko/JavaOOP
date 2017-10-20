package com.gmail.tsikalenko.nikita;

public class Main {

	public static void main(String[] args) {
		Vector3d v1 = new Vector3d(1.3,2.5,1.5);
		Vector3d v2 = new Vector3d(0.3,3.4,2.1);
		
		Vector3d vSum= v1.sum(v2);
		Vector3d vVector = v2.vector(v1);
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		
		System.out.println();
		
		System.out.println(v1.scalar(v2));
		System.out.println(vSum.toString());
		System.out.println(vVector.toString());
	}

}
