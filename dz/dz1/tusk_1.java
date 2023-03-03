package dz1;
import java.util.Scanner;

public class tusk_1 
{
    static public void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in, "Cp866");
        System.out.println("Введите целое положительное число n: ");
        int n = scan.nextInt();
        int meanSum = 0;
        int factor = 1;
            for (int i = 1; i <= n; i++) 
            {
                meanSum = meanSum + i;
                factor = factor*i;
            }
        System.out.printf("Среднее арифметическое " + n + " равно %d\n  факториал "+ n + " равен %d\n ", meanSum, factor);    
   }
}
        
    
