import spareparts.ParagrafText;

import java.util.Scanner;

public class Action {
    public static ParagrafText currentPar;
    public static void printParText(ParagrafText text){
        System.out.println(text.getText()+"\n "+text.getMenu());
    }
    public static void startAction(ParagrafText par){
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
                   SecondMenu.secondMenu();
               }
               case "EXIT" ->{
                   System.exit(0);
                   break OUTER;
               }
               default -> System.out.println("Wrong command, try another one");
           }
            // через иф можно  equalsignoreCase  но ифами совсем не хотца портить код
        }
    }
}
