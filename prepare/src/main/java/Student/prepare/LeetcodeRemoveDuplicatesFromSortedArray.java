package Student.prepare;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class LeetcodeRemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,1,2,5,8,4,5,7,5,2,1,5,1};
		HashSet hs=new HashSet();
		for(int x =0;x<=a.length-1;x++){
			hs.add(a[x]);
		}
		TreeSet ss=new TreeSet(hs);
		Iterator it=ss.iterator();
		
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		
		}
	}

}
