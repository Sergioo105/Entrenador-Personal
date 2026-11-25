import java.util.Scanner;
// hola caracola
/**
 * Clase con métodos de utilidad para la entrada de datos por teclado y el manejo de días de la semana.
 */
public class Utilidades {
    public static String leerCadena(Scanner teclado, String s) {
        System.out.print(s);
        s = teclado.nextLine();
        return s;
    }

    public static int leerNumero(Scanner teclado, String mensaje, int minimo, int maximo) {
        int num;
        do {
            while (!teclado.hasNextInt()){
                teclado.nextLine();
                System.out.print(mensaje);
            }
            num = teclado.nextInt();

        } while (num < minimo || num > maximo);

        return num;
    }

    public static int leerDiaDeLaSemana(Scanner teclado, String mensaje) {
        System.out.print(mensaje);
        String dia= teclado.next().toUpperCase();

        while (!dia.equals("L") && !dia.equals("M") && !dia.equals("X") &&
                !dia.equals("J") && !dia.equals("V") && !dia.equals("S") && !dia.equals("D")){
            System.out.print(mensaje);
            dia= teclado.next();
        }
        return diaSemanaAPosicion(dia);
    }

    public static int diaSemanaAPosicion(String dia) {
        if(dia == null){
            return -1;
        }
        dia = dia.toUpperCase();
        switch (dia) {
            case "L":
                return 0;
            case "M":
                return 1;
            case "X":
                return 2;
            case "J":
                return 3;
            case "V":
                return 4;
            case "S":
                return 5;
            case "D":
                return 6;
            default:
                return -1;
        }
    }

    public static String posicionADiaSemana(int pos) {
        switch (pos){
            case 0:
                return "Lunes";
            case 1:
                return "Martes";
            case 2:
                return "Miércoles";
            case 3:
                return "Jueves";
            case 4:
                return "Viernes";
            case 5:
                return "Sábado";
            case 6:
                return "Domingo";
            default:
                return "Desconocido";
        }
    }
}
