package TiposDatos;

public class TiposDatos {

    public static void main(String[] args) {

        //tipos de datos enteros

        byte number1 = 1;  // 1 byte
        short number2 = 2; // 2 byte
        int number3 = 4;   // 4 byte
        long number4 = 8;  // 8 byte

        //Imprimir datos
        System.out.println("Tipo de dato byte " + number1);
        System.out.println("Tipo de dato short " + number2);
        System.out.println("Tipo de dato int " + number3);
        System.out.println("Tipo de dato long " + number4);


        // tipos de datos flotantes

        float decimal1 = 4.1f;
        double decimal2 = 9.99d;

        System.out.println("Tipo de dato float " + decimal1);
        System.out.println("Tipo de dato double " + decimal2);

        // tipos de dato de un caracter
        char caracter1 = 'a';
        System.out.println("Tipo de dato de un caracter " + caracter1);

        //boleanos

        boolean verdadero = true;
        boolean falso = false;
        System.out.println("Tipo de dato boolean " + verdadero);
        System.out.println("Tipo de dato boolean " + falso);

        //cadenas de texto

        String nombre = "Carlos";
        System.out.println("Tipo de dato cadena de texto " + nombre);

        //tipos de datos envoltorios

        Integer numero = null;
        Long numero1 = 2L;

        System.out.println(numero);
        System.out.println(numero1);

    }


}
