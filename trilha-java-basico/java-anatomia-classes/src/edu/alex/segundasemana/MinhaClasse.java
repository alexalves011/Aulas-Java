package edu.alex.segundasemana;
public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Alex";
        String segundoNome = "Alves";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado Metodo: " + primeiroNome + " " + segundoNome;
    }
}
