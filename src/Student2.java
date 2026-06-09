public class Student2 {
   private String name;
   private String studentId;
   private double grade;

   public Student2(String name, String studentId){
       this.name = name;
       this.studentId = studentId;
       this.grade =  0.0;

   }
   public void setGrade(double grade){
       if(grade > 0 && grade <= 20){
           this.grade = grade;
           System.out.println("Grade set to : ->" + grade );
       }else{
           System.out.println("Invalid grade! Grade must be between 0 and 20. ");
       }
   }





   public void desplayInfo(){
       System.out.println("\t <<<<<< This is The First Systedent name of my School. >>>>>>");
       System.out.println("Name :" + name + ", ID:" + studentId + ",Grade " + grade);
   }


}
