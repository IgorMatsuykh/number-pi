import java.text.NumberFormat;

/**
 * Created by igor on 21.07.17.
 */
public class GetPIExample {
    public String getPI (int numDigets) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(numDigets);
        return  nf.format(Math.PI);
    }
    public static void main(String[] args) {
        GetPIExample example = new GetPIExample();
        System.out.println("Число PI наближено дорівнює " + example.getPI(Integer.parseInt(args[0])) );

    }
}
