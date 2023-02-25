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

        weatherData.setMeasurements(45, 4, 21.2f);
        dispatcher.dispatch(obj);
        
        }
    }
    
