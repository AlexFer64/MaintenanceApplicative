import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate now = LocalDate.now();
        return extracted(startingDate, endingDate, now);
    }

    public static boolean extracted(LocalDate startingDate, LocalDate endingDate, LocalDate now) {
        return now.isAfter(startingDate) && now.isBefore(endingDate);
    }
}