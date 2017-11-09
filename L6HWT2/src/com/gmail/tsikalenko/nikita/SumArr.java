package com.gmail.tsikalenko.nikita;

public class SumArr {
	public static int sum(int[] arr) {

		int lenght = arr.length / 3;
		int p1Begin = 0;
		int p1End = p1Begin + lenght;
		int p2Begin = p1End + 1;
		int p2End = p2Begin + lenght;
		int p3Begin = p2End + 1;
		int p3End = arr.length - 1;

		PartSum s1 = new PartSum(arr, p1Begin, p1End);
		PartSum s2 = new PartSum(arr, p2Begin, p2End);
		PartSum s3 = new PartSum(arr, p3Begin, p3End);

		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		Thread t3 = new Thread(s3);

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int sum = s1.getSum() + s2.getSum() + s3.getSum();
		return sum;
	}
}
