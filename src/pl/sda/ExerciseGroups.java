package pl.sda;

import java.util.Arrays;

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
        if (averageTemperature == 16.25) {
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
        if(Arrays.equals(taxiOrder, expectedTaxiOrder)) {
            System.out.println("Zadanie 5 zrobione");
        }
    }

    //1. simpleString przetwórz tak, aby wyliczyć średnią temperaturę
    public static double averageTemperature() {
        return 0;//ta linijka jest tylko po to, żeby nie podkreslało
    }

    //2. simpleString przetwórz tak, aby wyświetlić dla każdego rekordu "W <dzień tygodnia> wiało <siła wiatru> z <kierunek>"
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

    //5. TAXI_STRINGS przetwórz tak, żeby wypisać dla każdego elementu listy wiadomość według szablonu: „Zamowienie na <gdzie klient zamawial taksowke>”
    public static String[] taxiOrder() {
        return new String[0];//ta linijka jest tylko po to, żeby nie podkreslało
    }
}
