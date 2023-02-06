package MethodReference;

class Sample{
    private String s;
    Sample(String s){
       this.s=s;
        System.out.println("Constructor Executed:"+s);
    }
}

interface  Interf{
    public Sample get(String s);
}

public class ConsRef {
    public static void main(String[] args) {
        Interf f= s -> new Sample(s);
        f.get("From Lambda Excpression");

        Interf f1= Sample::new;
        f1.get("From Constructor Refrence");
    }
}
