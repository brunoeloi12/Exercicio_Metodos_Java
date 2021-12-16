public class Emprestimo {

    public static double taxaDuasParcelas(){
        return 0.3;
    }
    public static double taxaTresParcelas(){
        return 0.45;
    }

    public static void calculo (double valor, int parcelas){
        if (parcelas == 2){
            double finalValor = valor + (valor * taxaDuasParcelas());
            System.out.println("O valor final do emprestimo é: R$" + finalValor);
        }else if (parcelas == 3){
            double finalvalor = valor + (valor * taxaTresParcelas());
            System.out.println("O valor final do Emprestimo é: R$" + finalvalor);
        }else {
            System.out.println("Quantia não aceita!");
        }
    }

}
