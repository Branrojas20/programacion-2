package clase3;

import javax.swing.JOptionPane;

public class ejemplosswitch {

    public static void main(String[] args) {

        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite nota entre 0 y 10"));
        switch (nota) {

            case 1:

            case 2:

            case 3:

                JOptionPane.showMessageDialog(null, "La nota es insuficiente " + nota);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "La nota aun no es suficiente " + nota);
                break;
            case 5:
            case 6:
                JOptionPane.showMessageDialog(null, "La nota no da " + nota);
                break;
            case 7:
            case 8:
                JOptionPane.showMessageDialog(null, "La nota es suficiente " + nota);
            case 9:
            case 10:
                JOptionPane.showMessageDialog(null, "La nota es excelente " + nota);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Digite una nota valida ");
        }

    }
}
