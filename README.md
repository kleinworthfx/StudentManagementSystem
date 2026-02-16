SOLID Principles Applied

1. Single Responsibility Principle (SRP)

Each class has one responsibility:

Student → defines common student behavior

UndergraduateStudent → handles undergraduate logic

GraduateStudent → handles graduate logic

Each Builder → responsible only for object construction

2. Open/Closed Principle (OCP)

The system is open for extension but closed for modification.

If you add:

PartTimeStudent

You don’t modify Student.
You extend it.

3. Liskov Substitution Principle (LSP)

Objects of UndergraduateStudent and GraduateStudent can replace Student without breaking functionality.

Example:

Student s = new UndergraduateStudent.Builder(...).build();

Works perfectly.
