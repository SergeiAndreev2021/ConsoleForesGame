import java.util.Scanner;

public class SecondMenu {
    public  void secondMenu(){
        System.out.println("1. Загрузить игру \n2. Сохранить игру \n3. Выйти из игры ");
        System.out.println("Выберите пункт меню");
        FirstMenuControl menuControl = new FirstMenuControl();
        Scanner scanner = new Scanner(System.in);
        OUTER : while (true) {
            String input = scanner.nextLine();
            switch (input) {

                case "1" -> {
                    menuControl.setCommand(Commands.loadGame);
                    break OUTER;
                }
                case "2" -> {
                    menuControl.setCommand(Commands.saveGame);
                    break OUTER;
                                   }
                case "3" -> {
                    menuControl.setCommand(Commands.exitGame);
                    break OUTER;
                }
                default -> System.out.println("Enter correct menu punkt");
            }
        }
        menuControl.menuChosen();
    }
}
