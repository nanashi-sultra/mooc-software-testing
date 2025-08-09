package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanBeforeEach {

    private RomanNumeral roman;

     @BeforeEach
     public void intitialize(){
        this.roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        System.out.println(result);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IX");
        System.out.println(result);
        Assertions.assertEquals(9, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        System.out.println(result);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("CCC");
        System.out.println(result);
        Assertions.assertEquals(300, result);
    }

    @Test
    public void random_ones() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("III");
        System.out.println(result);
        Assertions.assertEquals(3, result);
    }
    @Test
    public void Empty_one() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("");
        System.out.println(result);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void too() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("MCIX");
        System.out.println(result);
        Assertions.assertEquals(1109, result);
    }
}
