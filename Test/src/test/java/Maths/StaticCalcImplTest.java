package Maths;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticCalcImplTest {
    private Addition add ;
    private Multiplication mul;

    @Test
    void test(){/*

        try(MockedStatic<Addition> mockedStatic = Mockito.mockStatic(Addition.class)){
            mockedStatic.when(Addition::add).thenReturn(0);
            Calculator cal  = new CalculatorImpl(add,mul);
            int result = cal.addition(0,1);
            int correct = 0;
            assertEquals(result,correct);
        }
        */
    }
    @Test
    void test1(){
        try(MockedStatic<Addition> mockedStatic = Mockito.mockStatic(Addition.class)){
            mockedStatic.when(() -> Addition.add(5,2)).thenReturn(7);
            Calculator cal  = new CalculatorImpl(add,mul);
            int result = cal.addition(5,2);
            int correct = 7;
            assertEquals(result,correct);
        }

    }

}
