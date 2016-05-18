package models.forms;

import models.Guest;
import play.data.validation.Constraints;

import java.util.Date;

/**
 * Created by Sharukh on 5/18/16.
 */
public class ReservationForm {

    @Constraints.Required
    public Guest guest;

    @Constraints.Required
    public Date check_in;

    @Constraints.Required
    public Date check_out;

    @Constraints.Required
    public String room_type;

    @Constraints.Required
    public String type_of_stay;

    @Constraints.Required
    public float amount_paid;

}
