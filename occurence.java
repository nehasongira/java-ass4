import java.util.*;
 class  occurence{
     public static void main(String[] args)
     {
        String str = "Java is java again java again";
        System.out.println("Length Of String:" + str.length());
        System.out.println("Length Of String Without a :" + str.replace("a", "").length());
        int charcount = str.length() - str.replaceAll("a", "").length();
        System.out.println("Occurrence Of A Char In String: " + charcount);

     }
 }