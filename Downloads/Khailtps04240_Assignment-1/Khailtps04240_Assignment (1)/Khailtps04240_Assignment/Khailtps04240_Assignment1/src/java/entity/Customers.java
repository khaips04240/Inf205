package entity;
// Generated Oct 15, 2016 10:17:18 AM by Hibernate Tools 4.3.1



/**
 * Customers generated by hbm2java
 */
public class Customers  implements java.io.Serializable {


     private String username;
     private String password;
     private String hoten;
     private Boolean gioitinh;
     private String email;
     private Boolean role;

    public Customers() {
    }

	
    public Customers(String username, String password, String hoten, String email) {
        this.username = username;
        this.password = password;
        this.hoten = hoten;
        this.email = email;
    }
    public Customers(String username, String password, String hoten, Boolean gioitinh, String email, Boolean role) {
       this.username = username;
       this.password = password;
       this.hoten = hoten;
       this.gioitinh = gioitinh;
       this.email = email;
       this.role = role;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getHoten() {
        return this.hoten;
    }
    
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public Boolean getGioitinh() {
        return this.gioitinh;
    }
    
    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Boolean getRole() {
        return this.role;
    }
    
    public void setRole(Boolean role) {
        this.role = role;
    }




}


