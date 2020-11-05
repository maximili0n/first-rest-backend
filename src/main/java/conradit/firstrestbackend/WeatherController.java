package conradit.firstrestbackend;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private static final String template = "Weather in %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/weather")
    public Weather weather(@RequestParam(value = "location", defaultValue = "Hamburg") String location) {
        return new Weather(counter.incrementAndGet(), String.format(template, location));

    }

}