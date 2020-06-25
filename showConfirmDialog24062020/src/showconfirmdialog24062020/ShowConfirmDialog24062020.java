
package showconfirmdialog24062020;
import javax.swing.JOptionPane;
public class ShowConfirmDialog24062020 {

    public static void main(String[] args) {
       
        int resp = JOptionPane.showConfirmDialog(null,"¿Quieres salir de la aplicación?");
        
        if (JOptionPane.OK_OPTION==resp){
            JOptionPane.showMessageDialog(null,"Genial que tengas buen dia!!","Mensaje de OK",JOptionPane.INFORMATION_MESSAGE);
            
           
        }else {
          JOptionPane.showMessageDialog(null,"Continue trabajando","Información",JOptionPane.WARNING_MESSAGE);
          
        
        }
        
        
        
    }
    
}
