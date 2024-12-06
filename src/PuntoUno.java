public class PuntoUno {

    public void concatenar(String nombre, String edad, String profesion){
        String imprimir = nombre.toUpperCase()+" tiene "+edad+" años y su profesión es "+profesion;
        System.out.println(imprimir);
    }


    public static void main(String[] args) {

        PuntoUno puntoUno = new PuntoUno();
        String nombre = "Gaby";
        String edad = "15";
        String profesion = "Ingeniera de sistemas";

        puntoUno.concatenar(nombre,edad,profesion);
        }


}
