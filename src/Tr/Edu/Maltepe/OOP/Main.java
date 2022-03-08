package Tr.Edu.Maltepe.OOP;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.Name("muharrem bahceci");
        System.out.println("öğrencinin numarası "+student.Id(190704041));

        Proffesor proffesor = new Proffesor();

        proffesor.Name("ensar gül");
        System.out.println("profesörün numarası "+proffesor.Id(162584765));

    }
}
