

public class Libro
{
    
    private String titulo;
    private String autor;
    private String codigo;
    private int añoPubli;
    private String editorial;

    public String getTitulo (){
        return titulo;
    }
    
    public String getAutor (){
        return autor;
    }
    
    public String getCodigo (){
        return codigo;
    }
    
    public String getEditorial (){
        return editorial;
    }
    
    public int geAñoPubli (){
        return añoPubli;
    }
    
    public void setTitulo( String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor( String autor){
        this.autor = autor;
    }
    
    public void setCodigo( String codigo){
        this.codigo = codigo;
    }
    
    public void setEditorial( String editorial){
        this.editorial = editorial;
    }
    
    public void setAñoPubli( int añoPubli){
        this.añoPubli = añoPubli;
    }
    
    public Libro(String titulo,String autor,String codigo, String editorial,int añoPubli)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.editorial = editorial;
        this.añoPubli = añoPubli;
    }

    
    
}
