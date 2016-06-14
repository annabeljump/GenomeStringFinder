/**
 * Takes a directory and scans it for files
 * File names are sorted into an Array
 * @author Annabel Jump on 14/06/2016.
 */
public class ScannerImpl implements Scanner {

    private String[] fileArray;
    private String folderName;


    /**
     * Takes a String being the file path of the folder containing the files to be
     * checked for the desired sequence, scans the folder for all files within.
     * Returns an Array with all of the file names in for further processing.
     * @param folderName, the String containing the path to the folder to be scanned
     * @return an Array of Strings containing the file names in the folder
     */

    @Override
    public String[] scanFolder(String folderName) {
        return new String[0];
    }

    public ScannerImpl(String directoryName) {
        this.folderName = directoryName;
    }

}
