public class Principal {
    public static void main(String[] args) {
        // Usuario(String nome, String doc, Data data_nasc, String username, String password)
        System.out.println("\n~============+ SECRETARIO +============~\n");
        Data data_secretario = new Data(01,05,1997);
        Usuario secretario = new Usuario("Fulano", "012345678", data_secretario, "SecrFulano", "abc123");
        System.out.println("\n~============+ LOGIN SECRETARIO +============~\n");
        System.out.println(secretario);
        System.out.println("Se o secretário errou a senha: \n");
        secretario.login("123456");
        System.out.println("Se o secretário acertou a senha: \n");
        secretario.login("abc123");

        System.out.println("\n~============+ DISCIPLINA +============~\n");
        Disciplina computacao = new Disciplina("Computação", 4200);
        Data dataAluno = new Data(10, 05, 2012);
        Data dataAluno_2 = new Data(8, 02, 2010);
        Data dataAluno_3 = new Data(01, 06, 2011);
        Data dataAluno_4 = new Data(02, 07, 2012);
        Data dataAluno_5 = new Data(03, 8, 2010);
        Data dataAluno_6 = new Data(04, 9, 2010);
        Data dataAluno_7 = new Data(05, 10, 2014);
        Data dataAlly = new Data(29, 04, 1998);
        Aluno aluno_1 = new Aluno("13848564", "computação", "C", "asdzxc", "Gustavo Mazz", "159753645", dataAluno_2);
        Aluno aluno_2 = new Aluno("18142536", "computação", "C","qweasd", "Fulano", "258741369", dataAluno_3);
        Aluno aluno_3 = new Aluno("19253641", "computação", "C","azsxdc", "Beltrano", "963258741", dataAluno_4);
        Aluno aluno_4 = new Aluno("17456321", "computação", "C","qawsed", "Ciclano", "321789654", dataAluno_5);
        Aluno aluno_5 = new Aluno("16142536", "computação", "C","qweasd", "Zezinho", "134679852", dataAluno_6);
        Aluno aluno_6 = new Aluno("15123456", "computação", "C","zxcasd", "Joaozinho", "268415973", dataAluno_7);

        Data data_P = new Data(15, 10, 1899);
        //Professor(String formacao, String departamento, String username, String password, String nome, String doc, Data data_nasc)
        Professor Professor_comp = new Professor("G", "Informatica", "Die", "SOs", "Fortran", "087654321", data_P);
        Professor professor_2 = new Professor("D", "Informatica", "Fluff", "ÇZAçaz", "Ally", "134597620", dataAlly);
        //addAluno(String RA, String curso, String username, String password, String nome, String doc, Data data_nasc)
        computacao.addAluno("17242826", "Computação", "A","zwx098", "Glaucia Dias", "987654321", dataAluno);
        computacao.AddAluno(aluno_1);
        computacao.AddAluno(aluno_2);
        computacao.AddAluno(aluno_3);
        computacao.AddAluno(aluno_4);
        computacao.AddAluno(aluno_5);
        computacao.AddAluno(aluno_6);

        computacao.AddProfessor(professor_2);
        System.out.println("Tentando adicionar outro professor");
        computacao.AddProfessor(Professor_comp);

        System.out.println("\n~============+ ALTERANDO SITUAÇÃO DO ALUNO +============~\n");
        System.out.println("\nAntes de editar situação" + aluno_1+"\n");
        aluno_1.Editar("A");
        System.out.println("\nDepois de editar situação: "+ aluno_1 +"\n");
        System.out.println("------------------------------------");
        System.out.println("\nAntes de editar situação" + aluno_2+"\n");
        aluno_2.Editar("D");
        System.out.println("\nDepois de editar situação: "+ aluno_2 +"\n");
        System.out.println("------------------------------------");
        System.out.println("\nAntes de editar situação" + aluno_3+"\n");
        aluno_3.Editar("D");
        System.out.println("\nDepois de editar situação: "+ aluno_3 +"\n");
        System.out.println("------------------------------------");

        System.out.println("\n~============+ LOGIN DO PROFESSOR +============~\n");
        System.out.println(professor_2);
        Professor_comp.login("ÇZAçaz");
        
        System.out.println("\n~============+ LOGIN DO ALUNO +============~\n");
        System.out.println(aluno_1);
        aluno_1.login("asdzxc");

        System.out.println("\n~============+ LISTA DE ALUNOS +============~\n");
        computacao.Assinaturas();
        
    }
}
