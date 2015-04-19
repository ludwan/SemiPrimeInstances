import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Separator {

	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new FileReader(args[0]));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int i = 0;
		while (s != null) {
			if (s.equals("c -/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/")
					|| s.equals("c-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/")
					|| s.equals("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/")
					|| s.equals(" -/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/")
					|| s.equals("cc -/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/")
					|| s.equals("cc-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/")) {
				PrintWriter pw = new PrintWriter(args[0].split("reduktion")[0]
						+ "ReductionOutput" + i + ".txt");
				pw.write(sb.toString());
				pw.close();
				i++;
				sb = new StringBuilder();
			} else {
				sb.append(s + System.getProperty("line.separator"));
			}

			s = br.readLine();
		}
	}

}
