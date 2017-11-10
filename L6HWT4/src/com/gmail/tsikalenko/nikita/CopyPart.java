package com.gmail.tsikalenko.nikita;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyPart implements Runnable{
	
	private boolean fileIsCopy = false;
	private File in;
	private File out;
	private long begin;
	private long end;
	
	
	public CopyPart(File in, File out, long begin, long end) {
		super();
		this.in = in;
		this.out = out;
		this.begin = begin;
		this.end = end;
	}

	public CopyPart() {
		super();
	}
	
	public boolean isFileIsCopy() {
		return fileIsCopy;
	}

	public void copyPart() throws IOException {
		
		if (in == null || out == null) {
			throw new IllegalArgumentException("Null file pointer");
		}
		
		try (InputStream inSt = new FileInputStream(in); OutputStream ouSt = new FileOutputStream(out)) {
			int byteCopy = 0;
			long byteCopyAll = 0;
			inSt.skip(begin);
			byte[] bufferArrey = new byte[1024 * 1024];
			do {
				byteCopy = inSt.read(bufferArrey);
				ouSt.write(bufferArrey, 0, byteCopy);
			} while ((byteCopyAll += byteCopy) <= end || inSt.available() > 0);
			this.fileIsCopy = true;
		} catch (IOException e) {
			throw e;
		}
		
	}

	@Override
	public void run() {
		try {
			copyPart();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
