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
    }
}
