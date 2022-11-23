package operator;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class MathUtilsTest {

    @Test
    void add() {
       int result =  MathUtils.add(3,2);
       int correct = 5;
       assertEquals(5,result);
    }

    @Test
    void addBoundary() {
        try{
            int result =  MathUtils.add(Integer.MAX_VALUE,2);
            fail();
        }
        catch (RuntimeException re){
            assertEquals(re.getMessage(),"Overflow");
        }

    }
    @Test
    void addWrapper() {
        try{
            int result =  MathUtils.add(null,2);
            fail();
        }
        catch (NullPointerException re){
            assertEquals(re.getMessage(),"Null");
        }

    }
    @Test
    void addAfterSubtracting() {
        subtractService mockSubtractService =  mock(subtractService.class);
        when(mockSubtractService.subtract(8,2)).thenReturn(6);
        int result =  MathUtils.add(3,mockSubtractService.subtract(8,2));
        int correct = 9;
        assertEquals(9,result);
    }

    @Test
    void mockListSize() {
        List listMock =  mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);

        assertEquals(2,listMock.size());
        assertEquals(3,listMock.size());
    }

    @Test
    void letsMockListGet() {
        List listMock =  mock(List.class);

        // Argument Matcher
        when(listMock.get(anyInt())).thenReturn("Mukul");
        assertEquals("Mukul",listMock.get(10));
    }

    @Test
    void letsMockList_throwAnException() {
        List listMock =  mock(List.class);

        // Argument Matcher
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));

        try{
            String name = (String) listMock.get(0);
            fail();
        }
        catch (RuntimeException re){
            assertEquals(re.getMessage(),"Something");
        }
    }

    @Test
    void subtractImpl() {
        int result =  MathUtils.subtract(6,2);
        int correct = 4;
        assertEquals(4,result);
    }


    @Test
    void subtract() {

        int result =  MathUtils.subtract(6,2);
        int correct = 4;
        assertEquals(4,result);
    }

    @Test
    void multiply() {
        int result =  MathUtils.multiply(6,2);
        int correct = 12;
        assertEquals(12,result);
    }

    @Test
    void divide() {
        int result =  MathUtils.divide(6,2);
        int correct = 3;
        assertEquals(3,result);
    }

    @Test
    void computeCircleArea() {
        double result =  MathUtils.computeCircleArea(7);
        double correct = Math.PI * 49;
        assertEquals(correct,result);
    }


}