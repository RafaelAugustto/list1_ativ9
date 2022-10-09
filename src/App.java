import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // Requisito 1: Peça uma temperatura em graus Fahrenheit
    Scanner sc = new Scanner(System.in);
    System.out.print("Entre com uma temperatura em graus Fahrenheit: ");
    double Fahrenheit = sc.nextDouble();

    // Requisito 2: transforme e mostre em graus celsius
    double celsius = 5 * ((Fahrenheit-32) / 9);

    System.out.println(Fahrenheit + "graus Fahrenheit, equivalem a " + celsius + "graus celcius");

    }
}
