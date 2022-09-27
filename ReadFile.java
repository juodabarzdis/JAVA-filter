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
          data = data.replaceAll("[^\\d]", " ");
          data = data.trim();
          data = data.replaceAll(" +", " ");
            for (String retval: data.split(" ")) {
          int num = Integer.parseInt(retval);
            if (num >= 10) {
              String str = Integer.toString(num);
              if(data.contains(str)) {
                System.out.println(str);
              }
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
