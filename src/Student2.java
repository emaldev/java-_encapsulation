public class Student2 {
   private String name;
   private String studentId;
   private double grade;

   public Student2(String name){
       this.name = name;
       this.studentId = studentId;
       this.grade =  0.0;

   }
   public void setGrade(double grade){
       if(grade > 0 && grade <= 20){
           this.grade = grade;
           System.out.println("Good ->" + grade );
       }else{
           System.out.println("Invalid grade! Grade must be between 0 and 20. ");
       }
   }
   public double getGrade(){
       return grade;
   }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name = name;
   }
   public String getStudentId(){
       return studentId;
   }
   public void setStudentId(String studentId){
       this.studentId = studentId;
   }
   public void desplayInfo(){
       System.out.println("\t <<<<<< This is The First Systedent name of my School. >>>>>>");
       System.out.println("Name :" + name + ", ID:" + studentId + ",Grade " + grade);
   }


}
