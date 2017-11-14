package Student.prepare;

import java.util.ArrayList;
import java.util.Iterator;

public class ArratListSort {

	public static void main(String[] args) {
		//arraylist.sort排序
		ArrayList <String> name=new ArrayList<String>();
		name.add("peter");
		name.add("a");
		name.add("b");
		name.add("r");
		name.add("peter");
		name.add("d");
		name.add("w");
		name.add("c");
		name.add("b");
		for(String s:name){
			System.out.print(s);
		}
			System.out.println("");
		name.sort(null);
		for(String s:name){
			System.out.print(s);
		}
		name.set(4, "2");
		for(String s:name){
			System.out.print(s);
		}
		Iterator  aa=name.iterator();
		while(aa.hasNext()){
			System.out.print("11"+aa.next());
		}
	}

}
