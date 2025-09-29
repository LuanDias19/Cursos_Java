public non-sealed class Vendedor extends Empregado{

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

public non-sealed class Vendedor extends Empregado {

    private double percentualComissao;

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

}
