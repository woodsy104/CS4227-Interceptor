import java.util.*;

public class WeatherData implements SetMeasurements, GetMeasurements, Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();

    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
        observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();

    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    // public void registerInterceptor(Interceptor x){
    //     interceptors.add(x);
    // }

    // public void removeInterceptor(Interceptor x){
    //     int i = interceptors.indexOf(x);
    //     if (i >= 0) {
    //     interceptors.remove(i);
    //     }
    // }

    // public void notifyInterceptors(){
    //     for(Interceptor interceptor : interceptors){
    //         interceptor.intercept(this, temperature, humidity, pressure);
    //     }
    // }
   
}

