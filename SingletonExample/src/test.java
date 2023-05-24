public class test {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("George");
        System.out.println(a1);
        ProfessorAngelo professorAngelo = ProfessorAngelo.getInstance();
        System.out.println(professorAngelo);
        Aluno a2 = new Aluno("Gabriel");
        System.out.println(a2);
        ProfessorAngelo professorAngelo1 = ProfessorAngelo.getInstance();
        System.out.println(professorAngelo1);
        Aluno a3 = new Aluno("Wagner");
        System.out.println(a3);
        ProfessorAngelo professorAngelo2 = ProfessorAngelo.getInstance();
        System.out.println(professorAngelo2);

    }
}