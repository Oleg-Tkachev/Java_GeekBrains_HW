package Calculator;


class Plus implements Operation {

    @Override
    public double exec(double valueOne, double valueTwo ) {
        return (valueOne + valueTwo );
    }
}
//  Операция ВЫЧИТАНИЯ
class Minus implements Operation{

    @Override
    public double exec(double valueOne
            , double valueTwo ) {
        return (valueOne - valueTwo );
    }
}
//  Операция УМНОЖЕНИЯ
class Multiply implements Operation{

    @Override
    public double exec(double valueOne, double valueTwo ) {
        return (valueOne * valueTwo );
    }
}
//  Операция ДЕЛЕНИЯ
class Division implements Operation{
    @Override
    public double exec(double valueOne, double valueTwo ) {
        try{
            double p = valueOne / valueTwo;
        }catch(ArithmeticException e){
            System.out.println(e + "ошибка");
        }
        return (valueOne / valueTwo );
    }
}