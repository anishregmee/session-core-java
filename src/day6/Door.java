package day6;

public class Door {

//    static maa implicit vanne parameter hudaina

    private static int counter;

    public static void increaseCounter(){
        counter++;
    }

    public static void decreaseCounter(){
        counter--;
    }

    public static int getCounter() {
        return counter;
    }
}
