public class BinaryNumberFormatException extends NumberFormatException {
    private char illegalCharacter;

    public BinaryNumberFormatException(char illegalCharacter) {
        this.illegalCharacter = illegalCharacter;
    }

    public char getIllegalCharacter() {
        return illegalCharacter;
    }
}
