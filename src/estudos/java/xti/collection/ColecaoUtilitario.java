package estudos.java.xti.collection;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ColecaoUtilitario {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder result = new StringBuilder();

		ArrayList<String> list = new ArrayList<>();
		LinkedHashSet<String> set = new LinkedHashSet<>();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		Collections.addAll(list,"r","e","b","a","c","a","f");
		
		set.addAll(list);
		set.add("s");
		set.add("m");
		
		for(String s: list){
			map.put(s, 10);
		}
		
		bw.write(list.toString());
		
		map.put("e",5);

		result.append("\n\nFrequencia do elemento 'a' : ")
			  .append(Collections.frequency(list, "a"))
			  .append("\n")
			  .append(set)
			  .append("\n")
			  .append(map.get("e"));
		
		bw.write(result.toString());
		bw.flush();
	}

}
