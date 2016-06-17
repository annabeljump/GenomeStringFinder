import java.io.IOException;
import java.util.ArrayList;

/**
 * Contains running scripts of program.
 * Created by annabeljump on 15/06/2016.
 */
public class Main {

    public static void main(String[] args) {

        //TODO accept keyboard input and make interactive output

        System.out.println("Welcome to the Genome String Finder!");
        System.out.println("This tool will search through the files in a given directory");
        System.out.println("and return files that contain a match to the string");
        System.out.println("that you instruct it to find!");
        System.out.println("____________________________________________________________");
        System.out.println("First, please enter the path to the folder that the files you");
        System.out.println("wish to be searched are in (NB this should be in the format");
        System.out.println("/Users/you/folder/searchfolder or similar if you are on Mac, or");
        System.out.println("on Windows, this should be something like c:\\User\\folder\\etc.)");
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

        Finder findME = new Finder("abcd");

        try {
            System.out.println(findME.findMatches(scanned));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
