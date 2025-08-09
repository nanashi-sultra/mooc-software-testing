package tudelft.roman;

//import jdk.internal.org.jline.terminal.TerminalBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void singleDigit() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        System.out.println(result);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithTwoDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IX");
        System.out.println(result);
        Assertions.assertEquals(9, result);
    }

    @Test
    public void numberWithConfusingOne() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        System.out.println(result);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void BigNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("CCC");
        System.out.println(result);
        Assertions.assertEquals(300, result);
    }

    @Test
    public void Random_Ones() {
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
    public void Mix() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("MCIX");
        System.out.println(result);
        Assertions.assertEquals(1109, result);
    }
}
