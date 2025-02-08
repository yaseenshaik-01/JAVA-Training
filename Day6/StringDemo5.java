public class StringDemo5 {

    public static void main(String[] args){
        String str = "Hello World";
        int count = countCharacters(str);
        System.out.println("Character count: " + count);
    }

    public static int countCharacters(String str) {
        return str.length();
    }
}