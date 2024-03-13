import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeHW {
    public static LocalTime timeNow() {
        return LocalTime.now();
    }
    
    public static LocalDate dateNow() {
        return LocalDate.now();
    }

    public static void main(String[] args) {
        System.out.println(timeNow());
        System.out.println(dateNow());
    }
}
