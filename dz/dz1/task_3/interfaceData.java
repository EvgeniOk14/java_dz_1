package task_3;

public class interfaceData 
{
    static void startProgram()
    {  
    functions.operationList();


    int number = functions.operation_number();

    
    while(number < 1 || number > 4)
    {
        System.out.println("Вы ввели не верный номер операции!\n Введите его снова!");
        functions.operationList();
        number = functions.operation_number();
    }
    
      
      if (number == 1)
      { 
    System.out.print("Результат сложения двух чисел равен: " + functions.sumData(functions.inputData1(),functions.inputData2()));
      }
      else if (number == 2)
      {
    System.out.print("Результат вычитания двух чисел равен: " + functions.subData(functions.inputData1(),functions.inputData2()));
      }
      else if (number == 3)
      {
    System.out.print("Результат умножения двух чисел равен: " + functions.multData(functions.inputData1(),functions.inputData2()));
      }
      else if (number == 4)
      {
    System.out.print("Результат деления двух чисел равен: " + functions.divData(functions.inputData1(),functions.inputData2())); 
      } 
 }
}
