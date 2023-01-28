package Calculator;

public class CalculatorFull {
    public static void main(String[]args){
        MyOpFactory myOpFactory = new MyOpFactory();
        Calculator calc = new Calculator(myOpFactory);
        calc.exec();
    }
}

interface Operation{
    double exec( double valueOne, double valueTwo );
}
interface OperationFactory
{
    Operation getOpInstance( int op );
}
