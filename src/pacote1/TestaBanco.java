package pacote1;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente icaro = new Cliente();
        icaro.nome = "Icaro de Oliveira Siqueira ";
        icaro.cpf = "222.222.222.-22";
        icaro.profissao = "programador";

        Conta contaDoIcaro = new Conta();
        contaDoIcaro.deposita(100);

        contaDoIcaro.titular = icaro;
        System.out.println(contaDoIcaro.titular.nome);
        System.out.println(contaDoIcaro.titular);

    }

}
