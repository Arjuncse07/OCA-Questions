package Exception;

public class Exception4 {
    public static void main(String[] args) {
        try {
            play();
            return;
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return;
        } finally {
            System.out.println("MATCH ABANDONED");
        }

        //System.out.println("DONE");
    }

    static void play() throws Exception {
        throw new Exception("INJURED");
    }
}
