public class ProfessorAngelo {

    private static ProfessorAngelo uniqueProfessor;

    private ProfessorAngelo() {
    }

    public static synchronized ProfessorAngelo getInstance(){
        if(uniqueProfessor == null){
            uniqueProfessor = new ProfessorAngelo();
        }
        return uniqueProfessor;
    }
}