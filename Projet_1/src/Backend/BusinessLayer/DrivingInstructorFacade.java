import java.util.HashMap;
import java.util.Map;

public class DrivingInstructorFacade {
    

    private Map<Integer, DrivingInstructorBL> instructorsMap;

    public DrivingInstructorFacade() {
        this.instructorsMap = new HashMap<>();
    }

    public DrivingInstructorBL getInstructor(int id) {
        if (!instructorsMap.containsKey(id)) {
            throw new IllegalArgumentException("Instructor does not exist");
        }
        return instructorsMap.get(id);
    }

    public void addInstructor(DrivingInstructorBL instructor) {
        if (instructorsMap.containsKey(instructor.getId())) {
            throw new IllegalArgumentException("Instructor already exists");
        }
        instructorsMap.put(instructor.getId(), instructor);
    }
    public void removeInstructor(int id) {
        if (!instructorsMap.containsKey(id)) {
            throw new IllegalArgumentException("Instructor does not exist");
        }
        instructorsMap.remove(id);
    }

    public void updateInstructor(DrivingInstructorBL instructor) {
        if (!instructorsMap.containsKey(instructor.getId())) {
            throw new IllegalArgumentException("Instructor does not exist");
        }
        instructorsMap.put(instructor.getId(), instructor);
    }
    
    public DrivingInstructorBL getCheapestInstructor(){
        if (instructorsMap.isEmpty()) {
            throw new IllegalArgumentException("No instructors available");
        }
        
        DrivingInstructorBL cheapestInstructor = null;
        for (DrivingInstructorBL instructor : instructorsMap.values()) {
            if (cheapestInstructor == null || instructor.getPricePerLesson() < cheapestInstructor.getPricePerLesson()) {
                cheapestInstructor = instructor;
            }
        }
        return cheapestInstructor;
    }

    public Map<Integer, DrivingInstructorBL> getInstructorsMap() {
        return instructorsMap;
    }

}
