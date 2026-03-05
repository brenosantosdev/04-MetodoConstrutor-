package Exercicio02;

public class Main {
    public static void main(String[] args) {
        SenhaAtendimento s1 = new SenhaAtendimento(" Breno");
        SenhaAtendimento s2 = new SenhaAtendimento(" Pedro");
        SenhaAtendimento s3 = new SenhaAtendimento(" Marques");

        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        System.out.println("Próxima senha disponivel --> " + SenhaAtendimento.controle);
    }


}
