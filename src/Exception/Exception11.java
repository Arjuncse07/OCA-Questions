package Exception;


import java.io.IOException;

class Super {
    Super() throws RuntimeException {
        System.out.print("CARPE ");
    }
}

class Sub extends Super {
    Sub() throws IOException {
        System.out.print("DIEM ");
    }
}

public class Exception11 {
    public static void main(String[] args) throws Exception {
        new Sub();
    }
}

