import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Dame el primer promedio");
        String numero2 = JOptionPane.showInputDialog("Dame segundo promedio");
        String numero3 = JOptionPane.showInputDialog("Dame segundo promedio");
        System.out.println((Float.parseFloat(numero1) + Float.parseFloat(numero2) + Float.parseFloat(numero3))/3); 
    }
}
