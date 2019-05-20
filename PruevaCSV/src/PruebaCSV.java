import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PruebaCSV {
	public static void main(String[] args) throws FileNotFoundException{
		//leer datos del archivo, 1:"C:\\Users\\Juliandpt\\Desktop\\PruebasCSV.csv", 2:"C:\\Users\\julid\\Desktop\\PruebaCSV.csv"
		Scanner scanner = new Scanner(new File("C:\\Users\\Juliandpt\\Desktop\\PruebasCSV.csv"));
		scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.print(scanner.next()+"|");
        }
        scanner.close();
        
        System.out.println("--------------------------");
        //meter datos
        try (PrintWriter writer = new PrintWriter(new File("C:\\Users\\Juliandpt\\Desktop\\PruebasCSV.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("id,");
            sb.append(',');
            sb.append("Name");
            sb.append('\n');

            sb.append("1");
            sb.append(',');
            sb.append("Prashant Ghimire");
            sb.append('\n');


            System.out.println("done!");

          } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
          }
	}
}
