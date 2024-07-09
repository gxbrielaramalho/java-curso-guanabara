package ComparandoStrings;

public class ComparandoStrings {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "apple";
        String str3 = "Banana";

        // Comparação usando equals()
        boolean isEqual = str1.equals(str2);
        System.out.println("\"" + str1 + "\" equals \"" + str2 + "\" : " + isEqual);

        // Comparação usando equalsIgnoreCase()
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("\"" + str1 + "\" equalsIgnoreCase \"" + str2 + "\" : " + isEqualIgnoreCase);

        // Comparação usando compareTo()
        int compareResult = str1.compareTo(str2);
        System.out.println("\"" + str1 + "\" compareTo \"" + str2 + "\" : " + compareResult);

        // Comparação usando compareToIgnoreCase()
        int compareIgnoreCaseResult = str1.compareToIgnoreCase(str2);
        System.out.println("\"" + str1 + "\" compareToIgnoreCase \"" + str2 + "\" : " + compareIgnoreCaseResult);

        // Comparação de igualdade com ==
        boolean isSameReference = (str1 == str2);
        System.out.println("\"" + str1 + "\" == \"" + str2 + "\" : " + isSameReference);

        // Outro exemplo de comparação usando compareTo()
        compareResult = str1.compareTo(str3);
        System.out.println("\"" + str1 + "\" compareTo \"" + str3 + "\" : " + compareResult);
    }
}
