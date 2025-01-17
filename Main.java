import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws ExceptionFirstNumberBigger {
        // System.out.println(MultiplyTable(2,100));
        // System.out.println(isPrimo(34));
        System.out.println((PrimosTilNumber(1, 10)).toString());
    }
    public static String numberComparation(double firstNumber, double secondNumber) {
        if (firstNumber==secondNumber)
            return "Son iguales los numeros";
        if (firstNumber > secondNumber)
            return "El mayor es " + firstNumber;
        else
            return "El mayor es " + secondNumber;
    }
    public static String MultiplyTable(int number, int range){
        String table = "Number_*_multiplyer = Result"+"\n";
        for(int i= 1; i<=range;i++){
            table +="   "+number+"   *       "+i+"    =   "+number*i+"\n";
        }
        return table;
    }
    public static Boolean isPrimo(int number){
        for(int i =2; i< number;i++){
            if(number%i == 0){
                return false;
            }
        }
        
        return true;
    }
    public static Stack<Integer> PrimosTilNumber(int number, int endNumber) throws ExceptionFirstNumberBigger{
        Stack<Integer> primos= new Stack<>();     
        if(number>endNumber){
        throw new ExceptionFirstNumberBigger("First element can't be bigger than endNumber");
        }
        for(int i = number; i<=endNumber;i++){
                if (isPrimo(i)){
                    primos.push(i);
                }
        }
        return primos;
    }
}
