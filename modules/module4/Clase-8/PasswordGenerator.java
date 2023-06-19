public class PasswordGenerator {
    public static void main(String[] args) {
        String myPassword = getPassword();
        System.out.println(myPassword);
    }

    public static String getPassword() {
        StringBuilder str = new StringBuilder();
        String[] capitalLetters = {"ZWX", "WRV", "WXY", "QML", "PEK", "TEC", "SWD", "PKD", "VNQ", "TAK"};
        String[] letters = {"awokd", "eowmx", "xyz", "anhd", "efgh", "ijkl", "mnop", "qrst", "ksmcr", "xerfs"};
        String[] numbers = {"739", "249", "135", "536", "789", "321", "654", "987", "301", "027"};
        String[] characters = {"$%#", "@&!", "*^%", "#$@", "!@#", "%^*", "@#$", "&*%", "^#-", "&!$"};

        int numberRandom = (int) (Math.random() * 9) + 1;
        str.append(capitalLetters[numberRandom]);
        str.append(letters[numberRandom]);
        str.append(numbers[numberRandom]);
        str.append(characters[numberRandom]);

        return str.toString();
    }
}
