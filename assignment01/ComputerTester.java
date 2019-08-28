package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
    Computer computer1 = new Computer("microsoft", "intel", 8, 2000, true, 599);
    Computer computer2 = new Computer("apple", "amd", 8, 2000, false, 700);
    Computer computer3 = new Computer("microsoft", "intel", 4, 500, false, 300);
    Computer computer4 = new Computer("apple", "amd", 4, 500, true, 450);
    System.out.println(computer1);
    System.out.println(computer2);
    System.out.println(computer3);
    System.out.println(computer4);
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

      output.println(computer1);
      output.println(computer2);
      output.println(computer3);
      output.println(computer4);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
