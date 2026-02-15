package za.ac.cput.domain;

public class GraduateStudent extends Student {

    private boolean researchAssistant;
    private double stipend;

    private GraduateStudent(Builder builder) {
        super(builder.studentId, builder.name, builder.email, builder.department);
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public double calculateTuition() {
        double baseTuition = 20000;
        return researchAssistant ? baseTuition - stipend : baseTuition;
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Research Assistant: " + researchAssistant);
        System.out.println("Stipend: R" + stipend);
        System.out.println("---------------------------");
    }

    public static class Builder {
        private String studentId;
        private String name;
        private String email;
        private String department;

        private boolean researchAssistant;
        private double stipend;

        public Builder(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder researchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public Builder stipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }
}
