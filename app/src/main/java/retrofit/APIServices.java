package retrofit;

/**
 * Created by Iron_Man on 24/06/17.
 */

import com.google.gson.JsonObject;

import models.LocationModel;
import models.QRModel;
import models.User;
import models.UserModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIServices {

    @POST("/api/location/create/")
    Call<LocationModel> savePost(@Body LocationModel locationModel);

    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("/account/test/")
    Call<User> createNewUser(@Body User user);

    @GET("/api/accounts/drivers/{license_num}")
    Call<QRModel> getDriverDetails(@Path("license_num") String license_num);

    @Headers("Content-Type: application/json")
    @POST("/api-token-auth/")
    Call<JsonObject> getToken(@Body JsonObject loginModel);

    @GET("/api/accounts/users/{username}")
    Call<UserModel> getUserDetails(@Path("username") String username);
}