import java.util.Scanner;

public class Prog_7{

    public static void main(String[] args)
    {
        int[] arr1=getArray();
        showArray(arr1);
    }

    /**
     * Создает массив ,размер и содержание которого указывает пользователь
     *
     * @return новый массив с элементами , которые ввел пользователь
     */
     static int[] getArray()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ВВедите размер масива:");
        int size = scanner.nextInt();
        int[] array =new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент массива " + i + " :");
            array[i] = scanner.nextInt();
        }
        System.out.println("Массив создан");
        return array;
    }

    /**
     * Выводид соднржимое массива переданного в метод
     * @param array массив ,который нужно вывести
     */
    static void showArray(int[] array)
    {
        System.out.print("Массив:");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}