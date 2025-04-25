import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {  
        ArrayList<Person> myList = new ArrayList<Person>();
        myList.add(new Person(14,true,"kevin"));
        myList.add(new Person(20,false,"trucy"));
        myList.add(new Person(9,true,"lacey"));
   
   
        System.out.println(myList);
    }
}
