public class EmailInterceptor implements Interceptor{
    private String emailAddress;

    public EmailInterceptor(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public void intercept(ContextObj contextObj, WeatherData weatherData, float temperature, float humidity, float pressure){
        String emailText = "Please find the current weather conditions here: " + temperature
        + "C degrees " + humidity + " % humidity " + pressure + " % pressure";

        String emailAddress = this.emailAddress;

        EmailSender.sendEmail(emailAddress, emailText);
    }
}