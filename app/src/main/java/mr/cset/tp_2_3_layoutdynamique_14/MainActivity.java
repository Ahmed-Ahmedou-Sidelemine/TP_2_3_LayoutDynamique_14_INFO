package mr.cset.tp_2_3_layoutdynamique_14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout LinearLayout_1;
    ScrollView ScrollView_1;
 Integer   idScrollWiew;
    String txtEditTextview;
    Integer    idButton;
    Button      btnAjouer;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout_1 = findViewById(R.id.linearLayout_1);
        //ScrollView_1 = findViewById(R.id.scrollView_1);
        AjouterEditText();
        AjouterBTN();
       // AjouterScrollview();

    btnAjouer.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {


          if (v.getId() == idButton) {

              LinearLayout layout_ajouter = new LinearLayout(this);
       //.addView(layout_ajouter);
       //.setBackgroundColor(0xFFCFDBEC);
               // TextView txt=new TextView(this);
              //  txt.setText("Bienvenue "+ txtEditTextview.getText());

                Toast.makeText(MainActivity.this, "Champ Obligatoire", Toast.LENGTH_SHORT).show();
           }
          //  else{
        AjouterScrollview();
           //     Toast.makeText(MainActivity.this, "vienvennu", Toast.LENGTH_SHORT).show();

           // }

    }





    private void AjouterBTN() {
        LinearLayout button_Layout = new LinearLayout(this);
        LinearLayout.LayoutParams params_btn_layout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        button_Layout.setLayoutParams(params_btn_layout);
        //button_Layout.setOrientation(LinearLayout.VERTICAL);
       Button btn_1 = new Button(this);
        btnAjouer=btn_1;
       idButton=btn_1.getId();
        btn_1.setText("Ajouter");
        button_Layout.addView(btn_1);
        LinearLayout_1.addView(button_Layout);
        btn_1.setTextColor(Color.BLACK);

        AjouterButtonAttributes(btn_1);
    }
    private void AjouterButtonAttributes(Button btn) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        params.setMargins(convertirDpToPixel(16),
                convertirDpToPixel(16),
                0, 0
        );

        btn.setLayoutParams(params);
    }

    private void AjouterEditText() {
        LinearLayout editText_Layout = new LinearLayout(this);
        //editText_Layout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params_editText_layout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        editText_Layout.setLayoutParams(params_editText_layout);
        LinearLayout_1.addView(editText_Layout);
        EditText editText_1 = new EditText(this);
 txtEditTextview = editText_1.getText().toString();
        editText_Layout.addView(editText_1);
        AjouterEditTextAttributes(editText_1);
        editText_1.setHint("Saisir un Nom ");
    }
    public void AjouterScrollview() {

       LinearLayout scrollView_Layout = new LinearLayout(this);
        LinearLayout_1.addView(scrollView_Layout);

        //editText_Layout.setOrientation(LinearLayout.VERTICAL);
       LinearLayout.LayoutParams params_scrollView_Layout = new LinearLayout.LayoutParams(
              LinearLayout.LayoutParams.MATCH_PARENT,
               LinearLayout.LayoutParams.WRAP_CONTENT);
      scrollView_Layout.setLayoutParams(params_scrollView_Layout);
      ScrollView scrollView = new ScrollView(this);
       scrollView.setBackgroundColor(Color.RED);

        //

        scrollView_Layout.addView(scrollView);

        AjouterScrollviewAttributes(scrollView);

        //
        idScrollWiew=scrollView.getId();

        AjouterTextView(scrollView);




    }
    private void AjouterTextView(ScrollView scrollView){
        LinearLayout editText_Layout = new LinearLayout(this);

        if (idScrollWiew == scrollView.getId()) {
            TextView txt = new TextView(this);

            editText_Layout.addView(txt);
            scrollView.addView(editText_Layout);
           AjouterTextviewAttributes(txt);

            txt.setText("Bienvenue");

        }

    }


    private void AjouterScrollviewAttributes(ScrollView textView) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        params.setMargins(convertirDpToPixel(16),
                convertirDpToPixel(16),
                convertirDpToPixel(16),
                0
        );

        textView.setLayoutParams(params);
    }

    private void AjouterEditTextAttributes(EditText editText) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        params.setMargins(convertirDpToPixel(16),
                convertirDpToPixel(16),
                convertirDpToPixel(16),
                0
        );

        editText.setLayoutParams(params);
    }
//


    private void AjouterTextviewAttributes(TextView textView) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        params.setMargins(convertirDpToPixel(16),
                convertirDpToPixel(16),
                convertirDpToPixel(16),
                0
        );

        textView.setLayoutParams(params);
    }
    //


    private int convertirDpToPixel(float dp) {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float px = dp * (metrics.densityDpi / 160f);
        return Math.round(px);
    }



}