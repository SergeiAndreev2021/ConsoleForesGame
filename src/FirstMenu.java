import spareparts.ParagrafText;

import java.util.Scanner;

public class FirstMenu {
    public static void firstMenu(){
        System.out.println("1. Начать игру \n2. Загрузить игру \n3. Выйти ");
        System.out.println("Выберите пункт меню");
        FirstMenuControl menuControl = new FirstMenuControl();
        Scanner scanner = new Scanner(System.in);
       OUTER : while (true) {
            String input = scanner.nextLine();
            switch (input) {
                case "1" -> {
                    menuControl.setCommand(()-> Action.startAction(ParagrafText.LISENOK));
                    break OUTER;
                }
                case "2" -> {
                    menuControl.setCommand(()-> Action.startAction(new Loader().getParagraph()));
                    break OUTER;
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
