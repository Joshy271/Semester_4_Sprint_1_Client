package City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@CrossOrigin
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/Cities")
    public List<City> getAllCity(){
        return cityService.getAllCity();
    }

    @GetMapping("/Cities_Search")
    public List<City> getCityByPrams(@RequestParam String cityName){
        CitySearchPrams citySearchPrams = new CitySearchPrams();

        citySearchPrams.setName(cityName);

        return cityService.findCityByPrams(citySearchPrams);
    }

    @PostMapping
    public ResponseEntity<City> createCity(@RequestBody City city) {
        City createdCity = cityService.createCity(city);
        return new ResponseEntity<>(createdCity, HttpStatus.CREATED);
    }

}
