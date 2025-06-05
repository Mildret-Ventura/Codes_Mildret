public class UsuarioSeguro {
    private String nombreUsuario;
    private String contrasenaUsuario;

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario != null && !nombreUsuario.trim().isEmpty()) {
            this.nombreUsuario = nombreUsuario;
        } else {
            System.out.println("El nombre de usuario no puede estar vacío.");
        }
    }

    public void setContrasenaUsuario(String contrasena) {
        boolean esValida = true;

        if (contrasena == null || contrasena.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            esValida = false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            }
            if (Character.isDigit(c)) {
                tieneNumero = true;
            }
        }

        if (!tieneMayuscula) {
            System.out.println("Debe contener al menos una letra mayúscula.");
            esValida = false;
        }

        if (!tieneMinuscula) {
            System.out.println("Debe contener al menos una letra minúscula.");
            esValida = false;
        }

        if (!tieneNumero) {
            System.out.println("Debe contener al menos un número.");
            esValida = false;
        }

        if (esValida) {
            this.contrasenaUsuario = contrasena;
        }
    }

    public boolean autenticar(String intento) {
        return contrasenaUsuario != null && contrasenaUsuario.equals(intento);
    }

    public boolean estaInicializado() {
        return nombreUsuario != null && contrasenaUsuario != null;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }
}
