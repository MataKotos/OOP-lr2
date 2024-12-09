import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab2 {

//Написать регулярное выражение, определяющее является ли данная строчка валидным 
//E-mail адресом согласно RFC под номером 2822.– пример правильных выражений: user@example.com, 
//root@local.host– пример неправильных выражений: bug@@@com.ru, @val.ru, Just Text2.
	
    public static void main(String[] args) {
        
    	String email =  " @val.ru"; //ввести ИМЭЙЛ

        String pattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
 
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(email);

        if (matcher.matches()) 
        {
            System.out.println("Адрес электронной почты корректен.");
        } 
        else 
        {
            System.out.println("Адрес электронной почты некорректен.");
        }
    }
}