import java.text.NumberFormat;

/**
 * Created by igor on 21.07.17.
 */
public class GetPIExample {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(1);
        System.out.println("Число PI наближено дорівнює " + nf.format(22.0 / 7.0));
    }
}
