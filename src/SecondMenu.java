import java.util.Scanner;

public class SecondMenu {
    public static void secondMenu(){
        System.out.println("1. Загрузить игру \n2. Сохранить игру \n3. Выйти из игры ");
        System.out.println("Выберите пункт меню");
        FirstMenuControl menuControl = new FirstMenuControl();
        Scanner scanner = new Scanner(System.in);
        OUTER : while (true) {
            String input = scanner.nextLine();
            switch (input) {

                case "1" -> {
                    menuControl.setCommand(()-> Action.startAction(new Loader().getParagraph()));
                    break OUTER;
                }
                case "2" -> { Saver saver = new Saver(Action.currentPar);
                    saver.saveParagraf();
                    System.out.println("Игра сохранена");
                    Action.startAction(Action.currentPar);
                    break OUTER;
                    /*
                       почему-то в таком виде не работает :
                     menuControl.setCommand(()->new Saver(Action.currentPar).saveParagraf());
                    System.out.println("Игра сохранена");
                    Action.startAction(Action.currentPar);
                    break OUTER;

                     */
                }
                case "3" -> {
                    menuControl.setCommand(() -> {System.out.println("Thank u for your game! Goo luck!");
                                                  System.exit(0);});
                    break OUTER;
                }
                default -> System.out.println("Enter correct menu punkt");
            }
        }
        menuControl.menuChosen();
    }
}
