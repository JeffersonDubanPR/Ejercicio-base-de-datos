import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numero1, numero2, suma, resta, multi;

        System.out.println("ingrese el primer numero");
        numero1 = teclado.nextDouble();

        System.out.println("INGRESE EL SEGUNDO VALOR");
        numero2 = teclado.nextDouble();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 - numero2;
        System.out.println("la suma es" + suma);
        System.out.println("la resta es" + resta);
        System.out.println("la multiplicacion es" + multi);


    }
}



