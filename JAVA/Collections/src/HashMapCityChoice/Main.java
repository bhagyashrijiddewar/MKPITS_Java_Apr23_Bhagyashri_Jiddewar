package HashMapCityChoice;

import LinkListChoiceStudentData.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        City city=null;
        CityService cityService=new CityService();
        int choice;
        while (true){
            System.out.println("1. Add city"+"\n"+"2. Display All"+"\n"+"3. Find Value"+"\n"+"4. Update data"+"\n"+
                    "5. Delete record"+"\n"+"6. Delete All"+"\n"+"7. Exit");
            System.out.println("Choose any one of the option : ");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter City code and City name : ");
                    int code=scanner.nextInt();
                    city = new City(scanner.next());
                    cityService.addCity(code,city);
                    break;
                case 2:
                    if(city!=null) {
                        System.out.println("Display records :");
                        System.out.println("city code and city name :"+cityService.displayCity());
                        break;
                    }
                case 3:
                    System.out.println("Enter the key to search the value of particular key :");
                    cityService.searchValue(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Enter the key to search the value of particular key :");
                    cityService.updateData(scanner.nextInt(),city);
                    break;
                case 5:
                    System.out.println("Enter the key to delete record :");
                    cityService.deleteSingleData(scanner.nextInt());
                    break;
                case 6:
                    System.out.println("Enter the key to delete record :");
                    cityService.deleteAll();
                    break;
                default:
                    System.out.println("Invalid data.Please enter correct input.");
            }
        }
    }
}
