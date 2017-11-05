import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.commons.collections.iterators.EntrySetMapIterator;

public class TestOne extends Throwable{
	
	
	
	public static void main(String args[]) {
		
		ExecutorService executorService = Executors.newScheduledThreadPool(1);
		
		Future fu = executorService.submit(new Thread());
		
		Executors.newFixedThreadPool(1);
		Executors.newSingleThreadExecutor();
		Executors.newCachedThreadPool();
		
		
		
		int[] numbers = new int[]{1,2,3,4,5,6};
    	int[] myArray = {0,1,2,3};
		
		for (int i = 0; i < myArray.length; i++) {
		  myArray[i] = 0;
		}
		
		
		int[][] myArray1 = { {0,1,2,3}, {3,2,1,0}, {3,5,6,1}, {3,8,3,4} };
		
		List<List<String>> listOfLists = new ArrayList<List<String>>();
		List<String> ll = new ArrayList<>();
		
		Collections.sort(ll);
		
		Iterator<String> df= ll.iterator();
		
		
		Map<String, String> hashmap = new HashMap<>();
		 		   
		
		Collection<String> ss =  hashmap.values();
		
		hashmap.hashCode();
		Set<Entry<String,String>> s =hashmap.entrySet();
		
		for(Entry<String,String> ee : s){
			
			
			
		}
		
		
		for (int i = 0; i < myArray1.length; i++) {
			  for (int j = 0; j < myArray1.length; j++) {
				  System.out.println(myArray1[i][j]);
			  }
			}
		
		
		String testString = "123hjdfjfjsdd5";
		
		char[] ccc= testString.toCharArray();
		
		
		
		
		char ch[] = testString.toCharArray();
		
		int[][] myArray3 = {  {0, 1, 2, 3},
				              {3, 2, 1, 0},
				              {3, 5, 6, 1},
				              {3, 8, 3, 4}  };
		
		int[][] ayy = new int[][]{  {0, 1, 2, 3},{3, 2, 1, 0},{3, 5, 6, 1},{3, 8, 3, 4}  };
		
		Object[] oo = new Object[10];
		
		List<int[]> es = Arrays.asList(myArray3);
		
		
		
		int total=0;
		int temp=0;
		for(char c : ch){
			if(!Character.isAlphabetic(c)){
				temp = temp*10+(c-'0');
			}else{
				total=total+temp;
				temp = 0;
			}
		}
		if(temp>0)
			total=total+temp;
		System.out.println(total);
		
	}

	
	public int compareTo(TestOne o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	public int compare(TestOne o1, TestOne o2) {
		// 
		return 0;
	}

	
	
}