import java.util.Scanner;
import java.util.ArrayList;

public class EditString
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter string :");
      String userString = scan.nextLine();
      
      String userCommand = "";
      ArrayList<String> CommandList = new ArrayList<String>();
   
      while(userCommand!= "X")
      {
         System.out.println("please enter the commands:");
         userCommand = scan.nextLine();
         CommandList.add(userCommand);
      }
   
   
   }
}
