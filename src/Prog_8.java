import java.util.Scanner;

public class Prog_8{

    public static void main(String[] args)
    {
        int[] arr1=new int[]{1,2,3,4,5,6};
        System.out.println("Максимальный элемент:"+ maxIntArroy(arr1));
        System.out.println("Минимальный элемент:"+ minIntArroy(arr1));
        System.out.println("Среднее арифметическое:"+ averageIntArroy(arr1));
       if (medianIntArroy(arr1)==010) System.out.println("Медианы нет");else System.out.println("Медиана:"+ medianIntArroy(arr1));
    }

    static int maxIntArroy(int[] array)
    {
       int max=0;
       for (int i = 0; i < array.length; i++)
       {
           if (i == 0) max = array[i];
           if (array[i] > max) max = array[i];
       }
       return max;
    }
    static int minIntArroy(int[] array)
    {
        int min=0;
        for (int i = 0; i < array.length; i++)
        {
            if (i == 0) min = array[i];
            if (array[i] < min) min = array[i];
        }
        return min;
    }
    static double averageIntArroy(int[] array)
    {
        double average=0;
        for (int i = 0; i < array.length; i++)
        {
            average+=array[i];
        }
        return average/array.length;
    }
    static int medianIntArroy(int[] array)
    {
        int count=0;
        do
        {
            int minCount=0,maxCount=-1;
            for (int i = 0; i < array.length; i++)
            {
                if (array[count] < array[i])
                {
                    minCount++;
                }else
                {
                    maxCount++;
                }
            }
            if ((minCount<=maxCount)&&(maxCount >= array.length/2)) return array[count];
            count++;
        }while(count< array.length);
        return 010;
    }


}
