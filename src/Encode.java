import java.util.List;

public class Encode extends Model {



    /*
    2. Es soll eine Tabelle angelegt werden, in der fuer jedes der 128 moglichen ASCII-Zeichen
    drinsteht, wie oft das entsprechende Zeichen in der Textdatei vorkommt. (Hinweis: (int)
    c macht aus einem character c den entsprechenden ASCII-Wert).
    */

    public void test()

    {
        List<Integer> allLetter = changeToASCII("Beispiel.txt");

        int[] ascii = new int[128]; //Zeichen von 0-127
        int zaehler = 0;

        for (int i : allLetter) {


        }


    }


}
