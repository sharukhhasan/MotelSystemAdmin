package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Sharukh on 5/18/16.
 */
@Entity
@Table(name = "supplies")
public class Supply extends Model {

    @Id
    @GeneratedValue
    public Long id;

    public String supply_name;

    public int supply_quantity;

    public int supply_price;

    public boolean supply_restock;
}
