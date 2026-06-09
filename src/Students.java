public class Students {
    public static void main(String[] args){
        StudGN StudentGrade = new StudGN();

        StudentGrade.setName("Emal-Hasanzada");
        StudentGrade.setGrade(19.5);
        System.out.println( " this is the name of Student > " + StudentGrade.getName());
        System.out.println( "and this is Grade of  : " + StudentGrade.getGrade());
    }

}
