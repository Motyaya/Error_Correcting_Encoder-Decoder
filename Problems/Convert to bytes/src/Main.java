import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        int charNumber = inputStream.read();
        while (charNumber!=-1) {
            System.out.print(charNumber);
            charNumber = inputStream.read();
        }
        inputStream.close();

    }
}