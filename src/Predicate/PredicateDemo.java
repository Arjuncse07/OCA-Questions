package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {



    public static void main(String[] args) {




        List<User> userList = new ArrayList<>();
        userList.add(new User("Arjun",120,25,"DAD","2500","Civillian","DAD"));
        userList.add(new User("Ravi",120,25,"DAD","2500","Civillian","NAVY"));
        userList.add(new User("Sachin",120,25,"DAD","2500","Civillian","AIRFORCE"));
        userList.add(new User("Sumtit",120,25,"DAD","2500","ArmedForces","ARMY"));
        userList.add(new User("Sachu",120,25,"DAD","2500","ArmedForces","ARMY"));
        userList.add(new User("Sahu",120,25,"DAD","2500","ArmedForces","ARMY"));
        userList.add(new User("Sumit Chanda",120,25,"DAD","2500","ArmedForces","ARMY"));
        userList.add(new User("Lodha",120,25,"DAD","2500","ArmedForces","ARMY"));
        userList.add(new User("Raviendra Ashmin",120,25,"DAD","2500","ArmedForces","ARMY"));
        userList.add(new User("Alok",120,25,"DAD","2500","ArmedForces","ARMY"));
        userList.add(new User("Xiaciver",120,25,"DAD","2500","ArmedForces","ARMY"));

        //defining a predicate for filtring the users
       /* Predicate<User> unitServicePredicate = user ->
                user.getUnitService().equals("ArmedForces");

       List<User> filteredUserList =  userList.stream()
                .filter(unitServicePredicate)
                .collect(Collectors.toList());*/

       // Predicate for the pay band
       Predicate<User> payBandPredicate = data ->
               data.getPayBand().equals(UserModel.userModelDetails().getPayBand());


       Predicate<User> userServicePredicate = data ->
               data.getUserService().equals(UserModel.userModelDetails().getUserService());


        Predicate<User>  uniServicePredicate  = data ->
                data.getUnitService().equals(UserModel.userModelDetails().getUnitService());

        //combine the predicate based on the user inputs might not be null
        Predicate<User> finalPredicate = payBandPredicate.and(userServicePredicate).and(uniServicePredicate);

                    List<User> userInputFilterList  = userList.stream()
                        .filter(finalPredicate)
                                .collect(Collectors.toList());

                    userInputFilterList.forEach( e ->
                            System.out.println(e.getName() + "::::" +e.getUnitService() + ":::" +
                                    e.getPayBand()));



       // filteredUserList.forEach(e -> System.out.println(e.getName()+ "::::" +e.getUnitService()));



    }






}
