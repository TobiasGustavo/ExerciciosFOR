package exFor;

public class ex01 {


       public static void main(String[] args) throws InterruptedException {
    	  // Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
    	   
    	   
    	   int x; 
    	   
    	   for (x  = 1000; x <= 1999; x++) {
    		   if(x % 11 == 5)
    	   {
    			   System.out.println("Os numeros que sao dividos sao: " + x);
    			   Thread.sleep(1000);
    		   }
    	   }
       }
}