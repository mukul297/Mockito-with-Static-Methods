package Maths;

public class CalculatorImpl implements Calculator  {
    private Addition add;
    private Multiplication mul;

    public CalculatorImpl(Addition add, Multiplication mul){
        this.add = add;
        this.mul = mul;
    }

    public int addition(int a, int b){
       // return Addition.add(a,b);
        return Addition.add(a,b);
    }

    public int multiplication(int a, int b){
        return  Multiplication.multiply(a,b);
    }
}
