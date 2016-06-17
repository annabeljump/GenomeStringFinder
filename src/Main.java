import java.io.IOException;
import java.util.ArrayList;

/**
 * Contains running scripts of program.
 * Created by annabeljump on 15/06/2016.
 */
public class Main {

    public static void main(String[] args) {


        System.out.println("Welcome to the Genome String Finder!");
        System.out.println("");
        System.out.println("This tool will search through the files in a given directory");
        System.out.println("and return files that contain a match to the string");
        System.out.println("that you instruct it to find!");
        System.out.println("");
        System.out.println("____________________________________________________________");
        System.out.println("");
        System.out.println("First, please enter the path to the folder that the files you");
        System.out.println("wish to be searched are in (NB this should be in the format");
        System.out.println("/Users/you/folder/searchfolder or similar if you are on Mac, or");
        System.out.println("on Windows, this should be something like c:\\User\\folder\\etc.)");
        System.out.println("");
        System.out.println("Please enter the folder path now:");

        String pathName = System.console().readLine();
        Scanner sc = new ScannerImpl(pathName);

        System.out.print("Thank you! Scanning.");
        System.out.print(".");
        System.out.print(".");
        System.out.print(".");
        System.out.print(".");
        System.out.println(".");

        ArrayList<String> scanned = new ArrayList<>();
        scanned = sc.scanFolder();

        System.out.println("Please enter the target sequence you wish to search for:");

        String target = System.console().readLine();
        Finder findME = new Finder(target);

        System.out.println("Your sequence was matched in:");

        try {
            System.out.println(findME.findMatches(scanned));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
