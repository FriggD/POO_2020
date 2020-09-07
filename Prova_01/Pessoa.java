//================================================================

// Sumário
// 1. Classe Pessoa
// 2. Atributos 
// 3. Construtor 1 (Nome, documento e data de nascimento)
// 4. Construtor 2 (Nome e data de nascimento)
// 5. Setters
//  5.1 setNome
//   Não é permitido nomes com 'lenght' menor que zero e nem numeros
//  5.2 setDoc
//   O documento pode ser rg ou cpf (pode possuir 9 ou 11 digitos), e deve possuir apenas números
// 6. setData  
// 7. Getters
// 8. toString

//===================================================================

public class Pessoa {
    //Atributos
    protected String nome;
    protected String doc;
    //composição da classe Data
    protected Data data_nasc;

    //construtor completo
    public Pessoa(String nome, String doc, Data data_nasc) {
        this.setNome(nome);
        this.setDoc(doc);
        this.setData_nasc(data_nasc);
    }

    //construtor sem a informaçao do documento
    public Pessoa(String nome, Data data_nasc) {
        this.setNome(nome);
        this.setData_nasc(data_nasc);
    }

    //Setters
    public void setNome(String nome) {
        //apenas letras, sem acentos e não pode ser vazio
        if (nome.length() > 0 && nome.matches("^[a-zA-Z\\s]*$")) { //.substring(0, 20)
            this.nome = nome;
        } else {
            System.out.println("Nome inválido: "+nome+"\n"+"Verifique a existencia de acentos.");
        }
    }

    public void setDoc(String doc) {
        //9digitos, apenas numeros
        if (doc.length() == 9 && doc.matches("[0-9]*")){ //|| doc.lenght() == 11
            this.doc = doc;
        }else{
            System.out.println("Documento invalido.\n");
        }
    }

    public void setData_nasc(Data data_nasc) {
        this.data_nasc = data_nasc;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getDoc() {
        return doc;
    }

    public Data getData_nasc() {
        return data_nasc;
    }

    //toString() com nome, documento e data de nascimento
    public String toString(){
        String dados_pessoa;
        dados_pessoa = "Nome: "+getNome()+"\nDocumentos: "+getDoc()+"\nData de nascimento: "+getData_nasc()+"\n";
        return dados_pessoa;
    }
}
