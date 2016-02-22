package Models.Admin;

/**
 * Created by Dima on 2/22/16.
 */
public class Admin_m {

    private String name;
    private String email;
    private String phoneNum;

    public Admin_m() {
        name = "";
        email = "";
        phoneNum = "";

    }

    public Admin_m(String name, String email, String phoneNum) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }
}
