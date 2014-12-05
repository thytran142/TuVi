package com.example.tranthy.fortuneteller;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by tranthy on 2/12/14.
 */
public class Activity1 extends Activity {
    Intent myIntent;
    ListView listView;
    Button btn_submit;
    public String userName = "";
    public String gender = "";
    public String place="";
    public int year=0;
    public int month=0;
    public int day=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        listView = (ListView) findViewById(R.id.list);
        String[] values = {"", "", "", "", ""};
        ArrayAdapter listAdapter = new MyAdapter(this, R.layout.list_item, R.id.item_title, values, R.id.item_content);
        listView.setAdapter(listAdapter);
        //list view item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, final View view, int position, long id) {
                int itemPosition = position;
                if (itemPosition == 0) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(Activity1.this);
                    final View v = getLayoutInflater().inflate(R.layout.dialog_username, null);

                    builder.setView(v)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int id) {

                                    userName = ((EditText) v.findViewById(R.id.username)).getText().toString();
                                    //check if username is empty and save the value to username string
                                    TextView item_name = (TextView) view.findViewById(R.id.item_content);
                                    item_name.setText(userName);
                                }
                            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
                    builder.create();
                    builder.show();
                }//end itemposition1
                else if (itemPosition == 1) {
                   AlertDialog.Builder builder=new AlertDialog.Builder(Activity1.this);
                    final View v=getLayoutInflater().inflate(R.layout.dialog_gender,null);
                    builder.setView(v).setPositiveButton("OK",new DialogInterface.OnClickListener(){
                        @Override
                                public void onClick(DialogInterface dialog, int id){
                                RadioButton maleOption=(RadioButton)v.findViewById(R.id.male_radio);
                                RadioButton femaleOption=(RadioButton)v.findViewById(R.id.female_radio);
                            if(maleOption.isChecked()){
                                gender="Male";
                                TextView item_name = (TextView) view.findViewById(R.id.item_content);
                                item_name.setText(gender);
                            }else if(femaleOption.isChecked()){
                                gender="Female";
                                TextView item_name = (TextView) view.findViewById(R.id.item_content);
                                item_name.setText(gender);
                            }
                            else {gender="";
                            TextView item_name = (TextView) view.findViewById(R.id.item_content);
                            item_name.setText(gender);}

                        }
                    }).setNegativeButton(R.string.cancel,new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog, int id){
                            dialog.cancel();
                        }
                    });
                    builder.create();
                    builder.show();
                }//end position gender
                else if (itemPosition == 2) {
                   AlertDialog.Builder builder= new AlertDialog.Builder(Activity1.this);
                   final View v=getLayoutInflater().inflate(R.layout.dialog_place,null);
                    builder.setView(v).setPositiveButton("OK",new DialogInterface.OnClickListener(){
                        @Override
                    public void onClick(DialogInterface dialog, int id){
                            RadioButton hereOption=(RadioButton)v.findViewById(R.id.here_radio);
                            RadioButton thereOption=(RadioButton)v.findViewById(R.id.there_radio);
                            if(hereOption.isChecked()){
                                place="here";
                                TextView item_name = (TextView) view.findViewById(R.id.item_content);
                                item_name.setText(place);
                            }else if(thereOption.isChecked()){
                                place="there";
                                TextView item_name = (TextView) view.findViewById(R.id.item_content);
                                item_name.setText(place);
                            }else {place="";
                            TextView item_name = (TextView) view.findViewById(R.id.item_content);
                            item_name.setText(place);}
                        }
                    }).setNegativeButton(R.string.cancel,new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                      builder.create();
                    builder.show();
                } else if (itemPosition == 3) {
                  final Calendar c=Calendar.getInstance();
                   int mYear=c.get(Calendar.YEAR);
                    int mMonth=c.get(Calendar.MONTH);
                    int mDay=c.get(Calendar.DAY_OF_MONTH);
                    DatePickerDialog datePickerDialog=new DatePickerDialog(Activity1.this,new DatePickerDialog.OnDateSetListener(){
                        @Override
                    public void onDateSet(DatePicker v, int yearOfYear, int monthOfYear, int dayOfMonth){
                            year=yearOfYear;
                            month=monthOfYear+1;
                            day=dayOfMonth;
                            TextView item_name = (TextView) view.findViewById(R.id.item_content);
                            item_name.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+yearOfYear);
                        }
                    },mYear,mMonth,mDay);
                    datePickerDialog.show();
                } else {

                }
            }
        });
        //end listView

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private boolean isEmptyString(String str) {
        if (str.trim().length() > 0) return false;
        else return true;
    }

    public void goToActivity3(View view) {
        myIntent = new Intent(this, Activity3.class);
        if (isEmptyString(userName)) {
            Toast.makeText(this, R.string.empty_name_error, Toast.LENGTH_LONG).show();
        } else {
            if (isEmptyString(gender)) {
                Toast.makeText(this, R.string.empty_gender_error, Toast.LENGTH_LONG).show();
            } else {
                if(isEmptyString(place)){
                    Toast.makeText(this,R.string.empty_place,Toast.LENGTH_LONG).show();
                }else{
                    if(year==0 || month==0 || day==0){
                        Toast.makeText(this,R.string.empty_date_of_birth,Toast.LENGTH_LONG).show();
                    }else {
                        myIntent.putExtra("userName", userName);
                        myIntent.putExtra("gender", gender);
                        myIntent.putExtra("place",place);
                        myIntent.putExtra("year",year);
                        myIntent.putExtra("month",month);
                        myIntent.putExtra("day",day);
                        startActivity(myIntent);
                    }

                }

            }
        }
    }

}
