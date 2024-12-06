import java.util.Scanner;

public class PuntoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el total de la compra: ");
        double compra = scanner.nextDouble();
        double descuento = 0.0;

        if(compra >= 1000){
            descuento = 0.20;
        }else if (compra >= 500){
            descuento = 0.10;
        }

        double totalDescuento = compra - (compra*descuento);

        System.out.println("El total de su compra con el descuento es: "+totalDescuento);
        if(descuento>0){
            System.out.println("Se aplico un descuento de: "+descuento+"%");
        }else {
            System.out.println("No se aplico descuento");
        }

    }
}
