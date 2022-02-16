

import java.util.Scanner;

public class Metodos {
    
    public static String IntefazMenu(){
         int num = 0;
        int caso1 = 0;
        int caso2 = 0;
        int caso3 = 0;
        
        System.out.println("Agendamiento de estacionamiento");

        Scanner leer = new Scanner(System.in);
        
        do{
            
            System.out.println("1. Estacionamiento");
            System.out.println("2. Vehiculo");
            System.out.println("3. Información general");
            System.out.println("4. Salir");

            System.out.print("Selecciones la opcion: ");
            num = leer.nextInt();
            System.out.println("\n" + "---------------------------------------");
            
            switch (num) {
                case 1:
                    
                    do{
                    System.out.println("");
                    System.out.println("1. Agendar estacionamiento");
                    System.out.println("2. Numero de espacios");
                    System.out.println("3. Salir");
                    System.out.print("Seleccione la opción: ");
                    caso1 = leer.nextInt();
                    
                    
                    }while(caso1 < 3 && caso1 > -1 );
                    
                    System.out.println("\n"+"-------------------------");
                    System.out.println("Saliendo de estacionamiento");
                    System.out.println("-------------------------");

                    break;

                case 2:
                    
                     do{
                    System.out.println("");
                    System.out.println("1. Mirar tu vehiculo");
                    System.out.println("2. Pago por vehiculo");
                    System.out.println("3. Salir");
                    System.out.print("Seleccione la opción: ");
                    caso2 = leer.nextInt();
                    
                    
                    }while(caso2 < 3 && caso2 > -1 );
                    
                    System.out.println("\n"+"-------------------------");
                    System.out.println("Saliendo de Vehiculos");
                    System.out.println("-------------------------");
                    

                    break;

                case 3:
                    
                    do{
                    System.out.println("");
                    System.out.println("1. Información de precios");
                    System.out.println("2. Información del servicio");
                    System.out.println("3. Salir");
                    System.out.print("Seleccione la opción: ");
                    caso3 = leer.nextInt();
                    
                    }while(caso3 < 3 && caso3 > -1 );
                    
                    System.out.println("\n"+"-------------------------");
                    System.out.println("Saliendo de Informacion");
                    System.out.println("-------------------------");

                    break;

            }
        } while (num < 4 && num > -1);
        
        return "* Programa finalizado";
    }

}
