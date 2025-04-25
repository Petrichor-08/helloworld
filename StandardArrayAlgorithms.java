public class StandardArrayAlgorithms {
    public static void main(String[] args)
    {
      int max = 0;
      int min = 0;
      int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
            int[] goalCounter = new int[9];
          int sum = 0;
          for (int i = 0; i < goals.length; i++)
            {
             if(goals[i] > max)
             {
                max = goals[i];
             }
             if(goals[i] < min)
             {
                min = goals[i];
             }
            }
          for (int p = 0; p < goals.length; p++)
          {
           for (int s = 0; s < goals.length; s++)
           {
            if (goals[s] == p)
            {
                goalCounter[p]++;
            }
           }
          }
          
          System.out.println("max goals in a game " + max);
          System.out.println("min goal in a game " + min);
        
        for( int r = 0; r < goalCounter.length; r++)
        {
            System.out.println("there were " + goalCounter[r] + " games with " + r + " goals" );
        }
        Player[] players = {new Player("Alex", 12), new Player("Aiden", 13),
        new Player("Bobbie", 18), new Player("Blaine", 20),
        new Player("Chris", 15), new Player("Charlie", 15) };
int o = 0;
boolean hasValue = false;
     for( hasValue = false; hasValue == true; o++)
     {
      if(players[o].getAge() >= 18)
      {
        hasValue = true;
      }
     }
     if(hasValue == true)
     {
      System.err.println("a player was found that was over 18");
     }
     else
     {
      System.err.println("a player was not found that was over 18");
     }
   //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
     int j = 0;
    boolean allHasValue = false;
     for( allHasValue = false; j >= players.length; j++)
     {
      if(players[o].getAge() >= 21)
      {
        allHasValue = true;
      }
     }
     if(allHasValue == true)
     {
      System.err.println("not all players are over 21");
     }
     else
     {
      System.err.println("all players are under 21");
     }
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    
    int y = 0;
    int g = 0;

    
     for( g = 0; g < players.length; g++)
     {
      if(players[g].getAge() == 15)
      {
       y++;
      }
     }
     
      System.err.println("there are " + y + " who are 15");
 //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
      int l = 1;  
int n = 0;
for (n = 0;n < players.length; n++)
{
System.out.print(players[n].getName() + " ");
  if(l == 2)
 {
System.out.println("");
  l = 0;
 }
l++;
}
String[] arr = {"A","B","C","D","E","F"};

for (int t = arr.length; t > 1; t--)
{
String temp = arr[t-2];
arr[t - 2] = arr[t - 1];
arr[y - 1] = temp;
}
for (int i = 0; i < arr.length/2; i++)
{
  String tmp = arr[i];
  arr[i] = arr[arr.length - i - 1];
  arr[arr.length - i - 1] = tmp;
}













    }
 }
  