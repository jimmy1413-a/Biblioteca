

public class Adiministrativo extends Usuario
{
   
    private String oficina;
    
    public Adiministrativo(int codigo,String nombre,String direccion,String email,String oficina)
    {
         super(codigo,nombre,direccion,email);
         this.oficina = oficina;
    }
    
    public String getOficina(){
        return oficina;
    }
    
    public void setOficina(String oficina){
        this.oficina = oficina;
    }
    
   
}
