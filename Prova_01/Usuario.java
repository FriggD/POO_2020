//================================================================

// Sumário
// 1. Classe Usuario que exetende (herda) a classe pessoa
// 2. Atributos 
// 3. Construtor 
// 4. setUsername
// 5. setPassword
// 6. Getters
// 7. Login
// 8. toString

//===================================================================

//herança
public class Usuario extends Pessoa {
    protected String username;
    protected String password;

    //connstrutor
    public Usuario(String nome, String doc, Data data_nasc, String username, String password) {
        super(nome, doc, data_nasc);
        this.setUsername(username);
        this.setPassword(password);
    }

    //Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    //função para login
    void login(String password) {
        if (password == this.password) {
            this.password = password;
            System.out.println("Logado com sucesso!\n");
        } else {
            System.out.println("Senha inválida!\n");
        }
    }

    //toString com informações da super classe e informações da classe atual
    public String toString() {
        String dados_user;
        dados_user = super.toString() + "\nUsername: " + getUsername() + "\nSenha: ******\n"; // +getSenha();
        return dados_user;
    }
}
