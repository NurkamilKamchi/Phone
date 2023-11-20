import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Scanner scanner1 = new Scanner(System.in);
//        Bank bank = new Bank(1000,scanner1.nextInt(),9417728508478926l);
//        Notes notes1 = new Notes();
//        Notes[] notes = new Notes[0];
        OuterLoop:
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Scanner scannerForNum = new Scanner(System.in);
            System.out.println("""
                    1.Notes.
                    2.Calculator.
                    3.Bank.
                    4.Exit.
                    Enter choice: 
                    """);
            switch (scanner.nextLine()) {
                case "1" -> {
                    switch (scanner.nextLine()) {
                        case "1" -> {

                            Notes.menuNotes();
//                        switch (scanner.nextLine()) {
//                            case "5" -> {
//                                break InnerLoop;
//                            }
                        }


                    }

                }
                case "2" -> {
                    Calculator.calculator();
                }
                case "3" -> {

                        Bank.headWords();


                }
            }
        }

    }
}
