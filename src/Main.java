public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("FIlme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lancamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com gala dos anos 80
                Muito bom!
                Ano de lancamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

    }
}