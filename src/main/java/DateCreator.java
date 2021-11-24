import java.util.Date;

public class DateCreator {
	
	public static Date date(String date) {
		String[] dateParts = date.split("/");
		int day = Integer.parseInt(dateParts[0]);
		int month = Integer.parseInt(dateParts[1]);
		int year = Integer.parseInt(dateParts[2]);
		return new Date(year, month, day);
	}

}
