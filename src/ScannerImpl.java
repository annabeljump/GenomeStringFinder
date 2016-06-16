import java.io.File;
import java.util.ArrayList;


/**
 * Takes a directory and scans it for files
 * File names are sorted into an Array
 * @author Annabel Jump on 14/06/2016.
 */
public class ScannerImpl implements Scanner {

    private String folderName;
    private ArrayList<String> fileLocations;


    /**
     * Takes a String being the file path of the folder containing the files to be
     * checked for the desired sequence, scans the folder for all files within.
     * All potential files are checked and subfolders and other non-files are weeded out.
     * Returns an Array with all of the file paths in for further processing.
     * @return an ArrayList of Strings containing the file names in the folder
     */

    @Override
    public ArrayList<String> scanFolder() {
        File directory = new File(folderName);
        File[] files = directory.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
            fileLocations.add(files[i].getPath());
                //Two lines of code I used to test if working:
               // System.out.println(fileLocations);
               // System.out.println(files[i]);
            }
        }
        return fileLocations;
    }

    //Constructors for the Scanner
    public ScannerImpl(String directoryName) {
        this.folderName = directoryName;
        this.fileLocations = new ArrayList<>();
    }

    public ScannerImpl() {
        this.folderName = null;
        this.fileLocations = new ArrayList<>();
    }

    //Getters and Setters

    public void setFolderName(String s){
        this.folderName = s;
    }

    public String getFolderName() {
        return this.folderName;
    }

    public ArrayList<String> getFileLocations() {
        return this.fileLocations;
    }
}
