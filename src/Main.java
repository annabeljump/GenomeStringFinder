import java.io.IOException;
import java.util.ArrayList;

/**
 * Contains running scripts of program.
 * Created by annabeljump on 15/06/2016.
 */
public class Main {

    public static void main(String[] args) {

        String pathName = "/Users/annabeljump/Documents/MSc/Project";
        Scanner sc = new ScannerImpl(pathName);

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
