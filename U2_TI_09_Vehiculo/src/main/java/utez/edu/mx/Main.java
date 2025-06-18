package utez.edu.mx;

public class Main {
    public static void main(String[] args) {
        Garage garage= new Garage[4];
        Coche coche1= new Coche(987, "Toyota", 4);
        Coche coche2= new Coche(456, "Tsuru", 4);
        Coche coche3=new Coche(123, "Nisan", 4);
        Motocicleta motocicleta1= new Motocicleta("963", "Italika", true);
        garage.estacionar(coche1);
        garage.estacionar(coche2);
        garage.estacionar(motocicleta1);
        System.out.println("Vehiculos dentro del garage: " + garage.contarVehiculos());
        boolean retirar= garage.retirar("963");{
            System.out.println("Vehiculo retirado: " + retirar);}
    }
}