package PRAKTIKA12;

public class Main {
    public static void writeWithColor(FontColors fc, String str)
    {
        System.out.println(fc.getColor() + str + FontColors.ANSI_RESET.getColor());
    }
    public static void main(String[] args) {
        writeWithColor(FontColors.ANSI_BLUE, "ГОЛУБОЙ");
    }
}
