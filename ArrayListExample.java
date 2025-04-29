/*
 * Activity 3.7.2
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample
{     public static void main(String args[])
   {    Scanner sc = new Scanner(System.in);
       
      ArrayList<String> animalList = new ArrayList<String>();  
      animalList.add("Dog");
      animalList.add("Cat");
      animalList.add("Parrot");
   
   
     
    for (boolean i = true; i == true;){
System.out.print("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace or (q)it");
String input = sc.nextLine();
if (input.equals("a"))
{
   System.out.print("Enter an animal");
   String addInput = sc.nextLine();
   animalList.add(addInput);
}
else if (input.equals("i"))
{
   System.out.print("Enter an animal");
   String insertInput = sc.nextLine();
   System.out.print("Enter an position");
   int insertInputNum = sc.nextInt();
animalList.add(insertInputNum - 1, insertInput);
}
else if (input.equals("r"))
{
   System.out.print("Enter the index you would like to remove");
   int  removeInputNum = sc.nextInt();
   animalList.remove(removeInputNum - 1);
}
else if (input.equals("p"))
{
   System.out.print("Enter an animal");
   String insertInput = sc.nextLine();
   System.out.print("Enter an position");
   int insertInputNum2 = sc.nextInt();
animalList.add(insertInputNum2 - 1, insertInput);
animalList.remove(insertInputNum2);
}
else if (input.equals("q"))
{
  i = false; 
}

System.out.println(animalList);
    }
      
   

   

    
      // display elements
      
   }  
}



