package FunctionalInterface.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionClass {
    public static void main(String[] args){
        List cityList= Arrays.asList("Nagpur","Pune","Amravati","Sambhaji Nagar");
        Function<String,Integer> function=(number)->{
            return number.length();
        };
        cityList.stream().map(function).forEach(city-> System.out.println(city));
        System.out.println("-----------------------------------");
//        ---------------------------------------------------------------------------

            List<String> cities = new ArrayList<>();
            cities.add("Delhi");
            cities.add("Mumbai");
            cities.add("Goa");
            cities.add("Pune");

            Function<String, Character> getFirstCharFunction = city -> {
                return city.charAt(0);
            };
            cities.stream().map(getFirstCharFunction)
                    .forEach(System.out::println);
        }
    }

