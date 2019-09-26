import java.util.*;
 class sort{
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         
         String str=sc.nextLine();
         String[] arr=str.split(" ");
         Arrays.sort(arr);
         String str1=Arrays.toString(arr);
         str1= str1.replace(",", " ").replace("[", "").replace("]", "");
         System.out.println(str1);

 }
}