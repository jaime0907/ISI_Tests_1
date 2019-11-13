import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class oddOrPosTest
{
   // this test passes
   @Test public void normalCase()
   {
      int arr[] = {-2, 2, -3, 3, -4};
      assertEquals("Normal case", 3, oddOrPos.oddOrPos(arr));
   }

   @Test public void normalPositive()
   {
      int arr[] = {-4, 4, -4};
      assertEquals("Normal positive", 1, oddOrPos.oddOrPos(arr));
   }

   @Test public void normalOdd()
   {
      int arr[] = {-4, -3, -4};
      assertEquals("Normal odd", 1, oddOrPos.oddOrPos(arr));
   }

   @Test public void firstOdd()
   {
      int arr[] = {2, -6, -4};
      assertEquals("First odd", 1, oddOrPos.oddOrPos(arr));
   }

   @Test public void lastOdd()
   {
      int arr[] = {-4, -6, -3};
      assertEquals("Last odd", 1, oddOrPos.oddOrPos(arr));
   }

   @Test public void onlyOne()
   {
      int arr[] = {4};
      assertEquals("Only one odd", 1, oddOrPos.oddOrPos(arr));
   }

   @Test public void noOdd()
   {
      int arr[] = {-2, -4};
      assertEquals("no odd", 0, oddOrPos.oddOrPos(arr));
   }

   @Test (expected = NullPointerException.class)
   public void nullList()
   {
      int arr[] = null;
      oddOrPos.oddOrPos(arr);
   }
}
