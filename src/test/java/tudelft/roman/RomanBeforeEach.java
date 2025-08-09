package tudelft.roman;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanBeforeEach {

    private RomanNumeral roman;

     @BeforeEach
     public void initialize(){
        this.roman = new RomanNumeral();
    }


    @Test
    public void singleDigit() {

        int result = roman.convert("I");
        System.out.println(result);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithTwoDigits() {

        int result = roman.convert("IX");
        System.out.println(result);
        Assertions.assertEquals(9, result);
    }

    @Test
    public void numberWithConfusingOne() {

        int result = roman.convert("IV");
        System.out.println(result);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void BigNumber() {

        int result = roman.convert("CCC");
        System.out.println(result);
        Assertions.assertEquals(300, result);
    }

    @Test
    public void Random_Ones() {

        int result = roman.convert("III");
        System.out.println(result);
        Assertions.assertEquals(3, result);
    }
    @Test
    public void Empty_one() {

        int result = roman.convert("");
        System.out.println(result);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void Mix() {

        int result = roman.convert("MCIX");
        System.out.println(result);
        Assertions.assertEquals(1109, result);
    }
}
