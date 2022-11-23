package operator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MathServiceImplTest {
    @Mock
    private subtractService ob1;
    @Test
    void test1() {
        Mockito.lenient().when(ob1.subtract(8,2)).thenReturn(6);
        //subtractService ob1 = mock(subtractService.class);
        MathService ob = new MathServiceImpl(ob1);
        //((MathServiceImpl)ob).setOb(ob1);
        int res = ob.subtract(8,2);
        assertEquals(6,res);
        verify(ob1).subtract(8,2);
    }
}
