package com.example.bakalaura_darbs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    private LoginButton login;
    private ImageView profile;
    private TextView info;

    CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);

        login = findViewById(R.id.fclogin);
        profile = findViewById(R.id.profile);
        info = findViewById(R.id.info);

        CallbackManager callbackManager = CallbackManager.Factory.create();

        login.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                info.setText("user ID : "+ loginResult.getAccessToken().getUserId());
                String imageURL = "https://graph.facebook.com/" + loginResult.getAccessToken().getUserId() + "/picture?return_ssl_resources=1";
                Picasso.get().load(imageURL).into(profile);
            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(@NonNull FacebookException e) {

            }
        });

        /*final EditText etUsername = (EditText) findViewById(R.id.username);
        final EditText etPassword = (EditText) findViewById(R.id.password);
        final Button bLogin = (Button) findViewById(R.id.bLogin);

        bLogin.setOnClickListener(v -> {
            final String username = etUsername.getText().toString();
            final String password = etPassword.getText().toString();

            // Response received from the server
            Response.Listener<String> responseListener = response -> {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    boolean success = jsonResponse.getBoolean("success");

                    if (success) {
                        String name = jsonResponse.getString("name");
                        int age = jsonResponse.getInt("age");

                        Intent intent = new Intent(LoginActivity.this, Galvena_lapa.class);
                        intent.putExtra("name", name);
                        intent.putExtra("age", age);
                        intent.putExtra("username", username);
                        LoginActivity.this.startActivity(intent);
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                        builder.setMessage("Login Failed")
                                .setNegativeButton("Retry", null)
                                .create()
                                .show();
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            };

            LoginRequest loginRequest = new LoginRequest(username, password, responseListener);
            RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
            queue.add(loginRequest);
        });

        Button StartButton = (Button) findViewById(R.id.bRegister);

        StartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });*/

        Button secactivity = (Button) findViewById(R.id.bLogin);

        secactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, Galvena_lapa.class));
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
