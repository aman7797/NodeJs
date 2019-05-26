import java.util.*;
import java.util.Scanner; 
  
class question2 { 
      
    static int mostFrequent(int arr[], int n) 
    { 

        Arrays.sort(arr); 
          
        int max_count = 1, res = arr[0]; 
        int curr_count = 1; 
          
        for (int i = 1; i < n; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                curr_count++; 
            else 
            { 
                if (curr_count > max_count) 
                { 
                    max_count = curr_count; 
                    res = arr[i - 1]; 
                } 
                curr_count = 1; 
            } 
        } 

        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = arr[n - 1]; 
        } 
      
        return res; 
    } 
      
    // Driver program 
    public static void main (String[] args) { 
          
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int [] myArray = new int[length];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<length; i++ ) 
        {
            myArray[i] = s.nextInt();
        }
        System.out.println("mostFrequent:"+mostFrequent(myArray,length)); 
          
    } 
} 
