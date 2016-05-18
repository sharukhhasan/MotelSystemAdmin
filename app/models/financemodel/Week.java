package models.financemodel;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**
 * Created by Sharukh on 5/18/16.
 */
@Entity
public class Week extends Model {

    @Id
    public Date week_date;

    public List<Day> days_of_week;

    public float weekly_of_revenue;

    public int weekly_rooms;

    public int weekly_supply_orders;

    public float weekly_revenue_difference;
}
