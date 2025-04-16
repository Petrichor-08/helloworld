public class Helloworld {
    public static void main(String[] args) {
       int[]goals = {1,2,0,3,2,4,2,1,0,2,0,1,3,2};
int index = 0;
       while(index < goals.length)
       {
        //index out of bounds for length 12 at line 7 == |resolved|
        if (goals[index] == 0)
        {
            System.out.println("previous game had no goals!");
        }
        index++;
    }
       
    }
}