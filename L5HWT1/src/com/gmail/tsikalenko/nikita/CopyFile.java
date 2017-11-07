package com.gmail.tsikalenko.nikita;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

	public static void copy(File out, File in, String sours) throws IOException {
		if (in == null || out == null) {
			throw new IllegalArgumentException("Null file pointer");
		}
		if (!in.isDirectory() || !out.isDirectory()) {
			throw new IllegalArgumentException("Not directory");
		}
		MyFileFilter mFF = new MyFileFilter(sours);
		File[] fileList = out.listFiles(mFF);
		for (File file : fileList) {
			System.out.println(file.getName());
			try (InputStream inSt = new FileInputStream(file); OutputStream ouSt = new FileOutputStream(out)) {
				int byteCopy = 0;
				byte[] bufferArrey = new byte[1024 * 1024];
				for (; (byteCopy = inSt.read(bufferArrey)) > 0;) {
					ouSt.write(bufferArrey, 0, byteCopy);
				}

			} catch (IOException e) {
				throw e;
			}
		}
	}

}