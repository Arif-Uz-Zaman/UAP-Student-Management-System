
package assignment.pkg4;


public class Student {
private  String name ;
    private String id;
    private String level_term;
   private Double cgpa;
    

    Student(String name , String id , String level_term , Double cgpa){
        this.name = name;
        this.id = id;
        this.level_term=level_term;
        this.cgpa = cgpa;
       
    }
    void updateCgpa(Double newCgpa){
        cgpa = newCgpa;
    }

    String getId(){
        
        return id;
    }

    Double getCgpa(){
      return cgpa;
    }


    void display(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Level/Term : "+level_term);
        System.out.println("Cgpa: "+cgpa);
    }
    
    
}