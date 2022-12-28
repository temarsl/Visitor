package my;

public class LetsDecide {
    public static void main(String[] args) {
        ExamOption examOption = new ExamOption();

        Solving student = new Student();
        Solving teacher = new Teacher();

        System.out.println("students writter...");
        examOption.beWritten(student);

        System.out.println();
        System.out.println("teacher writter...");
        examOption.beWritten(teacher);
    }
}
