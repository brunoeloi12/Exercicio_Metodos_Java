public class Main {

    public static void main(String[] args){

        //Calculadora:
        System.out.println("Calculadora: ");
        Calculadora.soma( 1, 2);
        Calculadora.subtracao(2, 1);
        Calculadora.divisao(8,2);
        Calculadora.mutiplicacao(5,3);

        //Mensagem do dia:
        System.out.println("\n" + "Mensagem do dia conforme o horário: ");
        MensagemDia.mensagem(5);
        MensagemDia.mensagem(14);
        MensagemDia.mensagem(22);

        //Emprestimo
        System.out.println("\n" + "O emprestimo é: ");
        Emprestimo.calculo(1000, 2);
        Emprestimo.calculo(1000, 3);


    }
}
