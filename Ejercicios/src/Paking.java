
public class Paking {
    int espacio = 0;
    String tipo;
    boolean estado;

    public Paking(int espacio, String tipo, boolean estado) {
       this.espacio = espacio;
        this.tipo = tipo;
        this.estado = estado;
        
        if(espacio <= 5){
           espacio++; 
        }else{
            System.out.println("sin espacios disponibles");
        }
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paking{" + "espacio=" + espacio + ", tipo=" + tipo + ", estado=" + estado + '}';
    }
    
    
    
    
}
