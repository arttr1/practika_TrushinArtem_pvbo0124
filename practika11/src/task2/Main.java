import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime currentDate = LocalDateTime.now();           
        LocalDateTime userDate = UserInput.getUserDate();          

        DateComparator.compareDates(currentDate, userDate);        
    }
}
