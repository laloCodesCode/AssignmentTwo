package CSC340.AssignmentTwo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class WeatherAPI_Controller {

    //City name
    Map<String, weatherData> cityNamesBase = new HashMap<>();


    //Hello, world! for making sure the API works.
    @GetMapping("/Hello")
    public String helloWorld(){
        return "Hello,World!";
    }

    @GetMapping("/Greensboro")
    public Object getCityName(){
        return "Greeensboro,NC";
    }


}
