// This Java Program helps in converting date to string.

import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
 public class dateToString {  
       public static void main(String args[]){  
                Date date = Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
                String strDate = dateFormat.format(date);  
                System.out.println("Converted String: " + strDate);  
                 
        }  
}  
