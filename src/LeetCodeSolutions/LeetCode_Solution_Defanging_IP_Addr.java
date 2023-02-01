package LeetCodeSolutions;

public class LeetCode_Solution_Defanging_IP_Addr {
   public String defangingIpAddress(String address){
       return address.replace(".","[.]");
   }

    public static void main(String[] args) {
      LeetCode_Solution_Defanging_IP_Addr addr= new LeetCode_Solution_Defanging_IP_Addr();
        System.out.println(addr.defangingIpAddress("11.223.2332.33"));
    }
}
