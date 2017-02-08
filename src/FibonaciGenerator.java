/**
 * Created by moles on 2017-02-08.
 *
 * @author moles
 */
public class FibonaciGenerator {
    /**
     * @param n index within
     * @return value
     */
    public int gen(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        return gen(n - 1) + gen(n - 2);
    }
}
