import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate joinDate = LocalDate.parse("2025-12-01", DateTimeFormatter.ISO_DATE);
        System.out.println("Join Date: " + joinDate);
    }
}
