
package password;

public class Main {
    
    public static void main(String[] args) {
        
        Password mia = new Password(15);
        System.out.println(mia.toString());
        mia.cambiarPassword("JSHHSO48442");
        System.out.println(mia.toString());
        System.out.println(mia.esFuerte());
    }
}
