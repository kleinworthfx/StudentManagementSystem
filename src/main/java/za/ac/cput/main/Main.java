package za.ac.cput.main;

import za.ac.cput.domain.*;

public class Main {

    public static void main(String[] args) {

        Student undergrad = new UndergraduateStudent.Builder("U1001", "Paul Mogale")
                .email("paul@gmail.com")
                .department("ICT")
                .creditHours(20)
                .scholarshipAmount(5000)
                .build();

        Student grad = new GraduateStudent.Builder("G2001", "John Smith")
                .email("john@gmail.com")
                .department("Computer Science")
                .researchAssistant(true)
                .stipend(8000)
                .build();

        undergrad.displayStudentDetails();
        grad.displayStudentDetails();
    }
}
