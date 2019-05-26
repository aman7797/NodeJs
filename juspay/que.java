/* IMPORTANT: Multiple classes and nested static classes are supported */
import java.util.*;
import java.util.Scanner;
import java.io.*;
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        // System.out.println("Enter the element of the array:");
        while(s.hasNextInt()) {
            int num = s.nextInt();
            myArray.add(new Integer(num));
        }
        // System.out.print("Enter no 1 :-");
        int num1=s.nextInt();
        // System.out.print("Enter no 2 :-");
        int num2=s.nextInt();
        // System.out.println("Answer:"+answer(myArray,length,num1,num2));
        System.out.println(answer(myArray,length,num1,num2));
    }
    
    static int answer(ArrayList<Integer> arr,int n,int num1,int num2){
        int expected = (num2-num1)/2;
        // System.out.println("Expected:"+expected);
        if(expected<=arr.get(0)){
            return arr.get(0);
        }
        else if(expected>=arr.get(n-1)){
            return arr.get(n-1);
        }
        
        int i=0,j=n,mid=0;
        while(i<j)
            mid = (i+j)/2;
            if(arr.get(mid)==expected){
                return arr.get(mid);
            }
            if(expected<arr.get(mid)){
                if(mid>0&&expected>arr.get(mid-1)){
                    return getValue(arr.get(mid-1),arr.get(mid),expected);
                }
                j=mid;
            }
            else {
                if(mid<n-1&&expected<arr.get(mid+1)){
                    return getValue(arr.get(mid),arr.get(mid+1),expected);
                }
                i=mid+1;
            }
        return arr.get(mid);
    }
    
    public static int getValue(int val1,int val2,int expected){
        // System.out.println("in getValue"+val1+val2+expected);
        if(expected - val1>=val2-expected){
            return val2;
        }
        else{
            return val1;
        }
    }
}
