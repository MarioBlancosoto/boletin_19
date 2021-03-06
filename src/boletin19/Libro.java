
package boletin19;

import javax.swing.JOptionPane;


public class Libro  implements Comparable <Libro>{
    String titulo,autor,isbn;
    float prezo;
    int numUnidades;
    
    public Libro(){
        
        
    }

    public Libro(String titulo, String autor, String isbn, float prezo, int numUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        this.numUnidades = numUnidades;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public String toString() {
        return  "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", prezo=" + prezo + ", numUnidades=" + numUnidades ;
    }
    
    @Override
    public int compareTo(Libro comparar){
        
  int select = Integer.parseInt(JOptionPane.showInputDialog("Elija el parámetro por el que quiere ordenar "
    + "\n 1. por Titulo \n 2. por ISBN"));
  
  int  comp=select;
  switch(select){
      case 1:  comp = this.titulo.compareToIgnoreCase(comparar.getTitulo());
        break;
      case 2: comp = this.isbn.compareToIgnoreCase(comparar.getIsbn());
        break;
  }  
    
  return comp;
    }
    
}    
    

