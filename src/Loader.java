
import spareparts.ParagrafText;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Loader {
    private ParagrafText paragraph;
    private ObjectInputStream in;


    public Loader() {
        try {
            in= new ObjectInputStream(new FileInputStream("game.bin"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ParagrafText getParagraph() {
        try {
           paragraph = (ParagrafText) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       return paragraph;
    }

}
