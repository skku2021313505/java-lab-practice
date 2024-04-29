import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) throws IOException {
		InputStream fis = new FileInputStream("input.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream("output.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String data = "";
		int lineCount = 0;
		ArrayList<String> lines = new ArrayList<>();
		
		while ((data = br.readLine()) != null) {
			lineCount++;
			lines.add(data);
		}
		
		Collections.reverse(lines);
		for (int i = 0; i < lineCount; i++) {
			String str = lines.get(i);
			bw.write(str);
			if (i != lineCount - 1) bw.newLine();
		}
		bw.flush();
		
		br.close(); isr.close(); fis.close();
		bw.close(); osw.close(); fos.close();
	}

}
