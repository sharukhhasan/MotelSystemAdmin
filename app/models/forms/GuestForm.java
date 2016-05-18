package models.forms;

import play.data.validation.Constraints;

import java.util.Date;

/**
 * Created by Sharukh on 5/18/16.
 */
public class GuestForm {

    @Constraints.Required
    public String first_name;

    @Constraints.Required
    public String last_name;

    @Constraints.Required
    public String gender;

    @Constraints.Required
    public Date birthdate;

}
