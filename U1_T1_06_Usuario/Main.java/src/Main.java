import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioSeguro usuario = new UsuarioSeguro();

        System.out.print("Ingresa el nombre de usuario: ");
        usuario.setNombreUsuario(sc.nextLine());

        while (usuario.getContrasenaUsuario() == null) {
            System.out.print("Ingresa la contraseña: ");
            usuario.setContrasenaUsuario(sc.nextLine());
        }

        if (!usuario.estaInicializado()) {
            System.out.println("El usuario no fue inicializado correctamente.");
            return;
        }

        System.out.print("Ingresa la contraseña correcta para autenticar: ");
        String correcta = sc.nextLine();
        if (usuario.autenticar(correcta)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }

        System.out.print("Ingresa una contraseña incorrecta para probar: ");
        String incorrecta = sc.nextLine();
        if (usuario.autenticar(incorrecta)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }

    }
}
