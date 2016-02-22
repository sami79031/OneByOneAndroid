package Orders;

/**
 * Created by Dima on 2/22/16.
 */
public class Orders_m {
    private String objectID;
    private String orderNum;
    private String datePlaced;
    private String customerOrderNum;
    private String shipsFromName;
    private String shipsFromAddr;
    private String shipsFromPhone;
    private String shipsFromEmail;
    private String shipsToName;
    private String shipsToAddr;
    private String shipsToPhone;
    private String shipsToEmail;
    private String codAmount;
    private String driverEmail;
    private String trailerNum;
    private String orderStatus;
    private boolean prepaidCB;
    private boolean collectCB;
    private boolean thirdpartyCB;
//    private PFFile dispatchForm;
//    private PFFile billOfLanding;
//    private PFFile billOfLandingPickUpSign;
      private OrderItem [] mItems;
    private String [] mOpenOrdersArray;

    public Orders_m() {
        this.objectID = "";
        this.orderNum = "";
        this.datePlaced = "";
        this.customerOrderNum = "";
        this.shipsFromName = "";
        this.shipsFromAddr = "";
        this.shipsFromPhone = "";
        this.shipsFromEmail = "";
        this.shipsToName = "";
        this.shipsToAddr = "";
        this.shipsToPhone = "";
        this.shipsToEmail = "";
        this.codAmount = "";
        this.driverEmail = "";
        this.trailerNum = "";
        this.orderStatus = "";
        this.prepaidCB = false;
        this.collectCB = false;
        this.thirdpartyCB = false;
    }
}
