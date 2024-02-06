import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        return extracted(startingDate, endingDate, LocalDate.now());
    }

    public static boolean extracted(LocalDate startingDate, LocalDate endingDate, LocalDate now) {
        return now.isAfter(startingDate) && now.isBefore(endingDate);
    }
}