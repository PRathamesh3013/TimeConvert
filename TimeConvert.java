package user;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConvert {
	
	
	public static String convertTo24(String time12Hour) {
        try {
            SimpleDateFormat sdf12 = new SimpleDateFormat("hh:mm:ss a");
            Date date = sdf12.parse(time12Hour);
            SimpleDateFormat sdf24 = new SimpleDateFormat("HH:mm:ss");
            return sdf24.format(date);
        } catch (ParseException e) {
            e.printStackTrace();	            
            return null;
        }
    
     }
	
	   public static void main(String[] args) {
	        String time12Hour = "12:00:45 AM";
	        String time24Hour = convertTo24(time12Hour);
	        System.out.println("12-hour format: " + time12Hour);
	        System.out.println("24-hour format: " + time24Hour);
	    }

	    

}
