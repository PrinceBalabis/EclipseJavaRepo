package laboration4;
import javax.swing.*;

public class Program4d {
    public void nameAndJava() {
        String str1 = "födelsedag", str2 = "gratulationer", str3 = "på", str4 = "Hjärtliga", str5 = "!";
        String res=str4+" "+str2+" "+str3+" "+str1+" nummer ";
        int age = Integer.parseInt( JOptionPane.showInputDialog( "Ange din ålder" ) );
        // res = ...
        JOptionPane.showMessageDialog(null, res+age);
    }
}