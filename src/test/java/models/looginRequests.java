package models;

public class looginRequests {

  
    private String username;
    private String password;

    public looginRequests( String username, String password) {
        this.username = username;
        this.password = password;
    }



    public String getUsername() {
        return username;
    }

    // Setter
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter
    public String getPassword() {
        return password;
    }

    // Setter
    public void setPassword(String password) {
        this.password = password;
    }
}