package com.example.seniorproject;
/*
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.List;
import java.util.Objects;

import pub.dev.*;


public class LoginActivity extends AppCompatActivity implements EasyPermissions.PermissionCallbacks {
    private static final int RC_CALL_PHONE = 101;
    private ActivityLoginBinding binding;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        handleClickListeners();
        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser() != null && firebaseAuth.getCurrentUser().getEmail() != null) {
            Toast.makeText(this, "Welcome back! " + firebaseAuth.getCurrentUser().getEmail(), Toast.LENGTH_LONG).show();
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }

    }

    private void handleClickListeners() {
        binding.btnStop.setOnClickListener(view -> handlePermissionAndCall());
        binding.btnLogin.setOnClickListener(view -> handleLogin());
        binding.btnSignup.setOnClickListener(view -> startActivity(new Intent(LoginActivity.this, SignUpActivity.class)));
    }

    private void handleLogin() {
        binding.evUserName.setError(null);
        binding.evPassword.setError(null);
        String userName = Objects.requireNonNull(binding.evUserName.getText()).toString().trim();
        String password = Objects.requireNonNull(binding.evPassword.getText()).toString().trim();
        if(userName.length() == 0) {
            binding.evUserName.setError("Please enter username");
        } else if(password.length() == 0) {
            binding.evPassword.setError("Please enter password");
        } else {
            firebaseAuth.signInWithEmailAndPassword(binding.evUserName.getText().toString(), binding.evPassword.getText().toString())
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()) {
                                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                                finish();
                            } else {
                                Toast.makeText(LoginActivity.this, "Incorrect username or password.", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });


        }
    }

    private void handlePermissionAndCall() {
        String[] perms = {Manifest.permission.CALL_PHONE};
        if (EasyPermissions.hasPermissions(this, perms)) {
            callEmergency();
        } else {
            EasyPermissions.requestPermissions(this, getString(R.string.please_provide_call_permission),
                    RC_CALL_PHONE, perms);
        }

    }

    @AfterPermissionGranted(RC_CALL_PHONE)
    private void callEmergency() {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+911"));
        startActivity(intent);
    }

    @Override
    public void onPermissionsGranted(int requestCode, @NonNull List<String> perms) {
        callEmergency();
    }

    @Override
    public void onPermissionsDenied(int requestCode, @NonNull List<String> perms) {
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            new AppSettingsDialog.Builder(this).build().show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }
}
*/