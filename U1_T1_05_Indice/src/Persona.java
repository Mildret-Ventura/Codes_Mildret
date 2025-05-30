public class Persona {
    private String nombre;
    private double altura;
    private double peso;

    public double calcular() {
        return peso / (altura * altura);
    }

    public String clasificar() {
        double imc = calcular();
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 24.9) {
            return "Normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
}
    public Persona(String nombre, double altura, double peso){
            this.nombre = nombre;
            this.altura = altura;
            this.peso = peso;
        }
        public String getNombre () {
            return nombre;
        }
        public double getAltura () {
            return altura;
        }
        public double getPeso () {
            return peso;
        }
        public void setNombre (String nombre){
            this.nombre = nombre;
        }
        public void setAltura ( double altura){
            this.altura = altura;
        }
        public void setPeso ( double peso){
            this.peso = peso;
        }
    }
