import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = sc.nextDouble();

        Persona persona = new Persona(nombre, altura, peso);

        double imc = persona.calcular();
        System.out.printf("IMC de %s: %.2f%n", persona.getNombre(), imc);
        System.out.println("Clasificación: " + persona.clasificar());

        sc.close();
    }
}

