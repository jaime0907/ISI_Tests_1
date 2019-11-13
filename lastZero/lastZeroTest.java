import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class lastZeroTest
{
   // this test passes
   @Test public void zeroInTwo()
   {
      int arr[] = {2, 7, 0, 3};
      assertEquals("Zero in 2", 2, lastZero.lastZero(arr));
   }

   @Test public void noZeros()
   {
      int arr[] = {-1, -2, -5};
      assertEquals("No zeros", -1, lastZero.lastZero(arr));
   }

   @Test public void firstZero()
   {
      int arr[] = {0, 2, 3};
      assertEquals("firstZero", 0, lastZero.lastZero(arr));
   }

   @Test public void lastindexZero()
   {
      int arr[] = {2, 7, 3, 1, 0};
      assertEquals("Last index zero", 4, lastZero.lastZero(arr));
   }

   @Test public void twoZeros()
   {
      int arr[] = {2, 7, 0, 1, 0, 3};
      assertEquals("Last index zero", 4, lastZero.lastZero(arr));
   }

   @Test public void onlyZero()
   {
      int arr[] = {0};
      assertEquals("Only zero", 0, lastZero.lastZero(arr));
   }

   @Test (expected = NullPointerException.class)
   public void nullList()
   {
      int arr[] = null;
      lastZero.lastZero(arr);
   }
 }
