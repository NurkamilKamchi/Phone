public class MyGenerateId {
    private static int counter=1;
    public static int generateId(){
        return counter++;
    }
}
