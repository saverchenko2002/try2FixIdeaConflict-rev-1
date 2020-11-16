public class someText {
    public someText() { }
    public String toString() { return "c="; }
    public static void main(String[] args)
    {
        someText a = new someText();
        System.out.println(a.toString());
    }
}