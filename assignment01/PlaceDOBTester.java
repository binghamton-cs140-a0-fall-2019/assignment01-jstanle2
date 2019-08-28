package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
    DateAndPlaceOfBirth dapob1 = new DateAndPlaceOfBirth(2000, 9, 30, "Boca Raton", "Florida", "USA");
    DateAndPlaceOfBirth dapob2 = new DateAndPlaceOfBirth(1970, 9, 30, "Levittown", "New York", "USA");
    DateAndPlaceOfBirth dapob3 = new DateAndPlaceOfBirth(1999, 7, 31, "Levittown", "Pennsylvania", "USA");
    DateAndPlaceOfBirth dapob4 = new DateAndPlaceOfBirth(2000, 9, 30, "London", "England");
    DateAndPlaceOfBirth dapob5 = new DateAndPlaceOfBirth(2010, 1, 1, "Rome", "Italy");
    System.out.println(dapob1);
    System.out.println(dapob2);
    System.out.println(dapob3);
    System.out.println(dapob4);
    System.out.println(dapob5);
    //printing the tests here
    System.out.println(dapob1.olderThan(dapob2));
    System.out.println(dapob1.olderThan(dapob3));
    System.out.println(dapob1.olderThan(dapob4));
    System.out.println(dapob1.olderThan(dapob5));
    System.out.println(dapob2.olderThan(dapob3));
    System.out.println(dapob2.olderThan(dapob4));
    System.out.println(dapob2.olderThan(dapob5));
    System.out.println(dapob3.olderThan(dapob4));
    System.out.println(dapob3.olderThan(dapob5));
    System.out.println(dapob4.olderThan(dapob5));

    System.out.println(dapob1.youngerThan(dapob2));
    System.out.println(dapob1.youngerThan(dapob3));
    System.out.println(dapob1.youngerThan(dapob4));
    System.out.println(dapob1.youngerThan(dapob5));
    System.out.println(dapob2.youngerThan(dapob3));
    System.out.println(dapob2.youngerThan(dapob4));
    System.out.println(dapob2.youngerThan(dapob5));
    System.out.println(dapob3.youngerThan(dapob4));
    System.out.println(dapob3.youngerThan(dapob5));
    System.out.println(dapob4.youngerThan(dapob5));

    System.out.println(dapob1.hasSameBirthDateAs(dapob2));
    System.out.println(dapob1.hasSameBirthDateAs(dapob3));
    System.out.println(dapob1.hasSameBirthDateAs(dapob4));
    System.out.println(dapob1.hasSameBirthDateAs(dapob5));
    System.out.println(dapob2.hasSameBirthDateAs(dapob3));
    System.out.println(dapob2.hasSameBirthDateAs(dapob4));
    System.out.println(dapob2.hasSameBirthDateAs(dapob5));
    System.out.println(dapob3.hasSameBirthDateAs(dapob4));
    System.out.println(dapob3.hasSameBirthDateAs(dapob5));
    System.out.println(dapob4.hasSameBirthDateAs(dapob5));

    System.out.println(dapob1.hasSameBirthDayAs(dapob2));
    System.out.println(dapob1.hasSameBirthDayAs(dapob3));
    System.out.println(dapob1.hasSameBirthDayAs(dapob4));
    System.out.println(dapob1.hasSameBirthDayAs(dapob5));
    System.out.println(dapob2.hasSameBirthDayAs(dapob3));
    System.out.println(dapob2.hasSameBirthDayAs(dapob4));
    System.out.println(dapob2.hasSameBirthDayAs(dapob5));
    System.out.println(dapob3.hasSameBirthDayAs(dapob4));
    System.out.println(dapob3.hasSameBirthDayAs(dapob5));
    System.out.println(dapob4.hasSameBirthDayAs(dapob5));

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

      output.println(dapob1);
      output.println(dapob2);
      output.println(dapob3);
      output.println(dapob4);
      output.println(dapob5);

      output.println(dapob1.olderThan(dapob2));
      output.println(dapob1.olderThan(dapob3));
      output.println(dapob1.olderThan(dapob4));
      output.println(dapob1.olderThan(dapob5));
      output.println(dapob2.olderThan(dapob3));
      output.println(dapob2.olderThan(dapob4));
      output.println(dapob2.olderThan(dapob5));
      output.println(dapob3.olderThan(dapob4));
      output.println(dapob3.olderThan(dapob5));
      output.println(dapob4.olderThan(dapob5));

      output.println(dapob1.youngerThan(dapob2));
      output.println(dapob1.youngerThan(dapob3));
      output.println(dapob1.youngerThan(dapob4));
      output.println(dapob1.youngerThan(dapob5));
      output.println(dapob2.youngerThan(dapob3));
      output.println(dapob2.youngerThan(dapob4));
      output.println(dapob2.youngerThan(dapob5));
      output.println(dapob3.youngerThan(dapob4));
      output.println(dapob3.youngerThan(dapob5));
      output.println(dapob4.youngerThan(dapob5));

      output.println(dapob1.hasSameBirthDateAs(dapob2));
      output.println(dapob1.hasSameBirthDateAs(dapob3));
      output.println(dapob1.hasSameBirthDateAs(dapob4));
      output.println(dapob1.hasSameBirthDateAs(dapob5));
      output.println(dapob2.hasSameBirthDateAs(dapob3));
      output.println(dapob2.hasSameBirthDateAs(dapob4));
      output.println(dapob2.hasSameBirthDateAs(dapob5));
      output.println(dapob3.hasSameBirthDateAs(dapob4));
      output.println(dapob3.hasSameBirthDateAs(dapob5));
      output.println(dapob4.hasSameBirthDateAs(dapob5));

      output.println(dapob1.hasSameBirthDayAs(dapob2));
      output.println(dapob1.hasSameBirthDayAs(dapob3));
      output.println(dapob1.hasSameBirthDayAs(dapob4));
      output.println(dapob1.hasSameBirthDayAs(dapob5));
      output.println(dapob2.hasSameBirthDayAs(dapob3));
      output.println(dapob2.hasSameBirthDayAs(dapob4));
      output.println(dapob2.hasSameBirthDayAs(dapob5));
      output.println(dapob3.hasSameBirthDayAs(dapob4));
      output.println(dapob3.hasSameBirthDayAs(dapob5));
      output.println(dapob4.hasSameBirthDayAs(dapob5));

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
