import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente alan = new Cliente("Alan Pacheco");
        Cliente ben = new Cliente("Ben Pacheco");
        Cliente maite = new Cliente("Maitê Pacheco");
        Cliente evelin = new Cliente("Evelin Maria");
        Cliente juliana = new Cliente("Evelin Maria");
        Cliente bruna = new Cliente("Bruna Pacheco");
        Cliente carol = new Cliente("Carol Pacheco");


        Conta cc1 = new ContaCorrente(alan);
        Conta cc2 = new ContaCorrente(ben);
        Conta cc3 = new ContaCorrente(bruna);
        Conta poupanca1 = new ContaPoupanca(maite);
        Conta poupanca2 = new ContaPoupanca(evelin);
        Conta poupanca3 = new ContaPoupanca(juliana);
        Conta poupanca4 = new ContaPoupanca(carol);
        Conta poupanca5 = new ContaPoupanca(alan);

        Banco banco = new Banco();
        banco.addConta(Arrays.asList(cc1, cc2, cc3, poupanca1,
                poupanca2, poupanca3, poupanca4, poupanca5));

        cc2.depositar(100);
        cc2.transferir(100, poupanca1);
        cc3.depositar(1000);
        cc3.transferir(250, poupanca2);
        cc3.transferir(300, poupanca4);
        cc3.transferir(180, cc2);

        //Impressão de alguns extratos
        cc3.imprimirExtrato();
        cc2.imprimirExtrato();
        poupanca4.imprimirExtrato();

        banco.removeConta(poupanca5);
        banco.listarClientes();
    }
}
