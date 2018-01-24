/**
 * @author Bailey Garner
 * @version 1.0.0 Jan. 24, 2018
 */

/**
 * HexNumberFormatException adds functionality to NumberFormatException to get which illegal character caused the exception
 */

public class HexNumberFormatException extends NumberFormatException {

    private char illegalCharacter;

    /**
     * HexNumberFormatException constructs the content of the exception
     * @param illegalCharacter the illegal character that caused the exception
     */

    public HexNumberFormatException(char illegalCharacter) {
        this.illegalCharacter = illegalCharacter;
    }

    /**
     * getIllegalCharacter gets the content of the illegal character found in the exception
     * @return illegalCharacter that caused the thrown exception
     */

    public char getIllegalCharacter() {
        return illegalCharacter;
    }
}
