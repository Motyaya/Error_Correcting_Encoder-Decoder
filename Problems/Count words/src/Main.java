import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        if (text.isBlank() || text.isEmpty()){
            System.out.println(0);
            reader.close();
        }
        else {
            String[] textMas = text.split("\\s+");
            if (textMas[0].isBlank()) System.out.println(textMas.length-1);
            else System.out.println(textMas.length);
            reader.close();
        }
    }
}