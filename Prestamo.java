
public class Prestamo
{
    protected Fecha fechaPrestamo;
    protected Fecha fechaDevolucion;
    protected Estado estadoPrestamo;
    protected Usuario usuario;
    protected Libro libro;
    
    public Prestamo(){
        
    }
    
    
    public Prestamo(Fecha fechaPrestamo,Fecha fechaDevolucion, Estado estadoPrestamo,
    Usuario usario,Libro libro)
    {
       this.fechaPrestamo = fechaPrestamo;
       this.fechaDevolucion = fechaDevolucion;
       this.estadoPrestamo = estadoPrestamo;
       this.usuario = usuario;
       this.libro = libro;
    }
    
    
    public Fecha getFechaPrestamo(){
        return fechaPrestamo;
    }
    
    public Fecha getFechaDevolucion(){
        return fechaDevolucion;
    }
    
    public Estado getEstadoPrestamo(){
        return estadoPrestamo;
    }
    
}
