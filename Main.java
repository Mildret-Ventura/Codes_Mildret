import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Dame el primer promedio");
        String numero2 = JOptionPane.showInputDialog("Dame segundo promedio");
        String numero3 = JOptionPane.showInputDialog("Dame segundo promedio");
        System.out.println((Integer.parseInt(numero1) + Integer.parseInt(numero2) + Integer.parseInt(numero3))/3);
    }

}