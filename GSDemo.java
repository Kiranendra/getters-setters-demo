import static java.lang.System.out;
import static java.lang.System.in;

import java.util.ArrayList;
import java.util.Scanner;

public class GSDemo{
  private static Helper helper = null;
  private static Helper help = null;
  private static int id;
  private static String name;
  private static String branch;
  private static ArrayList<Object> objects = new ArrayList<Object>();
  public static void main (String[] args) {
    out.println("\n " + "===== Save new Employee Details =====");
    out.print("\n " + "Enter number of new employess: ");
    Scanner scanner = new Scanner(in);
    int no_of_employees = scanner.nextInt();
    scanner.nextLine();
    int i = 1;
    out.println("\n");
    while (i <= no_of_employees) {
      helper = new Helper();
      out.print(" Employee " + i + " name: ");
      name = scanner.nextLine();
      out.println();
      out.print(" Employee " + i + " branch: ");
      branch = scanner.nextLine();
      helper.setId(i);
      helper.setName(name);
      helper.setBranch(branch);
      objects.add(helper);
      i++;
      out.println("\n");
    }
    out.println("\n " + "===== View Employee Details =====" + "\n");
    for (Object obj: objects) {
      help = (Helper) obj;
      out.println(" Employee " + help.getId() + " details:" + "\n");
      out.println(" ```````````````````");
      out.println("\t Name   : " + help.getName());
      out.println("\t Branch : " + help.getBranch());
      out.println("\n");
    }
  }
}