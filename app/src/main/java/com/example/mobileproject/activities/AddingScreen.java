package com.example.mobileproject.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobileproject.R;
import com.example.mobileproject.room.entities.Ingredient;

import java.io.IOException;

public class AddingScreen extends AppCompatActivity {

    private ImageView DishImage;
    private static final int PICK_IMAGE=1;
    Uri imageUri;

    // declarations
    private EditText title_input, ingredients_input, description_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adding_screen);

        title_input = findViewById(R.id.title);
        ingredients_input  = findViewById(R.id.ingredients);
        description_input  = findViewById(R.id.description);


        DishImage = (ImageView) findViewById(R.id.AddPictureDish);
        DishImage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent gallery = new Intent();
                gallery.setType("image/*");
                gallery.setAction(Intent.ACTION_GET_CONTENT);

                startActivityForResult(Intent.createChooser(gallery, "Select Picture"), PICK_IMAGE);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int ResultCode, Intent data){
        super.onActivityResult(requestCode, ResultCode, data);

        if(requestCode == PICK_IMAGE && ResultCode == RESULT_OK){
            imageUri = data.getData();
            try{
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), imageUri);
                DishImage.setImageBitmap(bitmap);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }


    public void onSave(View view){
       // Ingredient ingredient = new Ingredient(title_input.getText().toString(), ingredients_input.getText().toString());
    }

    public void onCancel(View view){

    }

}