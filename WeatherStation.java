import java.util.*;

public class WeatherStation{
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerInterceptor(new LoggingInterceptor());
        weatherData.registerInterceptor(new EmailInterceptor("ULstudent@UL.com"));
        ContextObj contextObj = new ContextObj("Weather has been logged");
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(contextObj, 25, 40, 29.2f);
        }
    }
    
