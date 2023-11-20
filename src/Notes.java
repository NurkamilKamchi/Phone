import java.util.Arrays;
import java.util.Scanner;

public class Notes {
    private String text;
    private int id;

    public Notes() {
    }

    public String getText() {
        return text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static void menuNotes(){
        Scanner scanner = new Scanner(System.in);
        Notes[] notes = new Notes[0];
        while (true){
            System.out.println("""
                    1.Add notes.
                    2.Get all.
                    3.Update notes.
                    4.Delete  notes.
                    5.Exit.
                    Enter choice: 
                    """);
            switch (scanner.nextLine()){
                case "1"->{
                   notes = new Notes().addnotes(notes);
                }
                case "2" -> getAllNotes(notes);
                case "3"->{updateNotes(notes);}
                case "4"->{notes = deleteNotes(notes);}
                case "5"-> {
                    return;
                }

            }
        }
    }



    public Notes[] addnotes(Notes[] notes){
        Scanner scanner = new Scanner(System.in);
        this.setId(MyGenerateId.generateId());
        System.out.println("Enter notes; ");
        this.setText(scanner.nextLine());
        notes = Arrays.copyOf(notes,notes.length+1);
        notes[notes.length -1]=this;

        return notes;
    }

    public static void getAllNotes(Notes[] notes){
        for (Notes note : notes) {
            System.out.println(note);
        }
    }
    public static void updateNotes(Notes[]notes){
        Scanner scanner1 = new Scanner(System.in);
        Scanner scannerforNum = new Scanner(System.in);
        System.out.print("Kaisy id: ");
        int a = scanner1.nextInt();
        for (int i = 0; i < notes.length; i++) {
            if (notes[i].getId()== a){
                System.out.print("Enter text: ");
                String text = scannerforNum.nextLine();
                notes[i].setText(text);
                System.out.println(notes[i]);
            }
        }


    }
    public static Notes[] deleteNotes(Notes[]notes){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        for (int i = 0; i < notes.length; i++) {
           if (notes[i].getId()== id){
               for (int j = i; j < notes.length-1; j++) {
                   notes[j]=notes[j+1];
               }
           }
        }
        return (Arrays.copyOf(notes,notes.length-1));
    }
//    public static void Exit(){
//        System.exit(0);
//    }

    @Override
    public String toString() {
        return "Notes{" +"id  "+id+
                "text='" + text + '\'' +
                '}';
    }
}
