public class ContextObject{
    WeatherData weatherdata;

    public ContextObject(WeatherData weatherdata){
        this.weatherdata = weatherdata;
    }

    public String getUpdate(){
        String update = weatherdata.getTemperature() + " C " + weatherdata.getHumidity() + "% Humidity " + weatherdata.getPressure() + "% pressure";
        return update;
    }
}