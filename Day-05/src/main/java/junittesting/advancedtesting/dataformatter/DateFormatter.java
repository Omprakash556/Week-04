package junittesting.advancedtesting.dataformatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    // Method to format date from yyyy-MM-dd to dd-MM-yyyy
    public String formatDate(String inputDate) throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

        // Parse the input date and format it into the desired output format
        Date date = inputFormat.parse(inputDate);
        return outputFormat.format(date);
    }
}
