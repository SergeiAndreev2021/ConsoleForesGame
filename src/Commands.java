import spareparts.Command;
import spareparts.ParagrafText;

public class Commands {
    public static final Command startGame= ()-> {  Action action = new Action();
                                               action.startAction(ParagrafText.LISENOK);};

    public static final Command loadGame= ()->{ Action action = new Action();
                                               action.startAction(new Loader().getParagraph());};

    public static final Command exitGame= () -> {System.out.println("Thank u for your game! Goo luck!");
                                                 System.exit(0);};

    public static final Command saveGame=  () ->{ Action action = new Action();
                                                Saver saver = new Saver(Action.currentPar);
                                                saver.saveParagraf();
                                                System.out.println("Игра сохранена");
                                                action.startAction(Action.currentPar);};

}
