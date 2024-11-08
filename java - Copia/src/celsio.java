public class celsio {
    public static void main(String[] args) {
        System.out.println("Vamos converter a temperatura, aqui estava 21 graus celsios");
        int celsio = 21;
        double far = (celsio * 1.8) + 32;
        int farInteiro = (int) far;
        System.out.println(farInteiro);
    }
}
