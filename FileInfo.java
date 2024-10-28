package fileinfo;

import java.io.File;
import java.io.IOException;

public class FileInfo {

    public static void main(String[] args) {
        String fileName = args[0];
        File fn = new File(fileName);
        try {
            fn.createNewFile();
            System.out.println(fn.getName() + ":" + (fn.exists() ? "exists" : "doesn't exist"));
        } catch (IOException e) {
            System.out.println("Something went wrong..." + e);
        }

        System.out.println(fn.getName() + ":" + (fn.canRead() ? "is " : "isn't ") + "readable");
        System.out.println(fn.getName() + ":" + (fn.canWrite() ? "is " : "isn't ") + "writable");
        System.out.println("Μεγεθος αρχειου: " + fn.length() + " Bytes");
        System.out.println("Ημερομηνια τελευταιας τροποποιησης: " + new java.util.Date(fn.lastModified()));
    }

}
