import java.util.Scanner;

public class PuntoDos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de cuenta:");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Usted selecciono: 1.Cuenta Corriente");
                break;
            case 2:
                System.out.println("Usted selecciono: 2.Cuenta de Ahorro");
                break;
            case 3:
                System.out.println("Usted selecciono: 3.Cuenta Nómina");
                break;

            default:
                System.out.println("Por favor ingrese una opción valida");
                break;
        }
        scanner.close();
    }
}
