package Chain_of_Responsibility.Handlers;

import Chain_of_Responsibility.Handler;
import Chain_of_Responsibility.Messege;
import Chain_of_Responsibility.MessegeType;
import Singelton.Logger;

import java.time.LocalDate;

public class DevelopmentRequest extends Handler {
    Logger logger = Logger.getInstance();

    @Override
    protected boolean processMessage(Messege message) {
        if (message.getMessegeType() == MessegeType.DEVELPOMENT_REQUEST) {
            System.out.println("Thank you for your request. Your request is logged and will be processed soon.");
            LocalDate date = LocalDate.now();
            try {
                logger.setFileNames("developmentRequestLog.txt");
                logger.write("Development request received on " + date);
                logger.write("Request: " + message.getMessege());
                logger.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }
}
