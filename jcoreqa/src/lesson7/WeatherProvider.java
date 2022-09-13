package lesson7;

import lesson7.Periods;
import java.io.IOException;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException;
}
