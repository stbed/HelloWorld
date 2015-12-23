package com.example.helloworld;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends Activity {
  /** Called when the activity is first created. */
 Button btnShow;
 Button btnClear;
 EditText edtInput;
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
     
    btnShow=(Button)findViewById(R.id.btnShow);//�ؼ�������
    btnClear=(Button)findViewById(R.id.btnClear);//�ؼ�������
    edtInput=(EditText)findViewById(R.id.editInput);//�ؼ�������
    btnShow.setOnClickListener(new ClickListener());//ʹ�õ���¼�
    btnClear.setOnClickListener(new ClickListener());//ʹ�õ���¼�
  }
   
  class ClickListener implements OnClickListener
  {
   public void onClick(View v)
   {
   if(v==btnShow)
   {
    new AlertDialog.Builder(MainActivity.this)
    .setIcon(android.R.drawable.ic_dialog_alert)
    .setTitle("Information")
    .setMessage(edtInput.getText())
    .show(); 
   }
   else if(v==btnClear)
   {
    edtInput.setText("HelloAndroid");
   }
   }
  }
}
