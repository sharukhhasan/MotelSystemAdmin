package finance;

import java.util.List;

/**
 * Created by Sharukh on 5/18/16.
 */
public class CalculateRevenue {

    public float calculateRevenue(List<Float> revs)
    {
        float totalRevenue = 0;

        for(float indrev : revs)
        {
            totalRevenue += indrev;
        }

        return totalRevenue;
    }
}
