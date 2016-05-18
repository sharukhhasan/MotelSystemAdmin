package models.financemodel;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Sharukh on 5/18/16.
 */
@Entity
public class Month extends Model {

    @Id
    public String month_value;

    public List<List<Day>> weeks_of_month;

    public float monthly_revenue;

    public int monthly_rooms;

    public int monthly_supply_orders;

    public float monthly_revenue_difference;
}
