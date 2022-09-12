public class MainString {

    private char[] charArray;
    private int strLength;

    public MainString() {
    }

    public MainString(String str) {
        this.charArray = str.toCharArray();
    }

    public MainString(char charArray) {
        this.charArray = new char[1];
        this.charArray[1] = charArray;
    }

    public int findStringLength() {
        int strLength = this.charArray.length;
        return strLength;
    }

    public void deleteChar() {     // Не понял задание, не понятно, что значит пустой второй варинат this.charArray = new char[this.strLength];
        for (int i = 0; i < this.strLength; i++) {
            this.charArray[i] = ' ';
        }
    }

    public boolean findChar(char ch) {
        for (int i = 0; i < this.strLength; i++) {
            if (charArray[i] == ch) {
                return true;
            }
        }
        return false;
    }
}
