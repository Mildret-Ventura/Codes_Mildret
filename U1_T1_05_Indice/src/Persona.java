public class Persona {
    private String nombre;
    private double altura; // en metros
    private double peso;   // en kg

    // Constructor
    public Persona(String nombre, double altura, double peso) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para calcular el IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Método para clasificar el IMC
    public String clasificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}
