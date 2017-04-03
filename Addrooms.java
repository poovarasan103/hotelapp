package com.example.welcome.chapp;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Addrooms extends AppCompatActivity {

    Button customer;
    private EditText t, r, nr,nb, des1;
    private static int IMG_RESULT = 1;
    String ImageDecode;
    ImageView imageViewLoad,couponimg;
    TextView LoadImage,couponname,coupondis,coupondes, emailcouopn;
    Intent intent;
    String[] FILE;
    Button register;
    EditText item,discount,des;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addrooms);

        imageViewLoad = (ImageView) findViewById(R.id.imageView1);
        LoadImage = (TextView) findViewById(R.id.textView3);
        LoadImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                intent = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(intent, IMG_RESULT);

            }
        });


        t = (EditText) findViewById(R.id.editText);
        r = (EditText) findViewById(R.id.editText3);
        nr = (EditText) findViewById(R.id.editText8);
        nb = (EditText) findViewById(R.id.editText7);
        des1 = (EditText) findViewById(R.id.editText1);
        customer=(Button)findViewById(R.id.button5);
        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t.getText().toString().length() == 0) {
                    t.setError("Please Enter the Room Type");
                } else if (r.getText().toString().length() == 0) {
                    r.setError("Please Enter the Enter Room rate");
                } else if (nr.getText().toString().length() == 0) {
                    nr.setError("Please  Enter the  Room Number");
                } else if (nb.getText().toString().length() == 0) {
                    nb.setError("Please Enter the Enter Room Volume");
                } else if (des1.getText().toString().length() == 0) {
                    des1.setError("Please Enter the Room Description");
                }  else {
                    Intent main = new Intent(Addrooms.this, Admindashboard.class);
                    startActivity(main);
                }
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        try {

            if (requestCode == IMG_RESULT && resultCode == RESULT_OK
                    && null != data) {


                Uri URI = data.getData();
                String[] FILE = { MediaStore.Images.Media.DATA };


                Cursor cursor = getContentResolver().query(URI,
                        FILE, null, null, null);

                cursor.moveToFirst();

                int columnIndex = cursor.getColumnIndex(FILE[0]);
                ImageDecode = cursor.getString(columnIndex);
                cursor.close();

                imageViewLoad.setImageBitmap(BitmapFactory
                        .decodeFile(ImageDecode));

            }
        } catch (Exception e) {
            Toast.makeText(this, "Please try again", Toast.LENGTH_LONG)
                    .show();
        }

    }

}
