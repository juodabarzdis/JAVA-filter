import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {  
  public static void main(String[] args) {  
      try {       
        File myObj = new File("content.txt");
        Scanner reader = new Scanner(myObj);
        while (reader.hasNextLine()) {           
        String data = reader.nextLine();    
        String rep = data.replaceAll("[^\\d]", " ");
        rep = rep.trim();
        rep = rep.replaceAll(" +", " ");
          for (String retval: rep.split(" ")) {
        int num = Integer.parseInt(retval);
          if (num >= 10) {
              System.out.println(data);
          }    
        } 
      }
      reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

