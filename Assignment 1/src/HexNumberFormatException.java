public class HexNumberFormatException extends NumberFormatException {

    private char illegalCharacter;

    public HexNumberFormatException(char illegalCharacter) {
        this.illegalCharacter = illegalCharacter;
    }

    public char getIllegalCharacter() {
        return illegalCharacter;
    }
}
