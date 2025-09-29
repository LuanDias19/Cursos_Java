<<<<<<< HEAD
package dominio;

public non-sealed class Gerente extends Empregado {

    private String login;
    private String senha;
    private double comissao;

    public Gerente( String codigo, 
                    String nome, 
                    String endereco, 
                    int age, 
                    double salario, 
                    String login,
                    String senha,
                    double comissao) {
        super(codigo, nome, endereco, age, salario);
        this.login = login;
        this.senha = senha;
        this.comissao = comissao;
    }

    @Override
    public String getCodigo(){
        return "GR" + super.getCodigo();
    }

    public Gerente() {
    }

    
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double getTodoSalario() {
        return this.salario + this.comissao;
    }

    
    
}
=======
package dominio;

public non-sealed class Gerente extends Empregado {

    private String login;
    private String senha;
    private double comissao;

    public Gerente( String codigo, 
                    String nome, 
                    String endereco, 
                    int age, 
                    double salario, 
                    String login,
                    String senha,
                    double comissao) {
        super(codigo, nome, endereco, age, salario);
        this.login = login;
        this.senha = senha;
        this.comissao = comissao;
    }

    @Override
    public String getCodigo(){
        return "GR" + super.getCodigo();
    }

    public Gerente() {
    }

    
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double getTodoSalario() {
        return this.salario + this.comissao;
    }

    
    
}
>>>>>>> 00ab5e22d02e22bf2f71b1d816f58ab1ea308ca1
