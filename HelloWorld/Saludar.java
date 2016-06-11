package HelloWorld;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by SONIA on 21/05/2016.
 */

public class Saludar {
    public static void main (String args []){

        Scanner lector = new Scanner(System.in);

        System.out.println("escriba su nombre");
        String nombre = lector.nextLine();

        System.out.println("escriba su apellido");
        String apellido = lector.nextLine();

        System.out.println("escriba su edad");
        int edad = lector.nextInt();
        System.out.println("introduzca su peso");
        double peso = lector.nextDouble();

        System.out.println("cual es su ocupacion?");
        String ocupacion = lector.nextLine();


        System.out.println(nombre + apellido + edad + peso + ocupacion );
    }
}
