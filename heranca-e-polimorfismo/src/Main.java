<<<<<<< HEAD
import dominio.Empregado;
import dominio.Gerente;
import dominio.Vendedor;

public class Main {


    public static void main(String[] args) {
        printEmpregado(new Gerente());
        printEmpregado(new Vendedor());

}

    public static void printEmpregado(Empregado empregado) {

        System.out.printf("=======%s=======\n", empregado.getClass().getCanonicalName());

        switch (empregado) {
            case Gerente gerente -> {
                gerente.setCodigo("001");
                gerente.setNome("João");
                gerente.setSalario(5000);
                gerente.setLogin("joao");
                gerente.setSenha ("123456");
                gerente.setComissao(600);


                System.out.println(gerente.getCodigo());
                System.out.println(gerente.getNome());
                System.out.println(gerente.getSalario());
                System.out.println(gerente.getLogin());
                System.out.println(gerente.getSenha());
                System.out.println(gerente.getComissao());
            }
            
            case Vendedor vendedor -> {
                vendedor.setCodigo("002");
                vendedor.setNome("Maria");
                vendedor.setSalario(2000);
                vendedor.setPercentualComissao(10);
                vendedor.setQntdVendida(1000);


                System.out.println(vendedor.getCodigo());
                System.out.println(vendedor.getNome());
                System.out.println(vendedor.getSalario());
                System.out.println(vendedor.getPercentualComissao());
                System.out.println(vendedor.getQntdVendida());
            }
        }
        System.out.println(empregado.getTodoSalario());
        System.out.println(empregado.getTodoSalario(500));
        System.out.println("=====================\n");


    }

=======
import dominio.Empregado;
import dominio.Gerente;
import dominio.Vendedor;

public class Main {


    public static void main(String[] args) {
        printEmpregado(new Gerente());
        printEmpregado(new Vendedor());

}

    public static void printEmpregado(Empregado empregado) {

        System.out.printf("=======%s=======\n", empregado.getClass().getCanonicalName());

        switch (empregado) {
            case Gerente gerente -> {
                gerente.setCodigo("001");
                gerente.setNome("João");
                gerente.setSalario(5000);
                gerente.setLogin("joao");
                gerente.setSenha ("123456");
                gerente.setComissao(600);


                System.out.println(gerente.getCodigo());
                System.out.println(gerente.getNome());
                System.out.println(gerente.getSalario());
                System.out.println(gerente.getLogin());
                System.out.println(gerente.getSenha());
                System.out.println(gerente.getComissao());
            }
            
            case Vendedor vendedor -> {
                vendedor.setCodigo("002");
                vendedor.setNome("Maria");
                vendedor.setSalario(2000);
                vendedor.setPercentualComissao(10);
                vendedor.setQntdVendida(1000);


                System.out.println(vendedor.getCodigo());
                System.out.println(vendedor.getNome());
                System.out.println(vendedor.getSalario());
                System.out.println(vendedor.getPercentualComissao());
                System.out.println(vendedor.getQntdVendida());
            }
        }
        System.out.println(empregado.getTodoSalario());
        System.out.println(empregado.getTodoSalario(500));
        System.out.println("=====================\n");


    }

>>>>>>> 00ab5e22d02e22bf2f71b1d816f58ab1ea308ca1
}