package operator;

public class MathUtils {
    public static Integer add(Integer a, Integer b) {

        if(a == null || b == null){
            throw new NullPointerException("Null");
        }

        if(a == Integer.MAX_VALUE || b == Integer.MAX_VALUE){
            throw new RuntimeException("Overflow");
        }

        return a + b;
    }

    public static int subtract(int a, int b) {
        subtractService ob = new subtractServiceImpl();
        int res = ob.subtract(8,2);
        return res;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a/b;
    }

    public static double computeCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
