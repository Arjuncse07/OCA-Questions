package Exception;



    class Base {
        public void log() throws NullPointerException {
            System.out.println("Base: log()");
        }
    }

    class Derived extends Base {
        public void log() throws RuntimeException {
            System.out.println("Derived: log()");
        }
    }

    public class Exception5 {
        public static void main(String[] args) {
            Base obj = new Derived();
            obj.log();
        }
}
