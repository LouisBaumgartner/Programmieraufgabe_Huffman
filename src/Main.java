public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        String hello = "hello";

        int [] quellenalphabetHäufigkeit = new int [128];
        String [] kanalalphabetHäufigkeit = new String [128];

        //Häufigkeit für jedes zeichen zählen
        for (int i = 0; i < hello.length() ; i++) {
            quellenalphabetHäufigkeit[(int)hello.charAt(i)]++;
        }



    }
}

