package pl.sda;

import java.util.Arrays;

public class Exercise {
    private static final String testString1 = "Oceny Katarzyny to: 5,5,5,5,2,3,6";
    private static final String[] fileNames = {"grafika.jpg", "koty.png", "MyCode.java", "smieszne-link.txt",
            "wydatki.csv", "MainMain.java", "test-10-10-2010.log", "logowanie-13-05-2010.log", "Student.java",
            "formatowanie.exe", "smieszne-linki-kot.png", "App-20-01-2020.log"};

    // Pomoc:
    // Do zamiany String na int uzyj metody Integer.parseInt(), np Integer.parseInt("1") zwroci 1

    public static void main(String[] args) {
        //to uruchamiamy, żeby sprawdzić poprawne wykonanie zadania, nic nie modyfikujemy w tym mainie:)
        int minGrade = gradeExerciseMin();
        System.out.println("Min grade: " + minGrade);
        if (minGrade == 2) {
            System.out.println("Zadanie 2 zrobione");
        }
        int maxGrade = gradeExerciseMax();
        System.out.println("Max grade: " + maxGrade);
        if (maxGrade == 6) {
            System.out.println("Zadanie 1 zrobione");
        }
        String[] javaFiles = findJavaFiles();
        String[] expectedJavaFiles = {"MainMain.java", "MyCode.java"};
        System.out.println("Java files:");
        System.out.println(Arrays.toString(javaFiles));
        if (Arrays.equals(expectedJavaFiles, javaFiles)) {
            System.out.println("Zadanie 3 zrobione");
        }
        String[] expectedCatFiles = {"koty.png", "smieszne-linki-kot.png"};
        String[] catFiles = findCatFiles();
        System.out.println("Cat files:");
        System.out.println(Arrays.toString(catFiles));
        if (Arrays.equals(catFiles, expectedCatFiles)) {
            System.out.println("Zadanie 5 zrobione");
        }
        int patternFiles = findPatternFiles();
        System.out.println("Pattern files: " + patternFiles);
        if (patternFiles == 3) {
            System.out.println("Zadanie 5 zrobione");
        }

    }

    //1. Znajdź najwyższą ocenę Joli
    public static int gradeExerciseMax() {
        //"Oceny Katarzyny to: 5,5,5,5,2,3,6"
        // mozna bylo tez zrobic substring, tak zeby miec tylko oceny
        String wordsInGradesSentence[] = testString1.split(" ");
        System.out.println("Grades: " + wordsInGradesSentence[3]);
        String grades = wordsInGradesSentence[3]; //5,5,5,5,2,3,6
        String[] gradesArray = grades.split(","); ////["5","5","5","5","2","3","6"]
        System.out.println("Grades Array: " + Arrays.toString(gradesArray));

        int maxGrade = 1;
        for (String grade : gradesArray) {
            int gradeNumber = Integer.parseInt(grade);
            maxGrade = Math.max(maxGrade, gradeNumber);
            // Math.max(1,2); => 2
            // Math.max(100,2); => 100
        }
        //1. Najpierw wyekstraktuj z Stringa testString1 same liczby i przerzuc je do tablicy intow (osobnej)
        //2. Nastepnie znajdz najwyzsza ocene
        //Podpowiedz: uzyj metody split
        return maxGrade;//ta linijka jest tylko po to, żeby nie podkreslało
    }

    //2. Znajdź najniższą ocenę Joli
    public static int gradeExerciseMin() {
        //1. Najpierw wyekstraktuj z Stringa testString1 same liczby i przerzuc je do tablicy intow (osobnej)
        //2. Nastepnie znajdz najnizsza ocene
        //Podpowiedz: uzyj metody split
        return 0;//ta linijka jest tylko po to, żeby nie podkreslało
    }

    //3. Zwróć nazwy plików z rozszerzeniem .java, które zawieraja w sobie literę "M"
    public static String[] findJavaFiles() {
        //1. Utwórz nową tablicę javaFiles, która będzie mogła pomieścić maksymalnie tyle elementów ile ma tablica fileNames
        //2. Sprawdzaj element po elemencie za pomocą pętli czy zadane wyrazenie regularne (lancuch konczy sie na .java i ma w srodku literę "M")
        //3. Zwróć tablicę
        return new String[0];//ta linijka jest tylko po to, żeby nie podkreslało
    }

    //4. Zwróć nazwy plików z rozszerzeniem .png, które zawierają słowo "kot"
    public static String[] findCatFiles() {
        String[] catFiles = new String[fileNames.length];
        int index = 0;
        for(String fileName : fileNames) {
            String catRegex = ".*kot.*\\.png";
            boolean catMatches = fileName.matches(catRegex);
            if(catMatches) {
                catFiles[index] = fileName;
                index ++;
            }
        }

        /*// Tak nie, bo mamy luki w tablicy
        catFiles = new String[fileNames.length];
        for (int i = 0; i < fileNames.length; i ++) {
            String fileName = fileNames[i];
            String catRegex = ".*kot.*\\.png";
            boolean catMatches = fileName.matches(catRegex);
            if(catMatches) {
                catFiles[i] = fileName;
            }
        }*/
        System.out.println(Arrays.toString(catFiles));
        //1. Utwórz nową tablicę javaFiles, która będzie mogła pomieścić maksymalnie tyle elementów ile ma tablica fileNames
        //2. Sprawdzaj element po elemencie za pomocą pętli czy zadane wyrazenie regularne (lancuch konczy sie na .png i ma w srodku słowo "kot")
        //3. Zwróć tablicę
        return catFiles;//ta linijka jest tylko po to, żeby nie podkreslało
    }

    //5. Zlicz nazwy plikow, ktorych nazwa spelnia szablon <jakiestamlitery>-<dzień>-<miesiąc>-<rok>.<dowolnerozszerzenie>
    public static int findPatternFiles() {
        int counter = 0;
        for (String filename : fileNames) {
            boolean isFilenameRegexMatched = filename.matches("[a-zA-Z]+-[0123]\\d-[01]\\d-\\d{4}\\.[a-zA-Z]+");
            if (isFilenameRegexMatched) {
                counter++;
            }
        }
        return counter;
    }
}
