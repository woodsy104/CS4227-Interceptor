import java.util.*;

import javax.naming.Context;

public class WeatherStation{
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ContextObject obj = new ContextObject(weatherData);
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.registerInterceptor(new LoggingInterceptor("21/4/2024"));
        dispatcher.registerInterceptor(new EmailInterceptor("ULstudent@UL.com"));
        
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(45, 30, 21.2f);
        dispatcher.dispatch(obj);
        
        weatherData.setMeasurements(20, 7, 10.4f);
        dispatcher.dispatch(obj);
        }
    }
    
