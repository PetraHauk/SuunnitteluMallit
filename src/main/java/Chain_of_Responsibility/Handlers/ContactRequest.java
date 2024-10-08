package Chain_of_Responsibility.Handlers;

import Chain_of_Responsibility.Handler;
import Chain_of_Responsibility.Messege;
import Chain_of_Responsibility.MessegeType;

import java.time.LocalDate;
import java.util.Random;

public class ContactRequest extends Handler {
    @Override
    protected boolean processMessage(Messege message) {
        if (message.getMessegeType() == MessegeType.CONTACT_REQUEST) {
            Random random = new Random();
            // Let's set a fake data for the contact request
            LocalDate date = LocalDate.now();
            date = date.plusDays(random.nextInt(7) + 1);
            String person = "John Doe";
            System.out.println("Contact request accepted. " + person + " will contact you on " + date + ".");
            System.out.println("We will send you an email to " + message.getSenderEmail() + " with further the details.");
            return true;
        }
        return false;
    }
}
