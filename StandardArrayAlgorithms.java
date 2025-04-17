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
    int j = 0;
    boolean allHasValue = false;
     for( allHasValue = false; j >= players.length; o++)
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
    }
  }