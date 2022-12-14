
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
            this.paragraph = (ParagrafText) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ParagrafText getParagraph() {

       return this.paragraph;
    }

}
