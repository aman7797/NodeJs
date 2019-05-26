/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main {
    public static int processArray(ArrayList<Integer> array) {
        /* 
         * Modify this function to process `array` as indicated
         * in the question. At the end, return the appropriate
         * value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */
        int count=0,sum=0,average=0;
        ArrayList<Integer> Acount = new ArrayList<Integer>();
        try {
                for(Integer num : array){
                    // System.out.println("Going in if loop"+num);
                    if(num % 2 != 0){
                        // System.out.println("value"+num);               
                        count++;
                        // System.out.println("in if conditon "+count);
                        }
                        else{
                            // System.out.println("in else condition"+count);
                            Acount.add(count);
                            count=0;
                        }
                    
                }
            }catch(Exception e){
                                    System.out.println(e);
                                }
        // System.out.println("in for condition"+count);
        Acount.add(count);
        for(int i = 0; i < Acount.size(); i++)
            sum+= Acount.get(i);
        
        // System.out.println("sum"+sum);
        
        average=sum/Acount.size();
        // System.out.println("average"+average);
        
        return average;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}
