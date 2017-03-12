
package boletin19;
import javax.swing.JOptionPane;
import milibreria.Milibreria;

public class Boletin19 {

  int alejandroMariquita;
  //joer
    public static void main(String[] args) {
       Milibreria dato = new Milibreria();
       Libreria lib = new Libreria();
       int select;
      
       do{
             select = Integer.parseInt(JOptionPane.showInputDialog("selecciona una opción "
       + "\n  1.Engadir libro \n 2.Vender Libro \n 3.Atopar Libro \n 4.Dar de baixa libro \n 5.Ordear por Titulo/ISBN"
        + "\n 6.Sair"));
           
           switch(select){
               
           case 1: lib.engadeLibros();
           break;
           case 2: lib.vender();
           break;
           case 3: lib.consultarLibro();
           break;
           case 4: lib.darDeBaixa();
           break;
           case 5: lib.amosarLibros();     
           break;
           case 6: System.exit(select);
           
                       
               
           }
           
       }while(select!=0);
    
    
    }
}