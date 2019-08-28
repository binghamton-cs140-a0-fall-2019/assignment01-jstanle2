package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
    StreetUSAddress addy1 = new StreetUSAddress("8 Rolling Lane", "", "Levittown", "New York", "11756");
    DateAndPlaceOfBirth dapob1 = new DateAndPlaceOfBirth(2000, 9, 30, "Boca Raton", "Florida", "USA");
    Person person1 = new Person("Jack", "Stanley", "111-22-3333", dapob1, addy1);
    Computer computer1 = new Computer("microsoft", "intel", 8, 2000, true, 599);
    Computer computer2 = new Computer("apple", "amd", 8, 2000, false, 700);
    Computer computer3 = new Computer("microsoft", "intel", 4, 500, false, 300);
    Computer computer4 = new Computer("apple", "amd", 4, 500, true, 450);
    ComputerOwner owner1 = new ComputerOwner(person1);
    owner1.addComputer(computer1);
    owner1.addComputer(computer2);
    owner1.addComputer(computer3);
    owner1.addComputer(computer4);
    System.out.println(owner1);
    owner1.removeComputer(3);
    owner1.removeComputer(2);
    System.out.println(owner1);

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

      StreetUSAddress addy12 = new StreetUSAddress("8 Rolling Lane", "", "Levittown", "New York", "11756");
      DateAndPlaceOfBirth dapob12 = new DateAndPlaceOfBirth(2000, 9, 30, "Boca Raton", "Florida", "USA");
      Person person12 = new Person("Jack", "Stanley", "111-22-3333", dapob12, addy12);
      Computer computer12 = new Computer("microsoft", "intel", 8, 2000, true, 599);
      Computer computer22 = new Computer("apple", "amd", 8, 2000, false, 700);
      Computer computer32 = new Computer("microsoft", "intel", 4, 500, false, 300);
      Computer computer42 = new Computer("apple", "amd", 4, 500, true, 450);
      ComputerOwner owner12 = new ComputerOwner(person12);
      owner12.addComputer(computer12);
      owner12.addComputer(computer22);
      owner12.addComputer(computer32);
      owner12.addComputer(computer42);
      output.println(owner12);
      owner12.removeComputer(3);
      owner12.removeComputer(2);
      output.println(owner12);

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
