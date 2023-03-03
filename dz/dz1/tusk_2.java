package dz1;
import java.util.Scanner;

public class tusk_2 
{
    public static void main(String[] args) throws Exception 
    {
        boolean flag = true;
            for (int i = 1; i <= 1000; i++) 
            {
                    for(int j = 2; j < i; j++)
                    {
                        if(i % j == 0)
                        {
                            flag = false;
                            break;
                        } 
                    }        
                if (flag)
                {
                    System.out.println(i);
                } 
                else
                {
                    flag = true;
                } 
            }         
    }    
}          
            
                
    


        


