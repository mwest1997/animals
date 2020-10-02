package edu.cnm.deepdive.animals.service;

import edu.cnm.deepdive.animals.model.Animal;
import edu.cnm.deepdive.animals.model.ApiKey;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AnimalService {

  @GET("getKey")
  Call<ApiKey> getApiKey();

  @FormUrlEncoded
  @POST("getAnimals")
  Call<List<Animal>> getAnimals(@Field("key") String key);

}
