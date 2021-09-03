package fizzBuzz;

public class FizzBuzz {
	
	public String fizzBuzz(int a ){
			
	        String num="";



	        if(a%3==0 && a%5==0){
	            System.out.println("FizzBuzz");

	            
	        } else {
	            if(a%5==0){
	            System.out.println("Buzz");
	            
	            }else{
	                if(a%3==0 ){
	            System.out.println("Fizz");
	            } else{

	            	num=Integer.toString(a);

	            }

	            }
	    }
	        return num;

	    }    
	    
	    public String fizzBuzz(int a, String multiOf3word,String multiOf5word,String multiOf15word) {
	    	
	    	
	    	 String num="";



	         if(a%3==0 && a%5==0){
	            //System.out.println("multiOf15word");
	        	 num="multiOf15word";

	             
	         } else {
	             if(a%5==0){
	             System.out.println("multiOf5word");
	             
	             }else{
	                 if(a%3==0 ){
	             System.out.println("multiOf3word");
	             } else{

	            	 num=Integer.toString(a);
	             }

	         }
	     }
	         return num;
	    }

		
		}		
