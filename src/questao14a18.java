public class questao14a18 {
    public static void main(String[] args){

        int num = 4;

        if (num % 2 == 0){
            System.out.println("o número é par");
        }
        else {
            System.out.println("o número não é par");
        }




        questao14a18.main2(5);

        questao14a18.main3(3);

        questao14a18.main4(5);

        questao14a18.main5(7);
    }
    public static void main2(int n){

        int num = n;

        if (num % 2 != 0){
            System.out.println("o número é impar");
        }
        else {
            System.out.println("o número não é impar");
        }
    }
    public static void main3(int m){

        int variavel = m;

        if (variavel % 3 == 0){
            System.out.println("O número é multiplo de 3");
        }
        else {
            System.out.println("o número não é multiplo de 3");
        }


    }
    public static void main4(int k){
        int variavel = k;

        if (variavel % 5 == 0){
            System.out.println("o número é multiplo de 5");
        }
        else {
            System.out.println("o número não é multiplo de 5");
        }
    }
    public static void main5(int j){
        int variavel = j;

        if (variavel % 7 == 0){
            System.out.println("o número é multiplo de 7");
        }
        else {
            System.out.println("o número não é multiplo de 7");
        }
    }
}

