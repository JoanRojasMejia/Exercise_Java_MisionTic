package password;
import java.util.Random;

public class Password {
    
    public Integer longitud = 8;
    private String password;
    private final String Ran = "!#$%&'()*+,-./0123456789:;=?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^_`abcdefghijklmnopqrstuvwxyz{|}~";
    private final Random alg = new Random();
    private final String num = "0123456789";
    private final String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String min = "abcdefghijklmnopqrstuvwxyz";
    
    public Password(Integer longitud){
        this.longitud = longitud;
        this.password = generatePassword(this.alg, this.Ran, longitud);
    }
    
    public void cambiarPassword(String password) {
        if(this.longitud == password.length()){
            this.password = password;
        }else{
            System.out.println("La longitud de la contraseña no es igual a la longitud ingresada");
        } 
    }
    
    public final String generatePassword(Random rng, String characters, Integer length) {
        char[] text = new char[length];
        for (int i = 0; i < length; i++){
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
    
    public boolean esFuerte(){
        Integer cont = counts(this.password, this.num);
        Integer cont2 = counts(this.password, this.may);
        Integer cont3 = counts(this.password, this.min);
        return (cont >= 5 && cont2 >= 1 && cont3 >= 1);
    }
    
    private Integer counts(String pas, String car){
        Integer cont = 0;
        for(int i = 0; i < pas.length(); i++){
            for(int j = 0; j < car.length(); j++){
                if(pas.charAt(i) == car.charAt(j)){
                    cont++;
                }
            }
        }
        return cont;
    }

    @Override
    public String toString() {
        return "Your password has as attributes: {" + " longitud = " + this.longitud + ", password=" + this.password + " }";
    }
    
}
