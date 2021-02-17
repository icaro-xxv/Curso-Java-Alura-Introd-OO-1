package pacote1;

public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaLaura = new Conta();
        System.out.println(contaDaLaura.saldo);

        contaDaLaura.titular = new Cliente();
        System.out.println(contaDaLaura.titular);

        contaDaLaura.titular.nome = "Laura";
        System.out.println(contaDaLaura.titular.nome);

    }

}
