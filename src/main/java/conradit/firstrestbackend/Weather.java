package conradit.firstrestbackend;

import java.util.Date;

public class Weather {
    
    private final long id;
//     private final String sun; 
//     private final int temperature;
//    private final int wind;
// private final Date date;
    private final String location;

// , String sun, int temperature, int wind, Date date    

    public Weather(long id, String location) {
        this.id = id;
//        this.sun = sun;
//        this.temperature = temperature;
//        this.wind = wind;
//        this.date = date;
        this.location = location;
    }

    public long getId() {
        return id;
    }
    
    public String getLocation(){
        return location;
    }
}