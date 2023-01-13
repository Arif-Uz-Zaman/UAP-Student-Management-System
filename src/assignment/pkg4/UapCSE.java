
package assignment.pkg4;

import java.util.ArrayList;


public class UapCSE {
  private  ArrayList<Student>students;
    private String name;
    
    UapCSE(String name){
        this.name = name;
        students = new ArrayList<Student>();
    }
    void addNewStudent(Student s)
    {
        students.add(s);
    }
    void addNewStudent(String name, String id, String Level_term, double cgpa){
        Student s = new Student(name,id,Level_term,cgpa);
        addNewStudent(s);
        
    }
    Student findStudent(String id){
        
        for(int i=0;i<students.size();i++){
            if(students.get(i).getId().equals(id)){
                return students.get(i);
            }
        }
        return null;            
        }
      void updateCgpa(String id, double newCgpa){
          Student s = findStudent(id);
          if(s != null)
          {
              s.updateCgpa(newCgpa);
          }
      }
      void getCgpa(String id){
          Student s = findStudent(id);
          if(s != null){
             System.out.println(+s.getCgpa());
          }
          else{
              System.out.println("not found");
          }
      }
      void display(String id){
          Student s = findStudent(id);
          if(s != null){
              s.display();
          }
      }
          void display(){
          
          for(int i=0;i<students.size();i++){
              students.get(i).display();
          }
      }
      
    }
