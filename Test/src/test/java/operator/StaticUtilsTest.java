package operator;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class StaticUtilsTest {


    @Test
    public void givenStaticMethodWithArgs_whenMocked_thenReturnsMockSuccessfully() {
        StaticUtils ob1 = Mockito.mock(StaticUtils.class);
        ParentStaticUtils ob = new ParentStaticUtils(ob1);
        when(ob1.subtract(8,2)).thenReturn(6);
        int result = ob.subtract(8,2);
        int correct = 6;
        assertEquals(correct,result);
        //assertThat(StaticUtils.name()).isEqualTo("Baeldung");
    }
}
