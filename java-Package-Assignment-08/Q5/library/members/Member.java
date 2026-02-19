package library.members;

public class Member {
    private int memberId;
    private String name;
    private String email;

    public Member(int memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
    }

    public int getMemberId()  { return memberId; }
    public String getName()   { return name; }
    public String getEmail()  { return email; }

    public void displayDetails() {
        System.out.println("Member ID : " + memberId);
        System.out.println("Name      : " + name);
        System.out.println("Email     : " + email);
    }
}
