public class Person {
    private String firstName;
    private String lastName;
    private int meetings;

    public Person(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public void meet(Person person2) {
        System.out.println("Hello, my name is " + firstName + ".");
        System.out.println("Hi, my name is " + person2.getFirstName() + ".");
        meetings++;
        person2.meetings = person2.getMeetings() + 1;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMeetings() {
        return meetings;
    }
}
