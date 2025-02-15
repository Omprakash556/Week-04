package regex.basicregexproblem;

public class ValidLicenseNumberPlate {
    public static String  validLicenseNumberPlate(String platenumber){
        if(platenumber.matches("[A-Z]{2}[0-9]{4}")){
            return "valid";
        }

        return "invalid";
    }
    public static void main(String[] args) {
        System.out.println(validLicenseNumberPlate("AB1234"));
        System.out.println(validLicenseNumberPlate("A12345"));
    }
}
