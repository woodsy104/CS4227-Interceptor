import java.util.*;

public class WeatherStation{
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        //Interceptor logger = new LoggingInterceptor();
        //weatherData.registerInterceptor(logger);
        ContextObj contextObj = new ContextObj("Weather has been logged");
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(contextObj, 85, 35, 30.4f);
        weatherData.setMeasurements(contextObj, 82, 40, 29.2f);
        weatherData.setMeasurements(contextObj, 78, 70, 29.2f);
        }
    }
    
