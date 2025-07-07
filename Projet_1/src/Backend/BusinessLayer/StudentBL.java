package Backend.BusinessLayer;
import java.time.LocalDate;
import java.util.List;
import java.util.jar.Attributes.Name;

public class StudentBL {
    private String name;
    private int id;
    private String location;
    private int NumLessons;
    private int NumTest;
    private LocalDate startlearn;
    private LocalDate staplearn;
    private String status;
    private double balance;

    private CalenderBL lessonLog;  
    private CalenderBL achievements; 

    private DriverBL vv;








    public StudentBL(String name, int id){
        this.name=name;
        this.id=id;
        this.NumLessons=0;
        this.NumTest=0;

    }
     public StudentBL(String name, int id,int NumLessons,int NumTest){
        this.name=name;
        this.id=id;
        this.NumLessons=NumLessons;
        this.NumTest=NumTest;

    }
       public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getNumLessons() {
        return NumLessons;
    }

    public int getNumTest() {
        return NumTest;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumLessons(int numLessons) {
        this.NumLessons = numLessons;
    }

    public void setNumTest(int numTest) {
        this.NumTest = numTest;
    }

}
