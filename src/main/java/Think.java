import java.time.Month;

public class Think {

    private static int[] Days = {0,2,3,4,5};

    public int daysOfTheMonth(int month, int year){
        int days = Days[month];
//        if(month == 2 && isLeapYear(year))
        days++;
        return days;
    }


}
