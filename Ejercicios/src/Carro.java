 // 15-02-2022


public class Carro {
    
        String marca;
        String tipo;
        String placa;

    public Carro(String marca, String tipo, String placa) {
        this.marca = marca;
        this.tipo = tipo;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

        
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
}
