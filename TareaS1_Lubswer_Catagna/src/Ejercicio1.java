
import java.util.Scanner;

public class Ejercicio1 {    //Ejercicio 1: Registro de inventarios de plásticos
    public static void main(String[] args) {

        int cantidad;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos que desea agregar: ");
        cantidad = teclado.nextInt();
        teclado = new Scanner(System.in);

        String[] productos = new String[cantidad];
        double[] pres = new double[cantidad];
        int[] cans = new int[cantidad];

        for(int i = 0; i < productos.length; i++){
            String producto;
            double pre;
            int can;
            System.out.print("Ingrese el producto  " + (i+1) + " :" );
            producto = teclado.next();
            productos[i] = producto;
            teclado = new Scanner(System.in);
            System.out.print("Ingrese su precio unitario con coma: ");
            pre = teclado.nextDouble();
            teclado = new Scanner(System.in);
            System.out.print("Ingrese la cantidad de ese producto: ");
            can = teclado.nextInt();
            teclado = new Scanner(System.in);
            pres[i] = can * pre;
            cans[i] = can;

        }
        System.out.println("Productos en stock: " );

        for(int i = 0; i < productos.length; i++){
            System.out.println( productos[i] + "   |  Cantidad: " + cans[i] + " | Precio del total en Stock  " + pres[i] );
        }
    }
}
