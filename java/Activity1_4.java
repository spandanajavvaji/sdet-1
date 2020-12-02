package JavaActivity2;

import java.util.Arrays;

public class Activity1_4
{
	    static void Insertionsort(int array[]) {
        int size = array.length;
        
        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
    
    public static void main(String args[])
    {
        int[] data = { 21, 90, 19, 30, 12, 71, 37, 81 };
        Insertionsort(data);
        System.out.println("Ascending Order: "+ Arrays.toString(data));
        
    }
}
