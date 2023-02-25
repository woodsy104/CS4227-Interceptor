public class EmailInterceptor implements Interceptor{
    private String emailAddress;

    public EmailInterceptor(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public void intercept(ContextObject obj){
        String emailText = obj.getUpdate();

        String emailAddress = this.emailAddress;

        EmailSender.sendEmail(emailAddress, emailText);
    }
}