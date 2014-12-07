package com.example.tranthy.fortuneteller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tranthy on 2/12/14.
 */
public class Activity3 extends Activity {
    Intent myIntent;
    public String userName="";
    public String gender="";
    public String place="";
    public int year=0;
    public int day=0;
    public int month=0;
    public String time="";
    TextView nameText;
    TextView wasbornText;
    TextView menhText;
    TextView giosinhText;
    TextView amnuText;
    public String cungMenh="";
    public String cungPhuMau="";
    public String cungPhucDuc="";
    public String cungDienTrach="";
    public String cungQuanloc="";
    public String cungNoBoc="";
    public String cungThienDi="";
    public String cungTatAch="";
    public String cungTaiBach="";
    public String cungTuTuc="";
    public String cungTheThiep="";
    public String cungHuynhDe="";
    public String cungThan="";
    //THIS IS VARIABLE FOR THE LUNAR CALENDAR CONVERT
    private int gregorianYear;
    private int gregorianMonth;
    private int gregorianDate;
    private boolean isGregorianLeap;
    private int dayOfYear;
    private int dayOfWeek; // Sunday is the first day
    private int chineseYear;
    private int chineseMonth; // -n is a leap month
    private int chineseDate;
    private int sectionalTerm;
    private int principleTerm;
    private static char[] daysInGregorianMonth =
            {31,28,31,30,31,30,31,31,30,31,30,31};
    private static String[] monthNames =
            {"Jan","Feb","Mar","Apr","May","Jun",
                    "Jul","Aug","Sep","Oct","Nov","Dec"};
    private static String[] stemNames =
            {"Wood","Wood","Fire","Fire","Earth","Earth",
                    "Metal","Metal","Water","Water"};
    private static String[] branchNames =
            {"Rat","Ox","Tiger","Rabbit","Dragon","Snake",
                    "Horse","Sheep","Monkey","Rooster","Dog","Boar"};
    //Phan boi
    private static String[] cung={"Ty1","Suu","Dan","Mao","Thin","Ty5","Ngo","Mui","Than","Dau","Tuat","Hoi"};
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        //catch the userName, gender,place,year,month,day and time
        userName=getIntent().getStringExtra("userName");
        gender=getIntent().getStringExtra("gender");
        place=getIntent().getStringExtra("place");
        year=getIntent().getIntExtra("year", -1);
        month=getIntent().getIntExtra("month",-1);
        day=getIntent().getIntExtra("day",-1);
        time=getIntent().getStringExtra("time");
        //set the value in the textview
        nameText=(TextView)findViewById(R.id.userNameActivity3);
        nameText.setText(this.getString(R.string.fortune_teller_for)+userName);
        //set the was born
        wasbornText=(TextView)findViewById(R.id.wasBorn);
        //convert the date to lunar date
        setGregorian(year,month,day);
        computeChineseFields();
        //convert the year to lunar year
        String wasBorn=this.getString(R.string.you_was_born) + " " +chineseDate+", "+chineseMonth+" "+this.getString(R.string.in_year_of)+" "+this.getString(yearOfAnimal(year,month,day));
        wasbornText.setText(wasBorn);
        menhText=(TextView)findViewById(R.id.menhText);
        String menh=this.getString(R.string.year_belong_to)+this.getString(menh(yearOfAnimal(year,month,day)));
        menhText.setText(menh);
        giosinhText=(TextView)findViewById(R.id.giosinhText);
        giosinhText.setText(this.getString(gioSinh(time)));
        amnuText=(TextView)findViewById(R.id.amnuText);
        amnuText.setText(this.getString(amduong(yearOfAnimal(year,month,day))) + " "+this.getString(getGender(gender)));
        //set cung
        int temp=0;
        temp=counterClockwise(2,chineseMonth);
        temp=antiClockwise(temp,sogio(gioSinh(time)));
        cungMenh=cung[temp];
        anCungKhac(temp+1);
        TextView ancungkhac=(TextView)findViewById(R.id.ancungText);
        anCungThan(chineseMonth,sogio(gioSinh(time)));
        ancungkhac.setText("An cung menh o "+cungMenh+", an cung phu mau o "+cungPhuMau+", an cung Phuc duc o "+cungPhucDuc
                + ", an cung Dien Trach o "+cungDienTrach+ ", an cung Quan loc o "+ cungQuanloc+ ", an cung No boc o "+cungNoBoc
                +", an cung Thien di o "+cungThienDi+", an cung tat ach o "+cungTatAch+", an cung tai bach o "+cungTaiBach
                +", an cung Tu tuc o "+cungTuTuc+", an cung The thiep o "+cungTheThiep+". An cung than tai "+cungThan);

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
    public int getGender(String gender){
        if(gender.equalsIgnoreCase("Female"))
            return R.string.female;
        else
            return R.string.male;
    }
    private Date convertDate(int year, int month, int day){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String tempMonth;
        String tempDay;
        if(month<10) tempMonth="-0"+month;
        else tempMonth="-"+month;
        if(day<10) tempDay="-0"+day;
        else tempDay="-"+day;
        Date birthdate=new Date();
        String fullDate=year+tempMonth+tempDay;
        try {
            birthdate = sdf.parse(fullDate);

         }catch (ParseException ex){
            ex.printStackTrace();
        }
        return birthdate;
   }
    private boolean yearOfCanhThin(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=false;
        try {
            Date CanhThin_begin = sdf.parse("1940-02-08");
            Date CanhThin_end=sdf.parse("1941-01-26");
            Date year_begin=sdf.parse("2000-02-05");
            Date year_end=sdf.parse("2001-01-23");
            if(((birthday.after(CanhThin_begin)||birthday.equals(CanhThin_begin)) &&( birthday.before(CanhThin_end)||birthday.equals(CanhThin_end)))||((birthday.after(year_begin)||birthday.equals(year_begin))&&(birthday.before(year_end)||birthday.equals(year_end))))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfTanTy(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1941-01-27");
            Date year_end=sdf.parse("1942-02-14");
            Date year_begin1=sdf.parse("2001-01-24");
            Date year_end1=sdf.parse("2002-02-11");
            if(((birthday.after(year_begin)||birthday.equals(year_begin))
                    && (birthday.before(year_end)||birthday.equals(year_end)))
                    ||((birthday.after(year_begin1)||birthday.equals(year_begin1))
                    && (birthday.before(year_end1))||birthday.equals(year_end1)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfNhamNgo(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1942-02-15");
            Date year_end=sdf.parse("1943-02-04");
            Date year_begin1=sdf.parse("2002-02-12");
            Date year_end1=sdf.parse("2003-01-31");
            if(((birthday.after(year_begin)||birthday.equals(year_begin))
                    && (birthday.before(year_end)||birthday.equals(year_end)))
                    ||((birthday.after(year_begin1)||birthday.equals(year_begin1))
                    && (birthday.before(year_end1))||birthday.equals(year_end1)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfQuyMui(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1943-02-05");
            Date year_end=sdf.parse("1944-01-24");
            Date year_begin1=sdf.parse("2003-02-01");
            Date year_end1=sdf.parse("2004-01-21");
            if(((birthday.after(year_begin)||birthday.equals(year_begin))
                    && (birthday.before(year_end)||birthday.equals(year_end)))
                    ||((birthday.after(year_begin1)||birthday.equals(year_begin1))
                    && (birthday.before(year_end1))||birthday.equals(year_end1)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfGiapThan(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1944-01-25");
            Date year_end=sdf.parse("1945-02-12");
            Date year_begin1=sdf.parse("2004-01-22");
            Date year_end1=sdf.parse("2005-02-08");
            if(((birthday.after(year_begin)||birthday.equals(year_begin))
                    && (birthday.before(year_end)||birthday.equals(year_end)))
                    ||((birthday.after(year_begin1)||birthday.equals(year_begin1))
                    && (birthday.before(year_end1))||birthday.equals(year_end1)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfAtDau(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1945-02-13");
            Date year_end=sdf.parse("1946-02-01");
            Date year_begin1=sdf.parse("2005-02-09");
            Date year_end1=sdf.parse("2006-01-28");
            if(((birthday.after(year_begin)||birthday.equals(year_begin))
                    && (birthday.before(year_end)||birthday.equals(year_end)))
                    ||((birthday.after(year_begin1)||birthday.equals(year_begin1))
                    && (birthday.before(year_end1))||birthday.equals(year_end1)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfBinhTuat(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1946-02-02");
            Date year_end=sdf.parse("1947-01-21");
            Date year_begin1=sdf.parse("2006-01-29");
            Date year_end1=sdf.parse("2007-02-17");
            if(((birthday.after(year_begin)||birthday.equals(year_begin))
                    && (birthday.before(year_end)||birthday.equals(year_end)))
                    ||((birthday.after(year_begin1)||birthday.equals(year_begin1))
                    && (birthday.before(year_end1))||birthday.equals(year_end1)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfDinhHoi(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1947-01-22");
            Date year_end=sdf.parse("1948-02-09");
            Date year_begin1=sdf.parse("2007-02-18");
            Date year_end1=sdf.parse("2008-02-06");
            if(((birthday.after(year_begin)||birthday.equals(year_begin))
                    && (birthday.before(year_end)||birthday.equals(year_end)))
                    ||((birthday.after(year_begin1)||birthday.equals(year_begin1))
                    && (birthday.before(year_end1))||birthday.equals(year_end1)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfMauTy(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1948-02-10");
            Date year_end=sdf.parse("1949-01-28");
            Date year_begin1=sdf.parse("2008-02-07");
            Date year_end1=sdf.parse("2009-01-25");
            if(((birthday.after(year_begin)||birthday.equals(year_begin))
                    && (birthday.before(year_end)||birthday.equals(year_end)))
                    ||((birthday.after(year_begin1)||birthday.equals(year_begin1))
                    && (birthday.before(year_end1))||birthday.equals(year_end1)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfKySuu(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1949-01-29");
            Date year_end=sdf.parse("1950-02-16");
            Date year_begin1=sdf.parse("2009-01-26");
            Date year_end1=sdf.parse("2010-02-13");
            if(((birthday.after(year_begin)||birthday.equals(year_begin))
                    && (birthday.before(year_end)||birthday.equals(year_end)))
                    ||((birthday.after(year_begin1)||birthday.equals(year_begin1))
                    && (birthday.before(year_end1))||birthday.equals(year_end1)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfCanhDan(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1950-02-17");
            Date year_end=sdf.parse("1951-02-05");
            Date year_begin1=sdf.parse("2010-02-14");
            Date year_end1=sdf.parse("2011-02-02");
            if(((birthday.after(year_begin)||birthday.equals(year_begin))
                    && (birthday.before(year_end)||birthday.equals(year_end)))
                    ||((birthday.after(year_begin1)||birthday.equals(year_begin1))
                    && (birthday.before(year_end1))||birthday.equals(year_end1)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfTanMao(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1951-02-06");
            Date year_end=sdf.parse("1952-01-26");
            Date year_begin1=sdf.parse("2011-02-03");
            Date year_end1=sdf.parse("2012-01-22");
            if(((birthday.after(year_begin)||birthday.equals(year_begin))
                    && (birthday.before(year_end)||birthday.equals(year_end)))
                    ||((birthday.after(year_begin1)||birthday.equals(year_begin1))
                    && (birthday.before(year_end1))||birthday.equals(year_end1)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfNhamThin(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1952-01-27");
            Date year_end=sdf.parse("1953-02-13");
            Date year_begin1=sdf.parse("2012-01-23");
            Date year_end1=sdf.parse("2013-02-09");
            if(((birthday.after(year_begin)||birthday.equals(year_begin))
                    && (birthday.before(year_end)||birthday.equals(year_end)))
                    ||((birthday.after(year_begin1)||birthday.equals(year_begin1))
                    && (birthday.before(year_end1))||birthday.equals(year_end1)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfQuyTy(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1953-02-14");
            Date year_end=sdf.parse("1954-02-02");
            Date year_begin1=sdf.parse("2013-02-10");
            Date year_end1=sdf.parse("2014-01-30");
            if(((birthday.after(year_begin)||birthday.equals(year_begin))
                    && (birthday.before(year_end)||birthday.equals(year_end)))
                    ||((birthday.after(year_begin1)||birthday.equals(year_begin1))
                    && (birthday.before(year_end1))||birthday.equals(year_end1)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfGiapNgo(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1954-02-03");
            Date year_end=sdf.parse("1955-01-23");
             if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfAtMui(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1955-01-24");
            Date year_end=sdf.parse("1956-02-11");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfBinhThan(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1956-02-12");
            Date year_end=sdf.parse("1957-01-30");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfDinhDau(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1957-01-31");
            Date year_end=sdf.parse("1958-02-17");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfMauTuat(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1958-02-18");
            Date year_end=sdf.parse("1959-02-07");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfKyHoi(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1959-02-08");
            Date year_end=sdf.parse("1960-01-27");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfCanhTy(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1960-01-28");
            Date year_end=sdf.parse("1961-02-14");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfTanSuu(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1961-02-15");
            Date year_end=sdf.parse("1962-02-04");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfNhamDan(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1962-02-05");
            Date year_end=sdf.parse("1963-01-24");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfQuyMao(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1963-01-25");
            Date year_end=sdf.parse("1964-02-12");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfGiapThin(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1964-02-13");
            Date year_end=sdf.parse("1965-02-01");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfAtTy(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1965-02-02");
            Date year_end=sdf.parse("1966-01-20");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfBinhNgo(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1966-01-21");
            Date year_end=sdf.parse("1967-02-08");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfDinhMui(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1967-02-09");
            Date year_end=sdf.parse("1968-01-29");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfMauThan(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1968-01-30");
            Date year_end=sdf.parse("1969-02-16");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfKyDau(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1969-02-17");
            Date year_end=sdf.parse("1970-02-05");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfCanhTuat(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1970-02-06");
            Date year_end=sdf.parse("1971-01-26");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfTanHoi(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1971-01-27");
            Date year_end=sdf.parse("1972-02-14");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfNhamTy(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1972-02-15");
            Date year_end=sdf.parse("1973-02-02");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfQuySuu(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1973-02-03");
            Date year_end=sdf.parse("1974-01-22");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfGiapDan(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1974-01-23");
            Date year_end=sdf.parse("1975-02-10");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfAtMao(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1975-02-11");
            Date year_end=sdf.parse("1976-01-30");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfBinhThin(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1976-01-31");
            Date year_end=sdf.parse("1977-02-17");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfDinhTy(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1977-02-18");
            Date year_end=sdf.parse("1978-02-06");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfMauNgo(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1978-02-07");
            Date year_end=sdf.parse("1979-01-27");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfKyMui(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1979-01-28");
            Date year_end=sdf.parse("1980-02-15");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfCanhThan(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1980-02-16");
            Date year_end=sdf.parse("1981-02-04");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfTanDau(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1981-02-05");
            Date year_end=sdf.parse("1982-01-24");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfNhamTuat(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1982-01-25");
            Date year_end=sdf.parse("1983-02-12");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfQuyHoi(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1983-02-13");
            Date year_end=sdf.parse("1984-02-01");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))     result=true;

            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfGiapTy(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1984-02-02");
            Date year_end=sdf.parse("1985-02-19");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))     result=true;
             else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfAtSuu(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1985-02-20");
            Date year_end=sdf.parse("1986-02-08");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfBinhDan(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1986-02-09");
            Date year_end=sdf.parse("1987-01-28");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfDinhMao(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1987-01-29");
            Date year_end=sdf.parse("1988-02-16");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfMauThin(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1988-02-17");
            Date year_end=sdf.parse("1989-02-05");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfKyTy(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1989-02-06");
            Date year_end=sdf.parse("1990-01-26");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfCanhNgo(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1990-01-27");
            Date year_end=sdf.parse("1991-02-14");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfTanMui(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1991-02-15");
            Date year_end=sdf.parse("1992-02-03");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfNhamThan(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1992-02-04");
            Date year_end=sdf.parse("1993-01-22");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfQuyDau(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1993-01-23");
            Date year_end=sdf.parse("1994-02-09");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfGiapTuat(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1994-02-10");
            Date year_end=sdf.parse("1995-01-30");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfAtHoi(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1995-01-31");
            Date year_end=sdf.parse("1996-02-18");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfBinhTy(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1996-02-19");
            Date year_end=sdf.parse("1997-02-06");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfDinhSuu(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1997-02-07");
            Date year_end=sdf.parse("1998-01-27");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfMauDan(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1998-01-28");
            Date year_end=sdf.parse("1999-02-15");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private boolean yearOfKyMao(int year, int month, int day){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=true;
        try {
            Date year_begin = sdf.parse("1999-02-16");
            Date year_end=sdf.parse("2000-02-04");
            if((birthday.after(year_begin)||birthday.equals(year_begin)) && (birthday.before(year_end)||birthday.equals(year_end)))
                result=true;
            else result=false;
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return result;
    }
    private int test(int year,int month,int day){
        return R.string.hello_world;
    }
    private  int  yearOfAnimal(int year, int month, int day){
        if(yearOfCanhThin(year,month,day))
            return R.string.canhthin;//1
        else if(yearOfTanTy(year,month,day))
            return R.string.tanty;//2
        else if(yearOfNhamNgo(year,month,day))
            return R.string.nhamngo;//3
        else if(yearOfQuyMui(year,month,day))
            return R.string.quymui;//4
        else if(yearOfGiapThan(year,month,day))
            return R.string.giapthan;//5
        else if(yearOfAtDau(year,month,day))
            return R.string.atdau;//6
        else if(yearOfBinhTuat(year,month,day))
            return R.string.binhtuat;//7
        else if(yearOfDinhHoi(year,month,day))
            return R.string.dinhhoi;//8
        else if(yearOfMauTy(year,month,day))
            return R.string.mauty;//9
        else if(yearOfKySuu(year,month,day))
            return R.string.kysuu;//10
        else if(yearOfCanhDan(year,month,day))
            return R.string.canhdan;//11
        else if(yearOfTanMao(year,month,day))
            return R.string.tanmao;//12
        else if(yearOfNhamThin(year,month,day))
            return R.string.nhamthin;//13
        else if(yearOfQuyTy(year,month,day))
            return R.string.quyty;//14
        else if(yearOfGiapNgo(year,month,day))
            return R.string.giapngo;//15
        else if(yearOfAtMui(year,month,day))
            return R.string.atmui;//16
        else if(yearOfBinhThan(year,month,day))
            return R.string.binhthan;//17
        else if(yearOfDinhDau(year,month,day))
            return R.string.dinhdau;//18
        else if(yearOfMauTuat(year,month,day))
            return R.string.mautuat;//19
        else if(yearOfKyHoi(year,month,day))
            return R.string.kyhoi;//20
        else if(yearOfCanhTy(year,month,day))
            return R.string.canhty;//21
        else if(yearOfTanSuu(year,month,day))
            return R.string.tansuu;//22
        else if(yearOfNhamDan(year,month,day))
            return R.string.nhamdan;//23
        else if(yearOfQuyMao(year,month,day))
            return R.string.quymao;//24
        else if(yearOfGiapThin(year,month,day))
            return R.string.giapthin;//25
        else if(yearOfAtTy(year,month,day))
            return R.string.atty;//26
        else if(yearOfBinhNgo(year,month,day))
            return R.string.binhngo;//27
        else if(yearOfDinhMui(year,month,day))
            return R.string.dinhmui;//28
        else if(yearOfMauThan(year,month,day))
            return R.string.mauthan;//29
        else if(yearOfKyDau(year,month,day))
            return R.string.kydau;//30
        else if(yearOfCanhTuat(year,month,day))
            return R.string.canhtuat;//31
        else if(yearOfTanHoi(year,month,day))
            return R.string.tanhoi;//32
        else if(yearOfNhamTy(year,month,day))
            return R.string.nhamty;//33
        else if(yearOfQuySuu(year,month,day))
            return R.string.quysuu;//34
        else if(yearOfGiapDan(year,month,day))
            return R.string.giapdan;//35
        else if(yearOfAtMao(year,month,day))
            return R.string.atmao;//36
        else if(yearOfBinhThin(year,month,day))
            return R.string.binhthin;//37
        else if(yearOfDinhTy(year,month,day))
            return R.string.dinhty;//38
        else if(yearOfMauNgo(year,month,day))
            return R.string.maungo;//39
        else if(yearOfKyMui(year,month,day))
            return R.string.kymui;//40
        else if(yearOfCanhThan(year,month,day))
            return R.string.canhthan;//41
        else if(yearOfTanDau(year,month,day))
            return R.string.tandau;//42
        else if(yearOfNhamTuat(year,month,day))
            return R.string.nhamtuat;//43
        else if(yearOfQuyHoi(year,month,day))
            return R.string.quyhoi;//44
        else if(yearOfGiapTy(year,month,day))
            return R.string.giapty;//45
        else if(yearOfAtSuu(year,month,day))
            return R.string.atsuu;//46
        else if(yearOfBinhDan(year,month,day))
            return R.string.binhdan;//47
        else if(yearOfDinhMao(year,month,day))
            return R.string.dinhmao;//48
        else if(yearOfMauThin(year,month,day))
            return R.string.mauthin;//49
        else if(yearOfKyTy(year,month,day))
            return R.string.kyty;//50
        else if(yearOfCanhNgo(year,month,day))
            return R.string.canhngo;//51
        else if(yearOfTanMui(year,month,day))
            return R.string.tanmui;//52
        else if(yearOfNhamThan(year,month,day))
            return R.string.nhamthan;//53
        else if(yearOfQuyDau(year,month,day))
            return R.string.quydau;//54
        else if(yearOfGiapTuat(year,month,day))
            return R.string.giaptuat;//55
        else if(yearOfAtHoi(year,month,day))
            return R.string.athoi;//56
        else if(yearOfBinhTy(year,month,day))
            return R.string.binhty;//57
        else if(yearOfDinhSuu(year,month,day))
            return R.string.dinhsuu;//58
        else if(yearOfMauDan(year,month,day))
            return R.string.maudan;//59
        else if(yearOfKyMao(year,month,day))
            return R.string.kymao;//60
        else return 0;

    }
    /*********************HERE FUNCTION TO CONVERT LUNAR CALENDAR */
    public void setGregorian(int y, int m, int d) {
        gregorianYear = y;
        gregorianMonth = m;
        gregorianDate = d;
        isGregorianLeap = isGregorianLeapYear(y);
        dayOfYear = dayOfYear(y,m,d);
        dayOfWeek = dayOfWeek(y,m,d);
        chineseYear = 0;
        chineseMonth = 0;
        chineseDate = 0;
        sectionalTerm = 0;
        principleTerm = 0;
    }
    /*Methods supporting setGregorian function */
    public static boolean isGregorianLeapYear(int year) {
        boolean isLeap = false;
        if (year%4==0) isLeap = true;
        if (year%100==0) isLeap = false;
        if (year%400==0) isLeap = true;
        return isLeap;
    }
    public static int dayOfYear(int y, int m, int d) {
        int c = 0;
        for (int i=1; i<m; i++) { // Number of months passed
            c = c + daysInGregorianMonth(y,i);
        }
        c = c + d;
        return c;
    }
    public static int dayOfWeek(int y, int m, int d) {
        int w = 1; // 01-Jan-0001 is Monday, so base is Sunday
        y = (y-1)%400 + 1; // Gregorian calendar cycle is 400 years
        int ly = (y-1)/4; // Leap years passed
        ly = ly - (y-1)/100; // Adjustment
        ly = ly + (y-1)/400; // Adjustment
        int ry = y - 1 - ly; // Regular years passed
        w = w + ry; // Regular year has one extra week day
        w = w + 2*ly; // Leap year has two extra week days
        w = w + dayOfYear(y,m,d);
        w = (w-1)%7 + 1;
        return w;
    }
    public static int daysInGregorianMonth(int y, int m) {
        int d = daysInGregorianMonth[m-1];
        if (m==2 && isGregorianLeapYear(y)) d++; // Leap year adjustment
        return d;
    }
    /* End method support */
    private static int baseYear = 1901;
    private static int baseMonth = 1;
    private static int baseDate = 1;
    private static int baseIndex = 0;
    private static int baseChineseYear = 4598-1;
    private static int baseChineseMonth = 11;
    private static int baseChineseDate = 11;
    private static char[] chineseMonths = {
            //Chinese month map, 2 bytes per year, from 1900 to 2100, 402 bytes.
            //The first 4 bits represents the leap month of the year.
            //The rest 12 bits are flags indicate if the corresponding month
            //is a 29-day month. 2 bytes are stored in low-high order.
            0x00,0x04,0xad,0x08,0x5a,0x01,0xd5,0x54,0xb4,0x09,0x64,0x05,0x59,0x45,
            0x95,0x0a,0xa6,0x04,0x55,0x24,0xad,0x08,0x5a,0x62,0xda,0x04,0xb4,0x05,
            0xb4,0x55,0x52,0x0d,0x94,0x0a,0x4a,0x2a,0x56,0x02,0x6d,0x71,0x6d,0x01,
            0xda,0x02,0xd2,0x52,0xa9,0x05,0x49,0x0d,0x2a,0x45,0x2b,0x09,0x56,0x01,
            0xb5,0x20,0x6d,0x01,0x59,0x69,0xd4,0x0a,0xa8,0x05,0xa9,0x56,0xa5,0x04,
            0x2b,0x09,0x9e,0x38,0xb6,0x08,0xec,0x74,0x6c,0x05,0xd4,0x0a,0xe4,0x6a,
            0x52,0x05,0x95,0x0a,0x5a,0x42,0x5b,0x04,0xb6,0x04,0xb4,0x22,0x6a,0x05,
            0x52,0x75,0xc9,0x0a,0x52,0x05,0x35,0x55,0x4d,0x0a,0x5a,0x02,0x5d,0x31,
            0xb5,0x02,0x6a,0x8a,0x68,0x05,0xa9,0x0a,0x8a,0x6a,0x2a,0x05,0x2d,0x09,
            0xaa,0x48,0x5a,0x01,0xb5,0x09,0xb0,0x39,0x64,0x05,0x25,0x75,0x95,0x0a,
            0x96,0x04,0x4d,0x54,0xad,0x04,0xda,0x04,0xd4,0x44,0xb4,0x05,0x54,0x85,
            0x52,0x0d,0x92,0x0a,0x56,0x6a,0x56,0x02,0x6d,0x02,0x6a,0x41,0xda,0x02,
            0xb2,0xa1,0xa9,0x05,0x49,0x0d,0x0a,0x6d,0x2a,0x09,0x56,0x01,0xad,0x50,
            0x6d,0x01,0xd9,0x02,0xd1,0x3a,0xa8,0x05,0x29,0x85,0xa5,0x0c,0x2a,0x09,
            0x96,0x54,0xb6,0x08,0x6c,0x09,0x64,0x45,0xd4,0x0a,0xa4,0x05,0x51,0x25,
            0x95,0x0a,0x2a,0x72,0x5b,0x04,0xb6,0x04,0xac,0x52,0x6a,0x05,0xd2,0x0a,
            0xa2,0x4a,0x4a,0x05,0x55,0x94,0x2d,0x0a,0x5a,0x02,0x75,0x61,0xb5,0x02,
            0x6a,0x03,0x61,0x45,0xa9,0x0a,0x4a,0x05,0x25,0x25,0x2d,0x09,0x9a,0x68,
            0xda,0x08,0xb4,0x09,0xa8,0x59,0x54,0x03,0xa5,0x0a,0x91,0x3a,0x96,0x04,
            0xad,0xb0,0xad,0x04,0xda,0x04,0xf4,0x62,0xb4,0x05,0x54,0x0b,0x44,0x5d,
            0x52,0x0a,0x95,0x04,0x55,0x22,0x6d,0x02,0x5a,0x71,0xda,0x02,0xaa,0x05,
            0xb2,0x55,0x49,0x0b,0x4a,0x0a,0x2d,0x39,0x36,0x01,0x6d,0x80,0x6d,0x01,
            0xd9,0x02,0xe9,0x6a,0xa8,0x05,0x29,0x0b,0x9a,0x4c,0xaa,0x08,0xb6,0x08,
            0xb4,0x38,0x6c,0x09,0x54,0x75,0xd4,0x0a,0xa4,0x05,0x45,0x55,0x95,0x0a,
            0x9a,0x04,0x55,0x44,0xb5,0x04,0x6a,0x82,0x6a,0x05,0xd2,0x0a,0x92,0x6a,
            0x4a,0x05,0x55,0x0a,0x2a,0x4a,0x5a,0x02,0xb5,0x02,0xb2,0x31,0x69,0x03,
            0x31,0x73,0xa9,0x0a,0x4a,0x05,0x2d,0x55,0x2d,0x09,0x5a,0x01,0xd5,0x48,
            0xb4,0x09,0x68,0x89,0x54,0x0b,0xa4,0x0a,0xa5,0x6a,0x95,0x04,0xad,0x08,
            0x6a,0x44,0xda,0x04,0x74,0x05,0xb0,0x25,0x54,0x03
    };
    private static int[] bigLeapMonthYears = {
            // The leap months in the following years have 30 days
            6, 14, 19, 25, 33, 36, 38, 41, 44, 52,
            55, 79,117,136,147,150,155,158,185,193
    };
    /* COMPUTE CHINESE FIELDS */
    public int computeChineseFields() {
        // Gregorian year out of the computation range
        if (gregorianYear<1901 || gregorianYear>2100) return 1;
        int startYear = baseYear;
        int startMonth = baseMonth;
        int startDate = baseDate;
        chineseYear = baseChineseYear;
        chineseMonth = baseChineseMonth;
        chineseDate = baseChineseDate;
        // Switching to the second base to reduce the calculation process
        // Second base date: 01-Jan-2000, 4697/11/25 in Chinese calendar
        if (gregorianYear >= 2000) {
            startYear = baseYear + 99;
            startMonth = 1;
            startDate = 1;
            chineseYear = baseChineseYear + 99;
            chineseMonth = 11;
            chineseDate = 25;
        }
        // Calculating the number of days
        //    between the start date and the current date
        // The following algorithm only works
        //    for startMonth = 1 and startDate = 1
        int daysDiff = 0;
        for (int i=startYear; i<gregorianYear; i++) {
            daysDiff += 365;
            if (isGregorianLeapYear(i)) daysDiff += 1; // leap year
        }
        for (int i=startMonth; i<gregorianMonth; i++) {
            daysDiff += daysInGregorianMonth(gregorianYear,i);
        }
        daysDiff += gregorianDate - startDate;

        // Adding that number of days to the Chinese date
        // Then bring Chinese date into the correct range.
        //    one Chinese month at a time
        chineseDate += daysDiff;
        int lastDate = daysInChineseMonth(chineseYear, chineseMonth);
        int nextMonth = nextChineseMonth(chineseYear, chineseMonth);
        while (chineseDate>lastDate) {
            if (Math.abs(nextMonth)<Math.abs(chineseMonth)) chineseYear++;
            chineseMonth = nextMonth;
            chineseDate -= lastDate;
            lastDate = daysInChineseMonth(chineseYear, chineseMonth);
            nextMonth = nextChineseMonth(chineseYear, chineseMonth);
        }
        return 0;
    }
    public static int daysInChineseMonth(int y, int m) {
        // Regular month: m > 0
        // Leap month: m < 0
        int index = y - baseChineseYear + baseIndex;
        int v = 0;
        int l = 0;
        int d = 30; // normal month
        if (1<=m && m<=8) {
            v = chineseMonths[2*index];
            l = m - 1;
            if ( ((v>>l)&0x01)==1 ) d = 29;
        } else if (9<=m && m<=12) {
            v = chineseMonths[2*index+1];
            l = m - 9;
            if ( ((v>>l)&0x01)==1 ) d = 29;
        } else { // leap month
            v = chineseMonths[2*index+1];
            v = (v>>4)&0x0F;
            if (v!=Math.abs(m)) {
                d = 0; // wrong m specified
            } else {
                d = 29;
                for (int i=0; i<bigLeapMonthYears.length; i++) {
                    if (bigLeapMonthYears[i]==index) {
                        d = 30;
                        break;
                    }
                }
            }
        }
        return d;
    }
    public static int nextChineseMonth(int y, int m) {
        int n = Math.abs(m) + 1; // normal behavior
        if (m>0) {
            // need to find out if we are in a leap year or not
            int index = y - baseChineseYear + baseIndex;
            int v = chineseMonths[2*index+1];
            v = (v>>4)&0x0F;
            if (v==m) n = -m; // next month is a leap month
        }
        if (n==13) n = 1; //roll into next year
        return n;
    }

    //Menh
    public int menh(int d){
        if(d==R.string.giapty || d==R.string.atsuu || d==R.string.giapngo || d==R.string.atmui
        || d==R.string.nhamthan || d==R.string.quydau || d==R.string.nhamdan || d==R.string.quymao
        || d==R.string.canhthin || d==R.string.tanty || d==R.string.canhtuat || d==R.string.tanhoi)
         return R.string.kimmenh;
        else if (d==R.string.mauthin || d==R.string.kyty || d==R.string.mautuat || d==R.string.kyhoi
                || d== R.string.nhamngo || d==R.string.quymui || d==R.string.nhamty || d==R.string.quysuu
                || d== R.string.canhdan || d==R.string.tanmao || d==R.string.canhthan || d==R.string.tandau)
            return R.string.mocmenh;
        else if(d==R.string.binhty || d==R.string.dinhsuu || d==R.string.binhngo || d==R.string.dinhmui
                || d==R.string.giapthan || d==R.string.atdau || d==R.string.giapdan || d==R.string.atmao
                || d==R.string.nhamthin || d==R.string.quyty || d==R.string.nhamtuat || d==R.string.quyhoi)
            return R.string.thuymenh;
        else if(d==R.string.binhdan || d==R.string.dinhmao || d==R.string.binhthan || d==R.string.dinhdau
                || d==R.string.giaptuat || d==R.string.athoi || d==R.string.giapthin || d==R.string.atty
                || d==R.string.maungo || d==R.string.kymui || d==R.string.mauty || d==R.string.kysuu)
            return R.string.hoamenh;
        else if(d==R.string.canhngo || d==R.string.tanmui || d==R.string.canhty || d==R.string.tansuu
                || d==R.string.maudan || d==R.string.kymao || d==R.string.mauthan || d==R.string.kydau
                || d==R.string.binhtuat || d==R.string.dinhhoi || d==R.string.binhthin || d==R.string.dinhty)
            return R.string.thomenh;
        return 0;
    }
    public int gioSinh(String time){
        if(time.equalsIgnoreCase("mouse"))
            return R.string.gioty;
        else if(time.equalsIgnoreCase("buffalo"))
            return R.string.giosuu;
        else if(time.equalsIgnoreCase("tiger"))
            return R.string.giodan;
        else if(time.equalsIgnoreCase("cat"))
             return R.string.giomao;
        else if(time.equalsIgnoreCase("dragon"))
            return R.string.giothin;
        else if(time.equalsIgnoreCase("snake"))
            return R.string.gioty5;
        else if(time.equalsIgnoreCase("horse"))
            return R.string.giongo;
        else if(time.equalsIgnoreCase("goat"))
            return R.string.giomui;
        else if(time.equalsIgnoreCase("monkey"))
            return R.string.giothan;
        else if(time.equalsIgnoreCase("chicken"))
            return R.string.giodau;
        else if(time.equalsIgnoreCase("dog"))
            return R.string.giotuat;
        else if(time.equalsIgnoreCase("pig"))
            return R.string.giohoi;
        else
            return 0;
    }
    public int amduong(int namsinh){
        if(namsinh==R.string.giapty || namsinh==R.string.giapdan || namsinh==R.string.giapngo || namsinh==R.string.giapthan || namsinh==R.string.giapthin || namsinh==R.string.giaptuat
    || namsinh==R.string.binhty || namsinh==R.string.binhdan || namsinh==R.string.binhngo || namsinh==R.string.binhthan || namsinh==R.string.binhtuat || namsinh==R.string.binhthin
    || namsinh==R.string.maudan || namsinh==R.string.maungo || namsinh==R.string.mauthan || namsinh==R.string.mauthin || namsinh==R.string.mautuat || namsinh==R.string.mauty
    || namsinh==R.string.canhdan || namsinh==R.string.canhngo || namsinh==R.string.canhthan || namsinh==R.string.canhthin || namsinh==R.string.canhtuat || namsinh==R.string.canhty
    || namsinh==R.string.nhamdan || namsinh==R.string.nhamngo || namsinh==R.string.nhamthan || namsinh==R.string.nhamthin || namsinh==R.string.nhamtuat || namsinh==R.string.nhamty
        )
         return R.string.duong;
        else return R.string.am;
    }
    public int counterClockwise(int position, int times){
        int temp=position+times-1;
        int result=temp%12;
        return result;
    }
    public int antiClockwise(int position, int times){
        int temp=position - times +1;
        if(temp>=0)
            return temp;
        else return(12+temp);
    }
    public int sogio(int giosinh){
        if(giosinh==R.string.gioty)
            return 1;
        else if(giosinh==R.string.giosuu)
            return 2;
        else if(giosinh==R.string.giodan)
            return 3;
        else if(giosinh==R.string.giomao)
            return 4;
        else if(giosinh==R.string.giothin)
            return 5;
        else if(giosinh==R.string.gioty5)
            return 6;
        else if(giosinh==R.string.giongo)
            return 7;
        else if(giosinh==R.string.giomui)
            return 8;
        else if(giosinh==R.string.giothan)
            return 9;
        else if(giosinh==R.string.giodau)
            return 10;
        else if(giosinh==R.string.giotuat)
            return 11;
        else if(giosinh==R.string.giohoi)
            return 12;
        else return 0;
    }
    public void anCungKhac(int menh){
        int temp=counterClockwise(menh,1);
        cungPhuMau=cung[temp];
        temp=counterClockwise(menh,2);
        cungPhucDuc=cung[temp];

        temp=counterClockwise(menh,3);
        cungDienTrach=cung[temp];

        temp=counterClockwise(menh,4);
        cungQuanloc=cung[temp];

        temp=counterClockwise(menh,5);
        cungNoBoc=cung[temp];

        temp=counterClockwise(menh,6);
        cungThienDi=cung[temp];

        temp=counterClockwise(menh,7);
        cungTatAch=cung[temp];

        temp=counterClockwise(menh,8);
        cungTaiBach=cung[temp];
         temp=counterClockwise(menh,9);
        cungTuTuc=cung[temp];
        temp=counterClockwise(menh,10);
        cungTheThiep=cung[temp];
        temp=counterClockwise(menh,11);
        cungHuynhDe=cung[temp];
    }
    public void anCungThan(int thangsinh,int giosinh){
        int temp=counterClockwise(counterClockwise(2,thangsinh),giosinh);
        cungThan=cung[temp];
      }

}
