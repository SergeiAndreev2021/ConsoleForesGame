import spareparts.ParagrafText;

import java.util.Scanner;

public class Action {
    // Оставляем это поле статик, так как к нему обращаются Saver,
    // с помощью него он понимает какой параграф подгрузить
    public static ParagrafText currentPar;

    public  void printParText(ParagrafText text){
        System.out.println(text.getText()+"\n "+text.getMenu());
    }
    public  void startAction(ParagrafText par){
          currentPar =  par;
          printParText(currentPar);
         Scanner scanner = new Scanner(System.in);

        OUTER :  while(true){
           String input = scanner.nextLine();
           switch (input) {
               case "1" ->{
                   printParText(currentPar.getFirst());
                   currentPar = currentPar.getFirst();
               }
               case "2" ->{
                   printParText(currentPar.getSecond());
                   currentPar = currentPar.getSecond();
               }
               case "3" ->{
                   SecondMenu secondMenu = new SecondMenu();
                   secondMenu.secondMenu();
               }
               case "EXIT" ->{
                   System.exit(0);
                   break OUTER;
               }
               default -> System.out.println("Wrong command, try another one");
           }

        }
    }
}
