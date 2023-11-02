package City;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
    private List<City> cityList = new ArrayList<City>();

    public List<City> getAllCity(){
        return cityList;
    }

    public List<City> findCityByPrams(CitySearchPrams citySearchPrams) {
        List<City> searchResults = new ArrayList<City>();

        for (City city : cityList) {
            if (city.getName().equalsIgnoreCase(citySearchPrams.getName())){
                searchResults.add(city);
            }
        }
        return searchResults;
    }
    public City createCity(City city){
        cityList.add(city);

        return city;
    }
}
