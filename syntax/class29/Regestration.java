package class29;

public class Regestration {
    private String email;
    private String userName;
    private String pass;

    Regestration(String email,String userName, String pass){
        if(email.contains("yahoo")){
            this.email = email;

        }else if(userName.length()>6||userName.isEmpty()){
            this.userName=userName;

        }else if(pass.length()>6||pass.isEmpty()){
            this.pass=pass;
        }else{
            System.out.println("Invalid");
        }
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("yahoo")){
            this.email = email;

        }else{
            System.out.println("doesnt contain");
        }

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(userName.length()>6||userName.isEmpty()){
            this.userName=userName;
        }else{
            System.out.println("Invalid username");
        }
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        if(pass.length()>6||pass.isEmpty()){
            this.pass=pass;
        }else{
            System.out.println("Invalid password");
        }
    }
}
