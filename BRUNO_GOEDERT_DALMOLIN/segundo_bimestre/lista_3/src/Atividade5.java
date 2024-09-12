
public class Atividade5 {

    public static void main(String[] args) throws Exception {
        throwCustomError(null);
    }

    public static void throwCustomError(String text) {
        try {
            System.out.println(text.length());
        } catch (Exception e) {
            throw new CustomException("String em formato incorreto!");
        }
    }
}
