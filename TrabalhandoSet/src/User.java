<<<<<<< HEAD
import java.util.Objects;

public class User {
    private int id;
    private String nome;

    public User() {
    }

    public User(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return String.format("{'id': %s, 'nome:': %s}", id, nome);
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) return true;
        if ((isNull(obj)) || (!(obj instanceof User))) return false;
        var user = ((User) obj);
        return this.id == user.getId() == this.id && Objects.equals(user.getNome(), this.nome);
    }

    

    

    
}
=======
import java.util.Objects;

public class User {
    private int id;
    private String nome;

    public User() {
    }

    public User(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return String.format("{'id': %s, 'nome:': %s}", id, nome);
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) return true;
        if ((isNull(obj)) || (!(obj instanceof User))) return false;
        var user = ((User) obj);
        return this.id == user.getId() == this.id && Objects.equals(user.getNome(), this.nome);
    }

    

    

    
}
>>>>>>> 00ab5e22d02e22bf2f71b1d816f58ab1ea308ca1
