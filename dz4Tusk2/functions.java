import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class functions 
{

    public static int randNum() 
    {
        Scanner sc = new Scanner(System.in, "Cp866");
        /* System.out.println("Введите число: "); */
        if (sc.hasNextInt()) 
        {
            int number = sc.nextInt();
                if (number < 1 | number > 3) 
                {
                    System.out.println("Вы ввели число не входящее в диапазон! Повторите ввод! ");
                    return randNum();
                } 
                else 
                {
                    return number;
                }
        } 
        else 
        {
            System.out.println("Вы ввели не число! Повторите ввод! ");
        }
        return randNum();
    }

    public static String randStr() 
    {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    public static void enqueue(String str) 
    {
        LinkedList<String> ll = new LinkedList<>();
        LinkedList<String> test = new LinkedList<>();

        for (int i = 0; i < 10; i++) 
        {
            String s = randStr();
            test.addFirst(s); // showing original string
            ll.addLast(s); // showing reversed string
        }
        System.out.println("Добавление в начало массива:\n " + test);
        System.out.println("Добавление в конец массива:\n " + ll);

    }

    public static void dequeue(String str) 
    {
        LinkedList<String> ll = new LinkedList<>();
        LinkedList<String> test = new LinkedList<>();

        for (int i = 0; i < 10; i++) 
        {
            String s = randStr();
            ll.addLast(s);
        }
        System.out.println("Произвольный массив случайных строк:\n " + ll);
        System.out.println("Первый элемент из очереди: " + ll.pollFirst());
        System.out.println("Mассив после удаления первого элемента :\n " + ll);
    }

    public static void first(String str) 
    {
        LinkedList<String> ll = new LinkedList<>();
        LinkedList<String> test = new LinkedList<>();

        for (int i = 0; i < 10; i++) 
        {
            String s = randStr();
            ll.addLast(s);
        }
        System.out.println("Произвольный массив случайных строк:\n " + ll);
        System.out.println("Первый элемент из очереди: " + ll.getFirst());

    }
}
