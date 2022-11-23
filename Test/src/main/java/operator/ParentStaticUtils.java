package operator;

import org.mockito.MockedStatic;

public class ParentStaticUtils {
    public StaticUtils ob;
    public ParentStaticUtils(StaticUtils ob){
        this.ob = ob;
    }
    public int subtract(int a, int b){
        return ob.subtract(a,b);
    }
}
