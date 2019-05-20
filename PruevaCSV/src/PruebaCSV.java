import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PruebaCSV {
	public static void main(String[] args) throws FileNotFoundException{
		//leer datos del archivo
		Scanner scanner = new Scanner(new File("C:\\Users\\julid\\Desktop\\PruebaCSV.csv"));
		scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.print(scanner.next()+"|");
        }
        scanner.close();
	}
}
