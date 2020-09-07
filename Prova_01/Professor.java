//================================================================

// Sumário
// 1. Classe Professor que extende a classe Usuário
// 2. Construtor 
// 3. setFormação
// 4. setDepartamento
// 5. Getters
// 6. Editar
//  6.1 Editar apenas a formação
//  6.2 Editar formação e departamento
// 7. Login
// 8. toString 

//===================================================================

//Herança
public class Professor extends Usuario {
    //Atributos
    private String formacao;
    private String departamento;
    //construtor
    public Professor(String formacao, String departamento, String username, String password, String nome, String doc, Data data_nasc) {
        //por estar utilizando herança, é necessario utilizar o super() no construtor
        super(nome, doc, data_nasc,username, password);
        this.setFormacao(formacao);
        this.setDepartamento(departamento);
    }

    //verificação para settar valores na 'formação'
    public void setFormacao(String formacao) {
        if (formacao == "G" || formacao == "M" || formacao == "D") {
            this.formacao = formacao;
            if(formacao == "G"){
                System.out.println("Formação do professor: Graduação \n");
            }
            if(formacao == "M"){
                System.out.println("Formação do professor: Mestrado \n");
            }
            if(formacao == "D"){
                System.out.println("Formação do professor: Doutorado \n");
            }
        }else{
            System.out.println("Formação desconhecida!\n");
        }
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Getters
    public String getFormacao() {
        return formacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    //Editar formação
    void Editar(String formacao){
        this.formacao = formacao;
    }

    //Editar formação e departamento
    void Editar(String formacao, String departamento){
        this.formacao = formacao;
        this.departamento = departamento;
    }

    //função para login, onde compara a senha passada pelo construtor e 
    //a senha passada pelo parametro da chama da função
    void login(String password) {
        if (password == this.password) {
            this.password = password;
            System.out.println("Usuário logado no Professor Online\n");
        }
    }

    //toString com informações da super classe e informações da classe atual
    public String toString(){
        String dados_prof;
        dados_prof = super.toString()+"\nFormação: "+getFormacao()+ "\nDepartamento: "+getDepartamento()+"\n";
        return dados_prof;
    }

}
