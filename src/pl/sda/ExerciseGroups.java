package pl.sda;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExerciseGroups {
    private final static String METEO_STRING = "Poniedzialek;15C wiatr wschod mocny\n" +
            "Wtorek}16C wiatr zachod mocny\n" +
            "Sroda[15C wiatr brak brak\n" +
            "Czwartek!9C wiatr polnoc sredni\n";

    private final static String[] TAXI_STRINGS = {"Poprosze taksowke na Dworzec",
            "Taksowka pod Galerie szybko",
            "Gdzie ta taksowka?Miala byc 30 minut temu na Sokolskiej",
            "Platnosc karta za 3 minuty w Supersamie dziekuje"};


    private final static String SOME_CODE = "private int i = 0;\n" +
            "public String abc = \"aaa\";\n" +
            "protected float mojaMetoda() {\n" +
            "\n" +
            "}\n" +
            "public double jakasZmienna = 2.3d;";


    public static void main(String[] args) {
        double averageTemperature = averageTemperature();
        System.out.println("AVG temp: " + averageTemperature);
        if (averageTemperature == 13.75) {
            System.out.println("Zadanie 1 zrobione");
        }

        String[] meteoHistory = meteoHistory();
        String[] expectedMeteoHistory = {"W Poniedziałek wiało mocny z wschod",
                "W Wtorek wiało mocny z zachod",
                "W Sroda wiało brak z brak",
                "W Czwartek wiało sredni z polnoc"};
        System.out.println("Meteo history: ");
        System.out.println(Arrays.toString(meteoHistory));
        if (Arrays.equals(expectedMeteoHistory, meteoHistory)) {
            System.out.println("Zadanie 2 zrobione");
        }

        String someCodePrivateScopes = someCodePrivateScopes();
        System.out.println("Private scopes");
        System.out.println(someCodePrivateScopes);

        String expectedCodePrivateScopes = "private int i = 0;\n" +
                "private String abc = \"aaa\";\n" +
                "private float mojaMetoda() {\n" +
                "\n" +
                "}\n" +
                "private double jakasZmienna = 2.3d;";

        if (someCodePrivateScopes.equals(expectedCodePrivateScopes)) {
            System.out.println("Zadanie 3 zrobione");
        }
        String someCodeFieldTypes = someCodeFieldTypes();
        String expectedSomeCodeFieldTypes =
                "private int i = 0;\n" +
                        "public BigDecimal abc = \"aaa\";\n" +
                        "protected float mojaMetoda() {\n" +
                        "\n" +
                        "}\n" +
                        "public BigDecimal jakasZmienna = 2.3d;";
        System.out.println("Field types");
        System.out.println(someCodeFieldTypes);
        if (expectedSomeCodeFieldTypes.equals(someCodeFieldTypes)) {
            System.out.println("Zadanie 4 zrobione");
        }

        String[] taxiOrder = taxiOrder();
        String[] expectedTaxiOrder = {"Zamowienie na Dworzec", "Zamowienie na Galerie", "Zamowienie na Sokolskiej", "Zamowienie na Supersamie"};
        if (Arrays.equals(taxiOrder, expectedTaxiOrder)) {
            System.out.println("Zadanie 5 zrobione");
        }
    }

    /*
    private final static String METEO_STRING = "Poniedzialek;15C wiatr wschod mocny\n" +
            "Wtorek}16C wiatr zachod mocny\n" +
            "Sroda[15C wiatr brak brak\n" +
            "Czwartek!9C wiatr polnoc sredni\n";
     */
    //1. METEO_STRING przetwórz tak, aby wyliczyć średnią temperaturę
    public static double averageTemperature() {
        System.out.println(METEO_STRING);
        Pattern temperaturePattern = Pattern.compile("(\\d+)C");
        Matcher temperatureMatcher = temperaturePattern.matcher(METEO_STRING);

        float sum = 0;
        int findCounter = 0;
        while (temperatureMatcher.find()) {
            String temperatureText = temperatureMatcher.group(1);
            int temperature = Integer.parseInt(temperatureText);
            sum = sum + temperature;
            findCounter++;
        }
        float average = sum / findCounter;
        System.out.println(average);


        return average;//ta linijka jest tylko po to, żeby nie podkreslało
    }

    //2. TAXI_STRING przetwórz tak, aby wyświetlić dla każdego rekordu "W <dzień tygodnia> wiało <siła wiatru> z <kierunek>"
    public static String[] meteoHistory() {
        return new String[0];
    }

    //3. W SOME_CODE zamień wszystkie zasięgi (metod i pol) na prywatny
    public static String someCodePrivateScopes() {
        return "";//ta linijka jest tylko po to, żeby nie podkreslało
    }

    //4. W SOME_CODE Zamień typy wszystkich *pól* na BigDecimal
    public static String someCodeFieldTypes() {
        return "";//ta linijka jest tylko po to, żeby nie podkreslało
    }


    /*
    private final static String[] TAXI_STRINGS = {"Poprosze taksowke na Dworzec" -> Zamowienie na Dworzec
            "Taksowka pod Galerie szybko", -> Zamowienie na Galerie
            "Gdzie ta taksowka?Miala byc 30 minut temu na Sokolskiej", -> Zamowienie na Sokolskiej
            "Platnosc karta za 3 minuty w Supersamie dziekuje"}; -> Zamowienie na Supersamie
     */
    //5. TAXI_STRINGS przetwórz tak, żeby wypisać dla każdego elementu listy wiadomość według szablonu: „Zamowienie na <gdzie klient zamawial taksowke>”
    public static String[] taxiOrder1() {
        // tworzymy tablice wynikowa Stringow, ktora bedzie przechowywala rezultat naszej operacji. Dlugosc rowna dlugosci TAXI_STRINGS
        // for each po wszystkich elementach TAXI STRINGS
        //     uzyc replaceAll na obecnie iterowanym elemencie, tak, zeby zamienic ciag znakow na Zamowienie na <miejsce>
        //     na pierwszy wolny indeks w tablicy wynikowej ustawiamy rezultat operacji replaceAll
        //     zeby miec pierwszy wolny indeks trzeba uzyc countera, zeby wiedziec ile pozycji juz zostalo zapelnionych
        //zwracamy tablice wynikowa
        //"Gdzie ta taksowka?Miala byc 30 minut temu na Sokolskiej"
        System.out.println(TAXI_STRINGS[2].replaceAll(".*([A-Z a-z]+ (na)?(pod)?w?) ([A-Za-z]+).*", "Zamowienie na $4"));


        return new String[0];//ta linijka jest tylko po to, żeby nie podkreslało
    }

    public static String[] taxiOrder() {
        String regex = ".*([A-Z a-z]+ (na)?(pod)?w?) ([A-Za-z]+).*";
        int counter = 0;
        String arrayFinal[] = new String[TAXI_STRINGS.length];
        for (String element : TAXI_STRINGS) {
            arrayFinal[counter] = element.replaceAll(regex, "Zamowienie na $4");
            counter++;
        }
        return arrayFinal;//ta linijka jest tylko po to, żeby nie podkreslało }
    }

    public static String[] taxiOrderAlicja() {
        String[] nowaTablice = new String[TAXI_STRINGS.length];
        String regex = ".*([A-Za-z]+ (na)?(pod)?w?) ([A-Za-z]+).*";
        int counter = 0;
        String wordForArray = "";
        for (String word : TAXI_STRINGS) {
            wordForArray = word.replaceAll(regex, "Zamowienie na $4");
            nowaTablice[counter] = wordForArray;
            counter++;
        }
        System.out.println(Arrays.toString(nowaTablice));
        return nowaTablice;
    }
}
