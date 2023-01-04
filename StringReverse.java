package test;

public class StringReverse {
    public static String StringReverseMethod(String input) {
        char[] characters = input.toCharArray();
        String output = "";
        for (int i = characters.length - 1; i >= 0; i--) {
            output = output + characters[i];
        }
        return output;
    }

    public static void main(String[] args) {
        String input = "test";
        ///////////String reverse without string builder
        System.out.println("String reverse without string builder");
        System.out.println(StringReverseMethod(input));
        ///////////String reverse with string builder
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("String reverse with string builder");
        System.out.println(stringBuilder.append("test").reverse());
    }
}
