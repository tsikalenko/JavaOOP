package com.gmail.tsikalenko.nikita;

public class PartSum implements Runnable {

	private int sum = 0;
	private int[] arr;
	private int begin;
	private int end;
	
	public PartSum(int[] arr, int begin, int end) {
		super();
		this.arr = arr;
		this.begin = begin;
		this.end = end;
	}

	public PartSum() {
		super();
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getSum() {
		return sum;
	}

	private void sum() {
		for (int i = begin; i <= end; i++) {
			this.sum += arr[i];
		}
	}

	public void setSumToZero() {
		this.sum = 0;
	}

	@Override
	public void run() {
		sum();
	}

}
