package models.forms;

import play.data.validation.Constraints;

/**
 * Created by Sharukh on 5/18/16.
 */
public class SupplyForm {

    @Constraints.Required
    public String supply_name;

    @Constraints.Required
    public int supply_quantity;

    @Constraints.Required
    public int supply_price;

    @Constraints.Required
    public boolean supply_restock;
}
