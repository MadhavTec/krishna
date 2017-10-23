import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Scanner;

public class LargeResponses {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String fileLocation = s.next();
		s.close();

		File file = new File(fileLocation+".txt");
//		String fileName = file.getName();
//		fileLocation = file.getAbsolutePath();

		File newFile = new File("bytes_" + fileLocation + ".txt");

		Charset charset = Charset.forName("US-ASCII");
		int noRequests = 0, sum = 0, bytes = 0;
		try (BufferedReader reader = Files.newBufferedReader(file.toPath(), charset)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] columns = line.split(" ");
				bytes = Integer.valueOf(columns[columns.length - 1]);
				if (bytes > 5000) {
					noRequests++;
					sum += bytes;
				}
			}
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}

		String content = noRequests + System.lineSeparator() + sum;

		try (BufferedWriter writer = Files.newBufferedWriter(newFile.toPath(), charset)) {
			writer.write(content, 0, content.length());
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}

	}

}
