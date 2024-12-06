public class PuntoTres {

    public static void main(String[] args) {
        double a = 15.0;
        double b = 12.6;
        double c = 10.0;

        double suma = a + b + c;
        double resta = a - b - c;
        double multiplicacion = a * b * c;

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);

        try {
            double division = (a+b)/c;
            System.out.println("La división es: "+division);
        }catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
