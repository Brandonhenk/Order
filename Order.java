import java.util.Scanner;
import java.io.*;
public class Order{
  public static void main(String[] args) throws IOException {

    for (int x = 0; x < args.length; x++){
      File file = new File(args[x]);
      Scanner inputFile = new Scanner(file);

      String line = inputFile.nextLine();
      System.out.println(line);
    }
  }
}
