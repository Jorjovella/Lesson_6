import java.util.Scanner;

public class Prog_9{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите позицию:");
        long numb= scanner.nextInt();
            System.out.println(pointFibonachi(numb));
    }
    static long pointFibonachi(long numb)
        {

            if(numb == 0)
            {
                return 0;
            }else
            {
                if(numb == 1)
                {
                    return 1;
                }else
                {
                    return pointFibonachi(numb-1)+pointFibonachi(numb-2);
                }
            }


        }
}