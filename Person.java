public class Person {
   private int age;
   private boolean inSchool;
   private String Name;
   
   
   
    public Person(int age, boolean inSchool, String Name){
this.age = age;
this.inSchool = inSchool;
this.Name = Name;



   }
   public String getName()
   {
     return (Name + " " + age + " " + inSchool);
   
   } 
   public String toString() 
   {
      return getName();
   }
}
