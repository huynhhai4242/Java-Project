package goodstring;

import java.util.Scanner;
import static java.lang.System.out;

//Chuyển đổi chữ in hoa về dạng thường
public class GoodString {

    public static void main(String[] args) {
        /*ASCII
        for (int i = 0; i < 128; i++) {
            out.println(i + " | " + (char) i);
        }
        */
        
        Scanner sc = new Scanner(System.in);
        out.print("Input your string: ");
        String s = sc.nextLine();
        char[] ch = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        out.print("Good string: ");
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                int a = (int) ch[i] + 32;
                out.print((char) a);
            } else {
                out.print(ch[i]);
            }
        }
        out.println("");
    }

}
