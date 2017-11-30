package Generator;
public class Generator {
    public String getName()
    {
        StringBuilder builder = new StringBuilder();
        builder.append((char) (Math.random() * 26 + 'A'));
        int length = (int) (Math.random() * 7 + 4);
        for (int i = 0; i < length; i++) {
             builder.append((char) (Math.random() * 26 + 'a'));
        }
        return builder.toString();
    }
    public int getAge()
    {
        return (int) (Math.random() * 40 + 14);
    }
}
