
public class Assert_String_API {

        public boolean isString(String s) {
                for (int i = 0; i < s.length(); i++)
                        if (Character.isDigit(s.charAt(i)) == false)
                                return false;
                return true;
        }
}
