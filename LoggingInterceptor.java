public class LoggingInterceptor implements Interceptor{
    public void intercept(ContextObj contextObj, WeatherData weatherData, float temp, float humidity, float pressure){
        System.out.println(contextObj);
    }
}