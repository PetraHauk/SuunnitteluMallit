package Facade;

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        String jokeUrl = "https://api.chucknorris.io/jokes/random";
        String jokeAttribute = "value";

        try {
            String jokeText = facade.getAttributeValueFromJson(jokeUrl, jokeAttribute);
            System.out.println(jokeText);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String catFactUrl = "https://catfact.ninja/fact";
        String catFact = "fact";

        try {
            String catFactText = facade.getAttributeValueFromJson(catFactUrl, catFact);
            System.out.println(catFactText);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Invalid URL
        String invalidUrl = "https://api.chucknorris.io/jokes/random/invalid";
        try {
            String jokeText = facade.getAttributeValueFromJson(invalidUrl, jokeAttribute);
            System.out.println(jokeText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Invalid attribute
        String invalidAttribute = "invalid";
        try {
            String jokeText = facade.getAttributeValueFromJson(jokeUrl, invalidAttribute);
            System.out.println(jokeText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
