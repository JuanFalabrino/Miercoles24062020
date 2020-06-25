
package showinputdialog24062020.pkg2;
import javax.swing.JOptionPane;

public class ShowInputDialog240620202 {

    
    public static void main(String[] args) {
        
        
        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre:");
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su EDAD: "));
        
        if (edad>=18){
        
        JOptionPane.showMessageDialog(null,"Puede beber una Cerveza" + nombre);
             
        }else {
        
        JOptionPane.showMessageDialog(null,"Es menor siga con la gaseosa ","Advertencia",JOptionPane.WARNING_MESSAGE);
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
