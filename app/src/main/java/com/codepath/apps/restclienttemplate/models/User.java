package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Stanley CAYO on 24/02/2018.
 */

public class User {

    public String name;
    public long uid;
    public String screenName;
    public String profilImage;

    public static User fromJSON(JSONObject json) throws JSONException{
        User user = new User();

        user.name = json.getString("name");
        user.uid = json.getLong("id");
        user.screenName = json.getString("screen_name");
        user.profilImage = json.getString("profil_image_url");

        return user;
    }
}
