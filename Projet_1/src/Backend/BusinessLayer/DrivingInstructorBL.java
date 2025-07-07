import java.util.HashMap;
import java.util.Map;

public class DrivingInstructorBL {

    private String name;
    private int id;
    private String location;
    private int pricePerLesson;
    private boolean isManual;
    private Map<Integer, StudentBL> studentsMap= new HashMap<>();
    private CalenderBL calender=new CalenderBL();

    public DrivingInstructorBL(String name, int id, String location, int pricePerLesson, boolean isManual) {
        this.name = name;
        this.id = id;
        this.location = location;
        this.pricePerLesson = pricePerLesson; // Default price per lesson
        this.isManual = isManual; // true for manual, false for automatic
        
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

    public Map<Integer, StudentBL> getStudentsMap() {
        return studentsMap;
    }

    public void addStudent(StudentBL student) {
        if (studentsMap.containsKey(student.getId())) {
            throw new IllegalArgumentException("Student already exists");
        }
        studentsMap.put(student.getId(), student);
    }

    public void removeStudent(int id) {
        if (!studentsMap.containsKey(id)) {
            throw new IllegalArgumentException("Student does not exist");
        }
        studentsMap.remove(id);
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public void setLocation(String location) {
        this.location = location;
    }

    public void setPricePerLesson(int pricePerLesson) {
        this.pricePerLesson = pricePerLesson;
    }
    public int getPricePerLesson() {
        return pricePerLesson;
    }

    public boolean isManual() {
        return isManual;
    }
    public void setManual(boolean isManual) {
        this.isManual = isManual;
    }

    public CalenderBL getCalender() {
        return calender;
    }


}