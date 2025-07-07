package Backend.BusinessLayer;
import java.time.LocalDate;
import java.util.List;
import java.time.LocalTime;
import java.util.Map;
import java.util.AbstractMap;
import java.util.HashMap;

public class CalenderBL {

    //private Map< LocalTime, String > calenderMap;
  private Map <LocalDate, AbstractMap.SimpleEntry<String, Integer>> calenderMap;
    public CalenderBL() {
        this.calenderMap = new HashMap<>();
    }    

}