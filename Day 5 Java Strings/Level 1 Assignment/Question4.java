public class Question4 {

    public static void NullPointerException (String text) {
        System.out.println(text.length());
    }

    public static void HandleException (String text) {
        try {
            System.out.println(text.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException Occurrence: " +e.getMessage() );
        }
    }

    public static void main(String[] Args) {
        String text = null;
        NullPointerException(text);
        HandleException(text);
    }
}
