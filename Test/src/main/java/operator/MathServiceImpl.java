package operator;

public class MathServiceImpl implements MathService{
    private subtractService ob ;

    public MathServiceImpl(subtractService ob){
        this.ob = ob;
    }
    public void setOb(subtractService ob) {
        this.ob = ob;
    }

    @Override
    public int subtract(int a, int b) {
        return ob.subtract(a, b);
    }
}
