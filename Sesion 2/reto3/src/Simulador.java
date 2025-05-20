import java.util.Scanner;

public class Simulador{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        double totalSinDescuento = precioUnitario * cantidad;

        var aplicaDescuento = totalSinDescuento > 500;
        double descuento = aplicaDescuento ? totalSinDescuento * 0.25 : 0;

        double totalConDescuento = totalSinDescuento -descuento;

        System.out.print("Resumen de compra:");
        System.out.print("Medicamentos:"+ medicamento);
        System.out.print("Cantidad:"+ cantidad);
        System.out.print("Precio unitario:"+ precioUnitario);
        System.out.print("Total sin descuento:"+ totalSinDescuento);
        System.out.print("Aplica descuento:"+ aplicaDescuento);
        System.out.print("Total a pagar: $"+ totalConDescuento);

        scanner.close();
    }
}