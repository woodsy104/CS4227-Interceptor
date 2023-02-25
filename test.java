import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test {

    @Test
    public void weatherTest(){
        WeatherData weatherdata = new WeatherData();
        weatherdata.setMeasurements(21, 7, 31.4f);

        //float temp = weatherdata.getTemperature();
        assertEquals(21, weatherdata.getTemperature(), 0);
        assertEquals(7, weatherdata.getHumidity(), 0);
        assertEquals(31.4, weatherdata.getPressure(), 0.1);
    }
    
}
