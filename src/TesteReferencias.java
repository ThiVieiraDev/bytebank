public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Primeira conta saldo: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta.saldo);

        primeiraConta.saldo = 200;
        System.out.println(segundaConta.saldo);
    }
}
