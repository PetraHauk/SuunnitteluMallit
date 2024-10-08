package Chain_of_Responsibility.Handlers;

import Chain_of_Responsibility.Handler;
import Chain_of_Responsibility.Messege;
import Chain_of_Responsibility.MessegeType;

import java.util.Random;

public class CompensationClaim extends Handler {

    @Override
    protected boolean processMessage(Messege message) {
        if (message.getMessegeType() == MessegeType.COMPENSATION_CLAIM) {
            Random random = new Random();
            int lot = random.nextInt(2);
            if (lot == 0) {
                System.out.println("Your claim is rejected.");
            } else {
                System.out.println("Your claim is accepted.");
            }
            return true;
        }
        return false;
    }
}
