package estudos.java.xti.string;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class StringOperacoes {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = 
				new BufferedWriter(new OutputStreamWriter(System.out));
		String so = 
				"Bill is not a scientist. Mary is a scientist.";
		Boolean o  = 
				so.regionMatches(true, 8, "not", 0, 3);
		
		bw.write(o.toString());
		bw.flush();
		
	}

}
