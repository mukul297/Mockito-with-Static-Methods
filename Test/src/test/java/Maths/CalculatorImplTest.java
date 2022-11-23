package Maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalculatorImplTest {
    @Mock
    private Addition add;
    @Mock
    private Multiplication mul;

    @Test
    void addition() {
        /*
        Calculator cal = new CalculatorImpl(add,mul);
        when(add.add(5,2)).thenReturn(7);
        assertEquals(7,cal.addition(5,2));
        verify(add).add(5,2);

         */
    }

    @Test
    void multiplication() {
        /*
        Calculator cal = new CalculatorImpl(add,mul);
        when(mul.multiply(7,3)).thenReturn(21);
        assertEquals(21,cal.multiplication(7,3));
        verify(mul).multiply(7,3);

         */
    }



}