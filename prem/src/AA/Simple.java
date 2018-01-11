package AA;

import java.util.StringTokenizer;

public class Simple {
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("my name is khan"," ");  
     while (st.hasMoreElements ()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  