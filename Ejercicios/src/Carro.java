 // 15-02-2022


public class Carro {
    
        static int id = 0;
        String marca;
        String tipo;
        
        Carro(String marca, String tipo){
            System.out.println("constructor de carro"); 
            System.out.println("tipo carro: " +tipo);
            id++;
        }
        
        public void showId(){
            System.out.println("El id es: "+ id);
            
        }
        
        
        
        

    
}
