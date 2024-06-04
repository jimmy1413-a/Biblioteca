

public class Usuario
{
    private int codigo;
    private String nombre;
    private String direccion;
    private String email;
    protected Prestamo prestamo;
    
    
    public Usuario(int codigo,String nombre,String direccion,String email,Prestamo prestamo)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.prestamo = prestamo;
        
    }

    public int getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String  getDireccion(){
        return direccion;
    }
    
    public String getEmail(){
        return email;
    }
    
    public Prestamo getPrestamo(){
        return prestamo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPrestamo(Prestamo prestamo){
        this.prestamo=prestamo;
    }
    
    
    
}
