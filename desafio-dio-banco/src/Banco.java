import java.util.ArrayList;
import java.util.List;

public class Banco {

    public String nome;
    private List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void listarClientes(){
        System.out.println("\n=== Listagem de Clientes do Banco ===");
        this.contas.forEach(conta -> System.out.println(conta.getCliente().getNome() + " - "
                            + conta.getClass().getName() + ": " + conta.getNumero()));
    }

    public void addConta(Conta conta){
        this.contas.add(conta);
    }

    public void addConta(List<Conta> conta){
        this.contas.addAll(conta);
    }

    public void removeConta(Conta conta){
        this.contas.remove(conta);
    }
}
