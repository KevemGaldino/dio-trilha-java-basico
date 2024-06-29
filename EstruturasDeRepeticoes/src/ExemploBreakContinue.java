public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <=5; numero++) {
            if(numero == 3) continue; // Continue muda o fluxo do for, mas não para totalmente como o break

            System.out.println(numero);
        }
    }
}
