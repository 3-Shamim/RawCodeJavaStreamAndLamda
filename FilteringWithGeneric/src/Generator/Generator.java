package Generator;
/**
 *
 * @author SHAMIM
 */
public class Generator {
    public String firstNameGenerator()
    {
        StringBuilder builder = new StringBuilder();
        builder.append((char) (Math.random() * 26 + 'A'));
        int length = (int) (Math.random() * 7 + 4);
        for (int i = 0; i < length; i++) {
            builder.append((char) (Math.random() * 26 + 'a'));
        }
        return builder.toString();
    }
    public String lastNameGenerator()
    {
        StringBuilder builder = new StringBuilder();
        int length = (int) (Math.random() * 7 + 4);
        for (int i = 0; i < length; i++) {
            builder.append((char) (Math.random() * 26 + 'a'));
        }
        return builder.toString();
    }
    public String emailGenerator()
    {
        String domain[] = {".com", ".to",".org",".net"};
        StringBuilder builder = new StringBuilder();
        int length = (int) (Math.random() * 7 + 4);
        for (int i = 0; i < length; i++) {
            builder.append((char) (Math.random() * 26 + 'a'));
        }
        builder.append("@");
        int length1 = (int) (Math.random() * 5 + 4);
        for (int i = 0; i < length1; i++) {
            builder.append((char) (Math.random() * 26 + 'a'));
        }
        builder.append(domain[ (int) (Math.random() * domain.length)]);
        return builder.toString();
    }
    public int idGenerator()
    {
        int id =  (int) (Math.random() * 100);
        return id; 
    }
    public String courseCodeGenerator()
    {
        String domain[] = {"Cse", "Math","ENG"};
        StringBuilder builder = new StringBuilder();
        builder.append(domain[ (int) (Math.random() * domain.length)]);
        
        for (int i = 0; i < 4; i++) {
            builder.append((char) (Math.random() * 10 + '0'));
        }
        return builder.toString();
    }
    public String courseTitleGenerator()
    {
        StringBuilder builder = new StringBuilder();
        builder.append((char) (Math.random() * 26 + 'A'));
        int length = (int) (Math.random() * 6 + 3);
        for (int i = 0; i < length; i++) {
            builder.append((char) (Math.random() * 26 + 'a'));
        }
        builder.append(" ");
        int length1 = (int) (Math.random() * 7 + 4);
        for (int i = 0; i < length1; i++) {
            builder.append((char) (Math.random() * 26 + 'a'));
        }
        return builder.toString();
    }
}
