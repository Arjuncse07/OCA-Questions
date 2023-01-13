package CustomizedException;

 class TooYoungException extends RuntimeException {

    TooYoungException(String message){
        super(message);
    }


}

class TooOldException extends RuntimeException{

     TooOldException(String message){
         super(message);
     }


}

class Test{
    public static void main(String[] args) {
        int age= Integer.parseInt(args[0]);

        if(age>60){
            throw new TooOldException("Please wait some more time." +
                    "Definately you will get best match  ");
        } else if (age<18) {
            throw new TooYoungException("Sorry You are not able to marry:");
        }
        else {
            System.out.println("You will definately get a best match.");
        }

    }
}