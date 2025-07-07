package Backend.BusinessLayer;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Map;

class StudentFacade{
    private Map<Integer, StudentBL> studentsMap;

    public StudentFacade(){
        this.studentsMap=new HashMap<>();
    }
    
    public StudentBL getStudent(int id){
        if(!studentsMap.containsKey(id))
          throw new IllegalArgumentException("student is not exsit");
       
          return studentsMap.get(id);
    }
    public void addStudent(StudentBL student){
        if(studentsMap.containsKey(student.getId()))
          throw new IllegalArgumentException("student is already exsit");
        
        studentsMap.put(student.getId(), student);
    }
    public void removeStudent(int id){
        if(!studentsMap.containsKey(id))
          throw new IllegalArgumentException("student is not exsit");
        
        studentsMap.remove(id);
    }
    public void updateStudent(StudentBL student){
        if(!studentsMap.containsKey(student.getId()))
          throw new IllegalArgumentException("student is not exsit");
        
        studentsMap.put(student.getId(), student);
    }

    public Map<Integer, StudentBL> getStudentsMap() {
        return studentsMap;
    }

    
}