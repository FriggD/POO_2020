public class Principal {
    public static void main(String args[]){
        Agencia novaAgencia= new Agencia(1, 1000.0, 0.005);

        ContaCorrente contaLuiz = novaAgencia.novaContaCorrente("Luiz Pedro Petroski");
        System.out.println(contaLuiz);
        ContaCorrente contaMaria = novaAgencia.novaContaCorrente("Maria da Silva");
        System.out.println(contaMaria);

        novaAgencia.cobrarTaxa(contaLuiz);

    }
}
