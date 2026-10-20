public class Articulo {
    private String descripcion;
    private double PrecioUnitario;
    
    public Articulo(String descripcion, double PrecioUnitario){
        this.descripcion = descripcion;
        this.PrecioUnitario = PrecioUnitario;
    }
    
    public String getDescripcion(){
        return descripcion;
    }

    public double getPrecioUnitario(){
        return PrecioUnitario;
    }
    
    
}
