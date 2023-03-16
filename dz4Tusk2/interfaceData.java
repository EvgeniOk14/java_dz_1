
public class interfaceData 
{

    public static void selectOfFunctions()
    {
        System.out.println("""
                Выберите номер функции:
                1 - enqueue (помещение элемента в конец очереди)
                2 - dequeue (возвращение 1 элемента из очереди и его удаление)
                3 - first   (возвращение 1 элемента из очереди без его удаления)
                """);
            
        int operationNumber = functions.randNum(); 
    

            if(operationNumber == 1)
            {
                functions.enqueue(functions.randStr());
            }
            else if (operationNumber == 2)
            {
                functions.dequeue(functions.randStr());
            }
            else if (operationNumber == 3)
            {
                functions.first(functions.randStr());
            }            
    }    
}
