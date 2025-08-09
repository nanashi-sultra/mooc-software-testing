package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class LeapYearTest {

      private LeapYear leapyear;

      @BeforeEach
      public void initialize() {
          this.leapyear = new LeapYear();
      }

      @Test
      public void LeapYearDivivdedByFour() {
         Boolean result = leapyear.IsLeapYear(2016);
         Assertions.assertEquals(true , result);
      }
      @Test
      public void NotLeapYearDivivdedBy100() {
            Boolean result = leapyear.IsLeapYear(1500);
            Assertions.assertEquals(false , result);
      }
      @Test
      public void LeapYearDivivdedBy400() {
          Boolean result = leapyear.IsLeapYear(1600);
          Assertions.assertEquals(true , result);
      }
      @Test
      public void NotLeapYearDivideBy4() {
            Boolean result = leapyear.IsLeapYear(1763);
            Assertions.assertEquals(false , result);
      }
      @Test
      public void NotLeapYear() {
            Boolean result = leapyear.IsLeapYear(200);
            Assertions.assertEquals(false , result);
      }



}
