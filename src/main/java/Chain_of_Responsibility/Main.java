package Chain_of_Responsibility;

import Chain_of_Responsibility.Handlers.CompensationClaim;
import Chain_of_Responsibility.Handlers.ContactRequest;
import Chain_of_Responsibility.Handlers.DevelopmentRequest;
import Chain_of_Responsibility.Handlers.GeneralFeedback;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Handler compensationClaim = new CompensationClaim();
        Handler contactRequest = new ContactRequest();
        Handler developmentRequest = new DevelopmentRequest();
        Handler generalFeedback = new GeneralFeedback();

        compensationClaim.setNextHandler(contactRequest);
        contactRequest.setNextHandler(developmentRequest);
        developmentRequest.setNextHandler(generalFeedback);

        System.out.println("Enter the type of request." +
                "\n1. Compensation Claim" +
                "\n2. Contact Request" +
                "\n3. Development Request" +
                "\n4. General Request");
        String requestTypeNum = scanner.nextLine();

        MessegeType requestType = null;
        switch (requestTypeNum) {
            case "1":
                requestType = MessegeType.COMPENSATION_CLAIM;
                break;
            case "2":
                requestType = MessegeType.CONTACT_REQUEST;
                break;
            case "3":
                requestType = MessegeType.DEVELPOMENT_REQUEST;
                break;
            case "4":
                requestType = MessegeType.GENERAL_FEEDBACK;
                break;
            default:
                System.out.println("Invalid request type.");
        }

        System.out.println("Enter the message.");
        String messageContent = scanner.nextLine();

        System.out.println("Enter your email.");
        String email = scanner.nextLine();

        Messege messege = new Messege(requestType, messageContent, email);
        
        compensationClaim.handleMessage(messege);
    }

}
