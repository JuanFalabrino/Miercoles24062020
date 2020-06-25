
package showinputdialog24062020;
import javax.swing.JOptionPane;
        
public class ShowInputDialog24062020 {

       public static void main(String[] args) {
        
        //usuario y contraseña   
           
           String usuario,contraseña;
           String User = "JUAN";
           String Pass = "1234";
           
             
           
           usuario= JOptionPane.showInputDialog("Ingrese el nombre de Usuario:");
           contraseña= JOptionPane.showInputDialog("Ingrese la contraseña del Usuario:");
           
           if (usuario.equals(User) && contraseña.equals(Pass)){
             JOptionPane.showMessageDialog(null,"Buen dia  " + User);
           }else {
             JOptionPane.showMessageDialog(null,"Usuario/Contraseña MAL ","ERRORRR",JOptionPane.ERROR_MESSAGE);
           
           }
           
           
           
           
           
           
    }
    
}
