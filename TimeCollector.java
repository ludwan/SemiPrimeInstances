import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class TimeCollector {

	
	public static void main(String[] args) throws IOException {
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while(i < 100){
			System.out.println(i);
			sb.append(getTimeFile(i, args[0]) + System.getProperty("line.separator"));	
			i++;
		}
		PrintWriter pw = new PrintWriter("TimeCollection.txt", "UTF-8");
		pw.write(sb.toString());
		pw.close();
	}

	private static Object getTimeFile(int i, String args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args + "ReductionOutput" + i + ".txt"));
		String s = br.readLine();
		System.out.println(s);
		String ret = "";
		while(s != null){
			if(s.contains("100% all")){
				ret = s.split("100%")[0].replace('.', ',').split("[ ]+")[1];
				int j = 0;
				for(String ss: s.split("[ ]+")){
					System.out.println("["+ss+"]"+j);
					j++;
				}
			}
			s = br.readLine();
		}
		return ret;
	}

}