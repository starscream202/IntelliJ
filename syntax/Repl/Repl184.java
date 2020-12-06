package Repl;

public class Repl184 {
    private String firstname;
    private String lastname;
    private String birthmonth;
    private String birthday;
    private String birthyear;
    private String ssn;

    public Repl184(String firstname, String lastname, String birthmonth, String birthday, String birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(String birthmonth) {
        this.birthmonth = birthmonth;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(String birthyear) {
        this.birthyear = birthyear;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public static void main(String[] args) {
        Repl184 person=new Repl184("John","Doe","10/25/1900","fuck","fuck","123-45-6789");
        person.getFirstname();
        person.getLastname();
        person.getBirthmonth();
        person.getBirthday();
        person.getSsn();
        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());
        System.out.println(person.getBirthmonth());
        System.out.println(person.getSsn());
    }
}
