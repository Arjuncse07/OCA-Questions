package ValidPincodeFromCSVFile;
// Delloit question for finding the CSV File pindcode
public class ValidPincode {
    public static void main(String[] args) {
        String address="Ploat Number 144, Pratap Enclave, Mohan Garden,  Uttam Nagar, 110059, New Delhi";
        String words[]= address.split(",");

        for (String word: words){
            word= word.trim();
            if (word.length()==6 && checkValidPincode(word)){
                System.out.println("This is the valid pincode::"+word);
            }
        }
    }
    static boolean checkValidPincode(String str){
        for (char c: str.toCharArray()){
            if (!Character.isDigit(c)){
                return  false;
            }
        }
        return true;
    }
}
