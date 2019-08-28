package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
	public static void main(String[] args) {
    StreetUSAddress addy1 = new StreetUSAddress("8 Rolling Lane", "", "Levittown", "New York", "11756");
    StreetUSAddress addy2 = new StreetUSAddress("62 Null Lane", "9 Nine Road", "Boca Raton", "Florida", "11765");
    System.out.println(addy1);
    System.out.println(addy2);

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

      output.println(addy1);
      output.println(addy2);

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
