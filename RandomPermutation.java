import java.util.Random;

public class RandomPermutation {
    public static int[] next(int i) {
      int[] oldArray = new int [i];
        int[] newArray = new int[i];
       int h = 0;
        for (h = i - 1; h >= 0; h--)
        {
          oldArray[h] = h;
        }
        
        for( int g = i - 1; g >= 0 ; g--)
        {                         
          int l = (int) (Math.random() * g);
         newArray[g] = oldArray[l];
         oldArray[l] = oldArray[g];

        }


        System.out.println(java.util.Arrays.toString(newArray));
        return newArray;
    }
    public static void main(String[] args)
    {
        
    }

}
