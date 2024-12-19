import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI{
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specificDate = LocalDate.of(2024, 11, 25); // Christmas Day
        System.out.println(specificDate);
        
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 12, 25, 14, 30, 15);
        
        System.out.println(now);
        System.out.println(specificDateTime);

        ZonedDateTime now1 = ZonedDateTime.now();
        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(2024, 12, 25, 14, 30, 15, 0, ZoneId.of("Asia/Kolkata"));
        
        System.out.println(now);
        System.out.println(specificZonedDateTime);

        LocalDate date = LocalDate.now();
        System.out.println(date);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter);
        
        String formattedDate = date.format(formatter); // e.g., 20/12/2024
        System.out.println(formattedDate);

        LocalDate parsedDate = LocalDate.parse("20/12/2024", formatter);
        System.out.println(parsedDate);




    }
    
}