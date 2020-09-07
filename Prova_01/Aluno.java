//================================================================

// Sumário
// 1. Classe Aluno que extende a classe Usuario
// 2. Construtor 
// 3. Setters 
// 4. Getters
// 5. Editar 
// 6. Login
// 7. toString

//===================================================================

//Usuário é a super classe de Aluno => HERANÇA
public class Aluno extends Usuario {
    //Atributos
    protected String RA;
    protected String curso;
    protected String situacao;

    //Construtor
    public Aluno(String RA, String curso, String situacao, String password, String nome, String doc, Data data_nasc) {
        super(nome, doc, data_nasc, RA, password);
        this.setRA(RA);
        this.setCurso(curso);
        this.setSituacao(situacao);
    }
    //Métodos setters
    public void setRA(String RA) {
        this.RA = RA;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setSituacao(String situacao) {
        if (situacao == "A" || situacao == "C" || situacao == "D") {
            this.situacao = situacao;
            if (situacao == "A") {
                System.out.println("Situacao do aluno: Abandono \n");
            }
            if (situacao == "C") {
                System.out.println("Situacao do aluno: Cursando \n");
            }
            if (situacao == "D") {
                System.out.println("Situacao do aluno: Desistente \n");
            }
        } else {
            System.out.println("Situacao desconhecida!\n");
        }
    }
    //Métodos getters
    public String getRA() {
        return RA;
    }

    public String getCurso() {
        return curso;
    }

    public String getSituacao() {
        return situacao;
    }

    //Função para editar a situação do aluno
    void Editar(String situacao) {
        this.situacao = situacao;
    }

    //Função para login, onde a senha que foi passada no parametro da chamada da função 
    //é a mesma passada no construtor
    void login(String password) {
        if (password == this.password) {
            this.password = password;
            System.out.println("Usuário logado no Acadêmico Online\n");
        }
    }

    //Método toString com as informação adicionais (RA, curso e situação) e o toString da super classe
    public String toString() {
        String dados_aluno;
        dados_aluno = super.toString() + "\nRA: " + getRA() + "\nCurso: " + getCurso() + "\nSituação: " + getSituacao();
        return dados_aluno;
    }
}
