package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Basic {
	
	public void numbersFrom1to255() {
		
		for (int i=1;i<=255;i++) {
			System.out.println(i);
			
			
		}
}
	
	
	
	public void oddNumbersFrom1to255() {
		
		for (int i=1;i<=255;i++) {
			if(i%2!=0)
				
			System.out.println("Odd Number "+i);
			
			
		}
	
	}
	
	public void evenNumbersFrom1to255() {
		
		for (int i=1;i<=255;i++) {
			if(i%2==0)
				
			System.out.println("Even Number "+i);
			
			
		}
}

	public int sumFrom1To255() {
	
	int sum=0;
	for(int i=1;i<=255;i++) {
		
		sum=sum+i;
		
	}
	return sum;
	
}
		public void iteratingArray() {
			
			int [] arr= {1,3,5,7,9,13};
			
			for (int i=0;i<arr.length;i++) {
				
				System.out.println(arr[i]);
				
			}
			
			
		}
		
		
		public void findMaxUsingCollection() {
			
			Integer [] num= {4,5,2,9,7};
			
			int minNum=Collections.min(Arrays.asList(num));
			System.out.println("Minimum Number: "+minNum);
			
			int maxNum=Collections.max(Arrays.asList(num));
			
			System.out.println("Maximum Number: "+maxNum);
			
		}
		
			public int findMax() {
			
			Integer [] arr= {4,-5,-2,-9,-7};
			
			int max=arr[0];
			
			for (int i=1;i<arr.length;i++) {
				
				if(arr[i]>max) {
					
					max=arr[i];
			
				
				
				}
			}
			return max;
			
			}
			
			
			public void createArrayY() {
				
				ArrayList Y= new ArrayList ();
				
				for (int i=1;i<=255;i++) {
					if (i%2!=0)
					
					Y.add(i);
					
					
				}
				
				System.out.println("Array Y ="+Y);
				
			}

			public void getAverage(int [] arr) {
				
				
				int average=0;
				int	sum=0;
				for(int i=0;i<arr.length;i++) {
					
				sum = sum+arr[i];
				
					average=sum/arr.length;
			
				}
				
				System.out.println(average);
				
			}
			
			public void greaterThanY() {
				
				int [] array = {1, 3, 5, 7};
				
				int Y= 3;
				int count=0;
				
				for (int i=1;i<array.length;i++) {
					
					if(array[i]>Y) {
						Y=array[i];
						
						count ++;
					}
			
				}
				
				System.out.println(count);
				
			}
			
			
			public  void squareTheValue() {
				
				double arr [] = {2,5,10,-2};
				
				double [] squareValue= new double[arr.length];
				
				for (int i=0;i<arr.length;i++) {
					
					 squareValue [i]=  Math.sqrt(arr[i]);
					 
					 System.out.println("Squreroot of array are: "+squareValue [i]);
				}
				
				
			}
			
			
}
