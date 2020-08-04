package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Datas {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter dtf_LocaDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("\n" + now + "\n" + now.format(dtf_LocaDate) + "\n");

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dtf_DateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(dateTime + "\n" + dateTime.format(dtf_DateTime)  + "\n");

        DateTimeFormatter dtg_SHORT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter dtg_MEDIUM = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(dateTime.format(dtg_SHORT) + "\n" + dateTime.format(dtg_MEDIUM) + "\n");

        DateTimeFormatter dtf_localeUK = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM)
                .withLocale(Locale.UK);
        DateTimeFormatter dtf_localeBR = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM)
                .withLocale(new Locale("pt", "br"));
        System.out.println(dateTime.format(dtf_localeUK) + "\n" + dateTime.format(dtf_localeBR) + "\n");

        System.out.println(now.getMonth());
    }
}
