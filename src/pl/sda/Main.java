package pl.sda;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Pattern - na później, roznica miedzy matches, a find
        //String.replaceAll
        //String.split
        //String.matches
        //Pamiętać o escape characters!
        // dlaczego dwa \\

        String phoneNumber = "12   3-123-1  2  3";
        String phoneNumberAfterOperation = phoneNumber.replaceAll("\\D", "");
        //System.out.println(phoneNumberAfterOperation);
        //123123123

        String splitSimpleString = "1$2,33@!,%4a6";
        String numbersArray[] = splitSimpleString.split("\\D+");
        //System.out.println(Arrays.toString(numbersArray));

        String mail = "jakubplonka@@@gmail.com";
        String wrongMail = "123123!@##!@#";

        boolean isMail = mail.matches("[a-z]+@{1,4}[a-z]+\\.[a-z]+");
        //System.out.println(isMail);

        String testString = "Tomek";
        boolean doesTestStringMatch = testString.matches("[^kK]{1}");
        //System.out.println(doesTestStringMatch);


        //1. Chcę zamienić wszystkie źle napisane wystąpienia słowa Jaaavaaaa na Java
        String javaReplace = "Hej, Javaaaa jest wspaniałaaaa. Naprawdę PoWiNieneś się Nauczyć Jaaaaaavaaaaa";
        //System.out.println(javaReplace.replaceAll("Ja+va+", "Java"));
        //"Hej, Java jest wspaniałaaaa. Naprawdę PoWiNieneś się Nauczyć Java"

        //2. Ktoś niechlujnie odseparował kolumny różnymi znakami specjalnymi i nie mogę ich odczytać w excelu, ani zsumowac
        String csvReplaceAndSum = "1;323:3}{18+23";
        String csvNumbersArray[] = csvReplaceAndSum.split("\\D+");
        int sum = 0;
        //System.out.println(Arrays.toString(csvNumbersArray));
        for(int i = 0; i < csvNumbersArray.length; i ++) {
            String csvNumberString = csvNumbersArray[i];
            int csvNumber = Integer.parseInt(csvNumberString);
            sum = sum + csvNumber;
            //sum += csvNumber
        }
        //System.out.println(sum);
        // inny sposob na zrobienie tego samego:
        int sumForEach = 0;
        for(String csvNumberString : csvNumbersArray) {
            int csvNumber = Integer.parseInt(csvNumberString);
            sumForEach = sumForEach + csvNumber;
        }
        //System.out.println(sumForEach);
        //3. Chciałbym sprawdzić czy została wprowadzony poprawny adres według wzoru ul. NazwaUlicy numerDomu/opcjonalnieNumerMieszkania
        String streetTest1 = "ul. Grabowa 1";
        String streetTest2 = "ul$ Kwiatowa 5";
        String streetTest3 = "ul. Opolska 54/22b";
        String streetTest4 = "ul. Opolska 54/11bbbbb";
        String streetTest5 = "ul. OPOLSKA 54/22c";
        String streetTest6 = "ul. opolska 54/22c";


        String regex = "ul\\. [A-Z][a-z]* \\d+(/\\d+[a-z]?)?";

        boolean street1Matches = streetTest1.matches(regex);
        boolean street2Matches = streetTest2.matches(regex);
        boolean street3Matches = streetTest3.matches(regex);
        boolean street4Matches = streetTest4.matches(regex);
        boolean street5Matches = streetTest5.matches(regex);
        boolean street6Matches = streetTest6.matches(regex);
        System.out.println(streetTest1 + " - " + street1Matches);
        System.out.println(streetTest2 + " - " + street2Matches);
        System.out.println(streetTest3 + " - " + street3Matches);
        System.out.println(streetTest4 + " - " + street4Matches);
        System.out.println(streetTest5 + " - " + street5Matches);
        System.out.println(streetTest6 + " - " + street6Matches);

        //a jak zrobic aby przepuscilo Opolska ale odrzucilo OPOLSKA?
        //żeby jeszcze odrzuciło opolska z małej litery?
        //jak poprawic (skleic tego regexa)


    }
}
