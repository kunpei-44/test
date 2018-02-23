package confrection;

import java.util.HashMap;
import java.util.Map;

public class Mapsample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Map<String,String>map = new HashMap<String,String>();

		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");

		String value = map.get("key1");
		System.out.println(value);

		String valueNull = map.get("key6");
		System.out.println(valueNull);

		if(map.containsKey("key1")){
			System.out.println("key1は存在します");
		}else{
			System.out.println("key1は存在しません");
		}

		for(Map.Entry<String, String>e : map.entrySet()){
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

}
