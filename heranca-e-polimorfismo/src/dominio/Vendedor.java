<<<<<<< HEAD
package dominio;

public non-sealed class Vendedor extends Empregado {

    private double percentualComissao;
    private double qntdVendida;

    public Vendedor(String codigo, 
                    String nome, 
                    String endereco, 
                    int age, 
                    double salario,
                    double percentualComissao,
                    double qntdVendida) {
                        super(codigo, nome, endereco, age, salario);
                        this.percentualComissao = percentualComissao;
                        this.qntdVendida = qntdVendida;
    }

    @Override
    public String getCodigo(){
        return "VD" + super.getCodigo();
    }

    @Override
    public double getTodoSalario() {
        return this.salario + ((qntdVendida * percentualComissao) / 100);
    }

    public Vendedor() {
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setQntdVendida(double qntdVendida) {
        this.qntdVendida = qntdVendida;
    }

    public double getQntdVendida() {
        return qntdVendida;
    }


}


=======
package dominio;

public non-sealed class Vendedor extends Empregado {

    private double percentualComissao;
    private double qntdVendida;

    public Vendedor(String codigo, 
                    String nome, 
                    String endereco, 
                    int age, 
                    double salario,
                    double percentualComissao,
                    double qntdVendida) {
                        super(codigo, nome, endereco, age, salario);
                        this.percentualComissao = percentualComissao;
                        this.qntdVendida = qntdVendida;
    }

    @Override
    public String getCodigo(){
        return "VD" + super.getCodigo();
    }

    @Override
    public double getTodoSalario() {
        return this.salario + ((qntdVendida * percentualComissao) / 100);
    }

    public Vendedor() {
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setQntdVendida(double qntdVendida) {
        this.qntdVendida = qntdVendida;
    }

    public double getQntdVendida() {
        return qntdVendida;
    }


}


>>>>>>> 00ab5e22d02e22bf2f71b1d816f58ab1ea308ca1
