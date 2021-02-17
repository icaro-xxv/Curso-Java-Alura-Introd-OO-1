package pacote1;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoIcaro = new Conta();
        contaDoIcaro.saldo = 100;
        contaDoIcaro.deposita(50);
        System.out.println(contaDoIcaro.saldo);

        boolean conseguiuRetirar = contaDoIcaro.saca(20);
        System.out.println(contaDoIcaro.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaLaura = new Conta();
        contaDaLaura.deposita(1000);

        boolean sucessoTransferencia = contaDaLaura.transfere(300, contaDoIcaro);

        if (sucessoTransferencia) {
            System.out.println("transferencia com sucesso");

        } else {
            System.out.println("faltou dinheiro");

        }
        System.out.println(contaDaLaura.saldo);
        System.out.println(contaDoIcaro.saldo);
    }
}
