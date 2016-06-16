import java.io.*;
import java.util.ArrayList;


/**
 * The actual class which will find the string matches in the files
 * Created by annabeljump on 15/06/2016.
 */
public class Finder {
    private ArrayList<String> filePaths;
    private String currentFile;
    private String searchString;
    private ArrayList<String> matchFiles;
    private String matchString;

    public Finder(String s) {
        this.filePaths = new ArrayList<>();
        this.currentFile = "";
        this.searchString = "";
        this.matchFiles = new ArrayList<>();
        this.matchString = s;
    }

    public ArrayList<String> findMatches(ArrayList<String> fileNames) throws FileNotFoundException {

        this.filePaths = fileNames;

        for(int i = 0; i < filePaths.size(); i++) {

            this.currentFile = filePaths.get(i);

            File now = new File(currentFile);
            BufferedReader buff = new BufferedReader(new FileReader(now));
            StringBuffer contents = new StringBuffer();
            try {
                String line = buff.readLine();
                while (line != null) {
                    contents.append(line);
                    line = buff.readLine();
                }
                this.searchString = contents.toString();
                buff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (searchString.toLowerCase().contains(matchString.toLowerCase())) {
                matchFiles.add(currentFile);
            }
        }
        return matchFiles;
    }
}
