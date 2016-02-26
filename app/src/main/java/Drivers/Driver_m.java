package Drivers;

import com.parse.ParseFile;

/**
 * Created by Dima on 2/24/16.
 */
public class Driver_m {

    private String email;
    private String name;
    private String phoneNum;
    private String address;
    private String objectID;
//    private PFFile driversLic;
//    private PFFile medicalRec;
    private ParseFile dLicRec;


    public Driver_m() {
        this.email = "";
        this.name = "";
        this.phoneNum = "";
        this.address = "";
        this.objectID = "";
    }

    public Driver_m(String email, String name, String phoneNum, String address, String objectID) {
        this.email = email;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.objectID = objectID;
    }
}
