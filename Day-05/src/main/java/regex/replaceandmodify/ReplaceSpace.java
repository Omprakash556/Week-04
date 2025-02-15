package regex.replaceandmodify;


public class ReplaceSpace {
    public static void replaceSpace(String sentence){
        String replaceSpace = sentence.replaceAll("\\s+", " ");
        System.out.println("Original sentence: "+sentence);
        System.out.println("Replace space: "+replaceSpace);

    }
    public static void main(String[] args) {
        String text = "This  is   an example   with   multiple    spaces.";
        replaceSpace(text);
    }
}
