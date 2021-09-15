import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Date startTime = Calendar.getInstance().getTime();
        for(int i = 0; i < 10000; i++)
        {
            System.out.println("Hello World!!! - " + i);
        }
        Date endTime = Calendar.getInstance().getTime();
        System.out.println("Java took => " + (endTime.getTime() - startTime.getTime())/1000 + " seconds");
    }
  }