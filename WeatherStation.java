import java.util.*;

public class WeatherStation{
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerInterceptor(new LoggingInterceptor());
        ContextObj contextObj = new ContextObj("Weather has been logged");
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(contextObj, weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(contextObj, weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(contextObj, weatherData);
        weatherData.setMeasurements(contextObj, 85, 35, 30.4f);
        weatherData.setMeasurements(contextObj, 82, 40, 29.2f);
        weatherData.setMeasurements(contextObj, 78, 70, 29.2f);
        }
    }
    
