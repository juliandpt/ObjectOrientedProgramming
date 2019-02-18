
import java.util.Scanner;

public class ReservaAutobus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creo un array de dos dimensiones para representar el autobus.
        char autobus[][] = new char[25][4];

        // marco los asientos del autobus como vacios.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 25; j++) {
                autobus[j][i] = 'O';
            }
        }

        // hasta que no se cierre el viaje puedo reservar y mostrar autobus
        boolean viajeCerrado = false;
        while (!viajeCerrado) {
            System.out.println("Elija una opción: ");
            System.out.println("1 - Realizar reserva");
            System.out.println("2 - Mostrar autobus");
            System.out.println("3 - Cerrar viaje");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1: // reservar
                    // leo la fila y asiento
                    System.out.println("Dime la fila (1-25):");
                    int fila = sc.nextInt();
                    System.out.println("Dime el asiento (1-4):");
                    int asiento = sc.nextInt();
                    
                    // compruebo si han metido los datos bien (extra)
                    if (fila > 25 || fila < 1 || asiento > 4 || asiento < 1){
                        System.out.println("Error al introducir datos");
                    }else{
                        // si el asiento esta libre lo ocupo 'X'.
                        if (autobus [fila-1][asiento-1] == 'O'){
                            autobus [fila-1][asiento-1] = 'X';
                        }else{
                            // en caso contrario indico que el asiento está ocupado
                            System.out.println("Asiento ocupado");
                        }
                    }                    
                    break;
                    
                case 2: // imprimir autobus.
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 25; j++) {
                            System.out.print(" " + autobus[j][i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                    
                case 3: // cerrar viaje
                    viajeCerrado = true;
                    break;
                    
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
        
        // calcular facturación, se ha salido del bucle por que se ha cerrado el viaje.
        int vendido = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 25; j++) {
                if (autobus[j][i] == 'X'){
                    vendido++;
                }
            }
        }
        
        System.out.println("facturación = " + (vendido*25.5));
    }

}

