// Read a file and print chearcters, lines and words in that file.
import java.io.*;
import java.util.Scanner;

public class Aman3 {
  public static void main(String[] args) {
    try {
      Scanner input = new Scanner(System.in);
      File file = new File("abc.txt");
      Scanner fileInput = new Scanner(file);

      int characters = 0;
      int lines = 0;
      int words = 0;
      while (fileInput.hasNextLine()) {
        String line = fileInput.nextLine();
        characters += line.length();
        lines++;
        words += line.split(" ").length;
      }
      fileInput.close();
      System.out.println("Characters: " + characters);
      System.out.println("Lines: " + lines);
      System.out.println("Words: " + words);
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
    }
  }
}                                                                                                                                                                                             
