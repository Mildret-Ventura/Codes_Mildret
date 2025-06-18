public class Main {
    public static void main(String[] args) {
        Empleado empTiempoCompleto = new EmpleadoTiempoCompleto("001", "Christian", 2500, "Seguro médico");
        Empleado empPorHoras = new EmpleadoPorHoras("002", "Belem", 1500, 35);

        System.out.println("Salario de empleado tiempo completo de Christian: $" + empTiempoCompleto.calcularSalario());
        System.out.println("Salario de empleado por horas de Belem: $" + empPorHoras.calcularSalario());
    }
}
