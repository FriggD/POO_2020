public class Main {
    public static void main(String args[]){
        System.out.println("~≃================+ CONTA +================≃~");
        Conta Conta = new Conta("Fulano", 15, 500);
        System.out.println(Conta.toString());
        
        ContaCorrente corrente = new ContaCorrente(500, "Ciclano", 25, 30, 1000.0);
        System.out.println("≃================+ CONTA CORRENTE +================≃");
        System.out.println(corrente.toString());
        System.out.println("----------------");
        corrente.depositar(100.0);
        System.out.println(corrente.toString());
        System.out.println("----------------");
        corrente.sacar(2000.0);
        System.out.println(corrente.toString());
        System.out.println("----------------");
        corrente.sacar(1150.0);
        System.out.println(corrente.toString());
        System.out.println("----------------");

        Poupanca poupanca = new Poupanca(null, 0.20, "Beltrano", 40, 55);
        System.out.println("≃================+ POUPANÇA +================≃");
        System.out.println(poupanca.toString());
        System.out.println("----------------");
        poupanca.depositar(500.0, "30/09/2019");
        System.out.println("----------------");
        System.out.println(poupanca.toString());
        System.out.println("----------------");
        poupanca.adicionaRendimento(0.30);
        System.out.println(poupanca.toString());
        System.out.println("----------------");
        poupanca.depositar(100.0);
        System.out.println(poupanca.toString());
        System.out.println("----------------");
    }
}

