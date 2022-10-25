package trabajoclase1_catalinayushan;

import java.util.Scanner;

public class TrabajoClase1_CatalinaYushan {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un mes: ");
        System.out.println("Ingrese el año: ");
        int mes_2022 = entrada.nextInt();
        int año = entrada.nextInt();
        int dias_mes = 0;
        int bisiesto;
        
        switch(mes_2022){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias_mes = 31;
                System.out.println("Sus mes tiene 31 dias!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias_mes = 30;
                System.out.println("Sus mes tiene 30 dias!");
                break ;
            case 2:
                bisiesto = año % 4;
                if (bisiesto ==0) {
                    dias_mes = 29;
                    System.out.println("Sus mes tiene 29 dias!");
                }else{
                    dias_mes = 28;
                    System.out.println("Sus mes tiene 28 dias!");
                    break;
                  
        default:
            System.out.println("Sus datos no son válidos. Ingrese nuevos valores!");
        
                    
                    
                }
                
                
                
        }
     
    }
    
}
