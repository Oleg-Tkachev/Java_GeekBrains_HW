package Calculator;

class MyOpFactory implements OperationFactory{

    int operationCode;
    private Operation operation;

    @Override

    public Operation getOpInstance(int op) {
        this.operationCode = op;
        switch (operationCode){
            case 0:{
                operation = new Plus();
                break;
            }
            case 1:{
                operation = new Minus();
                break;
            }
            case 2:{
                operation = new Multiply();
                break;
            }
            case 3:{
                operation = new Division();
                break;
            }
            default:{
                operation = null;
            }
        }
        return operation;
    }
}