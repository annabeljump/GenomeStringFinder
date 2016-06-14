import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * Takes a directory and scans it for files
 * File names are sorted into an Array
 * @author Annabel Jump on 14/06/2016.
 */
public class ScannerImpl implements Scanner {

    private String[] fileArray;
    private String folderName;
    private List<String> fileLocations;


    /**
     * Takes a String being the file path of the folder containing the files to be
     * checked for the desired sequence, scans the folder for all files within.
     * All potential files are checked and subfolders and other non-files are weeded out.
     * Returns an Array with all of the file names in for further processing.
     * @param folderName, the String containing the path to the folder to be scanned
     * @return an Array of Strings containing the file names in the folder
     */

    @Override
    public String[] scanFolder(String folderName) {
        File directory = new File(folderName);
        File[] files = directory.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
            this.fileLocations.add(files[i].getName());
            }
        }
        return fileArray;
    }

    public ScannerImpl(String directoryName) {
        this.folderName = directoryName;
    }

}
