package regex.basicregexproblem;

public class HexColorCode {
    public static String validHexColor(String hexColor ){
       if(hexColor.matches("[#][0-9A-Fa-f]{6}")){
           return "Valid";
       }
        return "Invalid";
    }
    public static void main(String[] args) {
        System.out.println(validHexColor("#FFA500"));
        System.out.println(validHexColor("#ff4500"));
        System.out.println(validHexColor("98"));
    }
}
