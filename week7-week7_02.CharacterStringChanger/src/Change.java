public class Change {
    private char fromChar;
    private char toChar;

    public Change(char fromCharacter, char toCharacter) {
        this.fromChar = fromCharacter;
        this.toChar = toCharacter;
    }

    public String change(String characterString) {
        return characterString.replace(this.fromChar, this.toChar);
    }
}
