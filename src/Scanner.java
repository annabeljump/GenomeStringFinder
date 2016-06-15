import java.util.List;

/**
 * Takes a directory and scans it for files
 * File names are sorted into an Array
 * @author Annabel Jump on 14/06/2016.
 */
public interface Scanner {

    //Method to scan a given folder for the files it contains
    List<String> scanFolder(String folderName);

}
