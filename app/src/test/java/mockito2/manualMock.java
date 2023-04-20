package mockito2;

 import static org.junit.jupiter.api.Assertions.assertEquals;

 import java.util.ArrayList;
 import java.util.List;

 import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

 public class manualMock {

    
     @Test
     public void whenNotUseMockAnnotation_thenCorrect() {
         List mockList = Mockito.mock(ArrayList.class);

         mockList.add("one");
         Mockito.verify(mockList).add("one");
         assertEquals(0, mockList.size());
     }

 }