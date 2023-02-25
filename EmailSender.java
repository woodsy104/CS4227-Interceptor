public class EmailSender {
    public static void sendEmail(String emailAddress, String emailText){
        System.out.println("Weather update sent to: " + emailAddress);
        System.out.println("Text body included: " + " Please find the current weather conditions attached" + emailText);
    }
}
//Print statements to emulate the actions of an email service