import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class countPositiveTest
{
   // this test passes
   @Test public void twoPositives()
   {
      int arr[] = {2, 7, -3};
      assertEquals("Two positives", 2, countPositive.countPositive(arr));
   }

   @Test public void noPositives()
   {
      int arr[] = {-1, -2, -5};
      assertEquals("No positives", 0, countPositive.countPositive(arr));
   }

   @Test public void oneZero()
   {
      int arr[] = {2, 0, -3};
      assertEquals("oneZero", 1, countPositive.countPositive(arr));
   }

   @Test public void firstAndLastPositives()
   {
      int arr[] = {2, 7, 3};
      assertEquals("Two positives", 3, countPositive.countPositive(arr));
   }

   @Test (expected = NullPointerException.class)
   public void nullList()
   {
      int arr[] = null;
      countPositive.countPositive(arr);
   }
 }
