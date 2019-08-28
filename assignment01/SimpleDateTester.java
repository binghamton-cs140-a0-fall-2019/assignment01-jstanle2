package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
    SimpleDate date1 = SimpleDate.of(2000, 11, 11);
    SimpleDate date2 = SimpleDate.of(2001, 11, 11);
    SimpleDate date3 = SimpleDate.of(2000, 12, 11);
    SimpleDate date4 = SimpleDate.of(2000, 11, 12);
    SimpleDate date5 = SimpleDate.of(1999, 11, 11);
    SimpleDate date6 = SimpleDate.of(2000, 10, 11);
    SimpleDate date7 = SimpleDate.of(2000, 11, 10);
    SimpleDate date8 = SimpleDate.of(2000, 11, 11);
    System.out.println(date1.before(date2));
    System.out.println(date1.before(date3));
    System.out.println(date1.before(date4));
    System.out.println(date1.before(date5));
    System.out.println(date1.before(date6));
    System.out.println(date1.before(date7));
    System.out.println(date1.before(date8));
  }
}
