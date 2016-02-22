package Orders;

/**
 * Created by Dima on 2/22/16.
 */
public class OrderItem {
    private String objectID;
    private String orderNum;
    private String make;
    private String year;
    private String odometer;
    private String vin;
    private String specialInstr;
    private String color;
    private Boolean isInfoFilled;
//    private PFFile detailForm;


    public OrderItem() {
        this.objectID = "";
        this.orderNum = "";
        this.make = "";
        this.year = "";
        this.odometer = "";
        this.vin = "";
        this.specialInstr = "";
        this.color = "";
        this.isInfoFilled = false;
    }

    public OrderItem(String objectID, String orderNum, String make, String year, String odometer,
                     String vin, String specialInstr, String color, Boolean isInfoFilled) {
        this.objectID = objectID;
        this.orderNum = orderNum;
        this.make = make;
        this.year = year;
        this.odometer = odometer;
        this.vin = vin;
        this.specialInstr = specialInstr;
        this.color = color;
        this.isInfoFilled = isInfoFilled;
    }
}
