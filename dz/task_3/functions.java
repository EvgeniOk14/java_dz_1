package task_3;
import java.io.Reader;
import java.util.Scanner;

public class functions
{ 

    static int sumData(int a, int b)
    {
        return a + b;
    }

    static int subData(int a,int b)
    {
        return a - b;
    }

    static int multData(int a, int b)
    {
        return a * b;
    }

    static double divData(double a, double b)
    {
        return a / b;
    }

    static int inputData1()
    {
        Scanner sc = new Scanner(System. in, "Cp866");
        System.out.println("Введите первое число: ");
        String s = sc.nextLine();
        int number = Integer.parseInt(s);
        return number;
    }

    static int inputData2()
    {
        Scanner sc = new Scanner(System. in, "Cp866");
        System.out.println("Введите второе число: ");
        String s = sc.nextLine();
        int number = Integer.parseInt(s);
        return number;

    }

    static int operation_number()
    {
        Scanner sc = new Scanner(System. in, "Cp866");
        System.out.println("Введите номер операции: ");
        String s = sc.nextLine();
        int number = Integer.parseInt(s);
        return number;    
    }


    static void operationList()
    {
        System.out.println("""
            Выберете математическую операцию:
            1 - сумма
            2 - вычитание
            3 - умножение
            4 - деление 
                """);
    }
    
}