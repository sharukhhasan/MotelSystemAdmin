package models.financemodel;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Sharukh on 5/18/16.
 */
@Entity
public class Day extends Model {

    @Id
    public Date day_date;

    public int number_of_rooms;

    public float revenue_amount;

    public int supply_orders;
}
