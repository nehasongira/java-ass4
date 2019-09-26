import java.util.*;
class reverseWord{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       String words[]=str.split("\\s");  
       String reverseWord="";  
       for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
        }  
     reverseWord=reverseWord.trim();  
     System.out.println(reverseWord);
    }
}