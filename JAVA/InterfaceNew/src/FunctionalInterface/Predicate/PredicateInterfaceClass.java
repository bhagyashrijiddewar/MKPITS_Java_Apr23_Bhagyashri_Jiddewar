package FunctionalInterface.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceClass {
    public static void main(String[] args) {

//        List list= Arrays.asList("Nagpur","Amaravati","Pune");


            List<String> cities = new ArrayList<>();
            cities.add("Delhi");
            cities.add("Mumbai");
            cities.add("Goa");
            cities.add("Pune");

            Predicate<String> filterCity = city -> city.equals("Mumbai");
            cities.stream().filter(filterCity).forEach(city-> System.out.println(city));
        }
    }

