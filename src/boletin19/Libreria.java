
package boletin19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;
import milibreria.Milibreria;


public class Libreria {
    
    private ArrayList<Libro> biblioteca = new ArrayList();
    
    Milibreria dato = new Milibreria();
    
    
    public void engadeLibros(){
        
        biblioteca.add(new Libro(dato.pedirTitulo(),dato.pedirAutor(),dato.pedirIsbn()
           ,dato.pedirPrezo(),dato.pedirUnidades()));
    }
   
    
    public void darDeBaixa(){
      for(int i=0;i<biblioteca.size();i++){
       
        if(biblioteca.get(i).numUnidades==0){
          biblioteca.remove(i);
        }
    }
      
    }
    
    public void consultarLibro(){
        boolean atopado = false;
        String atopa = JOptionPane.showInputDialog("Introduza o titulo do libro que dexexa atopar ");
        for(int i=0;i<biblioteca.size();i++){
            if(atopa.equals(biblioteca.get(i).titulo)){
                atopado = true;
                System.out.println("O libro de titulo está ");
                break;
            }
            System.out.println(" non está ");
            break;
        }
    }
         public void amosarLibros(){
            
        Collections.sort(biblioteca);
    
     for(Libro  lib: biblioteca) 
            System.out.println(lib);
    }
         
        public void vender(){
         int unidades = Integer.parseInt(JOptionPane.showInputDialog("Indica a cantidade a vender"));
         String vender = JOptionPane.showInputDialog("Introduza o titulo do libro a vender");
             for(int i=0;i<biblioteca.size();i++){
                 if(biblioteca.get(i).getTitulo().equals(vender))
                 biblioteca.get(i).setNumUnidades(biblioteca.get(i).getNumUnidades()-unidades);
             }
       
        }       
 
         
    }   
    
    




