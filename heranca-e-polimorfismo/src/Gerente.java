public non-sealed class Gerente extends Empregado {

    private String login;
    private String senha;
    private String comissao;

    
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
    public String getComissao() {
        return comissao;
    }
    public void setComissao(String comissao) {
        this.comissao = comissao;
    }

    private String password;
    private double comissao;

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
}
