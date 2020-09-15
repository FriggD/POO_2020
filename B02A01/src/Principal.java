public class Principal {
    public static void main(String args[]){
        Agencia novaAgencia= new Agencia(1, 1000.0, 0.005);

        System.out.println("~========+ CONTAS: +========~");

        System.out.println("~========+ Correntes +========~");
        ContaCorrente contaFulano = novaAgencia.novaContaCorrente("Fulano Silva");
        System.out.println(contaFulano);
        
        ContaCorrente contaBeltrano = novaAgencia.novaContaCorrente("Beltrano Silva");
        System.out.println(contaBeltrano);

        contaFulano.depositar(100.0);
        contaBeltrano.depositar(50.0);

        novaAgencia.cobrarTaxa(contaFulano);

        System.out.println("~========+ Poupancas +========~");
        // ContaPoupanca contaCiclano = novaAgencia.novaContaPoupanca("Ciclano Souza");
        // System.out.println(contaCiclano);
        
        // ContaPoupanca contaZeh = novaAgencia.novaContaPoupanca("Zeh");
        // System.out.println(contaZeh);
    
        // contaCiclano.depositar(400.0);
        // contaZeh.depositar(600.0);
        
        // novaAgencia.cobrarTaxa(contaZeh);

        novaAgencia.balanco();
    }
}
