
package CheckDateValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDateValidation {

    public static void main(String[] args) {
    }

    public static boolean isLeap(int y) {
        boolean result = false;
        if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0))) {
            result = true;
        }
        return result;
    }

    public static boolean valid(int y, int m, int d) {
        if (y <= 0 || m <= 0 || m > 12 || d <= 0 || d > 31) {
            return false;
        }
        int maxD = 31;
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            maxD = 30;
        } else if (m == 2) {
            if (isLeap(y)) {
                maxD = 29;
            } else {
                maxD = 28;
            }
        }
        return d <= maxD;
    }

    public static boolean checkValidStringDate(String ymd) {
        int y = 0, m = 0, d = 0;
        int[] a = {y, m, d};
        String[] part = ymd.split("/");
        Pattern pattern = Pattern.compile("\\d*");
        Matcher matcher;
        for (int i = 0; i <= 2; i++) {
            matcher = pattern.matcher(part[i]);
            if (matcher.matches()) {
                a[i] = Integer.parseInt(part[i]);
            } else {
                return false;
            }
        }
        return valid(a[0], a[1], a[2]);
    }

}
