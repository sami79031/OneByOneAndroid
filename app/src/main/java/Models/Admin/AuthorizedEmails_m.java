package Models.Admin;

/**
 * Created by Dima on 2/22/16.
 */
public class AuthorizedEmails_m {
    private String objectID;
    private String email;
    private boolean admin;
    private boolean enabled;

    public AuthorizedEmails_m() {
        objectID = "";
        email = "";
        admin = false;
        enabled = false;
    }

    public AuthorizedEmails_m(String objectID, boolean enabled, String email, boolean admin) {
        this.objectID = objectID;
        this.enabled = enabled;
        this.email = email;
        this.admin = admin;
    }
}
