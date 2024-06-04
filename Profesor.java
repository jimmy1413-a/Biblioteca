

public class Profesor extends Usuario
{
    
    private String departamento;

    
    public Profesor(int codigo,String nombre,String direccion,String email,String departamento)
    {
        super(codigo,nombre,direccion,email);
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
}
