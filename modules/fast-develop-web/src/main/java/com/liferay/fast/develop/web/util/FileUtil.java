package com.liferay.fast.develop.web.util;

import java.io.*;

import java.nio.charset.StandardCharsets;

public class FileUtil {

	public static void writeFile(
		File f, byte[] contents, String expectedProjectName) {

		writeFile(f, new ByteArrayInputStream(contents), expectedProjectName);
	}

	public static void writeFile(File f, InputStream contents) {
		writeFile(f, contents, null);
	}

	public static void writeFile(
		File f, InputStream contents, String expectedProjectName) {

		if (f.exists()) {
			if (f.isDirectory()) {
			}
		}
		else {
			File parentFile = f.getParentFile();

			parentFile.mkdirs();
		}

		if (f.exists() && !f.canWrite()) {
			return;
		}

		byte[] buffer = new byte[1024];

		try (FileOutputStream out = new FileOutputStream(f)) {
			for (int count; (count = contents.read(buffer)) != -1;) {
				out.write(buffer, 0, count);
			}

			out.flush();
		}
		catch (IOException ioe) {
		}
	}

	public static void writeFile(
		File f, String contents, String expectedProjectName) {

		writeFile(
			f, contents.getBytes(StandardCharsets.UTF_8), expectedProjectName);
	}

}