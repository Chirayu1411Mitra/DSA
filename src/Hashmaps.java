import java.util.HashMap;
import java.util.Scanner;
public class Hashmaps{
	public static void main(String[] args){
	// create a hashmap
	HashMap<String,Integer>map=new HashMap<>();
	//add element in hahsmap
map.put("Apple", 20);
map.put("Banana", 30);
// print out using key value 
System.out.println(map.get("Apple"));
// to check if key value exists 
System.out.println(map.containsKey("Apple"));
//to remove the element form hashmap
map.remove("Apple");



}


}
