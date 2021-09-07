import java.util.*;

class ReverseOfNumber {
    public int reverse(int x) {
        int y = 0;
        boolean isNeg = x < 0;
        x = Math.abs(x);
        while (x > 0) {
            if (y > (Integer.MAX_VALUE - (x % 10)) / 10) return 0;
            y = y * 10 + (x % 10);
            x = x / 10;
        }
        return isNeg ? -y : y;
    }
}