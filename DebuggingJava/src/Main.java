public class Main {
    public static void main(String[] args) {
        System.out.println("O programa iniciou no método main");
        a();
        System.out.println("O programa encerrou no método main");
    }

    static void a() {
        System.out.println("Iniciou o método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b() {
        System.out.println("Iniciou o método b.");
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c() {
        System.out.println("Inicou o método c.");
        Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }

}
