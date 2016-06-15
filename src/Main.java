/**
 * Contains running scripts of program.
 * Created by annabeljump on 15/06/2016.
 */
public class Main {

    public static void main(String[] args) {

        String pathName = "/Users/annabeljump/Documents/MSc/Project";
        Scanner sc = new ScannerImpl(pathName);

        sc.scanFolder();

    }
}
