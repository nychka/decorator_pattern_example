import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class VasyaFilter extends BufferedReader {

  public VasyaFilter(Reader input){
    super(input);
  }
  public String readLine() throws IOException {
	  String line = super.readLine();
	  if(line != null){
      ArrayList<String> words = new ArrayList<String>(Arrays.asList(line.split("\\s")));
	  	words.add(1, "вася"); // insert word after first item in each lile
		  line = words.toString();
      // array.join where are? I miss you so much!
      line = line.replaceAll("[\\[\\],]", "");
      line = line.replace("Дівчина", "тёлочка");
      line = line.replace("засміялась", "заржала");
	  }
	  return line;
  }
}
