package hospital;

 import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Paciente p1 = new Paciente();

        System.out.println("Ingrese el nombre del paciente: ");
        p1.nombre = input.nextLine();

        System.out.println("Ingrese la edad: ");
        p1.edad = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese el numero de expediente: ");
        p1.expediente = input.nextLine();

        input.close();

        p1.mostrarInformacion();
    }
}
