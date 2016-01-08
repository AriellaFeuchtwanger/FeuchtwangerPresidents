package feuchtwanger.presidents;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by student1 on 1/7/2016.
 */
public interface PresidentsService {
    @GET("/hitch17/sample-data/blob/master/presidents.json")
    Call<List<Presidents>> listPresidents();
}
