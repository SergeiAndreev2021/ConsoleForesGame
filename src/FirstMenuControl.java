import spareparts.Command;

public class FirstMenuControl  {

    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }
    public void menuChosen(){
        slot.execute();
    }
}
