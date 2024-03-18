package com.example.listausjarjestelma;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddUserActivity extends AppCompatActivity {
    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private RadioButton seButton;
    private RadioButton imButton;
    private RadioButton ceButton;
    private RadioButton eeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_user);
        firstName = findViewById(R.id.editFirstName);
        lastName = findViewById(R.id.editLastName);
        email = findViewById(R.id.editEmail);
        seButton = findViewById(R.id.seRadioButton);
        imButton = findViewById(R.id.imRadioButton);
        ceButton = findViewById(R.id.ceRadioButton);
        eeButton = findViewById(R.id.eeRadioButton);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void addUser(View view){
        RadioGroup radioDegreeProgram = findViewById(R.id.radioDegreeProgram);
        String name = String.valueOf(firstName.getText());
        String surname = String.valueOf(lastName.getText());
        String mail = String.valueOf(email.getText());
        if (radioDegreeProgram.getCheckedRadioButtonId() == R.id.seRadioButton){
            String program = String.valueOf(seButton.getText());
            User user = new User(name,surname,mail,program);
            UserStorage.getInstance().addUser(user);
        }
        else if (radioDegreeProgram.getCheckedRadioButtonId() == R.id.imRadioButton){
            String program = String.valueOf(imButton.getText());
            User user = new User(name,surname,mail,program);
            UserStorage.getInstance().addUser(user);
        }
        else if (radioDegreeProgram.getCheckedRadioButtonId() == R.id.ceRadioButton){
            String program = String.valueOf(ceButton.getText());
            User user = new User(name,surname,mail,program);
            UserStorage.getInstance().addUser(user);
        }
        else if (radioDegreeProgram.getCheckedRadioButtonId() == R.id.eeRadioButton){
            String program = String.valueOf(eeButton.getText());
            User user = new User(name,surname,mail,program);
            UserStorage.getInstance().addUser(user);
        }
    }
}