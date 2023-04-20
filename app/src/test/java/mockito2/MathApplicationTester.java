package mockito2;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathApplicationTester {
    private MathApplication mathApplication;
    private CalculatorService calcService;

    @Test
    public void testAddAndSubtract(){

        mathApplication = new MathApplication();
        calcService = mock(CalculatorService.class);
        mathApplication.setCalculatorService(calcService);

        when(calcService.add(20.0, 10.0)).thenReturn(30.0);

        when(calcService.subtract(20.0, 10.0)).thenReturn(10.0);

        Assertions.assertEquals(mathApplication.subtract(20.0, 10.0), 10.0, 0);

        Assertions.assertEquals(mathApplication.add(20.0, 10.0), 30.0, 0);

        verify(calcService).add(20.0, 10.0);
        verify(calcService).subtract(20.0, 10.0);}
    }
