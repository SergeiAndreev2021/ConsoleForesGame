import spareparts.Command;
import spareparts.ParagrafText;

import java.io.*;

public class Saver {
    ParagrafText paragraf;
    ObjectOutputStream out;


    public Saver(ParagrafText paragraf) {
        this.paragraf = paragraf;
        try{
            out = new ObjectOutputStream(new FileOutputStream("game.bin"));

        } catch (IOException e) {
           e.printStackTrace();
        }
    }
    public void saveParagraf(){
        try {
            out.writeObject(paragraf);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
