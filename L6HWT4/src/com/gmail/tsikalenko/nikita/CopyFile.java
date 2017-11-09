package com.gmail.tsikalenko.nikita;

import java.io.File;

public class CopyFile {

	public static boolean copyFile(File in, File out) {
		long lenght = in.length()/(1024*1024)/3;
		long p1Begin = 0;
		long p1End = p1Begin + lenght*(1024*1024);
		long p2Begin = p1End + 1;
		long p2End = p2Begin + lenght*(1024*1024);
		long p3Begin = p2End + 1;
		long p3End = in.length();

		CopyPart p1 = new CopyPart(in, out, p1Begin, p1End);
		CopyPart p2 = new CopyPart(in, out, p2Begin, p2End);
		CopyPart p3 = new CopyPart(in, out, p3Begin, p3End);

		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);

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
		if(p1.isFileIsCopy() && p2.isFileIsCopy() && p3.isFileIsCopy()) {
			return true;
		} else {
			return false;
		}
	}

}
