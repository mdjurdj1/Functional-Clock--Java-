
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter seconds = new BoundedCounter(59);
        
        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);
        

        while(true) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
            if(seconds.getValue() == 0) {
                minutes.next();
                if(minutes.getValue() == 0) {
                    hours.next();
                }
            }
        }
        
    }
}
