public class Helloworld {
    public static void main(String[] args) {
       int[]goals = {1,2,0,3,2,4,2,1,0,1,3,2};

       for(int p = 0; p < goals.length; p++)
       {
        //index out of bounds for length 12 at line 7 == |resolved|
        if (goals[p] == 0)
        {
            System.out.println("previous game had no goals!");
        }
       }
    }
}