package DataTypes ;
public class Assignment6 {
    public static void main(String[] args) {
        char character = 'd';
        int asciiValue = (int) character;
        int newAsciiValue = asciiValue + 3;
        char newCharacter = (char) newAsciiValue;
        System.out.println("Original character: " + character);
        System.out.println("New character: " + newCharacter);
    }
}
