public class LoggingInterceptor implements Interceptor{
    private String logDate;

    public LoggingInterceptor(String logDate){
        this.logDate = logDate;
    }

    public void intercept(ContextObject obj){
        String data = obj.getUpdate();
        String date = this.logDate;
        Logger.logData(date, data);
    }
}