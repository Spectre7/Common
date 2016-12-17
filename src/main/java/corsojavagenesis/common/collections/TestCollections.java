package corsojavagenesis.common.collections;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TestCollections {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		Map map = new TreeMap();
		
		
		
		array.add("ip1");
		array.add("ip2");
		
		for (int i =0;i<array.size();i++){
			System.out.println(array.get(i));
		}
		
	}

}
