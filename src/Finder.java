import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.File;


/**
 * The actual class which will find the string matches in the files
 * Created by annabeljump on 15/06/2016.
 */
public class Finder {
    private ArrayList<String> filePaths;
    private String currentFile;
    private String searchString;
    private ArrayList<String> matchFiles;

    public Finder(ArrayList<String> fP) {
        this.filePaths = fP;
    }

    public ArrayList<String> findSequenceMatches() {

    }
    //File file = new File(fileLocation);

    //BufferedReader br = new BufferedReader(new FileReader(file));
    //StringBuffer fileContents = new StringBuffer();
    //String line = br.readLine();
    //while (line != null) {
      //  fileContents.append(line);
      //  line = br.readLine();
    //}

    //br.close();
}
