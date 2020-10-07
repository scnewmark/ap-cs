package StudentID;

public class Main {
    public static void main(String[] args) {
        StudentID student = new StudentID();
        System.out.println(student.toString());

        student.setStudentFirstName("Ada");
        student.setStudentLastName("Lovelace");
        student.setStudentID(223344);
        System.out.println(student.toString());

        StudentID student2 = new StudentID("Buzz", "Lightyear", 123456);
        System.out.println(student2.toString());

        System.out.println(student2.getStudentFirstName() + " " + student2.getStudentLastName() + " ID = " + student2.getStudentID() + " Password = " + student2.getPassword());
    }
}
