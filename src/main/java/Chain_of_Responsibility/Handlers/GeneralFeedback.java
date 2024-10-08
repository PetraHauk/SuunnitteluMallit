package Chain_of_Responsibility.Handlers;

import Chain_of_Responsibility.Handler;
import Chain_of_Responsibility.Messege;
import Chain_of_Responsibility.MessegeType;

public class GeneralFeedback extends Handler {

    @Override
    protected boolean processMessage(Messege message) {
        if (message.getMessegeType() == MessegeType.GENERAL_FEEDBACK) {
            System.out.println("Thank you for your feedback. Your feedback is sent to the appropriate parties.");
            return true;
        }
        return false;
    }
}
