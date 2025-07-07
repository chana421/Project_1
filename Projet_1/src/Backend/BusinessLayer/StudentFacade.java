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

    
}