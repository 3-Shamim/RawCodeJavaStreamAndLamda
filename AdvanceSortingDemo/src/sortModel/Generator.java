package sortModel;

import java.text.DecimalFormat;

/**
 *
 * @author SHAMIM
 */
public class Generator {
    
    public double CgpaGenarator()
    {
        DecimalFormat decimalFormat = new DecimalFormat(".00");
        double cgpa;
        
        cgpa =  Double.parseDouble(decimalFormat.format(Math.random() * 3 + 1));
        
        return cgpa;
    }
    public String nameGenerator()
    {
        StringBuilder  builder = new StringBuilder();
        builder.append((char) (Math.random() * 26 + 'A'));
        int lenght =  (int) (Math.random() * 7 + 5);
        for (int i = 0; i < lenght; i++) {
            builder.append((char) (Math.random() * 26 + 'a'));
        }
        return builder.toString();
    }
    public String emailGenerator()
    {
        String domain[] = {".com",".net",".to",".org"};
        StringBuilder  builder = new StringBuilder();
//        builder.append((char) (Math.random() * 26 + 'a'));
        int lenght =  (int) (Math.random() * 7 + 4);
        for (int i = 0; i < lenght; i++) {
            builder.append((char) (Math.random() * 26 + 'a'));
        }
        builder.append('@');
        int lenght1 =  (int) (Math.random() * 5 + 3);
        for (int i = 0; i < lenght1; i++) {
            builder.append((char) (Math.random() * 26 + 'a'));
        }
        int p = (int) (Math.random() * domain.length);
        builder.append(domain[p]);
//        builder.append(Math.random() > .5 ? ".com" : ".net");
        return builder.toString();
    }
}
