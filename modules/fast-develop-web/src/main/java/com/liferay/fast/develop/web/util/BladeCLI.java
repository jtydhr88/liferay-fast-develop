package com.liferay.fast.develop.web.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Terry Jia
 */
public class BladeCLI {

	public static String[] execute(String args)
		throws InterruptedException, IOException {

		StringBuffer sb = new StringBuffer();

		sb.append("java -jar ");

		File bladeJar = getBladeJar();

		sb.append("\"");
		sb.append(bladeJar.getPath());
		sb.append("\"");

		sb.append(" ");
		sb.append(args);

		String command = sb.toString(
		).replaceAll(
			"\\\\", "/"
		);

		Process proc = Runtime.getRuntime(
		).exec(
			command
		);

		proc.waitFor();
		InputStream in = proc.getInputStream();

		byte[] b = new byte[in.available()];

		in.read(b, 0, b.length);

		in.close();

		List<String> lines = new ArrayList<>();

		Scanner scanner = new Scanner(new String(b));

		while (scanner.hasNextLine()) {
			String nextLine = scanner.nextLine();

			lines.add(nextLine.replaceAll(".*\\[null\\] ", ""));
		}

		scanner.close();

		boolean hasErrors = false;

		StringBuilder errors = new StringBuilder();

		for (String line : lines) {
			String lineLowerCase = line.toLowerCase();

			if (lineLowerCase.startsWith("error")) {
				hasErrors = true;
			}
			else if (hasErrors) {
				errors.append(line);
			}
		}

		return lines.toArray(new String[0]);
	}

	public static File getBladeJar() {
		String tmpdir = System.getProperty("java.io.tmpdir");

		File temp = new File(tmpdir);

		File bladeJar = new File(temp, "blade.jar");

		ClassLoader bladeClassLoader = BladeCLI.class.getClassLoader();

		try (InputStream in = bladeClassLoader.getResourceAsStream(
				"/blade.jar")) {

			if (!bladeJar.exists()) {
				FileUtil.writeFile(bladeJar, in);
			}
		}
		catch (IOException ioe) {
		}

		return bladeJar;
	}

	public static synchronized String[] getProjectTemplates() {
		List<String> templateNames = new ArrayList<>();

		try {
			String[] executeResult = execute("create -l");

			for (String name : executeResult) {
				String trimmedName = name.trim();

				if (trimmedName.contains(" ")) {
					templateNames.add(name.substring(0, name.indexOf(" ")));
				}
				else {
					templateNames.add(name);
				}
			}

			return templateNames.toArray(new String[0]);
		}
		catch (InterruptedException | IOException ioe) {
			return new String[0];
		}
	}

}