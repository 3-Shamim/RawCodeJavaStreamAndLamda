package randomgeneratename;

/**
 *
 * @author SHAMIM
 */
public class RandomGenerateName {
    
    private String[] domain = {".com", ".net", ".org", ".io", ".to"};

    private String nameGenerator() {
        StringBuilder builder = new StringBuilder();

        int length = (int) (Math.random() * 10 + 3);
        builder.append((char) (Math.random() * 26 + 'A'));
        for (int i = 0; i < length; i++) {
            builder.append((char) (Math.random() * 26 + 'a'));
        }
        return builder.toString();
    }

    private String emailGenerator() {
        StringBuilder builder = new StringBuilder();

        int nameLegth = (int) (Math.random() * 8 + 3);
        for (int i = 0; i < nameLegth; i++) {
            builder.append((char) (Math.random() * 26 + 'a'));
        }
        builder.append("@");
        int mailNameLength =  (int) (Math.random()*5 + 3);
        for(int i = 0; i < mailNameLength; i++)
        {
            builder.append((char) (Math.random()*26 + 'a'));
        }
        
        builder.append(domain[ (int) (Math.random() * domain.length )]);
        
        return builder.toString();
    }

    public RandomGenerateName() {
        for (int i = 0; i < 100; i++) {
            System.out.println(nameGenerator() + "  " + emailGenerator());
        }
    }

    public static void main(String[] args) {
        new RandomGenerateName();
    }

}
