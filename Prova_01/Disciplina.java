//================================================================

// Sumário
// 1. Imports
// 2. Classe disciplina 
// 3. Construtor 
// 4. SetNome_disc (nome da disciplina)
// 5. setCarga_hora
// 6. Getters  
// 7. ArrayLists
// 8. toString

//===================================================================

import java.util.ArrayList;

public class Disciplina {
    //Atributos
    private String nome_disc;
    private int carga_hora;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Professor> professor = new ArrayList<Professor>();

    //construtor
    public Disciplina(String nome_disc, int carga_hora) {
        setNome_disc(nome_disc);
        setCarga_hora(carga_hora);
    }

    //Métodos setters
    public void setNome_disc(String nome_disc) {
        this.nome_disc = nome_disc;
    }

    public void setCarga_hora(int carga_hora) {
        this.carga_hora = carga_hora;
    }

    //Métodos getters
    public String getNome_disc() {
        return nome_disc;
    }

    public int getCarga_hora() {
        return carga_hora;
    }

    // • Matricular um aluno (sobrecarregado)
    // – parâmetro um objeto aluno
    public void AddAluno(Aluno new_aluno) {
        // Verifica se já existem 30 alunos ou mais
        if (this.alunos.size() <= 30) {
        } else {
            System.out.println("Limite de alunos atingido.\n");
            return; // Não deixa continuar se limite de alunos foi atingido
        }
        // Itera sobre os alunos, verifica se aluno já está cadastrado
        for (Aluno aluno : this.alunos) {
            if (aluno.getNome() == new_aluno.getNome()) {
                System.out.println("Aluno já existente: \n");
                return; // Não deixa continuar a função se aluno já está criado
            }
        }
        //adiciona aluno
        this.alunos.add(new_aluno);
    }

    // – parâmetro nome completo, documento, data de nascimento, ra, senha e curso
    public void addAluno(String RA, String curso, String username, String password, String nome, String doc,
            Data data_nasc) {
        Aluno new_aluno = new Aluno(RA, curso, username, password, nome, doc, data_nasc);
        if (this.alunos.size() <= 30) {
        } else {
            System.out.println("Limite de alunos atingido.\n");
            return; // Não deixa continuar se limite de alunos foi atingido
        }
        // Itera sobre os alunos, verifica se aluno já está cadastrado
        for (Aluno aluno : this.alunos) {
            if (aluno.getNome() == new_aluno.getNome()) {
                System.out.println("Aluno já existente: \n");
                return; // Não deixa continuar a função se aluno já está criado
            }
        }
        this.alunos.add(new_aluno);
    }

    //Getters
    public ArrayList<Aluno> getListaAluno() {
        return alunos;
    }

    public ArrayList<Professor> getListaProfessor() {
        return professor;
    }

    //Adiciona o máximo de 1 professor por matéria
    public void AddProfessor(Professor professor) {
        if (this.professor.size() < 1) {
            this.professor.add(professor);
        } else {
            System.out.println("Limite de professor atingido.\n");
        }
    }

    //Retorna todos os alunos cadastrados na disciplina
    public void Assinaturas() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }


}
