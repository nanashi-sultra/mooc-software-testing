package tudelft.leapyear;

public class LeapYear {

    public boolean IsLeapYear(int year) {
        if (year % 400 == 0 ) {
            return true;
        }
        if(year % 100 == 0) {
            return false;
        }
        else {
            return year % 4 == 0;
        }


    }
}
