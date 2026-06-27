
public class Professor extends Person {

    private String subject;
    private int yearsOfExperience;

    public Professor(String name, int age, String subject, int yearsOfExperience) {
        super(name, age);

        //checking subject 
        if(subject ==null || subject.isBlank()){ throw new IllegalArgumentException("Subject cannot be null or blank");}
        this.subject = subject;
        if (yearsOfExperience < 0) {
            throw new IllegalArgumentException("Year of experience cannot be negative ");
        } else {
            this.yearsOfExperience = yearsOfExperience;
        }
    }

    public boolean isSeniorProfessor() {
        return yearsOfExperience >= 10;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject : " + this.subject);
        System.out.println("Years of experience : " + yearsOfExperience);
    }
}
