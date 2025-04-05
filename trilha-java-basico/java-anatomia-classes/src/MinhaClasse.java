public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Alex";
        String segundoNome = "Alves";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto  (String primeiroNome, String SegundoNome){
        return "Resultado Metodo " + primeiroNome.concat("").concat(SegundoNome);


    }
}


