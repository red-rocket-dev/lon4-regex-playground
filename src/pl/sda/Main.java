package pl.sda;

public class Main {

    public static void main(String[] args) {
        //Pattern - na później, roznica miedzy matches, a find
        //String.replaceAll
        //String.split
        //String.matches
        //Pamiętać o escape characters!

        //1. Chcę zamienić wszystkie źle napisane wystąpienia słowa Jaaavaaaa na Java
        String javaReplace = "Hej, Javaaaa jest wspaniałaaaa. Naprawdę PoWiNieneś się Nauczyć Jaaaaaavaaaaa";
        //2. Ktoś niechlujnie odseparował kolumny różnymi znakami specjalnymi i nie mogę ich odczytać w excelu, ani zsumowac
        String csvReplaceAndSum = "1;323:3}{18+23";
        //3. Chciałbym sprawdzić czy została wprowadzony poprawny adres według wzoru ul. NazwaUlicy numerDomu/opcjonalnieNumerMieszkania
        String streetTest1 = "ul. Grabowa 1";
        String streetTest2 = "ul$ Kwiatowa 5";
        String streetTest3 = "ul. Opolska 5/12";

    }
}
