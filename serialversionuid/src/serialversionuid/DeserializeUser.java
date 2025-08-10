package serialversionuid;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeserializeUser {
   public static void main(String[] args) throws Exception {
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"));
       User user = (User) in.readObject(); 
       user.display();
       // This will fail
       in.close();
   }
}
