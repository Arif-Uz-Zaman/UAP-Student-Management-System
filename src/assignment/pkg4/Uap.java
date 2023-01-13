
package assignment.pkg4;

import java.util.Scanner;

public class Uap {
     public static void main(String[] args){

    UapCSE myUap = new UapCSE("CSE");
    int option;
        Scanner sc = new Scanner(System.in);
        while(true){
       
      option = sc.nextInt();
            sc.nextLine(); 
            if(option==1){ // add a new Student
                System.out.println("enter your name , id , Level_term , cgpa");
                String name = sc.nextLine();
                String id = sc.nextLine();
                String Level_term =sc.nextLine();
                double cgpa = sc.nextDouble();
                sc.nextLine();
             myUap.addNewStudent(name,id,Level_term,cgpa);
            }
            else if(option ==2){ // get cgpa
                System.out.println("enter your id");
                String id = sc.nextLine();
                sc.nextLine();
                
               myUap.getCgpa(id);

            }
            else if(option ==3){ // update cgpa
                System.out.println("enter your id and new Cgpa");
                String id = sc.nextLine();
                double cgpa = sc.nextDouble();
                sc.nextLine();
                
               myUap.updateCgpa(id,cgpa);
            }
            else if(option==4){ // display list of the students
                System.out.println("enter student id number ");
               String id = sc.nextLine();
               sc.nextLine();
               myUap.display(id);

               
            }
                else if(option==5){ // display all  students
                    
               
               myUap.display();

                }
            else if(option==0){
                break;

  }

        }
    }
}