public class Nota {
    public static void main(String[] args) {
        System.out.println("Esse é o screen match");
        System.out.println("Filme:");

        int anoDelancamento = 2022;
        System.out.println("Anos de lançamento:" + anoDelancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura dos anos 80   
                Muito bom
                Ano de lançamento
                
                """ + anoDelancamento;
        System.out.println(sinopse); 
    }
}
