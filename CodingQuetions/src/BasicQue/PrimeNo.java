package BasicQue;

import java.util.ArrayList;
import java.util.List;

public class PrimeNo{

	// check prime or not
	public static boolean checkPrime(int n) {
	
		if(n<=1) return false;
	    //for (int i = 2; i * i <= num; i++) 
		//for (int i = 2; i <= Math.sqrt(n); i++)
		 for (int i = 2; i <= n / 2; ++i) {
		      if (n % i == 0) {
		    	  return false;
		      }
		   }
		    return  true;
	}
	
	// print prime no
	public static int[] printPrime(int n) {
		
		int[] prime = new int[n + 1]; 
		List<Integer> answer = new ArrayList<>();
		
        for (int i = 2; i <= n; i++) {
        	if(prime[i]==0) {
            	for(int j=i*i; j<=n; j+=i) {
            		prime[i]=1;
            	}
           }
        }
            
        for (int i = 2; i <= n; i++) {
        	if(prime[i]==0) {
        		answer.add(i);
        	}
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
	}

    public static void main(String args[]){
    	int num = 15;
    	System.out.println(checkPrime(num));
    	
    	 int[] primes = printPrime(num);

         // Print the prime numbers
         for (int prime : primes) {
             System.out.print(prime + " ");
         }
    }
}