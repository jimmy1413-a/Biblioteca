

public class Referencia extends Libro
{
    private int cantidadCopias;    
   

    
    public Referencia(String titulo,String autor,String codigo, String editorial,int añoPubli,
    int cantidadCopias)
    {
        super(titulo,autor,codigo,editorial,añoPubli);
        this.cantidadCopias = cantidadCopias;
    }

       public int getCantidadCopias(){
           return cantidadCopias;
       }
       
       public void setCantidadCopias(int cantidadCopias){
           this.cantidadCopias = cantidadCopias;
       }
}
