package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
    StreetUSAddress addy1 = new StreetUSAddress("8 Rolling Lane", "", "Levittown", "New York", "11756");
    DateAndPlaceOfBirth dapob1 = new DateAndPlaceOfBirth(2000, 9, 30, "Boca Raton", "Florida", "USA");
    Person person1 = new Person("Jack", "Stanley", "111-22-3333", dapob1, addy1);
    System.out.println(person1);

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

      output.println(person1);

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
