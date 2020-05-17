package pl.sda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainGroups {

    public static void main(String[] args) {
        //TODO: Patterns


        //1. Chcę rozbić czynniki pierwsze - część przed małpą, część po małpie i kraj (po ostatniej kropce)
        String emailAddress1 = "test@gmail.com";
        String emailAddress2 = "jan@interia.pl";
        String emailAddress3 = "jakubplonka@wp.pl";
        String aLotOfMails = new StringBuilder(emailAddress1)
                .append("\n")
                .append(emailAddress2)
                .append("\n")
                .append(emailAddress3)
                .toString();
        String mailRegex = "([A-Za-z]+)@[A-Za-z]+\\.([A-Za-z]+)";
        //System.out.println(emailAddress1.replaceAll("([A-Za-z]+)@[A-Za-z]+\\.([A-Za-z]+)", "$1@onet.$2"));

        //System.out.println(aLotOfMails);
        Pattern mailPattern = Pattern.compile(mailRegex);
        Matcher mailMatcher = mailPattern.matcher(aLotOfMails);
        while (mailMatcher.find()) {
            //System.out.println("Znalazlem!");
            //System.out.println(mailMatcher.group(1));
            //System.out.println(mailMatcher.group(2));
        }


        //System.out.println(emailAddress1.matches(mailRegex));
        //System.out.println(emailAddress3.replaceAll("([A-Za-z]+)@[A-Za-z]+(\\.[A-Za-z]+)", "$1@onet?$2"));
        //emailAddress1.replaceAll(mailRegex,"");

//System.out.println(emailAddress1.replaceAll("[A-Za-z]+@[A-Za-z]+\\.[A-Za-z]+","$1@onet.$2"));
        //2. Chcę sformatować numer telefonu do postaci 123-123-123
        String phoneNumber = "9 2 3-4 1 2 3 2 2";
        //1-2 3 1-2 3 1 2 3
        //System.out.println(phoneNumber.matches("\\d[ -]?\\d[ -]?\\d[ -]?\\d[ -]?\\d[ -]?\\d[ -]?\\d[ -]?\\d[ -]?\\d[ -]?"));

        //2. Chcę sformatować numer telefonu do postaci 123-123-123
        System.out.println(phoneNumber.replaceAll("[ -]", " "));
        String phoneNumber1 = phoneNumber.replaceAll("(\\d \\d \\d ) ", "$1-");
        System.out.println(phoneNumber1);
        System.out.println(phoneNumber1.replaceAll(" ", ""));


        //3. Ze zdania chcę wyciągnąć drugie słowo, ale może składać się tylko z liter
        String someSentence1 = "To jest jakies zdanie";
        String someSentence2 = "Test Kowalski";
        String someSentence3 = "Jan 123";
        //System.out.println(someSentence1.replaceAll("\\w+ (\\w+).*", "$1"));
        //System.out.println(someSentence1.replaceAll("To jest", "jest"));
    }
}
