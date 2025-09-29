<<<<<<< HEAD
package dominio;

public sealed abstract class Empregado permits Gerente, Vendedor {

    protected String codigo;
    protected String nome;
    protected String endereco;
    protected int age;
    protected double salario;

    public Empregado(String codigo, String nome, String endereco, int age, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.age = age;
        this.salario = salario;
    }

    

    public Empregado() {
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getTodoSalario();

    public double getTodoSalario(double extra){
        return this.getTodoSalario() + extra;
    }

}
=======
package dominio;

public sealed abstract class Empregado permits Gerente, Vendedor {

    protected String codigo;
    protected String nome;
    protected String endereco;
    protected int age;
    protected double salario;

    public Empregado(String codigo, String nome, String endereco, int age, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.age = age;
        this.salario = salario;
    }

    

    public Empregado() {
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getTodoSalario();

    public double getTodoSalario(double extra){
        return this.getTodoSalario() + extra;
    }

}
>>>>>>> 00ab5e22d02e22bf2f71b1d816f58ab1ea308ca1
