package bucles;
public class ejercicio21 {
    public static void main(String[] args) {

        int num;
        int Resultado = 0;

        for (num = 1; num <= 1000; num = num + 1) {

            if (num % 2 == 0) {
                Resultado = Resultado + num;
            }
        }

        System.out.println(Resultado);


    }
}
