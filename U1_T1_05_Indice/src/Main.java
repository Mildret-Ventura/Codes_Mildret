import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa tu altura en metros (por ejemplo, 1.75): ");
        double altura = sc.nextDouble();

        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = sc.nextDouble();

        Persona persona = new Persona(nombre, altura, peso);

        double imc = persona.calcularIMC();
        String clasificacion = persona.clasificarIMC();

        System.out.printf("Hola %s, tu IMC es: %.2f\n", persona.getNombre(), imc);
        System.out.println("Clasificación: " + clasificacion);

        sc.close();
    }
}
