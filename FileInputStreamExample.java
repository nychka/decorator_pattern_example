import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamExample {

  public static void main(String[] args){
    String line = "";
    try( VasyaFilter reader = new VasyaFilter(new BufferedReader (new  InputStreamReader (new FileInputStream("test.txt")))))
    {
      while(( line = reader.readLine()) != null ){
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
