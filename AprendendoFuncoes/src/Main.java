
public class Main {
    public static void main(String[] args) {

        int primeiroNumero = 10;
        int segundonumero = 20;

        int soma = primeiroNumero + segundonumero;
        int subtracao = primeiroNumero - segundonumero;
        int multiplicao = primeiroNumero * segundonumero;
        int divisao = primeiroNumero / segundonumero;

      int somaViaFuncao = somarValores(primeiroNumero, segundonumero);
        System.out.println("Valor soma "+ somaViaFuncao);

      int subtrairViaFuncao = subtrairValores(50,10);
        System.out.println("Valor subtração"+subtrairViaFuncao);


      int multiplicacaoViaFuncao = mutiplicarValore(0, 0);
        System.out.println("Valor mutiplicação: " + multiplicacaoViaFuncao);


        int divisaoViaFuncao = divisaoValores(20, 2);
        System.out.println("Valor Dividido:"+divisaoViaFuncao);


    }

    public static int somarValores(int numA, int numB){
        return numA + numB;
    }

    public static int subtrairValores (int numA, int numB){

        if (numA < 0 ){
            numA = numA * -1;
        }

        return numA -numB;
    }

    public  static  int mutiplicarValore ( int numA, int numB){

        if (numA <= 0 && numB <= 0){
            System.out.println("Insira um Valor maior que 0 ");
        }

        return numA * numB;
    }

    public  static  int divisaoValores  ( int numA, int numB){

        return numA /numB;
    }


}