package serialversionuid;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 
public class SerializeUser {
   public static void main(String[] args) throws Exception {
       User user = new User("tanjiro", "tanjirokamado@fmail.com",15);
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));
      out.writeObject(user);
       out.close();
   }
}
