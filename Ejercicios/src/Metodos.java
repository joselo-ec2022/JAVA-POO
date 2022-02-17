

import java.util.Scanner;

public class Metodos {
      public static String[] horarios = {"dia", "tarde"}; 
        static int espacios = 5;
        public static int puesto = 0;

    public static String IntefazMenu(){
        Paking parqueo = new Paking(0, "", false);
        Carro carro = new Carro("", "", "");
        
        
        int num = 0;
        int caso1 = 0;
        int caso2 = 0;
        int caso3 = 0;
        String tiempo = null;
        boolean fov = false;
        
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
                    
                     if(caso1 == 1){
                        if(puesto <= 5){
                            
                        System.out.println("Seleccione su horario:");

                        for (int i = 0; i < 2; i++) {
                            System.out.println("- horario de la: "+ horarios[i]);                            
                        }
                            System.out.println("\n "+"--------------------------------");
                        
                         System.out.print("Escriba el horario: ");
                        tiempo = leer.next();
                         
                        if(tiempo.equals("dia")){
                            System.out.println("El horario que selecciono fue: "+ tiempo);
                            
                            System.out.println("\n"+ "--------------------------------------");
                            
                            do{
                            System.out.print("Numero de espacios que desee agendar: ");
                            puesto = leer.nextInt();
                            
                            if(puesto > 1){
                            fov = true;
                                parqueo.espacio = puesto;
                                parqueo.estado = fov;
                                parqueo.tipo = tiempo;
                                
                                System.out.println("parqueadero: "+ parqueo);
                                
                                }
                            } while(espacios > 5);
     
                            
                        }
                        
//----------------------------------------------------------------------------------------------                        
                        
                        else if(tiempo.equals("tarde")){

                            System.out.println("El horario que selecciono fue: "+ tiempo);
                            
                            System.out.println("\n"+ "--------------------------------------");
                            
                            do{
                            System.out.print("Numero de espacios que desee agendar: ");
                            puesto = leer.nextInt();
                            
                            if(puesto > 1){
                            fov = true;
                                parqueo.espacio = puesto;
                                parqueo.estado = fov;
                                parqueo.tipo = tiempo;
                                
                                System.out.println("parqueadero: "+ parqueo);
                                
                                }
                            } while(espacios > 5);
                        }else{
                            System.out.println("Horario invalido");
                        }
                      
                    }else{
                            System.out.println("No existen puestos disponibles");
                        }
                     }
                     //-------------------------------------
                     
                      if(caso1 == 2){
                          System.out.println("El numero de espacios disponibles es: "+puesto);
                          
                      }
                    
                    }while(caso1 < 3 && caso1 > -1 );
                    
                   
                    
                    
                    System.out.println("\n"+"-------------------------");
                    System.out.println("Saliendo de estacionamiento");
                    System.out.println("-------------------------");

                    break;
                    
//----------------------------------------------------------------------------------------------
                    
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
