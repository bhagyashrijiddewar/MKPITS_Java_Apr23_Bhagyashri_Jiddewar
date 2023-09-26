package HashMapCityChoice;
import java.util.Scanner;

public class City {
    private String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    @Override
    public String toString() {
        return cityName;
    }

}

