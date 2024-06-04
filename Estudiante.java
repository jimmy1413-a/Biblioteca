

public class Estudiante extends Usuario
{
     private String carrera;
    

    
    public Estudiante(int codigo,String nombre,String direccion,String email,String carrera)
    {
        super(codigo,nombre,direccion,email);
        this.carrera = carrera;
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    
   
}
