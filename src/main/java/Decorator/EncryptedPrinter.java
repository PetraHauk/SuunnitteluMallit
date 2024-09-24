package Decorator;

public class EncryptedPrinter extends PrinterDecorator {

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        //Encrypt the text
        String encryptedText = encrypt(text);

        //Print the encrypted text
        printer.print(encryptedText);
    }

    private String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        int key = 10;
        for (char character : text.toCharArray()) {
            encryptedText.append((char) (character + key));
        }
        return encryptedText.toString();
    }
}
