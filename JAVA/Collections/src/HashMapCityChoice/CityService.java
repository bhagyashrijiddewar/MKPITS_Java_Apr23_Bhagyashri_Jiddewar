package HashMapCityChoice;

import java.util.HashMap;
import java.util.Scanner;

public class CityService {
    HashMap <Integer,City> hashMap;
    Scanner scanner;

    public CityService() {
        hashMap =new HashMap<Integer,City>();
        scanner=new Scanner(System.in);
    }
    public void addCity(Integer code,City city){
        hashMap.put(code,city);
    }
    public Object displayCity(){
        return hashMap;
    }
    public void searchValue(Integer code){
        System.out.print(hashMap.get(code));
    }
    public void updateData(Integer code,City city){
        hashMap.get(code);
        System.out.println("Enter new city name :");
        city.setCityName(scanner.next());
        System.out.println(hashMap.replace(code,city));
        System.out.println(displayCity());
    }
    public void deleteSingleData(Integer code){

        System.out.println(" = "+hashMap.remove(code));
        System.out.println(displayCity());
    }
    public void deleteAll(){
        hashMap.clear();
        System.out.println(displayCity());
    }



    }

