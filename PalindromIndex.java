import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PalindromIndex {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        String line = br.readLine();
        int n = Integer.parseInt(line);
        
        
        for( int i = 0; i< n ; i++){
            int index = -1;
            line = br.readLine();
            int end = line.length()/2;
            for( int j = 0; j<end ; j++){
                //System.out.println(line.charAt(j) + " " + line.charAt(line.length()-j-1));
                if(line.charAt(j) == line.charAt(line.length()-j-1))
                    continue;
                else{        
                    if(line.charAt(j) == line.charAt(line.length()-j-2))
                       index = line.length()-j-1;
                    else
                       index = j;
                    break;
                }
            }
            System.out.println(index);
        }
        }
        catch(IOException e){
            throw new IOException("Error");
        }
    }
}
