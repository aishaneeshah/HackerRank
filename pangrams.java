
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try{
            str = br.readLine();
        }
        catch(IOException e){
            throw new IOException("Line not found");
        }
        boolean[] CharArray = new boolean[26];
        int val;
        for(int i = 0;i < str.length(); i++){
            val = (int) str.charAt(i);
            if(val >= 97){
                val = val - 97;
                CharArray[val] = true;
            }
           else if(val >= 65){
               val= val - 65;
               CharArray[val] = true;
           }
            
        }
        boolean flag = true;
        for(int i = 0; i < 26 ;i++){
            if(CharArray[i] != true)
            {
                flag = false;
                System.out.println("not pangram");
                return;
            }
            
        }
        System.out.println("pangram");
    }
}
