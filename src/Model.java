import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Model {



    // 1. Eine Textdatei (ASCII kodiert) soll eingelesen werden.
    public List<Integer> changeToASCII(String filename){
        //wo ist text.txt abgespeichert
        String file = filename;

        List<Integer> allChar = new ArrayList<>(); //text.txt wird in Arraylist gespeichert
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(file)));
            s.useDelimiter(""); // delimiter
            while (s.hasNext()) { //jeden Char in die Liste speichern
                allChar.add((int)(s.next().charAt(0))); // String wird in int umgewandelt
            }
        }catch(FileNotFoundException f){
            System.out.println(file + " existiert nicht!");
        }
        finally {
            if (s != null) {
                s.close();
            }
        }
        return allChar;
    }
}
