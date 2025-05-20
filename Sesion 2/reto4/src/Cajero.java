import java.util.Scanner;

public class Cajero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0;
        int opcion;

        do{
            System.out.println("Bienvenido al cajero automatico");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion");

            opcion = scanner.nextInt();
            switch (opcion){
                case 1 ->{
                    System.out.println("Tu saldo actual es:" + saldo);
                }
                case 2 ->{
                    System.out.println("Ingresa el monto a despositar:");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0){
                        System.out.println("El monto debe de ser mayor a 0");
                        continue;
                    }

                    saldo += deposito;
                    System.out.println("Deposito realizado. Saldo actualizado: $" +saldo);
                }
                case 3 ->{
                    System.out.print("Ingresa el nombre a retirar:");
                    double retiro = scanner.nextDouble();

                    if (retiro <=0){
                        System.out.print("El monto debe ser mayor a 0.");
                        continue;
                    }
                    if (retiro > saldo){
                        System.out.print("Saldo insuficiente. Tu saldo es: $" +saldo);
                    } else {
                        saldo -= retiro;
                        System.out.print("Retiro exitoso. Saldo restante: $" + saldo);
                    }
                }
                case 4 ->{
                    System.out.print("Gracias por udar el cajero. Hasta pronto");
                }
                default -> {
                    System.out.print("Opcion invalida. Intenta nuevamente");
                }
            }

        } while (opcion != 4);
        scanner.close();
    }
}