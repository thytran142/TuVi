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
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by tranthy on 2/12/14.
 */
public class Activity3 extends Activity {
    Intent myIntent;
    public String userName = "";
    public String gender = "";
    public String place = "";
    public int year = 0;
    public int day = 0;
    public int month = 0;
    public String time = "";
    TextView nameText;
    TextView wasbornText;
    TextView menhText;
    TextView giosinhText;
    TextView amnuText;
    public String cungMenh = "";
    public String cungPhuMau = "";
    public String cungPhucDuc = "";
    public String cungDienTrach = "";
    public String cungQuanloc = "";
    public String cungNoBoc = "";
    public String cungThienDi = "";
    public String cungTatAch = "";
    public String cungTaiBach = "";
    public String cungTuTuc = "";
    public String cungTheThiep = "";
    public String cungHuynhDe = "";
    public String cungThan = "";
    public String cuc = "";
    public String saoTuVi = "";
    public String saoLiemTrinh = "";
    public String saoThienDong = "";
    public String saoVuKhuc = "";
    public String saoThienCo = "";
    public String saoThaiDuong = "";
    public String saoThienPhu = "";
    public String saoThaiAm = "";
    public String saoThamLang = "";
    public String saoCumon = "";
    public String saoThienTuong = "";
    public String saoThienLuong = "";
    public String saoThatSat = "";
    public String saoPhaQuan = "";
    public String saoThaiTue = "";
    public String saoThieuDuong = "";
    public String saoTangMon = "";
    public String saoThieuAm = "";
    public String saoQuanPhu = "";
    public String saoTuPhu = "";
    public String saoTuePha = "";
    public String saoLongDuc = "";
    public String saoBachTo = "";
    public String saoPhucDuc = "";
    public String saoDieuKhach = "";
    public String saoTrucPhu = "";
    public String saoLocTon = "";
    public String saoLucSi = "";
    public String saoThanhLong = "";
    public String saoTieuHao = "";
    public String saoTuongQuan = "";
    public String saoTauThu = "";
    public String saoPhiLiem = "";
    public String saoHiThan = "";
    public String saoBenhPhu = "";
    public String saoDaiHao = "";
    public String saoPhucBinh = "";
    public String saoQuanPhu2 = "";
    public String saoTruongSinh = "";
    public String saoMocDuc = "";
    public String saoQuanDoi = "";
    public String saoLamQuan = "";
    public String saoDeVuong = "";
    public String saoSuy = "";
    public String saoBenh = "";
    public String saoTu = "";
    public String saoMo = "";
    public String saoTuyet = "";
    public String saoThai = "";
    public String saoDuong = "";
    public String saoKinhDuong = "";
    public String saoDala = "";
    public String saoDiaKiep = "";
    public String saoDiaKhong = "";
    public String saoHoaTinh = "";
    public String saoLinhTinh = "";
    public String saoTaPhu = "";
    public String saoHuuBat = "";
    public String saoVanXuong = "";
    public String saoVanKhuc = "";
    public String saoLongTri = "";
    public String saoPhuongCac = "";
    public String saoThienKhoi = "";
    public String saoThienViet = "";
    public String saoThienKhoc = "";
    public String saoThienHu = "";
    public String saoTamThai = "";
    public String saoBatToa = "";
    public String saoAnQuang = "";
    public String saoThienQui = "";
    public String saoThienDuc = "";
    public String saoNguyetDuc = "";
    public String saoThienHinh = "";
    public String saoThienRieu = "";
    public String saoThienY = "";
    public String saoHongLoan = "";
    public String saoThienHi = "";
    public String saoQuocAn = "";
    public String saoDuongPhu = "";
    public String saoThienGiai = "";
    public String saoDiaGiai = "";
    public String saoGiaiThan = "";
    public String saoThaiPhu = "";
    public String saoPhongCao = "";
    public String saoThienTai = "";
    public String saoThienTho = "";
    public String saoThienThuong = "";
    public String saoThienSu = "";
    public String saoThienLa = "";
    public String saoDiaVong = "";
    public String saoHoaLoc = "";
    public String saoHoaQuyen = "";
    public String saoHoaKhoa = "";
    public String saoHoaKy = "";
    public String saoCoThan = "";
    public String saoQuaTu = "";
    public String saoThienQuan = "";
    public String saoThienPhuc = "";
    public String saoDaoHoa = "";
    public String saoThienMa = "";
    public String saoPhaToai = "";
    public String saoKiepSat = "";
    public String saoHoaCai = "";
    public String saoLuuHa = "";
    public String saoThienTru = "";
    public String saoLuuNienVanTinh = "";
    public String saoBacSi = "";
    public String saoDauQuan = "";
    public String saoThienKhong = "";
    public String saoTuan = "";
    public String saoTuan1 = "";
    public String saoTriet = "";
    public String saoTriet1 = "";
    public ArrayList<Integer> generalString = new ArrayList<Integer>();
    public ArrayList<Integer> cungMenhString = new ArrayList<Integer>();
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
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static String[] monthNames =
            {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                    "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static String[] stemNames =
            {"Wood", "Wood", "Fire", "Fire", "Earth", "Earth",
                    "Metal", "Metal", "Water", "Water"};
    private static String[] branchNames =
            {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
                    "Horse", "Sheep", "Monkey", "Rooster", "Dog", "Boar"};
    //Phan boi
    private static String[] cung = {"Ty1", "Suu", "Dan", "Mao", "Thin", "Ty5", "Ngo", "Mui", "Than", "Dau", "Tuat", "Hoi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        //catch the userName, gender,place,year,month,day and time
        userName = getIntent().getStringExtra("userName");
        gender = getIntent().getStringExtra("gender");
        place = getIntent().getStringExtra("place");
        year = getIntent().getIntExtra("year", -1);
        month = getIntent().getIntExtra("month", -1);
        day = getIntent().getIntExtra("day", -1);
        time = getIntent().getStringExtra("time");
        //set the value in the textview
        nameText = (TextView) findViewById(R.id.userNameActivity3);
        nameText.setText(this.getString(R.string.fortune_teller_for) + userName);
        //set the was born
        wasbornText = (TextView) findViewById(R.id.wasBorn);
        //convert the date to lunar date
        setGregorian(year, month, day);
        computeChineseFields();
        //convert the year to lunar year
        String wasBorn = this.getString(R.string.you_was_born) + " " + chineseDate + ", " + chineseMonth + " " + this.getString(R.string.in_year_of) + " " + this.getString(yearOfAnimal(year, month, day));
        wasbornText.setText(wasBorn);
        menhText = (TextView) findViewById(R.id.menhText);
        String menh = this.getString(R.string.year_belong_to) + this.getString(menh(yearOfAnimal(year, month, day)));
        menhText.setText(menh);
        giosinhText = (TextView) findViewById(R.id.giosinhText);
        giosinhText.setText(this.getString(gioSinh(time)));
        amnuText = (TextView) findViewById(R.id.amnuText);
        amnuText.setText(this.getString(amduong(yearOfAnimal(year, month, day))) + " " + this.getString(getGender(gender)));
        //set cung
        int temp = 0;
        temp = counterClockwise(2, chineseMonth);
        temp = antiClockwise(temp, sogio(gioSinh(time)));
        cungMenh = cung[temp];
        anCungKhac(temp + 1);

        anCungThan(chineseMonth, sogio(gioSinh(time)));
        lapcuc(cungMenh, yearOfAnimal(year, month, day));
        anTuvitinhhe(cuc, chineseDate);
        anThienphutinhhe(saoTuVi);
        anThaitinhhe();
        anLoctontinhhe();
        anTruongsinhtinhhe();
        anLucSat();
        anTahuu();
        anXuongkhuc();
        anLongphuong();
        anKhoiviet();
        anKhochu();
        anThaitoa();
        anQuangqui();
        anThiennguyetduc();
        anHinhrieuy();
        anHonghi();
        anAnphu();
        anThiendiagiaithan();
        anPhucao();
        anTaitho();
        anThuongsu();
        anLavong();
        anTuhoa();
        anCoqua();
        anQuanphuc();
        anDaohoa();
        anThienma();
        anPhatoai();
        anKiepsat();
        anHoacai();
        anLuuha();
        anThientru();
        anLuunienvantinh();
        anBacsi();
        anDauquan();
        anThienkhong();
        anTuantriet();
        generalPrediction();

        TextView generalText = (TextView) findViewById(R.id.generalPredict);
        for (int i = 0; i < generalString.size(); i++) {
            generalText.append(this.getString(generalString.get(i)));
            generalText.append("\n");
        }
        ArrayList<Integer> cungMenhSao=getCungSao(convertCungToNumber(cungMenh));
         TextView cungMenhSaoText=(TextView)findViewById(R.id.cungMenhSao);
        for(int i=0;i<cungMenhSao.size();i++){
            cungMenhSaoText.append(this.getString(cungMenhSao.get(i)));
            cungMenhSaoText.append(", ");
        }

        cungMenhPrediction();
        TextView cungMenhText = (TextView) findViewById(R.id.cungMenhPredict);
        for (int i = 0; i < cungMenhString.size(); i++) {
            cungMenhText.append(this.getString(cungMenhString.get(i)));
            cungMenhText.append("\n");
        }
        ArrayList<Integer> cungPhuMauSao=getCungSao(convertCungToNumber(cungPhuMau));
        TextView cungPhuMauSaoText=(TextView)findViewById(R.id.cungPhuMauSao);
        for(int i=0;i<cungPhuMauSao.size();i++){
            cungPhuMauSaoText.append(this.getString(cungPhuMauSao.get(i)));
            cungPhuMauSaoText.append(", ");
        }
        ArrayList<Integer> cungPhuMauString=cungPhuMauPredict();
        TextView cungPhuMauPredictText=(TextView) findViewById(R.id.cungPhuMauPredict);
        for(int i=0;i<cungPhuMauString.size();i++){
            cungPhuMauPredictText.append(this.getString(cungPhuMauString.get(i)));
            cungPhuMauPredictText.append("\n");
        }
        ArrayList<Integer> cungPhucDucSao=getCungSao(convertCungToNumber(cungPhucDuc));
        TextView cungPhucDucSaoText=(TextView)findViewById(R.id.cungPhucDucSao);
        for(int i=0;i<cungPhucDucSao.size();i++){
            cungPhucDucSaoText.append(this.getString(cungPhucDucSao.get(i)));
            cungPhucDucSaoText.append(", ");
        }
        ArrayList<Integer> cungPhucDucString=cungPhucDucPredict();
        TextView cungPhucDucPredictText=(TextView)findViewById(R.id.cungPhucDucPredict);
        for(int i=0;i<cungPhucDucString.size();i++){
            cungPhucDucPredictText.append(this.getString(cungPhucDucString.get(i)));
            cungPhucDucPredictText.append("\n");
        }
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

    public int getGender(String gender) {
        if (gender.equalsIgnoreCase("Female"))
            return R.string.female;
        else
            return R.string.male;
    }

    private Date convertDate(int year, int month, int day) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tempMonth;
        String tempDay;
        if (month < 10) tempMonth = "-0" + month;
        else tempMonth = "-" + month;
        if (day < 10) tempDay = "-0" + day;
        else tempDay = "-" + day;
        Date birthdate = new Date();
        String fullDate = year + tempMonth + tempDay;
        try {
            birthdate = sdf.parse(fullDate);

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return birthdate;
    }

    private boolean yearOfCanhThin(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = false;
        try {
            Date CanhThin_begin = sdf.parse("1940-02-08");
            Date CanhThin_end = sdf.parse("1941-01-26");
            Date year_begin = sdf.parse("2000-02-05");
            Date year_end = sdf.parse("2001-01-23");
            if (((birthday.after(CanhThin_begin) || birthday.equals(CanhThin_begin)) && (birthday.before(CanhThin_end) || birthday.equals(CanhThin_end))) || ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end))))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfTanTy(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1941-01-27");
            Date year_end = sdf.parse("1942-02-14");
            Date year_begin1 = sdf.parse("2001-01-24");
            Date year_end1 = sdf.parse("2002-02-11");
            if (((birthday.after(year_begin) || birthday.equals(year_begin))
                    && (birthday.before(year_end) || birthday.equals(year_end)))
                    || ((birthday.after(year_begin1) || birthday.equals(year_begin1))
                    && (birthday.before(year_end1)) || birthday.equals(year_end1)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfNhamNgo(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1942-02-15");
            Date year_end = sdf.parse("1943-02-04");
            Date year_begin1 = sdf.parse("2002-02-12");
            Date year_end1 = sdf.parse("2003-01-31");
            if (((birthday.after(year_begin) || birthday.equals(year_begin))
                    && (birthday.before(year_end) || birthday.equals(year_end)))
                    || ((birthday.after(year_begin1) || birthday.equals(year_begin1))
                    && (birthday.before(year_end1)) || birthday.equals(year_end1)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfQuyMui(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1943-02-05");
            Date year_end = sdf.parse("1944-01-24");
            Date year_begin1 = sdf.parse("2003-02-01");
            Date year_end1 = sdf.parse("2004-01-21");
            if (((birthday.after(year_begin) || birthday.equals(year_begin))
                    && (birthday.before(year_end) || birthday.equals(year_end)))
                    || ((birthday.after(year_begin1) || birthday.equals(year_begin1))
                    && (birthday.before(year_end1)) || birthday.equals(year_end1)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfGiapThan(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1944-01-25");
            Date year_end = sdf.parse("1945-02-12");
            Date year_begin1 = sdf.parse("2004-01-22");
            Date year_end1 = sdf.parse("2005-02-08");
            if (((birthday.after(year_begin) || birthday.equals(year_begin))
                    && (birthday.before(year_end) || birthday.equals(year_end)))
                    || ((birthday.after(year_begin1) || birthday.equals(year_begin1))
                    && (birthday.before(year_end1)) || birthday.equals(year_end1)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfAtDau(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1945-02-13");
            Date year_end = sdf.parse("1946-02-01");
            Date year_begin1 = sdf.parse("2005-02-09");
            Date year_end1 = sdf.parse("2006-01-28");
            if (((birthday.after(year_begin) || birthday.equals(year_begin))
                    && (birthday.before(year_end) || birthday.equals(year_end)))
                    || ((birthday.after(year_begin1) || birthday.equals(year_begin1))
                    && (birthday.before(year_end1)) || birthday.equals(year_end1)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfBinhTuat(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1946-02-02");
            Date year_end = sdf.parse("1947-01-21");
            Date year_begin1 = sdf.parse("2006-01-29");
            Date year_end1 = sdf.parse("2007-02-17");
            if (((birthday.after(year_begin) || birthday.equals(year_begin))
                    && (birthday.before(year_end) || birthday.equals(year_end)))
                    || ((birthday.after(year_begin1) || birthday.equals(year_begin1))
                    && (birthday.before(year_end1)) || birthday.equals(year_end1)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfDinhHoi(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1947-01-22");
            Date year_end = sdf.parse("1948-02-09");
            Date year_begin1 = sdf.parse("2007-02-18");
            Date year_end1 = sdf.parse("2008-02-06");
            if (((birthday.after(year_begin) || birthday.equals(year_begin))
                    && (birthday.before(year_end) || birthday.equals(year_end)))
                    || ((birthday.after(year_begin1) || birthday.equals(year_begin1))
                    && (birthday.before(year_end1)) || birthday.equals(year_end1)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfMauTy(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1948-02-10");
            Date year_end = sdf.parse("1949-01-28");
            Date year_begin1 = sdf.parse("2008-02-07");
            Date year_end1 = sdf.parse("2009-01-25");
            if (((birthday.after(year_begin) || birthday.equals(year_begin))
                    && (birthday.before(year_end) || birthday.equals(year_end)))
                    || ((birthday.after(year_begin1) || birthday.equals(year_begin1))
                    && (birthday.before(year_end1)) || birthday.equals(year_end1)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfKySuu(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1949-01-29");
            Date year_end = sdf.parse("1950-02-16");
            Date year_begin1 = sdf.parse("2009-01-26");
            Date year_end1 = sdf.parse("2010-02-13");
            if (((birthday.after(year_begin) || birthday.equals(year_begin))
                    && (birthday.before(year_end) || birthday.equals(year_end)))
                    || ((birthday.after(year_begin1) || birthday.equals(year_begin1))
                    && (birthday.before(year_end1)) || birthday.equals(year_end1)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfCanhDan(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1950-02-17");
            Date year_end = sdf.parse("1951-02-05");
            Date year_begin1 = sdf.parse("2010-02-14");
            Date year_end1 = sdf.parse("2011-02-02");
            if (((birthday.after(year_begin) || birthday.equals(year_begin))
                    && (birthday.before(year_end) || birthday.equals(year_end)))
                    || ((birthday.after(year_begin1) || birthday.equals(year_begin1))
                    && (birthday.before(year_end1)) || birthday.equals(year_end1)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfTanMao(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1951-02-06");
            Date year_end = sdf.parse("1952-01-26");
            Date year_begin1 = sdf.parse("2011-02-03");
            Date year_end1 = sdf.parse("2012-01-22");
            if (((birthday.after(year_begin) || birthday.equals(year_begin))
                    && (birthday.before(year_end) || birthday.equals(year_end)))
                    || ((birthday.after(year_begin1) || birthday.equals(year_begin1))
                    && (birthday.before(year_end1)) || birthday.equals(year_end1)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfNhamThin(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1952-01-27");
            Date year_end = sdf.parse("1953-02-13");
            Date year_begin1 = sdf.parse("2012-01-23");
            Date year_end1 = sdf.parse("2013-02-09");
            if (((birthday.after(year_begin) || birthday.equals(year_begin))
                    && (birthday.before(year_end) || birthday.equals(year_end)))
                    || ((birthday.after(year_begin1) || birthday.equals(year_begin1))
                    && (birthday.before(year_end1)) || birthday.equals(year_end1)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfQuyTy(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1953-02-14");
            Date year_end = sdf.parse("1954-02-02");
            Date year_begin1 = sdf.parse("2013-02-10");
            Date year_end1 = sdf.parse("2014-01-30");
            if (((birthday.after(year_begin) || birthday.equals(year_begin))
                    && (birthday.before(year_end) || birthday.equals(year_end)))
                    || ((birthday.after(year_begin1) || birthday.equals(year_begin1))
                    && (birthday.before(year_end1)) || birthday.equals(year_end1)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfGiapNgo(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1954-02-03");
            Date year_end = sdf.parse("1955-01-23");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfAtMui(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1955-01-24");
            Date year_end = sdf.parse("1956-02-11");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfBinhThan(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1956-02-12");
            Date year_end = sdf.parse("1957-01-30");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfDinhDau(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1957-01-31");
            Date year_end = sdf.parse("1958-02-17");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfMauTuat(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1958-02-18");
            Date year_end = sdf.parse("1959-02-07");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfKyHoi(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1959-02-08");
            Date year_end = sdf.parse("1960-01-27");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfCanhTy(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1960-01-28");
            Date year_end = sdf.parse("1961-02-14");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfTanSuu(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1961-02-15");
            Date year_end = sdf.parse("1962-02-04");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfNhamDan(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1962-02-05");
            Date year_end = sdf.parse("1963-01-24");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfQuyMao(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1963-01-25");
            Date year_end = sdf.parse("1964-02-12");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfGiapThin(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1964-02-13");
            Date year_end = sdf.parse("1965-02-01");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfAtTy(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1965-02-02");
            Date year_end = sdf.parse("1966-01-20");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfBinhNgo(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1966-01-21");
            Date year_end = sdf.parse("1967-02-08");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfDinhMui(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1967-02-09");
            Date year_end = sdf.parse("1968-01-29");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfMauThan(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1968-01-30");
            Date year_end = sdf.parse("1969-02-16");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfKyDau(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1969-02-17");
            Date year_end = sdf.parse("1970-02-05");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfCanhTuat(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1970-02-06");
            Date year_end = sdf.parse("1971-01-26");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfTanHoi(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1971-01-27");
            Date year_end = sdf.parse("1972-02-14");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfNhamTy(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1972-02-15");
            Date year_end = sdf.parse("1973-02-02");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfQuySuu(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1973-02-03");
            Date year_end = sdf.parse("1974-01-22");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfGiapDan(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1974-01-23");
            Date year_end = sdf.parse("1975-02-10");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfAtMao(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1975-02-11");
            Date year_end = sdf.parse("1976-01-30");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfBinhThin(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1976-01-31");
            Date year_end = sdf.parse("1977-02-17");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfDinhTy(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1977-02-18");
            Date year_end = sdf.parse("1978-02-06");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfMauNgo(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1978-02-07");
            Date year_end = sdf.parse("1979-01-27");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfKyMui(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1979-01-28");
            Date year_end = sdf.parse("1980-02-15");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfCanhThan(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1980-02-16");
            Date year_end = sdf.parse("1981-02-04");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfTanDau(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1981-02-05");
            Date year_end = sdf.parse("1982-01-24");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfNhamTuat(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1982-01-25");
            Date year_end = sdf.parse("1983-02-12");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfQuyHoi(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1983-02-13");
            Date year_end = sdf.parse("1984-02-01");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;

            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfGiapTy(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1984-02-02");
            Date year_end = sdf.parse("1985-02-19");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfAtSuu(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1985-02-20");
            Date year_end = sdf.parse("1986-02-08");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfBinhDan(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1986-02-09");
            Date year_end = sdf.parse("1987-01-28");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfDinhMao(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1987-01-29");
            Date year_end = sdf.parse("1988-02-16");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfMauThin(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1988-02-17");
            Date year_end = sdf.parse("1989-02-05");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfKyTy(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1989-02-06");
            Date year_end = sdf.parse("1990-01-26");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfCanhNgo(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1990-01-27");
            Date year_end = sdf.parse("1991-02-14");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfTanMui(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1991-02-15");
            Date year_end = sdf.parse("1992-02-03");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfNhamThan(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1992-02-04");
            Date year_end = sdf.parse("1993-01-22");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfQuyDau(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1993-01-23");
            Date year_end = sdf.parse("1994-02-09");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfGiapTuat(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1994-02-10");
            Date year_end = sdf.parse("1995-01-30");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfAtHoi(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1995-01-31");
            Date year_end = sdf.parse("1996-02-18");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfBinhTy(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1996-02-19");
            Date year_end = sdf.parse("1997-02-06");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfDinhSuu(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1997-02-07");
            Date year_end = sdf.parse("1998-01-27");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfMauDan(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1998-01-28");
            Date year_end = sdf.parse("1999-02-15");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private boolean yearOfKyMao(int year, int month, int day) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = true;
        try {
            Date year_begin = sdf.parse("1999-02-16");
            Date year_end = sdf.parse("2000-02-04");
            if ((birthday.after(year_begin) || birthday.equals(year_begin)) && (birthday.before(year_end) || birthday.equals(year_end)))
                result = true;
            else result = false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private int test(int year, int month, int day) {
        return R.string.hello_world;
    }

    private int yearOfAnimal(int year, int month, int day) {
        if (yearOfCanhThin(year, month, day))
            return R.string.canhthin;//1
        else if (yearOfTanTy(year, month, day))
            return R.string.tanty;//2
        else if (yearOfNhamNgo(year, month, day))
            return R.string.nhamngo;//3
        else if (yearOfQuyMui(year, month, day))
            return R.string.quymui;//4
        else if (yearOfGiapThan(year, month, day))
            return R.string.giapthan;//5
        else if (yearOfAtDau(year, month, day))
            return R.string.atdau;//6
        else if (yearOfBinhTuat(year, month, day))
            return R.string.binhtuat;//7
        else if (yearOfDinhHoi(year, month, day))
            return R.string.dinhhoi;//8
        else if (yearOfMauTy(year, month, day))
            return R.string.mauty;//9
        else if (yearOfKySuu(year, month, day))
            return R.string.kysuu;//10
        else if (yearOfCanhDan(year, month, day))
            return R.string.canhdan;//11
        else if (yearOfTanMao(year, month, day))
            return R.string.tanmao;//12
        else if (yearOfNhamThin(year, month, day))
            return R.string.nhamthin;//13
        else if (yearOfQuyTy(year, month, day))
            return R.string.quyty;//14
        else if (yearOfGiapNgo(year, month, day))
            return R.string.giapngo;//15
        else if (yearOfAtMui(year, month, day))
            return R.string.atmui;//16
        else if (yearOfBinhThan(year, month, day))
            return R.string.binhthan;//17
        else if (yearOfDinhDau(year, month, day))
            return R.string.dinhdau;//18
        else if (yearOfMauTuat(year, month, day))
            return R.string.mautuat;//19
        else if (yearOfKyHoi(year, month, day))
            return R.string.kyhoi;//20
        else if (yearOfCanhTy(year, month, day))
            return R.string.canhty;//21
        else if (yearOfTanSuu(year, month, day))
            return R.string.tansuu;//22
        else if (yearOfNhamDan(year, month, day))
            return R.string.nhamdan;//23
        else if (yearOfQuyMao(year, month, day))
            return R.string.quymao;//24
        else if (yearOfGiapThin(year, month, day))
            return R.string.giapthin;//25
        else if (yearOfAtTy(year, month, day))
            return R.string.atty;//26
        else if (yearOfBinhNgo(year, month, day))
            return R.string.binhngo;//27
        else if (yearOfDinhMui(year, month, day))
            return R.string.dinhmui;//28
        else if (yearOfMauThan(year, month, day))
            return R.string.mauthan;//29
        else if (yearOfKyDau(year, month, day))
            return R.string.kydau;//30
        else if (yearOfCanhTuat(year, month, day))
            return R.string.canhtuat;//31
        else if (yearOfTanHoi(year, month, day))
            return R.string.tanhoi;//32
        else if (yearOfNhamTy(year, month, day))
            return R.string.nhamty;//33
        else if (yearOfQuySuu(year, month, day))
            return R.string.quysuu;//34
        else if (yearOfGiapDan(year, month, day))
            return R.string.giapdan;//35
        else if (yearOfAtMao(year, month, day))
            return R.string.atmao;//36
        else if (yearOfBinhThin(year, month, day))
            return R.string.binhthin;//37
        else if (yearOfDinhTy(year, month, day))
            return R.string.dinhty;//38
        else if (yearOfMauNgo(year, month, day))
            return R.string.maungo;//39
        else if (yearOfKyMui(year, month, day))
            return R.string.kymui;//40
        else if (yearOfCanhThan(year, month, day))
            return R.string.canhthan;//41
        else if (yearOfTanDau(year, month, day))
            return R.string.tandau;//42
        else if (yearOfNhamTuat(year, month, day))
            return R.string.nhamtuat;//43
        else if (yearOfQuyHoi(year, month, day))
            return R.string.quyhoi;//44
        else if (yearOfGiapTy(year, month, day))
            return R.string.giapty;//45
        else if (yearOfAtSuu(year, month, day))
            return R.string.atsuu;//46
        else if (yearOfBinhDan(year, month, day))
            return R.string.binhdan;//47
        else if (yearOfDinhMao(year, month, day))
            return R.string.dinhmao;//48
        else if (yearOfMauThin(year, month, day))
            return R.string.mauthin;//49
        else if (yearOfKyTy(year, month, day))
            return R.string.kyty;//50
        else if (yearOfCanhNgo(year, month, day))
            return R.string.canhngo;//51
        else if (yearOfTanMui(year, month, day))
            return R.string.tanmui;//52
        else if (yearOfNhamThan(year, month, day))
            return R.string.nhamthan;//53
        else if (yearOfQuyDau(year, month, day))
            return R.string.quydau;//54
        else if (yearOfGiapTuat(year, month, day))
            return R.string.giaptuat;//55
        else if (yearOfAtHoi(year, month, day))
            return R.string.athoi;//56
        else if (yearOfBinhTy(year, month, day))
            return R.string.binhty;//57
        else if (yearOfDinhSuu(year, month, day))
            return R.string.dinhsuu;//58
        else if (yearOfMauDan(year, month, day))
            return R.string.maudan;//59
        else if (yearOfKyMao(year, month, day))
            return R.string.kymao;//60
        else return 0;

    }

    /**
     * ******************HERE FUNCTION TO CONVERT LUNAR CALENDAR
     */
    public void setGregorian(int y, int m, int d) {
        gregorianYear = y;
        gregorianMonth = m;
        gregorianDate = d;
        isGregorianLeap = isGregorianLeapYear(y);
        dayOfYear = dayOfYear(y, m, d);
        dayOfWeek = dayOfWeek(y, m, d);
        chineseYear = 0;
        chineseMonth = 0;
        chineseDate = 0;
        sectionalTerm = 0;
        principleTerm = 0;
    }

    /*Methods supporting setGregorian function */
    public static boolean isGregorianLeapYear(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) isLeap = true;
        if (year % 100 == 0) isLeap = false;
        if (year % 400 == 0) isLeap = true;
        return isLeap;
    }

    public static int dayOfYear(int y, int m, int d) {
        int c = 0;
        for (int i = 1; i < m; i++) { // Number of months passed
            c = c + daysInGregorianMonth(y, i);
        }
        c = c + d;
        return c;
    }

    public static int dayOfWeek(int y, int m, int d) {
        int w = 1; // 01-Jan-0001 is Monday, so base is Sunday
        y = (y - 1) % 400 + 1; // Gregorian calendar cycle is 400 years
        int ly = (y - 1) / 4; // Leap years passed
        ly = ly - (y - 1) / 100; // Adjustment
        ly = ly + (y - 1) / 400; // Adjustment
        int ry = y - 1 - ly; // Regular years passed
        w = w + ry; // Regular year has one extra week day
        w = w + 2 * ly; // Leap year has two extra week days
        w = w + dayOfYear(y, m, d);
        w = (w - 1) % 7 + 1;
        return w;
    }

    public static int daysInGregorianMonth(int y, int m) {
        int d = daysInGregorianMonth[m - 1];
        if (m == 2 && isGregorianLeapYear(y)) d++; // Leap year adjustment
        return d;
    }

    /* End method support */
    private static int baseYear = 1901;
    private static int baseMonth = 1;
    private static int baseDate = 1;
    private static int baseIndex = 0;
    private static int baseChineseYear = 4598 - 1;
    private static int baseChineseMonth = 11;
    private static int baseChineseDate = 11;
    private static char[] chineseMonths = {
            //Chinese month map, 2 bytes per year, from 1900 to 2100, 402 bytes.
            //The first 4 bits represents the leap month of the year.
            //The rest 12 bits are flags indicate if the corresponding month
            //is a 29-day month. 2 bytes are stored in low-high order.
            0x00, 0x04, 0xad, 0x08, 0x5a, 0x01, 0xd5, 0x54, 0xb4, 0x09, 0x64, 0x05, 0x59, 0x45,
            0x95, 0x0a, 0xa6, 0x04, 0x55, 0x24, 0xad, 0x08, 0x5a, 0x62, 0xda, 0x04, 0xb4, 0x05,
            0xb4, 0x55, 0x52, 0x0d, 0x94, 0x0a, 0x4a, 0x2a, 0x56, 0x02, 0x6d, 0x71, 0x6d, 0x01,
            0xda, 0x02, 0xd2, 0x52, 0xa9, 0x05, 0x49, 0x0d, 0x2a, 0x45, 0x2b, 0x09, 0x56, 0x01,
            0xb5, 0x20, 0x6d, 0x01, 0x59, 0x69, 0xd4, 0x0a, 0xa8, 0x05, 0xa9, 0x56, 0xa5, 0x04,
            0x2b, 0x09, 0x9e, 0x38, 0xb6, 0x08, 0xec, 0x74, 0x6c, 0x05, 0xd4, 0x0a, 0xe4, 0x6a,
            0x52, 0x05, 0x95, 0x0a, 0x5a, 0x42, 0x5b, 0x04, 0xb6, 0x04, 0xb4, 0x22, 0x6a, 0x05,
            0x52, 0x75, 0xc9, 0x0a, 0x52, 0x05, 0x35, 0x55, 0x4d, 0x0a, 0x5a, 0x02, 0x5d, 0x31,
            0xb5, 0x02, 0x6a, 0x8a, 0x68, 0x05, 0xa9, 0x0a, 0x8a, 0x6a, 0x2a, 0x05, 0x2d, 0x09,
            0xaa, 0x48, 0x5a, 0x01, 0xb5, 0x09, 0xb0, 0x39, 0x64, 0x05, 0x25, 0x75, 0x95, 0x0a,
            0x96, 0x04, 0x4d, 0x54, 0xad, 0x04, 0xda, 0x04, 0xd4, 0x44, 0xb4, 0x05, 0x54, 0x85,
            0x52, 0x0d, 0x92, 0x0a, 0x56, 0x6a, 0x56, 0x02, 0x6d, 0x02, 0x6a, 0x41, 0xda, 0x02,
            0xb2, 0xa1, 0xa9, 0x05, 0x49, 0x0d, 0x0a, 0x6d, 0x2a, 0x09, 0x56, 0x01, 0xad, 0x50,
            0x6d, 0x01, 0xd9, 0x02, 0xd1, 0x3a, 0xa8, 0x05, 0x29, 0x85, 0xa5, 0x0c, 0x2a, 0x09,
            0x96, 0x54, 0xb6, 0x08, 0x6c, 0x09, 0x64, 0x45, 0xd4, 0x0a, 0xa4, 0x05, 0x51, 0x25,
            0x95, 0x0a, 0x2a, 0x72, 0x5b, 0x04, 0xb6, 0x04, 0xac, 0x52, 0x6a, 0x05, 0xd2, 0x0a,
            0xa2, 0x4a, 0x4a, 0x05, 0x55, 0x94, 0x2d, 0x0a, 0x5a, 0x02, 0x75, 0x61, 0xb5, 0x02,
            0x6a, 0x03, 0x61, 0x45, 0xa9, 0x0a, 0x4a, 0x05, 0x25, 0x25, 0x2d, 0x09, 0x9a, 0x68,
            0xda, 0x08, 0xb4, 0x09, 0xa8, 0x59, 0x54, 0x03, 0xa5, 0x0a, 0x91, 0x3a, 0x96, 0x04,
            0xad, 0xb0, 0xad, 0x04, 0xda, 0x04, 0xf4, 0x62, 0xb4, 0x05, 0x54, 0x0b, 0x44, 0x5d,
            0x52, 0x0a, 0x95, 0x04, 0x55, 0x22, 0x6d, 0x02, 0x5a, 0x71, 0xda, 0x02, 0xaa, 0x05,
            0xb2, 0x55, 0x49, 0x0b, 0x4a, 0x0a, 0x2d, 0x39, 0x36, 0x01, 0x6d, 0x80, 0x6d, 0x01,
            0xd9, 0x02, 0xe9, 0x6a, 0xa8, 0x05, 0x29, 0x0b, 0x9a, 0x4c, 0xaa, 0x08, 0xb6, 0x08,
            0xb4, 0x38, 0x6c, 0x09, 0x54, 0x75, 0xd4, 0x0a, 0xa4, 0x05, 0x45, 0x55, 0x95, 0x0a,
            0x9a, 0x04, 0x55, 0x44, 0xb5, 0x04, 0x6a, 0x82, 0x6a, 0x05, 0xd2, 0x0a, 0x92, 0x6a,
            0x4a, 0x05, 0x55, 0x0a, 0x2a, 0x4a, 0x5a, 0x02, 0xb5, 0x02, 0xb2, 0x31, 0x69, 0x03,
            0x31, 0x73, 0xa9, 0x0a, 0x4a, 0x05, 0x2d, 0x55, 0x2d, 0x09, 0x5a, 0x01, 0xd5, 0x48,
            0xb4, 0x09, 0x68, 0x89, 0x54, 0x0b, 0xa4, 0x0a, 0xa5, 0x6a, 0x95, 0x04, 0xad, 0x08,
            0x6a, 0x44, 0xda, 0x04, 0x74, 0x05, 0xb0, 0x25, 0x54, 0x03
    };
    private static int[] bigLeapMonthYears = {
            // The leap months in the following years have 30 days
            6, 14, 19, 25, 33, 36, 38, 41, 44, 52,
            55, 79, 117, 136, 147, 150, 155, 158, 185, 193
    };

    /* COMPUTE CHINESE FIELDS */
    public int computeChineseFields() {
        // Gregorian year out of the computation range
        if (gregorianYear < 1901 || gregorianYear > 2100) return 1;
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
        for (int i = startYear; i < gregorianYear; i++) {
            daysDiff += 365;
            if (isGregorianLeapYear(i)) daysDiff += 1; // leap year
        }
        for (int i = startMonth; i < gregorianMonth; i++) {
            daysDiff += daysInGregorianMonth(gregorianYear, i);
        }
        daysDiff += gregorianDate - startDate;

        // Adding that number of days to the Chinese date
        // Then bring Chinese date into the correct range.
        //    one Chinese month at a time
        chineseDate += daysDiff;
        int lastDate = daysInChineseMonth(chineseYear, chineseMonth);
        int nextMonth = nextChineseMonth(chineseYear, chineseMonth);
        while (chineseDate > lastDate) {
            if (Math.abs(nextMonth) < Math.abs(chineseMonth)) chineseYear++;
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
        if (1 <= m && m <= 8) {
            v = chineseMonths[2 * index];
            l = m - 1;
            if (((v >> l) & 0x01) == 1) d = 29;
        } else if (9 <= m && m <= 12) {
            v = chineseMonths[2 * index + 1];
            l = m - 9;
            if (((v >> l) & 0x01) == 1) d = 29;
        } else { // leap month
            v = chineseMonths[2 * index + 1];
            v = (v >> 4) & 0x0F;
            if (v != Math.abs(m)) {
                d = 0; // wrong m specified
            } else {
                d = 29;
                for (int i = 0; i < bigLeapMonthYears.length; i++) {
                    if (bigLeapMonthYears[i] == index) {
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
        if (m > 0) {
            // need to find out if we are in a leap year or not
            int index = y - baseChineseYear + baseIndex;
            int v = chineseMonths[2 * index + 1];
            v = (v >> 4) & 0x0F;
            if (v == m) n = -m; // next month is a leap month
        }
        if (n == 13) n = 1; //roll into next year
        return n;
    }

    //Menh
    public int menh(int d) {
        if (d == R.string.giapty || d == R.string.atsuu || d == R.string.giapngo || d == R.string.atmui
                || d == R.string.nhamthan || d == R.string.quydau || d == R.string.nhamdan || d == R.string.quymao
                || d == R.string.canhthin || d == R.string.tanty || d == R.string.canhtuat || d == R.string.tanhoi)
            return R.string.kimmenh;
        else if (d == R.string.mauthin || d == R.string.kyty || d == R.string.mautuat || d == R.string.kyhoi
                || d == R.string.nhamngo || d == R.string.quymui || d == R.string.nhamty || d == R.string.quysuu
                || d == R.string.canhdan || d == R.string.tanmao || d == R.string.canhthan || d == R.string.tandau)
            return R.string.mocmenh;
        else if (d == R.string.binhty || d == R.string.dinhsuu || d == R.string.binhngo || d == R.string.dinhmui
                || d == R.string.giapthan || d == R.string.atdau || d == R.string.giapdan || d == R.string.atmao
                || d == R.string.nhamthin || d == R.string.quyty || d == R.string.nhamtuat || d == R.string.quyhoi)
            return R.string.thuymenh;
        else if (d == R.string.binhdan || d == R.string.dinhmao || d == R.string.binhthan || d == R.string.dinhdau
                || d == R.string.giaptuat || d == R.string.athoi || d == R.string.giapthin || d == R.string.atty
                || d == R.string.maungo || d == R.string.kymui || d == R.string.mauty || d == R.string.kysuu)
            return R.string.hoamenh;
        else if (d == R.string.canhngo || d == R.string.tanmui || d == R.string.canhty || d == R.string.tansuu
                || d == R.string.maudan || d == R.string.kymao || d == R.string.mauthan || d == R.string.kydau
                || d == R.string.binhtuat || d == R.string.dinhhoi || d == R.string.binhthin || d == R.string.dinhty)
            return R.string.thomenh;
        return 0;
    }

    public int gioSinh(String time) {
        if (time.equalsIgnoreCase("mouse"))
            return R.string.gioty;
        else if (time.equalsIgnoreCase("buffalo"))
            return R.string.giosuu;
        else if (time.equalsIgnoreCase("tiger"))
            return R.string.giodan;
        else if (time.equalsIgnoreCase("cat"))
            return R.string.giomao;
        else if (time.equalsIgnoreCase("dragon"))
            return R.string.giothin;
        else if (time.equalsIgnoreCase("snake"))
            return R.string.gioty5;
        else if (time.equalsIgnoreCase("horse"))
            return R.string.giongo;
        else if (time.equalsIgnoreCase("goat"))
            return R.string.giomui;
        else if (time.equalsIgnoreCase("monkey"))
            return R.string.giothan;
        else if (time.equalsIgnoreCase("chicken"))
            return R.string.giodau;
        else if (time.equalsIgnoreCase("dog"))
            return R.string.giotuat;
        else if (time.equalsIgnoreCase("pig"))
            return R.string.giohoi;
        else
            return 0;
    }

    public int amduong(int namsinh) {
        if (namsinh == R.string.giapty || namsinh == R.string.giapdan || namsinh == R.string.giapngo || namsinh == R.string.giapthan || namsinh == R.string.giapthin || namsinh == R.string.giaptuat
                || namsinh == R.string.binhty || namsinh == R.string.binhdan || namsinh == R.string.binhngo || namsinh == R.string.binhthan || namsinh == R.string.binhtuat || namsinh == R.string.binhthin
                || namsinh == R.string.maudan || namsinh == R.string.maungo || namsinh == R.string.mauthan || namsinh == R.string.mauthin || namsinh == R.string.mautuat || namsinh == R.string.mauty
                || namsinh == R.string.canhdan || namsinh == R.string.canhngo || namsinh == R.string.canhthan || namsinh == R.string.canhthin || namsinh == R.string.canhtuat || namsinh == R.string.canhty
                || namsinh == R.string.nhamdan || namsinh == R.string.nhamngo || namsinh == R.string.nhamthan || namsinh == R.string.nhamthin || namsinh == R.string.nhamtuat || namsinh == R.string.nhamty
                )
            return R.string.duong;
        else return R.string.am;
    }

    public int counterClockwise(int position, int times) {
        int temp = position + times - 1;
        int result = temp % 12;
        return result;
    }

    public int antiClockwise(int position, int times) {
        int temp = position - times + 1;
        if (temp >= 0)
            return temp;
        else if (12 + temp >= 0) return 12 + temp;
        else return 24 + temp;

    }

    public int sogio(int giosinh) {
        if (giosinh == R.string.gioty)
            return 1;
        else if (giosinh == R.string.giosuu)
            return 2;
        else if (giosinh == R.string.giodan)
            return 3;
        else if (giosinh == R.string.giomao)
            return 4;
        else if (giosinh == R.string.giothin)
            return 5;
        else if (giosinh == R.string.gioty5)
            return 6;
        else if (giosinh == R.string.giongo)
            return 7;
        else if (giosinh == R.string.giomui)
            return 8;
        else if (giosinh == R.string.giothan)
            return 9;
        else if (giosinh == R.string.giodau)
            return 10;
        else if (giosinh == R.string.giotuat)
            return 11;
        else if (giosinh == R.string.giohoi)
            return 12;
        else return 0;
    }

    public void anCungKhac(int menh) {
        int temp = counterClockwise(menh, 1);
        cungPhuMau = cung[temp];
        temp = counterClockwise(menh, 2);
        cungPhucDuc = cung[temp];

        temp = counterClockwise(menh, 3);
        cungDienTrach = cung[temp];

        temp = counterClockwise(menh, 4);
        cungQuanloc = cung[temp];

        temp = counterClockwise(menh, 5);
        cungNoBoc = cung[temp];

        temp = counterClockwise(menh, 6);
        cungThienDi = cung[temp];

        temp = counterClockwise(menh, 7);
        cungTatAch = cung[temp];

        temp = counterClockwise(menh, 8);
        cungTaiBach = cung[temp];
        temp = counterClockwise(menh, 9);
        cungTuTuc = cung[temp];
        temp = counterClockwise(menh, 10);
        cungTheThiep = cung[temp];
        temp = counterClockwise(menh, 11);
        cungHuynhDe = cung[temp];
    }

    public void anCungThan(int thangsinh, int giosinh) {
        int temp = counterClockwise(counterClockwise(2, thangsinh), giosinh);
        cungThan = cung[temp];
    }

    public void lapcuc(String menh, int d) {
        if (d == R.string.giapngo || d == R.string.giapthin || d == R.string.giaptuat || d == R.string.giapdan || d == R.string.giapthan || d == R.string.giapty
                || d == R.string.kydau || d == R.string.kymao || d == R.string.kysuu || d == R.string.kymui || d == R.string.kyhoi || d == R.string.kyty
                ) {
            if (menh.equalsIgnoreCase("Ty1") || menh.equalsIgnoreCase("Suu"))
                cuc = "Thuy nhi cuc";
            else if (menh.equalsIgnoreCase("Dan") || menh.equalsIgnoreCase("Mao") || menh.equalsIgnoreCase("Tuat") || menh.equalsIgnoreCase("Hoi"))
                cuc = "Hoa luc cuc";
            else if (menh.equalsIgnoreCase("Thin") || menh.equalsIgnoreCase("Ty5"))
                cuc = "Moc tam cuc";
            else if (menh.equalsIgnoreCase("Ngo") || menh.equalsIgnoreCase("Mui"))
                cuc = "Tho ngu cuc";
            else if (menh.equalsIgnoreCase("Than") || menh.equalsIgnoreCase("Dau"))
                cuc = "Kim tu cuc";
        } else if (d == R.string.atty || d == R.string.athoi || d == R.string.atdau || d == R.string.atmao || d == R.string.atmui || d == R.string.atsuu
                || d == R.string.canhtuat || d == R.string.canhty || d == R.string.canhngo || d == R.string.canhthan || d == R.string.canhdan || d == R.string.canhthin) {
            if (menh.equalsIgnoreCase("Ty1") || menh.equalsIgnoreCase("Suu"))
                cuc = "Hoa luc cuc";
            else if (menh.equalsIgnoreCase("Dan") || menh.equalsIgnoreCase("Mao") || menh.equalsIgnoreCase("Tuat") || menh.equalsIgnoreCase("Hoi"))
                cuc = "Tho ngu cuc";
            else if (menh.equalsIgnoreCase("Thin") || menh.equalsIgnoreCase("Ty5"))
                cuc = "Kim tu cuc";
            else if (menh.equalsIgnoreCase("Ngo") || menh.equalsIgnoreCase("Mui"))
                cuc = "Moc tam cuc";
            else if (menh.equalsIgnoreCase("Than") || menh.equalsIgnoreCase("Dau"))
                cuc = "Thuy nhi cuc";
        } else if (d == R.string.binhthin || d == R.string.binhtuat || d == R.string.binhthan || d == R.string.binhngo || d == R.string.binhdan || d == R.string.binhty
                || d == R.string.tansuu || d == R.string.tanmui || d == R.string.tandau || d == R.string.tanmao || d == R.string.tanhoi || d == R.string.tanty) {
            if (menh.equalsIgnoreCase("Ty1") || menh.equalsIgnoreCase("Suu"))
                cuc = "Tho ngu cuc";
            else if (menh.equalsIgnoreCase("Dan") || menh.equalsIgnoreCase("Mao") || menh.equalsIgnoreCase("Tuat") || menh.equalsIgnoreCase("Hoi"))
                cuc = "Moc tam cuc";
            else if (menh.equalsIgnoreCase("Thin") || menh.equalsIgnoreCase("Ty5"))
                cuc = "Thuy nhi cuc";
            else if (menh.equalsIgnoreCase("Ngo") || menh.equalsIgnoreCase("Mui"))
                cuc = "Kim tu cuc";
            else if (menh.equalsIgnoreCase("Than") || menh.equalsIgnoreCase("Dau"))
                cuc = "Hoa luc cuc";
        } else if (d == R.string.dinhhoi || d == R.string.dinhty || d == R.string.dinhdau || d == R.string.dinhmao || d == R.string.dinhmui || d == R.string.dinhsuu
                || d == R.string.nhamtuat || d == R.string.nhamthin || d == R.string.nhamty || d == R.string.nhamngo || d == R.string.nhamdan || d == R.string.nhamthan) {
            if (menh.equalsIgnoreCase("Ty1") || menh.equalsIgnoreCase("Suu"))
                cuc = "Moc tam cuc";
            else if (menh.equalsIgnoreCase("Dan") || menh.equalsIgnoreCase("Mao") || menh.equalsIgnoreCase("Tuat") || menh.equalsIgnoreCase("Hoi"))
                cuc = "Kim tu cuc";
            else if (menh.equalsIgnoreCase("Thin") || menh.equalsIgnoreCase("Ty5"))
                cuc = "Hoa luc cuc";
            else if (menh.equalsIgnoreCase("Ngo") || menh.equalsIgnoreCase("Mui"))
                cuc = "Thuy nhi cuc";
            else if (menh.equalsIgnoreCase("Than") || menh.equalsIgnoreCase("Dau"))
                cuc = "Tho ngu cuc";
        } else if (d == R.string.mauthan || d == R.string.maudan || d == R.string.mauty || d == R.string.maungo || d == R.string.mauthin || d == R.string.mautuat
                || d == R.string.quyty || d == R.string.quysuu || d == R.string.quymui || d == R.string.quymao || d == R.string.quydau || d == R.string.quyhoi) {
            if (menh.equalsIgnoreCase("Ty1") || menh.equalsIgnoreCase("Suu"))
                cuc = "Kim tu cuc";
            else if (menh.equalsIgnoreCase("Dan") || menh.equalsIgnoreCase("Mao") || menh.equalsIgnoreCase("Tuat") || menh.equalsIgnoreCase("Hoi"))
                cuc = "Thuy nhi cuc";
            else if (menh.equalsIgnoreCase("Thin") || menh.equalsIgnoreCase("Ty5"))
                cuc = "Tho ngu cuc";
            else if (menh.equalsIgnoreCase("Ngo") || menh.equalsIgnoreCase("Mui"))
                cuc = "Hoa luc cuc";
            else if (menh.equalsIgnoreCase("Than") || menh.equalsIgnoreCase("Dau"))
                cuc = "Moc tam cuc";
        }
    }

    public void anTuvitinhhe(String cuc, int ngaySinh) {
        //an saoTuVi
        if (cuc.equalsIgnoreCase("Thuy nhi cuc")) {
            if (ngaySinh == 22 || ngaySinh == 23) saoTuVi = cung[0];
            else if (ngaySinh == 1 || ngaySinh == 25 || ngaySinh == 24) saoTuVi = cung[1];
            else if (ngaySinh == 2 || ngaySinh == 3 || ngaySinh == 26 || ngaySinh == 27)
                saoTuVi = cung[2];
            else if (ngaySinh == 4 || ngaySinh == 5 || ngaySinh == 28 || ngaySinh == 29)
                saoTuVi = cung[3];
            else if (ngaySinh == 6 || ngaySinh == 7 || ngaySinh == 30) saoTuVi = cung[4];
            else if (ngaySinh == 8 || ngaySinh == 9) saoTuVi = cung[5];
            else if (ngaySinh == 10 || ngaySinh == 11) saoTuVi = cung[6];
            else if (ngaySinh == 12 || ngaySinh == 13) saoTuVi = cung[7];
            else if (ngaySinh == 14 || ngaySinh == 15) saoTuVi = cung[8];
            else if (ngaySinh == 16 || ngaySinh == 17) saoTuVi = cung[9];
            else if (ngaySinh == 18 || ngaySinh == 19) saoTuVi = cung[10];
            else if (ngaySinh == 20 || ngaySinh == 21) saoTuVi = cung[11];
        } else if (cuc.equalsIgnoreCase("Moc tam cuc")) {
            if (ngaySinh == 25) saoTuVi = cung[0];
            else if (ngaySinh == 2 || ngaySinh == 28) saoTuVi = cung[1];
            else if (ngaySinh == 3 || ngaySinh == 5) saoTuVi = cung[2];
            else if (ngaySinh == 6 || ngaySinh == 8) saoTuVi = cung[3];
            else if (ngaySinh == 1 || ngaySinh == 9 || ngaySinh == 11) saoTuVi = cung[4];
            else if (ngaySinh == 4 || ngaySinh == 12 || ngaySinh == 14) saoTuVi = cung[5];
            else if (ngaySinh == 7 || ngaySinh == 15 || ngaySinh == 17) saoTuVi = cung[6];
            else if (ngaySinh == 10 || ngaySinh == 18 || ngaySinh == 20) saoTuVi = cung[7];
            else if (ngaySinh == 13 || ngaySinh == 21 || ngaySinh == 23) saoTuVi = cung[8];
            else if (ngaySinh == 16 || ngaySinh == 24 || ngaySinh == 26) saoTuVi = cung[9];
            else if (ngaySinh == 19 || ngaySinh == 27 || ngaySinh == 29) saoTuVi = cung[10];
            else if (ngaySinh == 22 || ngaySinh == 30) saoTuVi = cung[11];
        } else if (cuc.equalsIgnoreCase("Kim tu cuc")) {
            if (ngaySinh == 5) saoTuVi = cung[0];
            else if (ngaySinh == 3 || ngaySinh == 9) saoTuVi = cung[1];
            else if (ngaySinh == 4 || ngaySinh == 7 || ngaySinh == 13) saoTuVi = cung[2];
            else if (ngaySinh == 8 || ngaySinh == 11 || ngaySinh == 17) saoTuVi = cung[3];
            else if (ngaySinh == 2 || ngaySinh == 12 || ngaySinh == 15 || ngaySinh == 21)
                saoTuVi = cung[4];
            else if (ngaySinh == 6 || ngaySinh == 16 || ngaySinh == 19 || ngaySinh == 25)
                saoTuVi = cung[5];
            else if (ngaySinh == 10 || ngaySinh == 20 || ngaySinh == 23 || ngaySinh == 29)
                saoTuVi = cung[6];
            else if (ngaySinh == 14 || ngaySinh == 24 || ngaySinh == 27) saoTuVi = cung[7];
            else if (ngaySinh == 18 || ngaySinh == 28) saoTuVi = cung[8];
            else if (ngaySinh == 22) saoTuVi = cung[9];
            else if (ngaySinh == 26) saoTuVi = cung[10];
            else if (ngaySinh == 1 || ngaySinh == 30) saoTuVi = cung[11];
        } else if (cuc.equalsIgnoreCase("Tho ngu cuc")) {
            if (ngaySinh == 7) saoTuVi = cung[0];
            else if (ngaySinh == 4 || ngaySinh == 12) saoTuVi = cung[1];
            else if (ngaySinh == 5 || ngaySinh == 9 || ngaySinh == 17) saoTuVi = cung[2];
            else if (ngaySinh == 10 || ngaySinh == 14 || ngaySinh == 22) saoTuVi = cung[3];
            else if (ngaySinh == 3 || ngaySinh == 15 || ngaySinh == 19 || ngaySinh == 27)
                saoTuVi = cung[4];
            else if (ngaySinh == 8 || ngaySinh == 20 || ngaySinh == 24) saoTuVi = cung[5];
            else if (ngaySinh == 1 || ngaySinh == 13 || ngaySinh == 25 || ngaySinh == 29)
                saoTuVi = cung[6];
            else if (ngaySinh == 6 || ngaySinh == 18 || ngaySinh == 30) saoTuVi = cung[7];
            else if (ngaySinh == 11 || ngaySinh == 23) saoTuVi = cung[8];
            else if (ngaySinh == 16 || ngaySinh == 28) saoTuVi = cung[9];
            else if (ngaySinh == 21) saoTuVi = cung[10];
            else if (ngaySinh == 2 || ngaySinh == 26) saoTuVi = cung[11];
        } else if (cuc.equalsIgnoreCase("Hoa luc cuc")) {
            if (ngaySinh == 9 || ngaySinh == 19) saoTuVi = cung[0];
            else if (ngaySinh == 5 || ngaySinh == 15 || ngaySinh == 25) saoTuVi = cung[1];
            else if (ngaySinh == 6 || ngaySinh == 11 || ngaySinh == 21) saoTuVi = cung[2];
            else if (ngaySinh == 12 || ngaySinh == 17 || ngaySinh == 27) saoTuVi = cung[3];
            else if (ngaySinh == 4 || ngaySinh == 18 || ngaySinh == 23) saoTuVi = cung[4];
            else if (ngaySinh == 10 || ngaySinh == 24 || ngaySinh == 29) saoTuVi = cung[5];
            else if (ngaySinh == 2 || ngaySinh == 16 || ngaySinh == 30) saoTuVi = cung[6];
            else if (ngaySinh == 8 || ngaySinh == 22) saoTuVi = cung[7];
            else if (ngaySinh == 14 || ngaySinh == 28) saoTuVi = cung[8];
            else if (ngaySinh == 1 || ngaySinh == 20) saoTuVi = cung[9];
            else if (ngaySinh == 7 || ngaySinh == 26) saoTuVi = cung[10];
            else if (ngaySinh == 3 || ngaySinh == 13) saoTuVi = cung[11];
        }
        int temp = convertCungToNumber(saoTuVi);
        temp = counterClockwise(temp, 5);
        saoLiemTrinh = cung[temp];
        temp = convertCungToNumber(saoLiemTrinh);
        temp = counterClockwise(temp, 4);
        saoThienDong = cung[temp];
        temp = convertCungToNumber(saoThienDong);
        temp = counterClockwise(temp, 2);
        saoVuKhuc = cung[temp];
        temp = convertCungToNumber(saoVuKhuc);
        temp = counterClockwise(temp, 2);
        saoThaiDuong = cung[temp];
        temp = convertCungToNumber(saoThaiDuong);
        temp = counterClockwise(temp, 3);
        saoThienCo = cung[temp];

    }

    public int convertCungToNumber(String cung) {
        if (cung.equalsIgnoreCase("Ty1")) return 0;
        else if (cung.equalsIgnoreCase("Suu")) return 1;
        else if (cung.equalsIgnoreCase("Dan")) return 2;
        else if (cung.equalsIgnoreCase("Mao")) return 3;
        else if (cung.equalsIgnoreCase("Thin")) return 4;
        else if (cung.equalsIgnoreCase("Ty5")) return 5;
        else if (cung.equalsIgnoreCase("Ngo")) return 6;
        else if (cung.equalsIgnoreCase("Mui")) return 7;
        else if (cung.equalsIgnoreCase("Than")) return 8;
        else if (cung.equalsIgnoreCase("Dau")) return 9;
        else if (cung.equalsIgnoreCase("Tuat")) return 10;
        else if (cung.equalsIgnoreCase("Hoi")) return 11;
        else return 0;
    }

    public void anThienphutinhhe(String tuvi) {
        int index = convertCungToNumber(tuvi);
        if (index == 0) saoThienPhu = cung[4];
        else if (index == 1) saoThienPhu = cung[3];
        else if (index == 2) saoThienPhu = cung[2];
        else if (index == 3) saoThienPhu = cung[1];
        else if (index == 4) saoThienPhu = cung[0];
        else if (index == 5) saoThienPhu = cung[11];
        else if (index == 6) saoThienPhu = cung[10];
        else if (index == 7) saoThienPhu = cung[9];
        else if (index == 8) saoThienPhu = cung[8];
        else if (index == 9) saoThienPhu = cung[7];
        else if (index == 10) saoThienPhu = cung[6];
        else if (index == 11) saoThienPhu = cung[5];
        index = convertCungToNumber(saoThienPhu);
        index = counterClockwise(index, 2);
        saoThaiAm = cung[index];
        index = convertCungToNumber(saoThaiAm);
        index = counterClockwise(index, 2);
        saoThamLang = cung[index];
        index = convertCungToNumber(saoThamLang);
        index = counterClockwise(index, 2);
        saoCumon = cung[index];
        index = convertCungToNumber(saoCumon);
        index = counterClockwise(index, 2);
        saoThienTuong = cung[index];
        index = convertCungToNumber(saoThienTuong);
        index = counterClockwise(index, 2);
        saoThienLuong = cung[index];
        index = convertCungToNumber(saoThienLuong);
        index = counterClockwise(index, 2);
        saoThatSat = cung[index];
        index = convertCungToNumber(saoThatSat);
        index = counterClockwise(index, 5);
        saoPhaQuan = cung[index];
    }

    public void anThaitinhhe() {
        int index = yearOfAnimal(year, month, day);
        if (index == R.string.giapty || index == R.string.nhamty || index == R.string.binhty || index == R.string.mauty || index == R.string.canhty)
            saoThaiTue = cung[0];
        else if (index == R.string.atsuu || index == R.string.quysuu || index == R.string.dinhsuu || index == R.string.kysuu || index == R.string.tansuu)
            saoThaiTue = cung[1];
        else if (index == R.string.nhamdan || index == R.string.canhdan || index == R.string.giapdan || index == R.string.binhdan || index == R.string.maudan)
            saoThaiTue = cung[2];
        else if (index == R.string.quymao || index == R.string.tanmao || index == R.string.atmao || index == R.string.dinhmao || index == R.string.kymao)
            saoThaiTue = cung[3];
        else if (index == R.string.canhthin || index == R.string.mauthin || index == R.string.nhamthin || index == R.string.giapthin || index == R.string.binhthin)
            saoThaiTue = cung[4];
        else if (index == R.string.tanty || index == R.string.kyty || index == R.string.quyty || index == R.string.atty || index == R.string.dinhty)
            saoThaiTue = cung[5];
        else if (index == R.string.giapngo || index == R.string.nhamngo || index == R.string.binhngo || index == R.string.maungo || index == R.string.canhngo)
            saoThaiTue = cung[6];
        else if (index == R.string.atmui || index == R.string.quymui || index == R.string.dinhmui || index == R.string.kymui || index == R.string.tanmui)
            saoThaiTue = cung[7];
        else if (index == R.string.nhamthan || index == R.string.canhthan || index == R.string.giapthan || index == R.string.binhthan || index == R.string.mauthan)
            saoThaiTue = cung[8];
        else if (index == R.string.quydau || index == R.string.tandau || index == R.string.atdau || index == R.string.dinhdau || index == R.string.kydau)
            saoThaiTue = cung[9];
        else if (index == R.string.canhtuat || index == R.string.mautuat || index == R.string.nhamtuat || index == R.string.giaptuat || index == R.string.binhtuat)
            saoThaiTue = cung[10];
        else saoThaiTue = cung[11];
        index = convertCungToNumber(saoThaiTue);
        index = counterClockwise(index, 2);
        saoThieuDuong = cung[index];
        index = convertCungToNumber(saoThieuDuong);
        index = counterClockwise(index, 2);
        saoTangMon = cung[index];
        index = convertCungToNumber(saoTangMon);
        index = counterClockwise(index, 2);
        saoThieuAm = cung[index];
        index = convertCungToNumber(saoThieuAm);
        index = counterClockwise(index, 2);
        saoQuanPhu = cung[index];
        index = convertCungToNumber(saoQuanPhu);
        index = counterClockwise(index, 2);
        saoTuPhu = cung[index];
        index = convertCungToNumber(saoTuPhu);
        index = counterClockwise(index, 2);
        saoTuePha = cung[index];
        index = convertCungToNumber(saoTuePha);
        index = counterClockwise(index, 2);
        saoLongDuc = cung[index];
        index = convertCungToNumber(saoLongDuc);
        index = counterClockwise(index, 2);
        saoBachTo = cung[index];
        index = convertCungToNumber(saoBachTo);
        index = counterClockwise(index, 2);
        saoPhucDuc = cung[index];
        index = convertCungToNumber(saoPhucDuc);
        index = counterClockwise(index, 2);
        saoDieuKhach = cung[index];
        index = convertCungToNumber(saoDieuKhach);
        index = counterClockwise(index, 2);
        saoTrucPhu = cung[index];

    }

    public void anLoctontinhhe() {
        int index = yearOfAnimal(year, month, day);
        if (index == R.string.giapthin || index == R.string.giaptuat || index == R.string.giapthan || index == R.string.giapngo || index == R.string.giapdan || index == R.string.giapty)
            saoLocTon = cung[2];
        else if (index == R.string.atdau || index == R.string.atty || index == R.string.atmao || index == R.string.atsuu || index == R.string.athoi || index == R.string.atmui)
            saoLocTon = cung[3];
        else if (index == R.string.binhtuat || index == R.string.binhthan || index == R.string.binhngo || index == R.string.binhthin || index == R.string.binhdan || index == R.string.binhty
                || index == R.string.mautuat || index == R.string.mauthan || index == R.string.maungo || index == R.string.mauthin || index == R.string.maudan || index == R.string.mauty)
            saoLocTon = cung[5];
        else if (index == R.string.dinhdau || index == R.string.dinhmui || index == R.string.dinhty || index == R.string.dinhmao || index == R.string.dinhhoi || index == R.string.dinhsuu
                || index == R.string.kydau || index == R.string.kymui || index == R.string.kyty || index == R.string.kymao || index == R.string.kyhoi || index == R.string.kysuu)
            saoLocTon = cung[6];
        else if (index == R.string.canhtuat || index == R.string.canhthan || index == R.string.canhngo || index == R.string.canhthin || index == R.string.canhdan || index == R.string.canhty)
            saoLocTon = cung[8];
        else if (index == R.string.tandau || index == R.string.tanmui || index == R.string.tanty || index == R.string.tanmao || index == R.string.tanhoi || index == R.string.tansuu)
            saoLocTon = cung[9];
        else if (index == R.string.nhamtuat || index == R.string.nhamthan || index == R.string.nhamngo || index == R.string.nhamthin || index == R.string.nhamty || index == R.string.nhamdan)
            saoLocTon = cung[11];
        else if (index == R.string.quydau || index == R.string.quymui || index == R.string.quyty || index == R.string.quymao || index == R.string.quyhoi || index == R.string.quysuu)
            saoLocTon = cung[0];
        int amhayduong = amduong(yearOfAnimal(year, month, day));
        if ((gender.equalsIgnoreCase("Male") && amhayduong == R.string.duong) || (gender.equalsIgnoreCase("Female") && amhayduong == R.string.am)) {
            //duong nam am nu
            index = convertCungToNumber(saoLocTon);
            //theo chieu thuan
            index = counterClockwise(index, 2);
            saoLucSi = cung[index];
            index = convertCungToNumber(saoLucSi);
            index = counterClockwise(index, 2);
            saoThanhLong = cung[index];
            index = convertCungToNumber(saoThanhLong);
            index = counterClockwise(index, 2);
            saoTieuHao = cung[index];
            index = convertCungToNumber(saoTieuHao);
            index = counterClockwise(index, 2);
            saoTuongQuan = cung[index];
            index = convertCungToNumber(saoTuongQuan);
            index = counterClockwise(index, 2);
            saoTauThu = cung[index];
            index = convertCungToNumber(saoTauThu);
            index = counterClockwise(index, 2);
            saoPhiLiem = cung[index];
            index = convertCungToNumber(saoPhiLiem);
            index = counterClockwise(index, 2);
            saoHiThan = cung[index];
            index = convertCungToNumber(saoHiThan);
            index = counterClockwise(index, 2);
            saoBenhPhu = cung[index];
            index = convertCungToNumber(saoBenhPhu);
            index = counterClockwise(index, 2);
            saoDaiHao = cung[index];
            index = convertCungToNumber(saoDaiHao);
            index = counterClockwise(index, 2);
            saoPhucBinh = cung[index];
            index = convertCungToNumber(saoPhucBinh);
            index = counterClockwise(index, 2);
            saoQuanPhu2 = cung[index];
        } else {
            index = convertCungToNumber(saoLocTon);
            index = antiClockwise(index, 2);
            saoLucSi = cung[index];
            index = convertCungToNumber(saoLucSi);
            index = antiClockwise(index, 2);
            saoThanhLong = cung[index];
            index = convertCungToNumber(saoThanhLong);
            index = antiClockwise(index, 2);
            saoTieuHao = cung[index];
            index = convertCungToNumber(saoTieuHao);
            index = antiClockwise(index, 2);
            saoTuongQuan = cung[index];
            index = convertCungToNumber(saoTuongQuan);
            index = antiClockwise(index, 2);
            saoTauThu = cung[index];
            index = convertCungToNumber(saoTauThu);
            index = antiClockwise(index, 2);
            saoPhiLiem = cung[index];
            index = convertCungToNumber(saoPhiLiem);
            index = antiClockwise(index, 2);
            saoHiThan = cung[index];
            index = convertCungToNumber(saoHiThan);
            index = antiClockwise(index, 2);
            saoBenhPhu = cung[index];
            index = convertCungToNumber(saoBenhPhu);
            index = antiClockwise(index, 2);
            saoDaiHao = cung[index];
            index = convertCungToNumber(saoDaiHao);
            index = antiClockwise(index, 2);
            saoPhucBinh = cung[index];
            index = convertCungToNumber(saoPhucBinh);
            index = antiClockwise(index, 2);
            saoQuanPhu2 = cung[index];
        }
    }

    public void anTruongsinhtinhhe() {
        //an sao truong sinh
        if (cuc.equalsIgnoreCase("Kim tu cuc"))
            saoTruongSinh = cung[5];
        else if (cuc.equalsIgnoreCase("Moc tam cuc"))
            saoTruongSinh = cung[11];
        else if (cuc.equalsIgnoreCase("Hoa luc cuc"))
            saoTruongSinh = cung[2];
        else if (cuc.equalsIgnoreCase("Thuy nhi cuc"))
            saoTruongSinh = cung[8];
        else
            saoTruongSinh = cung[8];
        int amhayduong = amduong(yearOfAnimal(year, month, day));
        if ((gender.equalsIgnoreCase("Male") && amhayduong == R.string.duong) || (gender.equalsIgnoreCase("Female") && amhayduong == R.string.am)) {
            //duong nam am nu theo chieu thuan
            int index = convertCungToNumber(saoTruongSinh);
            index = counterClockwise(index, 2);
            saoMocDuc = cung[index];
            index = convertCungToNumber(saoMocDuc);
            index = counterClockwise(index, 2);
            saoQuanDoi = cung[index];
            index = convertCungToNumber(saoQuanDoi);
            index = counterClockwise(index, 2);
            saoLamQuan = cung[index];
            index = convertCungToNumber(saoLamQuan);
            index = counterClockwise(index, 2);
            saoDeVuong = cung[index];
            index = convertCungToNumber(saoDeVuong);
            index = counterClockwise(index, 2);
            saoSuy = cung[index];
            index = convertCungToNumber(saoSuy);
            index = counterClockwise(index, 2);
            saoBenh = cung[index];
            index = convertCungToNumber(saoBenh);
            index = counterClockwise(index, 2);
            saoTu = cung[index];
            index = convertCungToNumber(saoTu);
            index = counterClockwise(index, 2);
            saoMo = cung[index];
            index = convertCungToNumber(saoMo);
            index = counterClockwise(index, 2);
            saoTuyet = cung[index];
            index = convertCungToNumber(saoTuyet);
            index = counterClockwise(index, 2);
            saoThai = cung[index];
            index = convertCungToNumber(saoThai);
            index = counterClockwise(index, 2);
            saoDuong = cung[index];

        } else {
            //duong nu, am nam
            int index = convertCungToNumber(saoTruongSinh);
            index = antiClockwise(index, 2);
            saoMocDuc = cung[index];
            index = convertCungToNumber(saoMocDuc);
            index = antiClockwise(index, 2);
            saoQuanDoi = cung[index];
            index = convertCungToNumber(saoQuanDoi);
            index = antiClockwise(index, 2);
            saoLamQuan = cung[index];
            index = convertCungToNumber(saoLamQuan);
            index = antiClockwise(index, 2);
            saoDeVuong = cung[index];
            index = convertCungToNumber(saoDeVuong);
            index = antiClockwise(index, 2);
            saoSuy = cung[index];
            index = convertCungToNumber(saoSuy);
            index = antiClockwise(index, 2);
            saoBenh = cung[index];
            index = convertCungToNumber(saoBenh);
            index = antiClockwise(index, 2);
            saoTu = cung[index];
            index = convertCungToNumber(saoTu);
            index = antiClockwise(index, 2);
            saoMo = cung[index];
            index = convertCungToNumber(saoMo);
            index = antiClockwise(index, 2);
            saoTuyet = cung[index];
            index = convertCungToNumber(saoTuyet);
            index = antiClockwise(index, 2);
            saoThai = cung[index];
            index = convertCungToNumber(saoThai);
            index = antiClockwise(index, 2);
            saoDuong = cung[index];
        }
    }

    public void anLucSat() {
        int index = convertCungToNumber(saoLocTon);
        index = counterClockwise(index, 2);
        saoKinhDuong = cung[index];
        index = convertCungToNumber(saoLocTon);
        index = counterClockwise(index, 2);
        saoDala = cung[index];
        //an dia kiep: hoi theo chieu thuan den h sinh
        index = antiClockwise(11, sogio(gioSinh(time)));
        saoDiaKiep = cung[index];
        index = antiClockwise(11, sogio(gioSinh(time)));
        saoDiaKhong = cung[index];
        int amhayduong = amduong(yearOfAnimal(year, month, day));
        if ((gender.equalsIgnoreCase("Male") && amhayduong == R.string.duong) || (gender.equalsIgnoreCase("Female") && amhayduong == R.string.am)) {
            //duong nam am nu
            index = yearOfAnimal(year, month, day);
            if (index == R.string.giapdan || index == R.string.nhamdan || index == R.string.canhdan || index == R.string.binhdan || index == R.string.maudan
                    || index == R.string.giapngo || index == R.string.nhamngo || index == R.string.binhngo || index == R.string.maungo || index == R.string.canhngo
                    || index == R.string.canhtuat || index == R.string.mautuat || index == R.string.nhamtuat || index == R.string.giaptuat || index == R.string.binhtuat) {
                int temp = counterClockwise(1, sogio(gioSinh(time)));
                saoHoaTinh = cung[temp];
                temp = antiClockwise(3, sogio(gioSinh(time)));
                saoLinhTinh = cung[temp];
            } else if (index == R.string.nhamthan || index == R.string.canhthan || index == R.string.giapthan || index == R.string.binhthan || index == R.string.mauthan
                    || index == R.string.giapty || index == R.string.nhamty || index == R.string.binhty || index == R.string.mauty || index == R.string.canhty
                    || index == R.string.canhthin || index == R.string.mauthin || index == R.string.nhamthin || index == R.string.giapthin || index == R.string.binhthin) {
                int temp = counterClockwise(2, sogio(gioSinh(time)));
                saoHoaTinh = cung[temp];
                temp = antiClockwise(10, sogio(gioSinh(time)));
                saoLinhTinh = cung[temp];
            } else if (index == R.string.tanty || index == R.string.kyty || index == R.string.quyty || index == R.string.atty || index == R.string.dinhty
                    || index == R.string.quydau || index == R.string.tandau || index == R.string.atdau || index == R.string.dinhdau || index == R.string.kydau
                    || index == R.string.atsuu || index == R.string.quysuu || index == R.string.dinhsuu || index == R.string.kysuu || index == R.string.tansuu) {
                int temp = counterClockwise(3, sogio(gioSinh(time)));
                saoHoaTinh = cung[temp];
                temp = antiClockwise(10, sogio(gioSinh(time)));
                saoLinhTinh = cung[temp];
            } else if (index == R.string.tanhoi || index == R.string.kyhoi || index == R.string.quyhoi || index == R.string.athoi || index == R.string.dinhhoi
                    || index == R.string.quymao || index == R.string.tanmao || index == R.string.atmao || index == R.string.dinhmao || index == R.string.kymao
                    || index == R.string.atmui || index == R.string.quymui || index == R.string.dinhmui || index == R.string.kymui || index == R.string.tanmui) {
                int temp = counterClockwise(2, sogio(gioSinh(time)));
                saoHoaTinh = cung[temp];
                temp = antiClockwise(10, sogio(gioSinh(time)));
                saoLinhTinh = cung[temp];
            }

        } else {
            index = yearOfAnimal(year, month, day);
            if (index == R.string.giapdan || index == R.string.nhamdan || index == R.string.canhdan || index == R.string.binhdan || index == R.string.maudan
                    || index == R.string.giapngo || index == R.string.nhamngo || index == R.string.binhngo || index == R.string.maungo || index == R.string.canhngo
                    || index == R.string.canhtuat || index == R.string.mautuat || index == R.string.nhamtuat || index == R.string.giaptuat || index == R.string.binhtuat) {
                int temp = antiClockwise(1, sogio(gioSinh(time)));
                saoHoaTinh = cung[temp];
                temp = counterClockwise(3, sogio(gioSinh(time)));
                saoLinhTinh = cung[temp];
            } else if (index == R.string.nhamthan || index == R.string.canhthan || index == R.string.giapthan || index == R.string.binhthan || index == R.string.mauthan
                    || index == R.string.giapty || index == R.string.nhamty || index == R.string.binhty || index == R.string.mauty || index == R.string.canhty
                    || index == R.string.canhthin || index == R.string.mauthin || index == R.string.nhamthin || index == R.string.giapthin || index == R.string.binhthin) {
                int temp = antiClockwise(2, sogio(gioSinh(time)));
                saoHoaTinh = cung[temp];
                temp = counterClockwise(10, sogio(gioSinh(time)));
                saoLinhTinh = cung[temp];
            } else if (index == R.string.tanty || index == R.string.kyty || index == R.string.quyty || index == R.string.atty || index == R.string.dinhty
                    || index == R.string.quydau || index == R.string.tandau || index == R.string.atdau || index == R.string.dinhdau || index == R.string.kydau
                    || index == R.string.atsuu || index == R.string.quysuu || index == R.string.dinhsuu || index == R.string.kysuu || index == R.string.tansuu) {
                int temp = antiClockwise(3, sogio(gioSinh(time)));
                saoHoaTinh = cung[temp];
                temp = counterClockwise(10, sogio(gioSinh(time)));
                saoLinhTinh = cung[temp];
            } else if (index == R.string.tanhoi || index == R.string.kyhoi || index == R.string.quyhoi || index == R.string.athoi || index == R.string.dinhhoi
                    || index == R.string.quymao || index == R.string.tanmao || index == R.string.atmao || index == R.string.dinhmao || index == R.string.kymao
                    || index == R.string.atmui || index == R.string.quymui || index == R.string.dinhmui || index == R.string.kymui || index == R.string.tanmui) {
                int temp = antiClockwise(2, sogio(gioSinh(time)));
                saoHoaTinh = cung[temp];
                temp = counterClockwise(10, sogio(gioSinh(time)));
                saoLinhTinh = cung[temp];
            }
        }//end else

    }

    public void anTahuu() {
        int temp = counterClockwise(4, chineseMonth);
        saoTaPhu = cung[temp];
        temp = antiClockwise(10, chineseMonth);
        saoHuuBat = cung[temp];
    }

    public void anXuongkhuc() {
        int temp = antiClockwise(10, sogio(gioSinh(time)));
        saoVanXuong = cung[temp];
        temp = counterClockwise(4, sogio(gioSinh(time)));
        saoVanKhuc = cung[temp];
    }

    public int convertFromNamSinh(int index) {
        if (index == R.string.giapty || index == R.string.nhamty || index == R.string.binhty || index == R.string.mauty || index == R.string.canhty)
            return 0;
        else if (index == R.string.atsuu || index == R.string.quysuu || index == R.string.dinhsuu || index == R.string.kysuu || index == R.string.tansuu)
            return 1;
        else if (index == R.string.nhamdan || index == R.string.canhdan || index == R.string.giapdan || index == R.string.binhdan || index == R.string.maudan)
            return 2;
        else if (index == R.string.quymao || index == R.string.tanmao || index == R.string.atmao || index == R.string.dinhmao || index == R.string.kymao)
            return 3;
        else if (index == R.string.canhthin || index == R.string.mauthin || index == R.string.nhamthin || index == R.string.giapthin || index == R.string.binhthin)
            return 4;
        else if (index == R.string.tanty || index == R.string.kyty || index == R.string.quyty || index == R.string.atty || index == R.string.dinhty)
            return 5;
        else if (index == R.string.giapngo || index == R.string.nhamngo || index == R.string.binhngo || index == R.string.maungo || index == R.string.canhngo)
            return 6;
        else if (index == R.string.atmui || index == R.string.quymui || index == R.string.dinhmui || index == R.string.kysuu || index == R.string.tanmui)
            return 7;
        else if (index == R.string.nhamthan || index == R.string.canhthan || index == R.string.giapthan || index == R.string.binhthan || index == R.string.mauthan)
            return 8;
        else if (index == R.string.quydau || index == R.string.tandau || index == R.string.atdau || index == R.string.dinhdau || index == R.string.kydau)
            return 9;
        else if (index == R.string.canhtuat || index == R.string.mautuat || index == R.string.nhamtuat || index == R.string.giaptuat || index == R.string.binhtuat)
            return 10;
        else
            return 11;
    }

    public void anLongphuong() {
        int temp = counterClockwise(4, convertFromNamSinh(yearOfAnimal(year, month, day)) + 1);
        saoLongTri = cung[temp];
        temp = antiClockwise(10, convertFromNamSinh(yearOfAnimal(year, month, day)) + 1);
        saoPhuongCac = cung[temp];
    }

    public void anKhoiviet() {
        int index = yearOfAnimal(year, month, day);
        if (index == R.string.giapdan || index == R.string.giaptuat || index == R.string.giapthin || index == R.string.giapthan || index == R.string.giapngo || index == R.string.giapty
                || index == R.string.mauthan || index == R.string.mautuat || index == R.string.maungo || index == R.string.mauthin || index == R.string.maudan || index == R.string.mauty) {
            saoThienKhoi = cung[1];
            saoThienViet = cung[7];
        } else if (index == R.string.atdau || index == R.string.atmui || index == R.string.atty || index == R.string.atmao || index == R.string.athoi || index == R.string.atsuu
                || index == R.string.kysuu || index == R.string.kyty || index == R.string.kymao || index == R.string.kymui || index == R.string.kyhoi || index == R.string.kydau) {
            saoThienKhoi = cung[0];
            saoThienViet = cung[8];
        } else if (index == R.string.canhthan || index == R.string.canhngo || index == R.string.canhthin || index == R.string.canhdan || index == R.string.canhtuat || index == R.string.canhty
                || index == R.string.tandau || index == R.string.tanmui || index == R.string.tanty || index == R.string.tanmao || index == R.string.tanhoi || index == R.string.tansuu) {
            saoThienKhoi = cung[6];
            saoThienViet = cung[2];
        } else if (index == R.string.binhtuat || index == R.string.binhthan || index == R.string.binhngo || index == R.string.binhthin || index == R.string.binhdan || index == R.string.binhty
                || index == R.string.dinhdau || index == R.string.dinhmui || index == R.string.dinhty || index == R.string.dinhmao || index == R.string.dinhhoi || index == R.string.dinhty) {
            saoThienKhoi = cung[11];
            saoThienViet = cung[9];
        } else if (index == R.string.nhamdan || index == R.string.nhamtuat || index == R.string.nhamthan || index == R.string.nhamngo || index == R.string.nhamthin || index == R.string.nhamty
                || index == R.string.quydau || index == R.string.quymui || index == R.string.quyty || index == R.string.quymao || index == R.string.quyhoi || index == R.string.quysuu) {
            saoThienKhoi = cung[3];
            saoThienViet = cung[5];
        }
    }

    public void anKhochu() {
        int index = counterClockwise(6, convertFromNamSinh(yearOfAnimal(year, month, day)) + 1);
        saoThienKhoc = cung[index];
        index = convertCungToNumber(saoTuePha);
        saoThienHu = cung[index];
    }

    public void anThaitoa() {
        int index = convertCungToNumber(saoTaPhu);
        index = counterClockwise(index, chineseDate);
        saoTamThai = cung[index];
        int temp = convertCungToNumber(saoHuuBat);
        temp = antiClockwise(temp, chineseDate);
        saoBatToa = cung[temp];
    }

    public void anQuangqui() {
        int index = convertCungToNumber(saoVanXuong);
        index = counterClockwise(index, chineseDate - 1);
        saoAnQuang = cung[index];
        index = convertCungToNumber(saoVanKhuc);
        index = antiClockwise(index, chineseDate - 1);
        saoThienQui = cung[index];
    }

    public void anThiennguyetduc() {
        int index = convertFromNamSinh(yearOfAnimal(year, month, day));
        int temp = counterClockwise(9, index + 1);
        saoThienDuc = cung[temp];
        temp = counterClockwise(5, index + 1);
        saoNguyetDuc = cung[temp];
    }

    public void anHinhrieuy() {
        int index = counterClockwise(9, chineseMonth);
        saoThienHinh = cung[index];
        index = counterClockwise(0, chineseMonth + 1);
        saoThienRieu = cung[index];
        saoThienY = cung[index];

    }

    public int cungDoi(int index) {
        if (index == 0) return 6;
        else if (index == 1) return 7;
        else if (index == 2) return 8;
        else if (index == 3) return 9;
        else if (index == 4) return 10;
        else if (index == 5) return 11;
        else if (index == 6) return 0;
        else if (index == 7) return 1;
        else if (index == 8) return 2;
        else if (index == 9) return 3;
        else if (index == 10) return 4;
        else return 5;
    }

    public void anHonghi() {
        int index = antiClockwise(3, convertFromNamSinh(yearOfAnimal(year, month, day)) + 1);
        saoHongLoan = cung[index];
        index = cungDoi(index);
        saoThienHi = cung[index];
    }

    public void anAnphu() {
        int index = convertCungToNumber(saoLocTon);
        index = counterClockwise(index, 9);
        saoQuocAn = cung[index];
        index = convertCungToNumber(saoLocTon);
        index = antiClockwise(index, 8);
        saoDuongPhu = cung[index];
    }

    public void anThiendiagiaithan() {
        int index = counterClockwise(8, chineseMonth);
        saoThienGiai = cung[index];
        index = counterClockwise(7, chineseMonth);
        saoDiaGiai = cung[index];
        index = convertCungToNumber(saoPhuongCac);
        saoGiaiThan = cung[index];
    }

    public void anPhucao() {
        int index = convertCungToNumber(saoVanKhuc);
        index = counterClockwise(index, 3);
        saoThaiPhu = cung[index];
        index = convertCungToNumber(saoVanKhuc);
        index = antiClockwise(index, 3);
        saoPhongCao = cung[index];
    }

    public void anTaitho() {
        int index = convertCungToNumber(cungMenh);
        index = counterClockwise(index, convertFromNamSinh(yearOfAnimal(year, month, day)) + 1);
        saoThienTai = cung[index];
        index = convertCungToNumber(cungThan);
        index = counterClockwise(index, convertFromNamSinh(yearOfAnimal(year, month, day)) + 1);
        saoThienTho = cung[index];
    }

    public void anThuongsu() {
        int index = convertCungToNumber(cungNoBoc);
        saoThienThuong = cung[index];
        index = convertCungToNumber(cungTatAch);
        saoThienSu = cung[index];
    }

    public void anLavong() {
        saoThienLa = cung[4];
        saoDiaVong = cung[10];
    }

    public void anTuhoa() {
        int index = yearOfAnimal(year, month, day);
        if (index == R.string.giapdan || index == R.string.giapty || index == R.string.giapthin || index == R.string.giapngo || index == R.string.giapthan || index == R.string.giaptuat) {
            int temp = convertCungToNumber(saoLiemTrinh);
            saoHoaLoc = cung[temp];
            temp = convertCungToNumber(saoPhaQuan);
            saoHoaQuyen = cung[temp];
            temp = convertCungToNumber(saoVuKhuc);
            saoHoaKhoa = cung[temp];
            temp = convertCungToNumber(saoThaiDuong);
            saoHoaKy = cung[temp];
        } else if (index == R.string.atsuu || index == R.string.athoi || index == R.string.atmao || index == R.string.atty || index == R.string.atdau || index == R.string.atmui) {
            int temp = convertCungToNumber(saoThienCo);
            saoHoaLoc = cung[temp];
            temp = convertCungToNumber(saoThienLuong);
            saoHoaQuyen = cung[temp];
            temp = convertCungToNumber(saoTuVi);
            saoHoaKhoa = cung[temp];
            temp = convertCungToNumber(saoThaiAm);
            saoHoaKy = cung[temp];
        } else if (index == R.string.binhty || index == R.string.binhdan || index == R.string.binhthin || index == R.string.binhngo || index == R.string.binhthan || index == R.string.binhtuat) {
            int temp = convertCungToNumber(saoThienDong);
            saoHoaLoc = cung[temp];
            temp = convertCungToNumber(saoThienCo);
            saoHoaQuyen = cung[temp];
            temp = convertCungToNumber(saoVanXuong);
            saoHoaKhoa = cung[temp];
            temp = convertCungToNumber(saoLiemTrinh);
            saoHoaKy = cung[temp];
        } else if (index == R.string.dinhhoi || index == R.string.dinhmao || index == R.string.dinhty || index == R.string.dinhmui || index == R.string.dinhdau || index == R.string.dinhsuu) {
            int temp = convertCungToNumber(saoThaiAm);
            saoHoaLoc = cung[temp];
            temp = convertCungToNumber(saoThienDong);
            saoHoaQuyen = cung[temp];
            temp = convertCungToNumber(saoThienCo);
            saoHoaKhoa = cung[temp];
            temp = convertCungToNumber(saoCumon);
            saoHoaKy = cung[temp];
        } else if (index == R.string.mauthan || index == R.string.mauty || index == R.string.maudan || index == R.string.mauthin || index == R.string.maungo || index == R.string.mautuat) {
            int temp = convertCungToNumber(saoThamLang);
            saoHoaLoc = cung[temp];
            temp = convertCungToNumber(saoThaiAm);
            saoHoaQuyen = cung[temp];
            temp = convertCungToNumber(saoHuuBat);
            saoHoaKhoa = cung[temp];
            temp = convertCungToNumber(saoThienCo);
            saoHoaKy = cung[temp];
        } else if (index == R.string.kydau || index == R.string.kyhoi || index == R.string.kymui || index == R.string.kymao || index == R.string.kysuu || index == R.string.kyty) {
            int temp = convertCungToNumber(saoVuKhuc);
            saoHoaLoc = cung[temp];
            temp = convertCungToNumber(saoThamLang);
            saoHoaQuyen = cung[temp];
            temp = convertCungToNumber(saoThienLuong);
            saoHoaKhoa = cung[temp];
            temp = convertCungToNumber(saoVuKhuc);
            saoHoaKy = cung[temp];
        } else if (index == R.string.canhty || index == R.string.canhtuat || index == R.string.canhdan || index == R.string.canhthin || index == R.string.canhngo || index == R.string.canhthan) {
            int temp = convertCungToNumber(saoThaiDuong);
            saoHoaLoc = cung[temp];
            temp = convertCungToNumber(saoVuKhuc);
            saoHoaQuyen = cung[temp];
            temp = convertCungToNumber(saoThaiAm);
            saoHoaKhoa = cung[temp];
            temp = convertCungToNumber(saoThienDong);
            saoHoaKy = cung[temp];
        } else if (index == R.string.tansuu || index == R.string.tanhoi || index == R.string.tanmao || index == R.string.tanty || index == R.string.tandau || index == R.string.tanmui) {
            int temp = convertCungToNumber(saoCumon);
            saoHoaLoc = cung[temp];
            temp = convertCungToNumber(saoThienLuong);
            saoHoaQuyen = cung[temp];
            temp = convertCungToNumber(saoVuKhuc);
            saoHoaKhoa = cung[temp];
            temp = convertCungToNumber(saoVanXuong);
            saoHoaKy = cung[temp];
        } else if (index == R.string.nhamdan || index == R.string.nhamty || index == R.string.nhamthin || index == R.string.nhamngo || index == R.string.nhamthan || index == R.string.nhamtuat) {
            int temp = convertCungToNumber(saoThienLuong);
            saoHoaLoc = cung[temp];
            temp = convertCungToNumber(saoTuVi);
            saoHoaQuyen = cung[temp];
            temp = convertCungToNumber(saoTaPhu);
            saoHoaKhoa = cung[temp];
            temp = convertCungToNumber(saoVuKhuc);
            saoHoaKy = cung[temp];
        } else {
            int temp = convertCungToNumber(saoPhaQuan);
            saoHoaLoc = cung[temp];
            temp = convertCungToNumber(saoCumon);
            saoHoaQuyen = cung[temp];
            temp = convertCungToNumber(saoThaiAm);
            saoHoaKhoa = cung[temp];
            temp = convertCungToNumber(saoThamLang);
            saoHoaKy = cung[temp];
        }
    }

    public void anCoqua() {
        int index = convertFromNamSinh(yearOfAnimal(year, month, day));
        if (index == 11 || index == 0 || index == 1) {
            saoCoThan = cung[2];
            saoQuaTu = cung[10];
        } else if (index == 2 || index == 3 || index == 4) {
            saoCoThan = cung[5];
            saoQuaTu = cung[1];
        } else if (index == 5 || index == 6 || index == 7) {
            saoCoThan = cung[8];
            saoQuaTu = cung[4];
        } else {
            saoCoThan = cung[11];
            saoQuaTu = cung[7];
        }
    }

    public void anQuanphuc() {
        int index = yearOfAnimal(year, month, day);
        if (index == R.string.giapdan || index == R.string.giapty || index == R.string.giapthin || index == R.string.giapngo || index == R.string.giapthan || index == R.string.giaptuat) {
            saoThienQuan = cung[7];
            saoThienPhuc = cung[9];
        } else if (index == R.string.atsuu || index == R.string.athoi || index == R.string.atmao || index == R.string.atty || index == R.string.atdau || index == R.string.atmui) {
            saoThienQuan = cung[4];
            saoThienPhuc = cung[8];
        } else if (index == R.string.binhty || index == R.string.binhdan || index == R.string.binhthin || index == R.string.binhngo || index == R.string.binhthan || index == R.string.binhtuat) {
            saoThienQuan = cung[5];
            saoThienPhuc = cung[0];
        } else if (index == R.string.dinhhoi || index == R.string.dinhmao || index == R.string.dinhty || index == R.string.dinhmui || index == R.string.dinhdau || index == R.string.dinhsuu) {
            saoThienQuan = cung[2];
            saoThienPhuc = cung[11];
        } else if (index == R.string.mauthan || index == R.string.mauty || index == R.string.maudan || index == R.string.mauthin || index == R.string.maungo || index == R.string.mautuat) {
            saoThienQuan = cung[3];
            saoThienPhuc = cung[3];
        } else if (index == R.string.kydau || index == R.string.kyhoi || index == R.string.kymui || index == R.string.kymao || index == R.string.kysuu || index == R.string.kyty) {
            saoThienQuan = cung[9];
            saoThienPhuc = cung[2];
        } else if (index == R.string.canhty || index == R.string.canhtuat || index == R.string.canhdan || index == R.string.canhthin || index == R.string.canhngo || index == R.string.canhthan) {
            saoThienQuan = cung[11];
            saoThienPhuc = cung[6];
        } else if (index == R.string.tansuu || index == R.string.tanhoi || index == R.string.tanmao || index == R.string.tanty || index == R.string.tandau || index == R.string.tanmui) {
            saoThienQuan = cung[9];
            saoThienPhuc = cung[5];
        } else if (index == R.string.nhamdan || index == R.string.nhamty || index == R.string.nhamthin || index == R.string.nhamngo || index == R.string.nhamthan || index == R.string.nhamtuat) {
            saoThienQuan = cung[10];
            saoThienPhuc = cung[6];
        } else {
            saoThienQuan = cung[6];
            saoThienPhuc = cung[5];
        }
    }

    public void anDaohoa() {
        int index = convertFromNamSinh(yearOfAnimal(year, month, day));
        if (index == 5 || index == 9 || index == 1) saoDaoHoa = cung[6];
        else if (index == 11 || index == 3 || index == 7) saoDaoHoa = cung[0];
        else if (index == 8 || index == 0 || index == 4) saoDaoHoa = cung[9];
        else saoDaoHoa = cung[3];
    }

    public void anThienma() {
        int index = convertFromNamSinh(yearOfAnimal(year, month, day));
        if (index == 5 || index == 9 || index == 1) saoThienMa = cung[11];
        else if (index == 11 || index == 3 || index == 7) saoThienMa = cung[5];
        else if (index == 8 || index == 0 || index == 4) saoThienMa = cung[2];
        else saoThienMa = cung[8];
    }

    public void anPhatoai() {
        int index = convertFromNamSinh(yearOfAnimal(year, month, day));
        if (index == 0 || index == 6 || index == 3 || index == 9) saoPhaToai = cung[5];
        else if (index == 2 || index == 8 || index == 5 || index == 11) saoPhaToai = cung[9];
        else saoPhaToai = cung[1];
    }

    public void anKiepsat() {
        int index = convertFromNamSinh(yearOfAnimal(year, month, day));
        if (index == 5 || index == 9 || index == 11) saoKiepSat = cung[2];
        else if (index == 11 || index == 3 || index == 7) saoKiepSat = cung[8];
        else if (index == 2 || index == 6 || index == 10) saoKiepSat = cung[11];
        else saoKiepSat = cung[5];
    }

    public void anHoacai() {

        int index = convertFromNamSinh(yearOfAnimal(year, month, day));
        if (index == 5 || index == 9 || index == 11) saoHoaCai = cung[1];
        else if (index == 11 || index == 3 || index == 7) saoHoaCai = cung[7];
        else if (index == 2 || index == 6 || index == 10) saoHoaCai = cung[10];
        else saoHoaCai = cung[4];
    }

    public void anLuuha() {
        int index = yearOfAnimal(year, month, day);
        if (index == R.string.giapdan || index == R.string.giapty || index == R.string.giapthin || index == R.string.giapngo || index == R.string.giapthan || index == R.string.giaptuat) {
            saoLuuHa = cung[9];
        } else if (index == R.string.atsuu || index == R.string.athoi || index == R.string.atmao || index == R.string.atty || index == R.string.atdau || index == R.string.atmui) {
            saoLuuHa = cung[10];
        } else if (index == R.string.binhty || index == R.string.binhdan || index == R.string.binhthin || index == R.string.binhngo || index == R.string.binhthan || index == R.string.binhtuat) {
            saoLuuHa = cung[7];
        } else if (index == R.string.dinhhoi || index == R.string.dinhmao || index == R.string.dinhty || index == R.string.dinhmui || index == R.string.dinhdau || index == R.string.dinhsuu) {
            saoLuuHa = cung[4];
        } else if (index == R.string.mauthan || index == R.string.mauty || index == R.string.maudan || index == R.string.mauthin || index == R.string.maungo || index == R.string.mautuat) {
            saoLuuHa = cung[5];
        } else if (index == R.string.kydau || index == R.string.kyhoi || index == R.string.kymui || index == R.string.kymao || index == R.string.kysuu || index == R.string.kyty) {
            saoLuuHa = cung[6];
        } else if (index == R.string.canhty || index == R.string.canhtuat || index == R.string.canhdan || index == R.string.canhthin || index == R.string.canhngo || index == R.string.canhthan) {
            saoLuuHa = cung[8];
        } else if (index == R.string.tansuu || index == R.string.tanhoi || index == R.string.tanmao || index == R.string.tanty || index == R.string.tandau || index == R.string.tanmui) {
            saoLuuHa = cung[3];
        } else if (index == R.string.nhamdan || index == R.string.nhamty || index == R.string.nhamthin || index == R.string.nhamngo || index == R.string.nhamthan || index == R.string.nhamtuat) {
            saoLuuHa = cung[11];
        } else {
            saoLuuHa = cung[2];
        }
    }

    public void anThientru() {
        int index = yearOfAnimal(year, month, day);
        if (index == R.string.giapdan || index == R.string.giapty || index == R.string.giapthin || index == R.string.giapngo || index == R.string.giapthan || index == R.string.giaptuat) {
            saoThienTru = cung[5];
        } else if (index == R.string.atsuu || index == R.string.athoi || index == R.string.atmao || index == R.string.atty || index == R.string.atdau || index == R.string.atmui) {
            saoThienTru = cung[6];
        } else if (index == R.string.binhty || index == R.string.binhdan || index == R.string.binhthin || index == R.string.binhngo || index == R.string.binhthan || index == R.string.binhtuat) {
            saoThienTru = cung[0];
        } else if (index == R.string.dinhhoi || index == R.string.dinhmao || index == R.string.dinhty || index == R.string.dinhmui || index == R.string.dinhdau || index == R.string.dinhsuu) {
            saoThienTru = cung[5];
        } else if (index == R.string.mauthan || index == R.string.mauty || index == R.string.maudan || index == R.string.mauthin || index == R.string.maungo || index == R.string.mautuat) {
            saoThienTru = cung[6];
        } else if (index == R.string.kydau || index == R.string.kyhoi || index == R.string.kymui || index == R.string.kymao || index == R.string.kysuu || index == R.string.kyty) {
            saoThienTru = cung[8];
        } else if (index == R.string.canhty || index == R.string.canhtuat || index == R.string.canhdan || index == R.string.canhthin || index == R.string.canhngo || index == R.string.canhthan) {
            saoThienTru = cung[2];
        } else if (index == R.string.tansuu || index == R.string.tanhoi || index == R.string.tanmao || index == R.string.tanty || index == R.string.tandau || index == R.string.tanmui) {
            saoThienTru = cung[6];
        } else if (index == R.string.nhamdan || index == R.string.nhamty || index == R.string.nhamthin || index == R.string.nhamngo || index == R.string.nhamthan || index == R.string.nhamtuat) {
            saoThienTru = cung[9];
        } else {
            saoThienTru = cung[10];
        }
    }

    public void anLuunienvantinh() {
        int index = yearOfAnimal(year, month, day);
        if (index == R.string.giapdan || index == R.string.giapty || index == R.string.giapthin || index == R.string.giapngo || index == R.string.giapthan || index == R.string.giaptuat) {
            saoLuuNienVanTinh = cung[5];
        } else if (index == R.string.atsuu || index == R.string.athoi || index == R.string.atmao || index == R.string.atty || index == R.string.atdau || index == R.string.atmui) {
            saoLuuNienVanTinh = cung[6];
        } else if (index == R.string.binhty || index == R.string.binhdan || index == R.string.binhthin || index == R.string.binhngo || index == R.string.binhthan || index == R.string.binhtuat) {
            saoLuuNienVanTinh = cung[8];
        } else if (index == R.string.dinhhoi || index == R.string.dinhmao || index == R.string.dinhty || index == R.string.dinhmui || index == R.string.dinhdau || index == R.string.dinhsuu) {
            saoLuuNienVanTinh = cung[9];
        } else if (index == R.string.mauthan || index == R.string.mauty || index == R.string.maudan || index == R.string.mauthin || index == R.string.maungo || index == R.string.mautuat) {
            saoLuuNienVanTinh = cung[8];
        } else if (index == R.string.kydau || index == R.string.kyhoi || index == R.string.kymui || index == R.string.kymao || index == R.string.kysuu || index == R.string.kyty) {
            saoLuuNienVanTinh = cung[9];
        } else if (index == R.string.canhty || index == R.string.canhtuat || index == R.string.canhdan || index == R.string.canhthin || index == R.string.canhngo || index == R.string.canhthan) {
            saoLuuNienVanTinh = cung[11];
        } else if (index == R.string.tansuu || index == R.string.tanhoi || index == R.string.tanmao || index == R.string.tanty || index == R.string.tandau || index == R.string.tanmui) {
            saoLuuNienVanTinh = cung[0];
        } else if (index == R.string.nhamdan || index == R.string.nhamty || index == R.string.nhamthin || index == R.string.nhamngo || index == R.string.nhamthan || index == R.string.nhamtuat) {
            saoLuuNienVanTinh = cung[2];
        } else {
            saoLuuNienVanTinh = cung[3];
        }
    }

    public void anBacsi() {
        int index = convertCungToNumber(saoLocTon);
        saoBacSi = cung[index];
    }

    public void anDauquan() {
        int index = convertCungToNumber(saoThaiTue);
        index = antiClockwise(index, chineseMonth + 1);
        index = counterClockwise(index, sogio(gioSinh(time)) + 1);
        saoDauQuan = cung[index];

    }

    public void anThienkhong() {
        int index = convertCungToNumber(saoThaiTue);
        index = counterClockwise(index, 2);
        saoThienKhong = cung[index];

    }

    public boolean fallInTheRange(int year1, int month1, int day1, int year2, int month2, int day2) {
        Date birthday = convertDate(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean result = false;
        try {
            Date date1 = convertDate(year1, month1, day1);
            Date date2 = convertDate(year2, month2, day2);
            if ((birthday.after(date1) || birthday.equals(date1)) && (birthday.before(date2) || birthday.equals(date2))) {
                result = true;
            }
        } catch (Exception e) {
        }
        return result;
    }

    public void anTuantriet() {
        if (fallInTheRange(1984, 2, 2, 1994, 2, 9)) {
            //giap ty den quy dau
            saoTuan = cung[10];
            saoTuan1 = cung[11];
        } else if (fallInTheRange(1994, 2, 10, 2004, 1, 21)) {
            //giap tuat den quy mui
            saoTuan = cung[8];
            saoTuan1 = cung[9];
        } else if (fallInTheRange(1944, 1, 25, 1954, 2, 2) || fallInTheRange(2004, 1, 2, 2014, 1, 30)) {
            saoTuan = cung[6];
            saoTuan1 = cung[7];
        } else if (fallInTheRange(1954, 2, 3, 1964, 2, 12)) {
            saoTuan = cung[4];
            saoTuan = cung[5];
        } else if (fallInTheRange(1964, 2, 13, 1974, 1, 22)) {
            saoTuan = cung[3];
            saoTuan = cung[2];
        } else {
            saoTuan = cung[0];
            saoTuan1 = cung[1];
        }

        //an sao triet
        int index = yearOfAnimal(year, month, day);
        if (index == R.string.giapdan || index == R.string.giaptuat || index == R.string.giapthin || index == R.string.giapthan || index == R.string.giapngo || index == R.string.giapty
                || index == R.string.kyty || index == R.string.kysuu || index == R.string.kymao || index == R.string.kymui || index == R.string.kydau || index == R.string.kyhoi) {
            saoTriet = cung[8];
            saoTriet1 = cung[9];
        } else if (index == R.string.atmui || index == R.string.atdau || index == R.string.atty || index == R.string.atmao || index == R.string.athoi || index == R.string.atsuu
                || index == R.string.canhthan || index == R.string.canhngo || index == R.string.canhthin || index == R.string.canhdan || index == R.string.canhtuat || index == R.string.canhty) {
            saoTriet = cung[6];
            saoTriet1 = cung[7];
        } else if (index == R.string.binhtuat || index == R.string.binhthan || index == R.string.binhngo || index == R.string.binhthin || index == R.string.binhdan || index == R.string.binhty
                || index == R.string.tanmui || index == R.string.tandau || index == R.string.tanty || index == R.string.tanmao || index == R.string.tanhoi || index == R.string.tansuu) {
            saoTriet = cung[4];
            saoTriet1 = cung[5];

        } else if (index == R.string.dinhsuu || index == R.string.dinhdau || index == R.string.dinhmui || index == R.string.dinhty || index == R.string.dinhhoi || index == R.string.dinhmao
                || index == R.string.mauthan || index == R.string.mautuat || index == R.string.maungo || index == R.string.mauthin || index == R.string.maudan || index == R.string.mauty) {
            saoTriet = cung[2];
            saoTriet1 = cung[3];
        } else {
            saoTriet = cung[0];
            saoTriet1 = cung[1];
        }
    }

    public String saoTuViQuality() {
        int index = convertCungToNumber(saoTuVi);
        if (index == 5 || index == 6 || index == 2 || index == 8)
            return "Mieu dia";
        else if (index == 10 || index == 4) return "Vuong dia";
        else if (index == 7 || index == 1) return "Dac dia";
        else return "Binh hoa";
    }
    public String saoTangMonQuality(){
        int index=convertCungToNumber(saoTangMon);
        if(index==2 || index==8 || index==3 || index==9){
            return "Dac dia";
        }
        else return "Ham dia";
    }
    public String saoBachToQuality(){
        int index=convertCungToNumber(saoBachTo);
        if(index==2 || index==8 || index==3 || index==9){
            return "Dac dia";
        }
        else return "Ham dia";
    }

    public String saoLiemTrinhQuality() {
        int index = convertCungToNumber(saoLiemTrinh);
        if (index == 4 || index == 10)
            return "Mieu dia";
        else if (index == 0 || index == 2 || index == 6 || index == 8) return "Vuong dia";
        else if (index == 1 || index == 7) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThienDongQuality() {
        int index = convertCungToNumber(saoThienDong);
        if (index == 2 || index == 8)
            return "Mieu dia";
        else if (index == 0) return "Vuong dia";
        else if (index == 3 || index == 5 || index == 11) return "Dac dia";
        else return "Ham dia";
    }

    public String saoVuKhucQuality() {
        int index = convertCungToNumber(saoVuKhuc);
        if (index == 1 || index == 4 || index == 7 || index == 10)
            return "Mieu dia";
        else if (index == 0 || index == 2 || index == 6 || index == 8) return "Vuong dia";
        else if (index == 3 || index == 9) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThaiDuongQuality() {
        int index = convertCungToNumber(saoThaiDuong);
        if (index == 5 || index == 6)
            return "Mieu dia";
        else if (index == 2 || index == 3 || index == 4) return "Vuong dia";
        else if (index == 1 || index == 7) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThienCoQuality() {
        int index = convertCungToNumber(saoThienCo);
        if (index == 3 || index == 4 || index == 9 || index == 10)
            return "Mieu dia";
        else if (index == 5 || index == 8) return "Vuong dia";
        else if (index == 0 || index == 1 || index == 6 || index == 7) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThienPhuQuality() {
        int index = convertCungToNumber(saoThienPhu);
        if (index == 0 || index == 2 || index == 6 || index == 8)
            return "Mieu dia";
        else if (index == 4 || index == 10) return "Vuong dia";
        else if (index == 5 || index == 7 || index == 11) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThaiAmQuality() {
        int index = convertCungToNumber(saoThaiAm);
        if (index == 9 || index == 10 || index == 11)
            return "Mieu dia";
        else if (index == 0 || index == 8) return "Vuong dia";
        else if (index == 1 || index == 7) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThamLangQuality() {
        int index = convertCungToNumber(saoThamLang);
        if (index == 1 || index == 7)
            return "Mieu dia";
        else if (index == 4 || index == 10) return "Vuong dia";
        else if (index == 2 || index == 8) return "Dac dia";
        else return "Ham dia";
    }

    public String saoCuMonQuality() {
        int index = convertCungToNumber(saoCumon);
        if (index == 3 || index == 9)
            return "Mieu dia";
        else if (index == 0 || index == 2 || index == 6) return "Vuong dia";
        else if (index == 8 || index == 11) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThienTuongQuality() {
        int index = convertCungToNumber(saoThienTuong);
        if (index == 2 || index == 8)
            return "Mieu dia";
        else if (index == 0 || index == 4 || index == 6 || index == 10) return "Vuong dia";
        else if (index == 1 || index == 5 || index == 7 || index == 11) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThienLuongQuality() {
        int index = convertCungToNumber(saoThienLuong);
        if (index == 4 || index == 6 || index == 10)
            return "Mieu dia";
        else if (index == 0 || index == 2 || index == 3 || index == 8) return "Vuong dia";
        else if (index == 1 || index == 7) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThatSatQuality() {
        int index = convertCungToNumber(saoThatSat);
        if (index == 0 || index == 2 || index == 6 || index == 8)
            return "Mieu dia";
        else if (index == 5 || index == 11) return "Vuong dia";
        else if (index == 1 || index == 7) return "Dac dia";
        else return "Ham dia";
    }

    public String saoPhaQuanQuality() {
        int index = convertCungToNumber(saoPhaQuan);
        if (index == 0 || index == 6)
            return "Mieu dia";
        else if (index == 1 || index == 7) return "Vuong dia";
        else if (index == 4 || index == 10) return "Dac dia";
        else return "Ham dia";
    }

    public String saoKinhDuongQuality() {
        int index = convertCungToNumber(saoKinhDuong);
        if (index == 1 || index == 4 || index == 7 || index == 10)
            return "Dac dia";
        else return "Ham dia";

    }

    public String saoHoaTinhQuality() {
        int index = convertCungToNumber(saoHoaTinh);
        if (index == 2 || index == 3 || index == 4 || index == 5 || index == 6)
            return "Dac dia";

        else return "Ham dia";
    }

    public String saoVanXuongQuality() {
        int index = convertCungToNumber(saoVanXuong);
        if (index == 1 || index == 4 || index == 5 || index == 7 || index == 10 || index == 11)
            return "Dac dia";

        else return "Ham dia";
    }

    public String saoVanKhucQuality() {
        int index = convertCungToNumber(saoVanKhuc);
        if (index == 1 || index == 4 || index == 5 || index == 7 || index == 10 || index == 11)
            return "Dac dia";

        else return "Ham dia";
    }

    public String saoDiaKiepQuality() {
        int index = convertCungToNumber(saoDiaKiep);
        if (index == 2 || index == 5 || index == 8 || index == 11)
            return "Dac dia";

        else return "Ham dia";
    }

    public String saoDiaKhongQuality() {
        int index = convertCungToNumber(saoDiaKhong);
        if (index == 2 || index == 5 || index == 8 || index == 11)
            return "Dac dia";

        else return "Ham dia";

    }

    public String saoHoaKyQuality() {
        int index = convertCungToNumber(saoHoaKy);
        if (index == 1 || index == 4 || index == 7 || index == 10)
            return "Dac dia";

        else return "Ham dia";

    }

    public String saoDaiHaoQuality() {
        int index = convertCungToNumber(saoDaiHao);
        if (index == 2 || index == 3 || index == 8 || index == 9)
            return "Dac dia";

        else return "Ham dia";

    }

    public String saoTieuHaoQuality() {
        int index = convertCungToNumber(saoTieuHao);
        if (index == 2 || index == 3 || index == 8 || index == 9)
            return "Dac dia";

        else return "Ham dia";

    }

    public String saoThienKhocQuality() {
        int index = convertCungToNumber(saoThienKhoc);
        if (index == 0 || index == 1 || index == 3 || index == 6 || index == 7 || index == 9)
            return "Dac dia";

        else return "Ham dia";

    }

    public String saoThienHuQuality() {
        int index = convertCungToNumber(saoThienHu);
        if (index == 0 || index == 1 || index == 3 || index == 6 || index == 7 || index == 9)
            return "Dac dia";

        else return "Ham dia";

    }

    public String saoThienMaQuality() {
        int index = convertCungToNumber(saoThienMa);
        if (index == 2 || index == 5)
            return "Dac dia";

        else return "Ham dia";

    }

    public String saoThienHinhQuality() {
        int index = convertCungToNumber(saoThienHinh);
        if (index == 2 || index == 3 || index == 8 || index == 9)
            return "Dac dia";

        else return "Ham dia";

    }

    public String saoThienRieuQuality() {
        int index = convertCungToNumber(saoThienRieu);
        if (index == 2 || index == 3 || index == 9 || index == 10)
            return "Dac dia";

        else return "Ham dia";

    }
    public String saoDaLaQuality(){
        int index=convertCungToNumber(saoDala);
        if(index==4 || index==10 || index==1 || index==7){
            return "Dac dia";
        }else
            return "Ham dia";
    }

    //Dinh Huong Chieu
    public ArrayList<Integer> getTamhopchieu(int currentIndex) {
        ArrayList<Integer> tamhop = new ArrayList<Integer>();
        if (currentIndex == 0) {
            tamhop.add(8);
            tamhop.add(4);
        } else if (currentIndex == 1) {
            tamhop.add(5);
            tamhop.add(9);
        } else if (currentIndex == 2) {
            tamhop.add(6);
            tamhop.add(10);
        } else if (currentIndex == 3) {
            tamhop.add(11);
            tamhop.add(7);
        } else if (currentIndex == 4) {
            tamhop.add(0);
            tamhop.add(8);
        } else if (currentIndex == 5) {
            tamhop.add(9);
            tamhop.add(1);
        } else if (currentIndex == 6) {
            tamhop.add(2);
            tamhop.add(10);
        } else if (currentIndex == 7) {
            tamhop.add(3);
            tamhop.add(11);
        } else if (currentIndex == 8) {
            tamhop.add(0);
            tamhop.add(4);
        } else if (currentIndex == 9) {
            tamhop.add(1);
            tamhop.add(5);
        } else if (currentIndex == 10) {
            tamhop.add(2);
            tamhop.add(6);
        } else if (currentIndex == 11) {
            tamhop.add(3);
            tamhop.add(7);
        }
        return tamhop;
    }

    public int getXungchieu(int currentIndex) {
        switch (currentIndex) {
            case 0:
                return 6;

            case 1:
                return 7;

            case 2:
                return 8;

            case 3:
                return 9;

            case 4:
                return 10;

            case 5:
                return 11;

            case 6:
                return 0;

            case 7:
                return 1;

            case 8:
                return 2;

            case 9:
                return 3;

            case 10:
                return 4;

            case 11:
                return 5;

            default:
                return 0;
        }
    }

    public int getNhihop(int currentIndex) {
        switch (currentIndex) {
            case 0:
                return 1;
            case 1:
                return 0;
            case 2:
                return 11;
            case 3:
                return 10;
            case 4:
                return 9;
            case 5:
                return 8;
            case 6:
                return 7;
            case 7:
                return 6;
            case 8:
                return 5;
            case 9:
                return 4;
            case 10:
                return 3;
            case 11:
                return 2;
            default:
                return 0;
        }
    }


    //Phan Boi
    public void generalPrediction() {
        if (gender.equalsIgnoreCase("Male")) {
            int index = convertFromNamSinh(yearOfAnimal(year, month, day));
            if (index == 6 || index == 7) {
                if (convertCungToNumber(cungMenh) == 0 || convertCungToNumber(cungMenh) == 1) {
                    generalString.add(R.string.general1);
                }
            }
        }
        if (gender.equalsIgnoreCase("Female")) {
            int index = convertCungToNumber(cungMenh);
            int index1 = convertCungToNumber(saoMo);
            if (index == index1) {
                generalString.add(R.string.general2);
                if (index == 9) {
                    generalString.add(R.string.general3);
                } else if (index == 0 || index == 6) generalString.add(R.string.general4);
            }
        }
        //Menh vo chinh dieu
        int index = convertCungToNumber(cungMenh);
        if (index != convertCungToNumber(saoThienLuong) && index != convertCungToNumber(saoThatSat) && index != convertCungToNumber(saoLiemTrinh)
                && index != convertCungToNumber(saoPhaQuan) && index != convertCungToNumber(saoThienDong) && index != convertCungToNumber(saoVuKhuc) && index != convertCungToNumber(saoThienPhu)
                && index != convertCungToNumber(saoThaiDuong) && index != convertCungToNumber(saoThaiAm) && index != convertCungToNumber(saoThamLang)
                && index != convertCungToNumber(saoThienCo) && index != convertCungToNumber(saoCumon) && index != convertCungToNumber(saoTuVi)
                && index != convertCungToNumber(saoThienTuong)) {
            //cung menh vo chinh dieu
            generalString.add(R.string.general5);
            //check if tuan triet an ngu hay ThienKhong , Thien Giai , giai than, dia giai
            if (index == convertCungToNumber(saoThienKhong) || index == convertCungToNumber(saoThienGiai) || index == convertCungToNumber(saoGiaiThan) || index == convertCungToNumber(saoDiaGiai)) {
                generalString.add(R.string.general6);
            }
        }
        int index1 = convertCungToNumber(cungThan);
        if (index == index1) {
            //menh than dong cung
            generalString.add(R.string.general28);
            if ((index == convertCungToNumber(saoMo)) || (index != convertCungToNumber(saoThienLuong) && index != convertCungToNumber(saoThatSat) && index != convertCungToNumber(saoLiemTrinh)
                    && index != convertCungToNumber(saoPhaQuan) && index != convertCungToNumber(saoThienDong) && index != convertCungToNumber(saoVuKhuc) && index != convertCungToNumber(saoThienPhu)
                    && index != convertCungToNumber(saoThaiDuong) && index != convertCungToNumber(saoThaiAm) && index != convertCungToNumber(saoThamLang)
                    && index != convertCungToNumber(saoThienCo) && index != convertCungToNumber(saoCumon) && index != convertCungToNumber(saoTuVi)
                    && index != convertCungToNumber(saoThienTuong))) {
                //cung mo hay la vo chinh dieu
                if (index == convertCungToNumber(saoTuan) || index == convertCungToNumber(saoTuan1) || index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1)) {
                    generalString.add(R.string.general7);
                } else
                    generalString.add(R.string.general8);
            } else if ((index == 0 || index == 6) || (index != convertCungToNumber(saoThienLuong) && index != convertCungToNumber(saoThatSat) && index != convertCungToNumber(saoLiemTrinh)
                    && index != convertCungToNumber(saoPhaQuan) && index != convertCungToNumber(saoThienDong) && index != convertCungToNumber(saoVuKhuc) && index != convertCungToNumber(saoThienPhu)
                    && index != convertCungToNumber(saoThaiDuong) && index != convertCungToNumber(saoThaiAm) && index != convertCungToNumber(saoThamLang)
                    && index != convertCungToNumber(saoThienCo) && index != convertCungToNumber(saoCumon) && index != convertCungToNumber(saoTuVi)
                    && index != convertCungToNumber(saoThienTuong))) {
                generalString.add(R.string.general9);
                if (index == convertCungToNumber(saoHoaLoc)) {
                    generalString.add(R.string.general10);
                } else
                    generalString.add(R.string.general11);
            }
        }
        if ((index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1)) && (index1 == convertCungToNumber(saoTuan) || index1 == convertCungToNumber(saoTuan1))) {
            //menh triet than tuan
            //if vo chinh dieu
            if (index != convertCungToNumber(saoThienLuong) && index != convertCungToNumber(saoThatSat) && index != convertCungToNumber(saoLiemTrinh)
                    && index != convertCungToNumber(saoPhaQuan) && index != convertCungToNumber(saoThienDong) && index != convertCungToNumber(saoVuKhuc) && index != convertCungToNumber(saoThienPhu)
                    && index != convertCungToNumber(saoThaiDuong) && index != convertCungToNumber(saoThaiAm) && index != convertCungToNumber(saoThamLang)
                    && index != convertCungToNumber(saoThienCo) && index != convertCungToNumber(saoCumon) && index != convertCungToNumber(saoTuVi)
                    && index != convertCungToNumber(saoThienTuong)) {
                generalString.add(R.string.general12);
            }
        }
        //menh khong than kiep
        if (index == convertCungToNumber(saoDiaKhong) && index1 == convertCungToNumber(saoDiaKiep)) {
            generalString.add(R.string.general13);
            if (index == convertCungToNumber(saoTieuHao) || index == convertCungToNumber(saoDaiHao) && (index != convertCungToNumber(saoThienLuong) && index != convertCungToNumber(saoThatSat) && index != convertCungToNumber(saoLiemTrinh)
                    && index != convertCungToNumber(saoPhaQuan) && index != convertCungToNumber(saoThienDong) && index != convertCungToNumber(saoVuKhuc) && index != convertCungToNumber(saoThienPhu)
                    && index != convertCungToNumber(saoThaiDuong) && index != convertCungToNumber(saoThaiAm) && index != convertCungToNumber(saoThamLang)
                    && index != convertCungToNumber(saoThienCo) && index != convertCungToNumber(saoCumon) && index != convertCungToNumber(saoTuVi)
                    && index != convertCungToNumber(saoThienTuong))) {
                generalString.add(R.string.general14);
                if (index == convertCungToNumber(saoThienDong) || index == convertCungToNumber(saoThienLuong) || index == convertCungToNumber(saoPhaQuan) ||
                        index1 == convertCungToNumber(saoThienDong) || index1 == convertCungToNumber(saoThienLuong) || index1 == convertCungToNumber(saoPhaQuan)) {
                    generalString.add(R.string.general15);
                }
            }
        }
        //menh kiep than khong
        if (index == convertCungToNumber(saoDiaKiep) && index1 == convertCungToNumber(saoDiaKhong)) {
            generalString.add(R.string.general16);
            if (index != convertCungToNumber(saoThienLuong) && index != convertCungToNumber(saoThatSat) && index != convertCungToNumber(saoLiemTrinh)
                    && index != convertCungToNumber(saoPhaQuan) && index != convertCungToNumber(saoThienDong) && index != convertCungToNumber(saoVuKhuc) && index != convertCungToNumber(saoThienPhu)
                    && index != convertCungToNumber(saoThaiDuong) && index != convertCungToNumber(saoThaiAm) && index != convertCungToNumber(saoThamLang)
                    && index != convertCungToNumber(saoThienCo) && index != convertCungToNumber(saoCumon) && index != convertCungToNumber(saoTuVi)
                    && index != convertCungToNumber(saoThienTuong)) {
                generalString.add(R.string.general17);
            }
        }
        //than cu thien di
        if (index1 == convertCungToNumber(cungThienDi)) {
            generalString.add(R.string.general18);
            if (index1 == convertCungToNumber(saoTuan) || index1 == convertCungToNumber(saoTuan1) || index1 == convertCungToNumber(saoTriet)
                    || index1 == convertCungToNumber(saoTriet1)) {
                generalString.add(R.string.general19);
            }
        }
        if (index1 == convertCungToNumber(cungTheThiep)) {
            generalString.add(R.string.general27);
            if (index1 == convertCungToNumber(saoThaiAm)) {
                generalString.add(R.string.general20);
            }
            if (index1 == convertCungToNumber(saoTuan) || index1 == convertCungToNumber(saoTuan1) || index1 == convertCungToNumber(saoTriet1) || index1 == convertCungToNumber(saoTriet)) {
                generalString.add(R.string.general21);
            }
        }
        if (index1 == convertCungToNumber(cungTaiBach)) {
            generalString.add(R.string.general22);
            if (index1 == convertCungToNumber(saoThienCo) || index1 == convertCungToNumber(saoThaiAm) || index1 == convertCungToNumber(saoThienDong)
                    || index1 == convertCungToNumber(saoThienLuong) || index1 == convertCungToNumber(saoThatSat) || index1 == convertCungToNumber(saoLiemTrinh)
                    || index1 == convertCungToNumber(saoThamLang)) {
                generalString.add(R.string.general23);
            }
            if (index1 == convertCungToNumber(saoDaiHao) || index1 == convertCungToNumber(saoTieuHao) || index1 == convertCungToNumber(saoHoaQuyen)
                    || index1 == convertCungToNumber(saoHoaLoc) || index1 == convertCungToNumber(saoDiaKiep) || index1 == convertCungToNumber(saoHoaTinh)) {
                generalString.add(R.string.general24);
            }
            if (index1 == convertCungToNumber(saoLuuHa) || index1 == convertCungToNumber(saoDiaKiep)) {
                generalString.add(R.string.general25);
            }
        }
        if (index1 == convertCungToNumber(cungQuanloc)) {
            generalString.add(R.string.general26);
            if ((index1 == convertCungToNumber(saoTuan) || index1 == convertCungToNumber(saoTuan1)
                    || index1 == convertCungToNumber(saoTriet) || index1 == convertCungToNumber(saoTriet1))
                    && (index1 == convertCungToNumber(saoDiaKiep) || index1 == convertCungToNumber(saoHoaKy))) {
                generalString.add(R.string.general29);
            }
            if ((index1 == convertCungToNumber(saoTuan) || index1 == convertCungToNumber(saoTuan1)
                    || index1 == convertCungToNumber(saoTriet) || index1 == convertCungToNumber(saoTriet1))
                    && (index1 == convertCungToNumber(saoThatSat)) || index1 == convertCungToNumber(saoKiepSat)) {
                generalString.add(R.string.general30);
                {
                    if (index1 == convertCungToNumber(saoTangMon) || index1 == convertCungToNumber(saoPhiLiem)) {
                        generalString.add(R.string.general31);
                    }
                }
            }

        }
        if (index1 == convertCungToNumber(cungPhucDuc)) {
            generalString.add(R.string.general32);
        }
    }
        public ArrayList<Integer> getCungSao(int currentIndex) {
            ArrayList<Integer> cungmenhsao = new ArrayList<Integer>();
           if(convertCungToNumber(saoTuVi)==currentIndex) cungmenhsao.add(R.string.tuvi);
           if(convertCungToNumber(saoLiemTrinh)==currentIndex) cungmenhsao.add(R.string.liemtrinh);
           if(convertCungToNumber(saoThienDong)==currentIndex) cungmenhsao.add(R.string.thiendong);
           if(convertCungToNumber(saoVuKhuc)==currentIndex) cungmenhsao.add(R.string.vukhuc);
            if(convertCungToNumber(saoThaiDuong)==currentIndex) cungmenhsao.add(R.string.thaiduong);
            if(convertCungToNumber(saoThienCo)==currentIndex) cungmenhsao.add(R.string.thienco);
            if(convertCungToNumber(saoThienPhu)==currentIndex) cungmenhsao.add(R.string.thienphu);
            if(convertCungToNumber(saoThaiAm)==currentIndex) cungmenhsao.add(R.string.thaiam);
            if(convertCungToNumber(saoThamLang)==currentIndex) cungmenhsao.add(R.string.thamlang);
            if(convertCungToNumber(saoCumon)==currentIndex) cungmenhsao.add(R.string.cumon);
            if(convertCungToNumber(saoThienTuong)==currentIndex) cungmenhsao.add(R.string.thientuong);
            if(convertCungToNumber(saoThienLuong)==currentIndex) cungmenhsao.add(R.string.thienluong);
            if(convertCungToNumber(saoThatSat)==currentIndex) cungmenhsao.add(R.string.thatsat);
            if(convertCungToNumber(saoPhaQuan)==currentIndex) cungmenhsao.add(R.string.phaquan);
            if(convertCungToNumber(saoThaiTue)==currentIndex) cungmenhsao.add(R.string.thaitue);
            if(convertCungToNumber(saoThieuDuong)==currentIndex) cungmenhsao.add(R.string.thieuduong);
            if(convertCungToNumber(saoTangMon)==currentIndex) cungmenhsao.add(R.string.tangmon);
            if(convertCungToNumber(saoThieuAm)==currentIndex) cungmenhsao.add(R.string.thieuam);
            if(convertCungToNumber(saoQuanPhu2)==currentIndex) cungmenhsao.add(R.string.quanphu);
            if(convertCungToNumber(saoTuPhu)==currentIndex) cungmenhsao.add(R.string.tuphu);
            if(convertCungToNumber(saoTuePha)==currentIndex) cungmenhsao.add(R.string.tuepha);
            if(convertCungToNumber(saoLongDuc)==currentIndex) cungmenhsao.add(R.string.longduc);
            if(convertCungToNumber(saoBachTo)==currentIndex) cungmenhsao.add(R.string.bachho);
            if(convertCungToNumber(saoPhucDuc)==currentIndex) cungmenhsao.add(R.string.phucduc);
            if(convertCungToNumber(saoDieuKhach)==currentIndex) cungmenhsao.add(R.string.dieukhach);
            if(convertCungToNumber(saoTrucPhu)==currentIndex) cungmenhsao.add(R.string.trucphu);
            if(convertCungToNumber(saoLocTon)==currentIndex) cungmenhsao.add(R.string.locton);
            if(convertCungToNumber(saoLucSi)==currentIndex) cungmenhsao.add(R.string.lucsi);
            if(convertCungToNumber(saoThanhLong)==currentIndex) cungmenhsao.add(R.string.thanhlong);
            if(convertCungToNumber(saoTieuHao)==currentIndex) cungmenhsao.add(R.string.tieuhao);
            if(convertCungToNumber(saoTuongQuan)==currentIndex) cungmenhsao.add(R.string.tuongquan);
            if(convertCungToNumber(saoTauThu)==currentIndex) cungmenhsao.add(R.string.tauthu);
            if(convertCungToNumber(saoPhiLiem)==currentIndex) cungmenhsao.add(R.string.philiem);
            if(convertCungToNumber(saoHiThan)==currentIndex) cungmenhsao.add(R.string.hithan);
            if(convertCungToNumber(saoBenhPhu)==currentIndex) cungmenhsao.add(R.string.benhphu);
            if(convertCungToNumber(saoDaiHao)==currentIndex) cungmenhsao.add(R.string.daihao);
            if(convertCungToNumber(saoPhucBinh)==currentIndex) cungmenhsao.add(R.string.phucbinh);
            if(convertCungToNumber(saoQuanPhu2)==currentIndex) cungmenhsao.add(R.string.quanphu);
            if(convertCungToNumber(saoTruongSinh)==currentIndex) cungmenhsao.add(R.string.truongsinh);
            if(convertCungToNumber(saoMocDuc)==currentIndex) cungmenhsao.add(R.string.mocduc);
            if(convertCungToNumber(saoQuanDoi)==currentIndex) cungmenhsao.add(R.string.quandoi);
            if(convertCungToNumber(saoLamQuan)==currentIndex) cungmenhsao.add(R.string.lamquan);
            if(convertCungToNumber(saoDeVuong)==currentIndex) cungmenhsao.add(R.string.devuong);
            if(convertCungToNumber(saoSuy)==currentIndex) cungmenhsao.add(R.string.suy);
            if(convertCungToNumber(saoBenh)==currentIndex) cungmenhsao.add(R.string.benh);
            if(convertCungToNumber(saoTu)==currentIndex) cungmenhsao.add(R.string.tu);
            if(convertCungToNumber(saoMo)==currentIndex) cungmenhsao.add(R.string.mo);
            if(convertCungToNumber(saoTuyet)==currentIndex) cungmenhsao.add(R.string.tuyet);
            if(convertCungToNumber(saoThai)==currentIndex) cungmenhsao.add(R.string.thai);
            if(convertCungToNumber(saoDuong)==currentIndex) cungmenhsao.add(R.string.duong4);
            if(convertCungToNumber(saoKinhDuong)==currentIndex) cungmenhsao.add(R.string.kinhduong);
            if(convertCungToNumber(saoDala)==currentIndex) cungmenhsao.add(R.string.dala);
            if(convertCungToNumber(saoDiaKiep)==currentIndex) cungmenhsao.add(R.string.diakiep);
            if(convertCungToNumber(saoDiaKhong)==currentIndex) cungmenhsao.add(R.string.diakhong);
            if(convertCungToNumber(saoHoaTinh)==currentIndex) cungmenhsao.add(R.string.hoatinh);
            if(convertCungToNumber(saoLinhTinh)==currentIndex) cungmenhsao.add(R.string.linhtinh);
            if(convertCungToNumber(saoTaPhu)==currentIndex) cungmenhsao.add(R.string.taphu);
            if(convertCungToNumber(saoHuuBat)==currentIndex) cungmenhsao.add(R.string.huubat);
            if(convertCungToNumber(saoVanXuong)==currentIndex) cungmenhsao.add(R.string.vanxuong);
            if(convertCungToNumber(saoVanKhuc)==currentIndex) cungmenhsao.add(R.string.vankhuc);
            if(convertCungToNumber(saoLongTri)==currentIndex) cungmenhsao.add(R.string.longtri);
            if(convertCungToNumber(saoPhuongCac)==currentIndex) cungmenhsao.add(R.string.phuongcac);
            if(convertCungToNumber(saoThienKhoi)==currentIndex) cungmenhsao.add(R.string.thienkhoi);
            if(convertCungToNumber(saoThienViet)==currentIndex) cungmenhsao.add(R.string.thienviet);
            if(convertCungToNumber(saoThienKhoc)==currentIndex) cungmenhsao.add(R.string.thienkhoc);
            if(convertCungToNumber(saoThienHu)==currentIndex) cungmenhsao.add(R.string.thienhu);
            if(convertCungToNumber(saoTamThai)==currentIndex) cungmenhsao.add(R.string.tamthai);
            if(convertCungToNumber(saoBatToa)==currentIndex) cungmenhsao.add(R.string.battoa);
            if(convertCungToNumber(saoAnQuang)==currentIndex) cungmenhsao.add(R.string.anquang);
            if(convertCungToNumber(saoThienQui)==currentIndex) cungmenhsao.add(R.string.thienquy);
            if(convertCungToNumber(saoThienDuc)==currentIndex) cungmenhsao.add(R.string.thienduc);
            if(convertCungToNumber(saoNguyetDuc)==currentIndex) cungmenhsao.add(R.string.nguyetduc);
            if(convertCungToNumber(saoThienHinh)==currentIndex) cungmenhsao.add(R.string.thienhinh);
            if(convertCungToNumber(saoThienY)==currentIndex) cungmenhsao.add(R.string.thieny);
            if(convertCungToNumber(saoThienRieu)==currentIndex) cungmenhsao.add(R.string.thienrieu);
            if(convertCungToNumber(saoHongLoan)==currentIndex) cungmenhsao.add(R.string.hongloan);
            if(convertCungToNumber(saoThienHi)==currentIndex) cungmenhsao.add(R.string.thienhi);
            if(convertCungToNumber(saoQuocAn)==currentIndex) cungmenhsao.add(R.string.quocan);
            if(convertCungToNumber(saoDuongPhu)==currentIndex) cungmenhsao.add(R.string.duongphu);
            if(convertCungToNumber(saoThienGiai)==currentIndex) cungmenhsao.add(R.string.thiengiai);
            if(convertCungToNumber(saoDiaGiai)==currentIndex) cungmenhsao.add(R.string.diagiai);
            if(convertCungToNumber(saoGiaiThan)==currentIndex) cungmenhsao.add(R.string.giaithan);
            if(convertCungToNumber(saoThaiPhu)==currentIndex) cungmenhsao.add(R.string.thaiphu);
            if(convertCungToNumber(saoPhongCao)==currentIndex) cungmenhsao.add(R.string.phongcao);
            if(convertCungToNumber(saoThienTai)==currentIndex) cungmenhsao.add(R.string.thientai);
            if(convertCungToNumber(saoThienTho)==currentIndex) cungmenhsao.add(R.string.thientho);
            if(convertCungToNumber(saoThienThuong)==currentIndex) cungmenhsao.add(R.string.thienthuong);
            if(convertCungToNumber(saoThienSu)==currentIndex) cungmenhsao.add(R.string.thiensu);
            if(convertCungToNumber(saoThienLa)==currentIndex) cungmenhsao.add(R.string.thienla);
            if(convertCungToNumber(saoDiaVong)==currentIndex) cungmenhsao.add(R.string.diavong);
            if(convertCungToNumber(saoHoaLoc)==currentIndex) cungmenhsao.add(R.string.hoaloc);
            if(convertCungToNumber(saoHoaQuyen)==currentIndex) cungmenhsao.add(R.string.hoaquyen);
            if(convertCungToNumber(saoHoaKhoa)==currentIndex) cungmenhsao.add(R.string.hoakhoa);
            if(convertCungToNumber(saoHoaKy)==currentIndex) cungmenhsao.add(R.string.hoaky);
            if(convertCungToNumber(saoCoThan)==currentIndex) cungmenhsao.add(R.string.cothan);
            if(convertCungToNumber(saoQuaTu)==currentIndex) cungmenhsao.add(R.string.quatu);
            if(convertCungToNumber(saoThienQuan)==currentIndex) cungmenhsao.add(R.string.thienquan);
            if(convertCungToNumber(saoThienPhuc)==currentIndex) cungmenhsao.add(R.string.thienphuc);
            if(convertCungToNumber(saoDaoHoa)==currentIndex) cungmenhsao.add(R.string.daohoa);
            if(convertCungToNumber(saoThienMa)==currentIndex) cungmenhsao.add(R.string.thienma);
            if(convertCungToNumber(saoPhaToai)==currentIndex) cungmenhsao.add(R.string.phatoai);
            if(convertCungToNumber(saoKiepSat)==currentIndex) cungmenhsao.add(R.string.kiepsat);
            if(convertCungToNumber(saoHoaCai)==currentIndex) cungmenhsao.add(R.string.hoacai);
            if(convertCungToNumber(saoLuuHa)==currentIndex) cungmenhsao.add(R.string.luuha);
            if(convertCungToNumber(saoThienTru)==currentIndex) cungmenhsao.add(R.string.thientru);
            if(convertCungToNumber(saoLuuNienVanTinh)==currentIndex) cungmenhsao.add(R.string.luunienvantinh);
            if(convertCungToNumber(saoBacSi)==currentIndex) cungmenhsao.add(R.string.bacsi);
            if(convertCungToNumber(saoDauQuan)==currentIndex) cungmenhsao.add(R.string.dauquan);
            if(convertCungToNumber(saoThienKhong)==currentIndex) cungmenhsao.add(R.string.thienkhong);
            if(convertCungToNumber(saoTuan)==currentIndex || convertCungToNumber(saoTuan1)==currentIndex) cungmenhsao.add(R.string.tuan);
            if(convertCungToNumber(saoTriet)==currentIndex || convertCungToNumber(saoTriet1)==currentIndex)  cungmenhsao.add(R.string.triet);
                return cungmenhsao;
        }

    public void cungMenhPrediction() {
        int index = convertCungToNumber(cungMenh);
        int temp = convertCungToNumber(saoTuVi);
        int xungchieu = getXungchieu(index);
        ArrayList<Integer> tamhop = getTamhopchieu(index);
        int tamhop1 = tamhop.get(0);
        int tamhop2 = tamhop.get(1);
        int nhihop = getNhihop(index);
        //xet sao tu vi truoc
        if (index == temp) {
            //cung menh co sao tu vi
            String quality = saoTuViQuality();
            if (quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Dac dia")) {
                cungMenhString.add(R.string.cungMenhTuvi1);
            }
            if (quality.equalsIgnoreCase("Binh hoa")) {
                cungMenhString.add(R.string.cungMenhTuvi2);
            }
            if (quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Binh hoa")) {
                cungMenhString.add(R.string.cungMenhTuvi3);
            }
            if (quality.equalsIgnoreCase("Vuong dia") || quality.equalsIgnoreCase("Dac dia")) {
                cungMenhString.add(R.string.cungMenhTuvi4);
            }
            if (index == convertCungToNumber(saoThienPhu) || index == convertCungToNumber(saoVuKhuc) || index == convertCungToNumber(saoThienTuong)
                    || index == convertCungToNumber(saoVanXuong) || index == convertCungToNumber(saoVanKhuc) || index == convertCungToNumber(saoThienKhoi)
                    || index == convertCungToNumber(saoThienViet) || index == convertCungToNumber(saoHoaKhoa) || index == convertCungToNumber(saoHoaQuyen)
                    || index == convertCungToNumber(saoHoaLoc) || index == convertCungToNumber(saoLongTri) || index == convertCungToNumber(saoPhuongCac)) {
                cungMenhString.add(R.string.cungMenhTuvi5);
            }
            if (index == convertCungToNumber(saoTuan) || index == convertCungToNumber(saoTuan1) || index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1)) {
                cungMenhString.add(R.string.cungMenhTuvi6);
            }
            if (index == convertCungToNumber(saoDiaKhong) || index == convertCungToNumber(saoDiaKiep)) {
                cungMenhString.add(R.string.cungMenhTuvi7);
            }
            if ((index == 3 || index == 9) && index == convertCungToNumber(saoThamLang)) {
                cungMenhString.add(R.string.cungMenhTuvi8);
            }
            if (index == convertCungToNumber(saoThienPhu) || index == convertCungToNumber(saoHuuBat) || index == convertCungToNumber(saoTaPhu)) {
                cungMenhString.add(R.string.cungMenhTuvi9);
            }
            if (index == convertCungToNumber(saoKinhDuong)) {
                cungMenhString.add(R.string.cungMenhTuvi10);
            }
            if ((index == 5 || index == 11) && index == convertCungToNumber(saoThatSat) && (index == convertCungToNumber(saoTuan)
                    || index == convertCungToNumber(saoTuan1) || index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1))) {
                cungMenhString.add(R.string.cungMenhTuvi11);
            }
            if (index == convertCungToNumber(saoTaPhu) && index == convertCungToNumber(saoHuuBat)) {
                cungMenhString.add(R.string.cungMenhTuvi12);
            }
        }//end cung menh co sao tu vi
        temp = convertCungToNumber(saoLiemTrinh);
        if (index == temp) {
            cungMenhString.add(R.string.cungMenhLiemTrinh1);
            String quality = saoLiemTrinhQuality();
            if (quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia") || quality.equalsIgnoreCase("Dac dia")) {
                cungMenhString.add(R.string.cungMenhLiemTrinh2);
            }
            if (quality.equalsIgnoreCase("Dac dia") && (index == convertCungToNumber(saoVanXuong) || index == convertCungToNumber(saoVanKhuc))) {
                cungMenhString.add(R.string.cungMenhLiemTrinh3);
            }
            if ((quality.equalsIgnoreCase("Dac dia") || quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia"))
                    && (index == convertCungToNumber(saoKiepSat) || index == convertCungToNumber(saoThatSat) || index == convertCungToNumber(saoHoaKy) || index == convertCungToNumber(saoThienHinh))) {
                cungMenhString.add(R.string.cungMenhLiemTrinh4);
            }
            if (quality.equalsIgnoreCase("Ham dia")) {
                cungMenhString.add(R.string.cungMenhLiemTrinh5);
                if ((index == 5 || index == 11) && index == convertCungToNumber(saoHoaKy)) {
                    cungMenhString.add(R.string.cungMenhLiemTrinh6);
                }
            }
        }//end cung menh co sao liem trinh
        temp = convertCungToNumber(saoThienDong);
        if (index == temp) {
            cungMenhString.add(R.string.cungMenhThienDong1);
            String quality = saoThienDongQuality();
            if (quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia") || quality.equalsIgnoreCase("Dac dia")) {
                cungMenhString.add(R.string.cungMenhThienDong2);
                if (index == convertCungToNumber(saoThienHinh) || index == convertCungToNumber(saoThatSat)) {
                    cungMenhString.add(R.string.cungMenhThienDong5);
                }
            }
            if (quality.equalsIgnoreCase("Dac dia") && (index == 5 || index == 11)) {
                cungMenhString.add(R.string.cungMenhThienDong3);
                int nam = yearOfAnimal(year, month, day);
                if (nam == R.string.dinhdau || nam == R.string.dinhhoi || nam == R.string.dinhmao || nam == R.string.dinhmui || nam == R.string.dinhsuu || nam == R.string.dinhty
                        || nam == R.string.canhdan || nam == R.string.canhngo || nam == R.string.canhthan || nam == R.string.canhthin || nam == R.string.canhtuat || nam == R.string.canhty) {
                    cungMenhString.add(R.string.cungMenhThienDong4);
                }
            }
            if (quality.equalsIgnoreCase("Ham dia")) {
                cungMenhString.add(R.string.cungMenhThienDong6);
                if (index == 4 || index == 10 || index == 1) {
                    cungMenhString.add(R.string.cungMenhThienDong7);
                }
                if (index == 6) {
                    cungMenhString.add(R.string.cungMenhThienDong8);
                }
            }
            int nam = yearOfAnimal(year, month, day);
            if ((index == 6 || index == 10)

                    && (nam == R.string.dinhty || nam == R.string.dinhsuu || nam == R.string.dinhmui || nam == R.string.dinhmao || nam == R.string.dinhdau || nam == R.string.dinhhoi)) {
                cungMenhString.add(R.string.cungMenhThienDong9);
            }
            if ((index == 2 || index == 8) && (index == convertCungToNumber(saoThienLuong))) {
                cungMenhString.add(R.string.cungMenhThienDong10);

            }
            if ((index == 6) && (index == convertCungToNumber(saoThaiAm)) && (index == convertCungToNumber(saoThatSat) || index == convertCungToNumber(saoKiepSat))) {
                cungMenhString.add(R.string.cungMenhThienDong11);
            }
            if (index == 0 && index == convertCungToNumber(saoThaiAm)) {
                cungMenhString.add(R.string.cungMenhThienDong12);
                if (index == convertCungToNumber(saoThienKhoc) || index == convertCungToNumber(saoThienRieu) || index == convertCungToNumber(saoTangMon)) {
                    cungMenhString.add(R.string.cungMenhThienDong13);
                }
            }
        }//end cung menh co sao Thien Dong
        temp = convertCungToNumber(saoVuKhuc);
        if (index == temp) {
            cungMenhString.add(R.string.cungMenhVuKhuc1);
            String quality = saoVuKhucQuality();
            if (quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia") || quality.equalsIgnoreCase("Dac dia")) {
                cungMenhString.add(R.string.cungMenhVuKhuc2);
            }
            if ((quality.equalsIgnoreCase("Mieu dia")) && (index == 1 || index == 7)) {
                cungMenhString.add(R.string.cungMenhVuKhuc3);
            }
            if ((quality.equalsIgnoreCase("Dac dia")) && (index == 3)) {
                cungMenhString.add(R.string.cungMenhVuKhuc4);
            }
            if ((quality.equalsIgnoreCase("Dac dia")) && (index == 9)) {
                cungMenhString.add(R.string.cungMenhVuKhuc5);
            }
            if (quality.equalsIgnoreCase("Ham dia")) {
                cungMenhString.add(R.string.cungMenhVuKhuc6);
                if (index == convertCungToNumber(saoVanKhuc) || index == convertCungToNumber(saoVanXuong) || index == convertCungToNumber(saoThienKhoi)
                        || index == convertCungToNumber(saoThienViet) || index == convertCungToNumber(saoTaPhu) || index == convertCungToNumber(saoHuuBat)
                        || index == convertCungToNumber(saoHoaKhoa) || index == convertCungToNumber(saoHoaQuyen) || index == convertCungToNumber(saoHoaLoc)) {
                    cungMenhString.add(R.string.cungMenhVuKhuc7);
                }
            }
            if (index == convertCungToNumber(saoPhaQuan)) {
                cungMenhString.add(R.string.cungMenhVuKhuc8);
                if (index == convertCungToNumber(saoVanXuong) && index == convertCungToNumber(saoVanKhuc)) {
                    cungMenhString.add(R.string.cungMenhVuKhuc9);
                }
            }
        }//end cung menh co sao vu khuc;
        temp = convertCungToNumber(saoThaiDuong);
        if (index == temp) {
            String quality = saoThaiDuongQuality();
            if (quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia") || quality.equalsIgnoreCase("Dac dia")) {
                cungMenhString.add(R.string.cungMenhThaiDuong1);

            }
            if ((quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia")) && (index == convertCungToNumber(saoTuan) || index == convertCungToNumber(saoTuan1) || index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1))) {
                cungMenhString.add(R.string.cungMenhThaiDuong2);
            }
            if ((quality.equalsIgnoreCase("Dac dia")) && (index == convertCungToNumber(saoTuan) || index == convertCungToNumber(saoTuan1) || index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1))) {
                cungMenhString.add(R.string.cungMenhThaiDuong3);
            }
            if (quality.equalsIgnoreCase("Ham dia")) {
                cungMenhString.add(R.string.cungMenhThaiDuong4);
                if (index == 0 || index == 11) {
                    cungMenhString.add(R.string.cungMenhThaiDuong5);
                }
                if (index == 8 || index == 10 || index == 0) {
                    cungMenhString.add(R.string.cungMenhThaiDuong6);
                }
                if (index == convertCungToNumber(saoVanXuong) || index == convertCungToNumber(saoVanKhuc) || index == convertCungToNumber(saoThienKhoi)
                        || index == convertCungToNumber(saoThienViet) || index == convertCungToNumber(saoTaPhu) || index == convertCungToNumber(saoHuuBat)
                        || index == convertCungToNumber(saoHoaKhoa) || index == convertCungToNumber(saoHoaQuyen) || index == convertCungToNumber(saoHoaLoc) || index == convertCungToNumber(saoDaoHoa)
                        || index == convertCungToNumber(saoHongLoan) || index == convertCungToNumber(saoThienHi) || index == convertCungToNumber(saoHoaTinh)) {
                    cungMenhString.add(R.string.cungMenhThaiDuong7);
                }
                if (index == convertCungToNumber(saoTuan) || index == convertCungToNumber(saoTuan1) || index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1)) {
                    cungMenhString.add(R.string.cungMenhThaiDuong8);
                }
                if (index == convertCungToNumber(saoKinhDuong) || index == convertCungToNumber(saoDala) || index == convertCungToNumber(saoThienKhong)
                        || index == convertCungToNumber(saoKiepSat) || index == convertCungToNumber(saoHoaKy) || index == convertCungToNumber(saoThienRieu) ||
                        index == convertCungToNumber(saoThienHinh)) {
                    cungMenhString.add(R.string.cungMenhThaiDuong9);
                }
            }//ham dia
            if (index == convertCungToNumber(saoThaiAm)) {
                cungMenhString.add(R.string.cungMenhThaiDuong10);
                if ((index == convertCungToNumber(saoVanXuong) || index == convertCungToNumber(saoVanKhuc)) && (index == convertCungToNumber(saoThienQui)
                        || index == convertCungToNumber(saoQuocAn) || index == convertCungToNumber(saoTamThai) || index == convertCungToNumber(saoBatToa) || index == convertCungToNumber(saoThienKhoi)
                        || index == convertCungToNumber(saoHongLoan))) {
                    cungMenhString.add(R.string.cungMenhThaiDuong11);
                }
                if (index == convertCungToNumber(saoTuan) || index == convertCungToNumber(saoTuan1) || index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1)) {
                    cungMenhString.add(R.string.cungMenhThaiDuong12);
                }
                if ((index == 1) && (index == convertCungToNumber(saoHoaKhoa) || index == convertCungToNumber(saoHoaLoc))) {
                    cungMenhString.add(R.string.cungMenhThaiDuong13);
                }
            }
            if ((index == 4) && (convertCungToNumber(saoThaiAm) == 10)) {
                cungMenhString.add(R.string.cungMenhThaiDuong14);
            }
            if ((index == 5) && (convertCungToNumber(saoCumon) == 11)) {
                cungMenhString.add(R.string.cungMenhThaiDuong15);
            }
            if (index == convertCungToNumber(saoHoaKy)) {
                cungMenhString.add(R.string.cungMenhThaiDuong16);
            }
        }//end cung menh co sao thai duong
        temp = convertCungToNumber(saoThienCo);
        if (index == temp) {
            String quality = saoThienCoQuality();
            if (quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia") || quality.equalsIgnoreCase("Dac dia")) {
                cungMenhString.add(R.string.cungMenhThienCo1);
                if (index == convertCungToNumber(saoTaPhu) || index == convertCungToNumber(saoHuuBat)
                        || index == convertCungToNumber(saoHoaLoc) || index == convertCungToNumber(saoHoaQuyen) || index == convertCungToNumber(saoHoaLoc)
                        || index == convertCungToNumber(saoThienHinh) || index == convertCungToNumber(saoAnQuang) || index == convertCungToNumber(saoThienQui)) {
                    cungMenhString.add(R.string.cungMenhThienCo2);
                }
                if (index == convertCungToNumber(saoTaPhu) || index == convertCungToNumber(saoHuuBat)
                        || index == convertCungToNumber(saoLinhTinh) || index == convertCungToNumber(saoThienHinh)) {
                    cungMenhString.add(R.string.cungMenhThienCo3);
                }
                if (index == convertCungToNumber(saoTuan) || index == convertCungToNumber(saoTuan1) || index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1)) {
                    cungMenhString.add(R.string.cungMenhThienCo5);
                }
            }
            if ((quality.equalsIgnoreCase("Mieu dia")) && (index == convertCungToNumber(saoDaiHao) || index == convertCungToNumber(saoTieuHao))) {
                cungMenhString.add(R.string.cungMenhThienCo4);
            }
            if (quality.equalsIgnoreCase("Ham dia")) {
                cungMenhString.add(R.string.cungMenhThienCo6);
                if (index == convertCungToNumber(saoTuan) || index == convertCungToNumber(saoTuan1) || index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1)) {
                    cungMenhString.add(R.string.cungMenhThienCo7);
                }
                if (index == convertCungToNumber(saoKiepSat) || index == convertCungToNumber(saoThatSat) || index == convertCungToNumber(saoHoaKy) || index == convertCungToNumber(saoThienHinh)) {
                    cungMenhString.add(R.string.cungMenhThienCo8);
                }
            }
            if ((index == 4 || index == 10) && (index == convertCungToNumber(saoThienLuong))) {
                cungMenhString.add(R.string.cungMenhThienCo9);
            }
        }//end cung menh co sao Thien Co
        temp = convertCungToNumber(saoThienPhu);
        if (index == temp) {
            if (index != convertCungToNumber(saoTuan) && index != convertCungToNumber(saoTuan1)
                    && index != convertCungToNumber(saoTriet) && index != convertCungToNumber(saoTriet1)
                    && index != convertCungToNumber(saoDiaKhong) && index != convertCungToNumber(saoDiaKiep)) {
                cungMenhString.add(R.string.cungMenhThienPhu1);
            } else {
                cungMenhString.add(R.string.cungMenhThienPhu2);
            }
            if (index == convertCungToNumber(saoThatSat)) {
                cungMenhString.add(R.string.cungMenhThienPhu3);
            }
            if ((index == 2) && (index == convertCungToNumber(saoTuVi)) && (index == convertCungToNumber(saoHoaKhoa) || index == convertCungToNumber(saoHoaQuyen) || index == convertCungToNumber(saoHoaLoc))
                    && (index == convertCungToNumber(saoKinhDuong) || index == convertCungToNumber(saoHuuBat))
                    && (index != convertCungToNumber(saoTuan) && index != convertCungToNumber(saoTuan1)
                    && index != convertCungToNumber(saoTriet) && index != convertCungToNumber(saoTriet1))
                    && (index != convertCungToNumber(saoThienKhong) && (index != convertCungToNumber(saoDiaKhong) && index != convertCungToNumber(saoDiaKiep)))) {
                cungMenhString.add(R.string.cungMenhThienPhu4);
            }
            if (index == convertCungToNumber(saoVanXuong) || index == convertCungToNumber(saoVanKhuc)
                    || index == convertCungToNumber(saoTaPhu) || index == convertCungToNumber(saoHuuBat)) {
                cungMenhString.add(R.string.cungMenhThienPhu5);
            }
        }//end cung menh co sao Thien Phu
        temp = convertCungToNumber(saoThaiAm);
        if (index == temp) {
            String quality = saoThaiAmQuality();
            if (quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia") || quality.equalsIgnoreCase("Dac dia")) {
                cungMenhString.add(R.string.cungMenhThaiAm1);
                if (index == convertCungToNumber(saoVanXuong) || index == convertCungToNumber(saoVanKhuc) || index == convertCungToNumber(saoThienKhoi)
                        || index == convertCungToNumber(saoThienViet) || index == convertCungToNumber(saoTaPhu) || index == convertCungToNumber(saoHuuBat)
                        || index == convertCungToNumber(saoHoaKhoa) || index == convertCungToNumber(saoHoaQuyen) || index == convertCungToNumber(saoHoaLoc)
                        || index == convertCungToNumber(saoDaoHoa) || index == convertCungToNumber(saoHongLoan) || index == convertCungToNumber(saoThienHi)) {
                    cungMenhString.add(R.string.cungMenhThaiAm2);
                }
                if (index == convertCungToNumber(saoHoaLoc) && (nhihop == convertCungToNumber(saoTaPhu)
                        || nhihop == convertCungToNumber(saoHuuBat) || tamhop1 == convertCungToNumber(saoTaPhu) || tamhop2 == convertCungToNumber(saoTaPhu) || tamhop2 == convertCungToNumber(saoHuuBat))) {
                    cungMenhString.add(R.string.cungMenhThaiAm14);
                }
            }
            if (quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia")) {
                if (index == convertCungToNumber(saoTuan) || index == convertCungToNumber(saoTuan1)
                        || index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1)) {
                    cungMenhString.add(R.string.cungMenhThaiAm3);
                }
            }
            if (quality.equalsIgnoreCase("Dac dia")) {
                if (index == convertCungToNumber(saoTuan) || index == convertCungToNumber(saoTuan1)
                        || index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1)) {
                    cungMenhString.add(R.string.cungMenhThaiAm4);
                } else {
                    cungMenhString.add(R.string.cungMenhThaiAm5);
                }
            }
            if (quality.equalsIgnoreCase("Ham dia")) {
                cungMenhString.add(R.string.cungMenhThaiAm6);

                if (index == convertCungToNumber(saoVanXuong) || index == convertCungToNumber(saoVanKhuc) || index == convertCungToNumber(saoThienKhoi)
                        || index == convertCungToNumber(saoThienViet) || index == convertCungToNumber(saoHoaKhoa) || index == convertCungToNumber(saoHoaQuyen)
                        || index == convertCungToNumber(saoHoaLoc) || index == convertCungToNumber(saoDaoHoa) || index == convertCungToNumber(saoHongLoan) || index == convertCungToNumber(saoThienHi)
                        || tamhop1 == convertCungToNumber(saoVanXuong) || tamhop1 == convertCungToNumber(saoVanKhuc) || tamhop1 == convertCungToNumber(saoThienKhoi)
                        || tamhop1 == convertCungToNumber(saoThienViet) || tamhop1 == convertCungToNumber(saoHoaKhoa) || tamhop1 == convertCungToNumber(saoHoaQuyen)
                        || tamhop1 == convertCungToNumber(saoHoaLoc) || tamhop1 == convertCungToNumber(saoDaoHoa) || tamhop1 == convertCungToNumber(saoHongLoan) || tamhop1 == convertCungToNumber(saoThienHi)
                        || tamhop2 == convertCungToNumber(saoVanXuong) || tamhop2 == convertCungToNumber(saoVanKhuc) || tamhop2 == convertCungToNumber(saoThienKhoi)
                        || tamhop2 == convertCungToNumber(saoThienViet) || tamhop2 == convertCungToNumber(saoHoaKhoa) || tamhop2 == convertCungToNumber(saoHoaQuyen)
                        || tamhop2 == convertCungToNumber(saoHoaLoc) || tamhop2 == convertCungToNumber(saoDaoHoa) || tamhop2 == convertCungToNumber(saoHongLoan) || tamhop2 == convertCungToNumber(saoThienHi)
                        || nhihop == convertCungToNumber(saoVanXuong) || nhihop == convertCungToNumber(saoVanKhuc) || nhihop == convertCungToNumber(saoThienKhoi)
                        || nhihop == convertCungToNumber(saoThienViet) || nhihop == convertCungToNumber(saoHoaKhoa) || nhihop == convertCungToNumber(saoHoaQuyen)
                        || nhihop == convertCungToNumber(saoHoaLoc) || nhihop == convertCungToNumber(saoDaoHoa) || nhihop == convertCungToNumber(saoHongLoan) || nhihop == convertCungToNumber(saoThienHi)
                        ) {
                    cungMenhString.add(R.string.cungMenhThaiAm8);
                }
                if (index == convertCungToNumber(saoTuan) || index == convertCungToNumber(saoTuan1)
                        || index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1)) {
                    cungMenhString.add(R.string.cungMenhThaiAm9);
                }
                if (index == convertCungToNumber(saoThatSat) || index == convertCungToNumber(saoThienRieu) || index == convertCungToNumber(saoHoaKy)
                        || tamhop1 == convertCungToNumber(saoThatSat) || tamhop1 == convertCungToNumber(saoThienRieu) || tamhop1 == convertCungToNumber(saoHoaKy)
                        || tamhop2 == convertCungToNumber(saoThatSat) || tamhop2 == convertCungToNumber(saoThienRieu) || tamhop2 == convertCungToNumber(saoHoaKy)
                        || nhihop == convertCungToNumber(saoThatSat) || nhihop == convertCungToNumber(saoThienRieu) || nhihop == convertCungToNumber(saoHoaKy)) {
                    cungMenhString.add(R.string.cungMenhThaiAm10);
                }

            }
            if (quality.equalsIgnoreCase("Mieu dia")) {
                if (index == 3 || index == 5) {
                    cungMenhString.add(R.string.cungMenhThaiAm7);
                }
            }
            if (index == 11) {
                cungMenhString.add(R.string.cungMenhThaiAm11);
            }
            if (index == 0) {
                cungMenhString.add(R.string.cungMenhThaiAm12);
            }

            if (quality.equalsIgnoreCase("Ham dia")) {
                if (xungchieu == convertCungToNumber(saoThienLuong)) {
                    cungMenhString.add(R.string.cungMenhThaiAm13);
                }
            }
        }//end sao thai am
        temp = convertCungToNumber(saoThamLang);
        if (index == temp) {
            String quality = saoThamLangQuality();
            if (quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia") || quality.equalsIgnoreCase("Dac dia")) {
                cungMenhString.add(R.string.cungMenhThamLang1);
                if (quality.equalsIgnoreCase("Mieu dia")) {
                    cungMenhString.add(R.string.cungMenhThamLang2);
                }
                if (nhihop == convertCungToNumber(saoTaPhu) || nhihop == convertCungToNumber(saoHuuBat) || nhihop == convertCungToNumber(saoHoaKhoa) || nhihop == convertCungToNumber(saoHoaQuyen) || nhihop == convertCungToNumber(saoHoaLoc)
                        || tamhop1 == convertCungToNumber(saoTaPhu) || tamhop1 == convertCungToNumber(saoHuuBat) || tamhop1 == convertCungToNumber(saoHoaKhoa) || tamhop1 == convertCungToNumber(saoHoaQuyen) || tamhop1 == convertCungToNumber(saoHoaLoc)
                        || tamhop2 == convertCungToNumber(saoTaPhu) || tamhop2 == convertCungToNumber(saoHuuBat) || tamhop2 == convertCungToNumber(saoHoaKhoa) || tamhop2 == convertCungToNumber(saoHoaQuyen) || tamhop2 == convertCungToNumber(saoHoaLoc)
                        ) {
                    cungMenhString.add(R.string.cungMenhThamLang3);
                }
            }
            if (quality.equalsIgnoreCase("Vuong dia")) {
                if (xungchieu == convertCungToNumber(saoHoaKy) || index == convertCungToNumber(saoHoaKy)) {
                    cungMenhString.add(R.string.cungMenhThamLang4);
                }
            }
            if (quality.equalsIgnoreCase("Ham dia")) {
                cungMenhString.add(R.string.cungMenhThamLang5);
                if (index == 0 || index == 6 || index == 6 || index == 11) {
                    cungMenhString.add(R.string.cungMenhThamLang6);
                }
                if (index == 3 || index == 9) {
                    cungMenhString.add(R.string.cungMenhThamLang7);
                }
            }
            if (index == convertCungToNumber(saoHoaKy) || index == convertCungToNumber(saoThienRieu)) {
                cungMenhString.add(R.string.cungMenhThamLang8);
            }
            if ((index == 1 || index == 7) && (index == convertCungToNumber(saoVuKhuc))) {
                cungMenhString.add(R.string.cungMenhThamLang9);
            }
            if (quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia")) {
                if (index == convertCungToNumber(saoLinhTinh)) {
                    cungMenhString.add(R.string.cungMenhThamLang10);
                }
                if (index == convertCungToNumber(saoDiaKhong) || index == convertCungToNumber(saoDiaKiep)) {
                    cungMenhString.add(R.string.cungMenhThamLang11);
                }
            }
            if ((index == 2 || index == 8) && (index == convertCungToNumber(saoTruongSinh))) {
                cungMenhString.add(R.string.cungMenhThamLang12);
            }
        }//end sao tham lang
        temp = convertCungToNumber(saoCumon);
        if (index == temp) {
            cungMenhString.add(R.string.cungMenhCuMon1);
            String quality = saoCuMonQuality();
            if (quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia") || quality.equalsIgnoreCase("Dac dia")) {
                cungMenhString.add(R.string.cungMenhCuMon2);
                if (index == convertCungToNumber(saoVanKhuc) || index == convertCungToNumber(saoVanXuong) || index == convertCungToNumber(saoThienKhoi) ||
                        index == convertCungToNumber(saoThienViet) || index == convertCungToNumber(saoThienHinh) || index == convertCungToNumber(saoHoaKhoa)
                        || index == convertCungToNumber(saoThaiTue)) {
                    cungMenhString.add(R.string.cungMenhCuMon3);
                }
                if (index == convertCungToNumber(saoBachTo) || index == convertCungToNumber(saoTuePha) || index == convertCungToNumber(saoTaPhu)
                        || nhihop == convertCungToNumber(saoBachTo) || nhihop == convertCungToNumber(saoTuePha) || nhihop == convertCungToNumber(saoTaPhu)
                        || tamhop1 == convertCungToNumber(saoBachTo) || tamhop1 == convertCungToNumber(saoTuePha) || tamhop1 == convertCungToNumber(saoTaPhu)
                        || tamhop2 == convertCungToNumber(saoBachTo) || tamhop2 == convertCungToNumber(saoTuePha) || tamhop2 == convertCungToNumber(saoTaPhu)) {
                    cungMenhString.add(R.string.cungMenhCuMon4);
                }
                if (nhihop == convertCungToNumber(saoThatSat) || nhihop == convertCungToNumber(saoThienHinh) || nhihop == convertCungToNumber(saoHoaKy)
                        || tamhop1 == convertCungToNumber(saoThatSat) || tamhop1 == convertCungToNumber(saoThienHinh) || tamhop1 == convertCungToNumber(saoHoaKy)
                        || tamhop2 == convertCungToNumber(saoThatSat) || tamhop2 == convertCungToNumber(saoThienHinh) || tamhop2 == convertCungToNumber(saoHoaKy)) {
                    cungMenhString.add(R.string.cungMenhCuMon6);
                }
            }
            if (quality.equalsIgnoreCase("Vuong dia") && (index == 0 || index == 6) && (index == convertCungToNumber(saoHoaLoc)
                    || index == convertCungToNumber(saoTuan) || index == convertCungToNumber(saoTuan1) || index == convertCungToNumber(saoTriet) || index == convertCungToNumber(saoTriet1))) {
                cungMenhString.add(R.string.cungMenhCuMon5);
            }
            if (quality.equalsIgnoreCase("Ham dia")) {
                cungMenhString.add(R.string.cungMenhCuMon7);
                int nam = yearOfAnimal(year, month, day);
                if (nam == R.string.quydau || nam == R.string.quyhoi || nam == R.string.quymao || nam == R.string.quymui || nam == R.string.quysuu || nam == R.string.quyty
                        || nam == R.string.tandau || nam == R.string.tanhoi || nam == R.string.tanmao || nam == R.string.tanmui || nam == R.string.tansuu || nam == R.string.tanty) {
                    cungMenhString.add(R.string.cungMenhCuMon8);
                }
                if (nam == R.string.dinhhoi || nam == R.string.dinhdau || nam == R.string.dinhmao || nam == R.string.dinhmui || nam == R.string.dinhsuu || nam == R.string.dinhty
                        || nam==R.string.canhthan || nam==R.string.canhtuat || nam==R.string.canhngo || nam==R.string.canhty || nam==R.string.canhdan || nam==R.string.canhthin) {
                    cungMenhString.add(R.string.cungMenhCuMon9);
                }
                if(index==convertCungToNumber(saoHoaLoc) || index==convertCungToNumber(saoThaiTue)){
                    cungMenhString.add(R.string.cungMenhCuMon10);
                }
            }
             if((index==2) && (index==convertCungToNumber(saoThienCo))){
                 cungMenhString.add(R.string.cungMenhCuMon11);
             }
            if((index==3 || index==9) && (index==convertCungToNumber(saoThienCo)) &&
                    (nhihop==convertCungToNumber(saoDaiHao) || nhihop==convertCungToNumber(saoTieuHao)
                    || tamhop1==convertCungToNumber(saoDaiHao) || tamhop1==convertCungToNumber(saoTieuHao)
                    || tamhop2==convertCungToNumber(saoDaiHao) || tamhop2==convertCungToNumber(saoTieuHao))
                    )
            {
                cungMenhString.add(R.string.cungMenhCuMon12);
            }
        }//end sao cu mon
        temp=convertCungToNumber(saoThienTuong);
        if(index==temp){
            String quality=saoThienTuongQuality();
            if(quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia") || quality.equalsIgnoreCase("Dac dia")){
               cungMenhString.add(R.string.cungMenhThienTuong1);
                if(gender=="Female"){
                    cungMenhString.add(R.string.cungMenhThienTuong9);
                    if(index==convertCungToNumber(saoHongLoan)){
                        cungMenhString.add(R.string.cungMenhThienTuong10);
                    }
                }

                if(nhihop==convertCungToNumber(saoTuVi) || nhihop==convertCungToNumber(saoThienPhu) || nhihop==convertCungToNumber(saoVanXuong)
               || nhihop==convertCungToNumber(saoVuKhuc) || nhihop==convertCungToNumber(saoThienKhoi) || nhihop==convertCungToNumber(saoThienViet)
                        || nhihop==convertCungToNumber(saoTaPhu) || nhihop==convertCungToNumber(saoHuuBat) || nhihop==convertCungToNumber(saoHoaKhoa)
                        || nhihop==convertCungToNumber(saoHoaQuyen)
                                || tamhop1==convertCungToNumber(saoTuVi) || tamhop1==convertCungToNumber(saoThienPhu) || tamhop1==convertCungToNumber(saoVanXuong)
                                || tamhop1==convertCungToNumber(saoVuKhuc) || tamhop1==convertCungToNumber(saoThienKhoi) || tamhop1==convertCungToNumber(saoThienViet)
                                || tamhop1==convertCungToNumber(saoTaPhu) || tamhop1==convertCungToNumber(saoHuuBat) || tamhop1==convertCungToNumber(saoHoaKhoa)
                                || tamhop1==convertCungToNumber(saoHoaQuyen)
                                || tamhop2==convertCungToNumber(saoTuVi) || tamhop2==convertCungToNumber(saoThienPhu) || tamhop2==convertCungToNumber(saoVanXuong)
                                || tamhop2==convertCungToNumber(saoVuKhuc) || tamhop2==convertCungToNumber(saoThienKhoi) || tamhop2==convertCungToNumber(saoThienViet)
                                || tamhop2==convertCungToNumber(saoTaPhu) || tamhop2==convertCungToNumber(saoHuuBat) || tamhop2==convertCungToNumber(saoHoaKhoa)
                                || tamhop2==convertCungToNumber(saoHoaQuyen))
                {
                    cungMenhString.add(R.string.cungMenhThienTuong3);

                }
                if(index==convertCungToNumber(saoThatSat) || index==convertCungToNumber(saoKiepSat)
                        ||nhihop==convertCungToNumber(saoThatSat) || nhihop==convertCungToNumber(saoKiepSat)
            || tamhop1==convertCungToNumber(saoThatSat) || tamhop1==convertCungToNumber(saoKiepSat)
                        || tamhop2==convertCungToNumber(saoThatSat) || tamhop2==convertCungToNumber(saoKiepSat)){
                    cungMenhString.add(R.string.cungMenhThienTuong5);
                }
            }
            else{
                cungMenhString.add(R.string.cungMenhThienTuong2);
                if(index==convertCungToNumber(saoThatSat) || index==convertCungToNumber(saoKiepSat)
                        ||nhihop==convertCungToNumber(saoThatSat) || nhihop==convertCungToNumber(saoKiepSat)
                        || tamhop1==convertCungToNumber(saoThatSat) || tamhop1==convertCungToNumber(saoKiepSat)
                        || tamhop2==convertCungToNumber(saoThatSat) || tamhop2==convertCungToNumber(saoKiepSat))
                {
                    cungMenhString.add(R.string.cungMenhThienTuong6);
                }


            }//ham dia thien tuong
            if(quality.equalsIgnoreCase("Vuong dia")){
                if(nhihop==convertCungToNumber(saoKinhDuong) || nhihop==convertCungToNumber(saoDala)
                        || tamhop1==convertCungToNumber(saoKinhDuong) || tamhop1==convertCungToNumber(saoDala)
                        ||tamhop2==convertCungToNumber(saoKinhDuong) || tamhop2==convertCungToNumber(saoDala)){
                    cungMenhString.add(R.string.cungMenhThienTuong4);
                }
            }
            if(index==convertCungToNumber(saoTuan) || index==convertCungToNumber(saoTuan1) || index==convertCungToNumber(saoTriet)
                    || index==convertCungToNumber(saoTriet1)){
                cungMenhString.add(R.string.cungMenhThienTuong7);
            }
            if(index==4 || index==10){
                cungMenhString.add(R.string.cungMenhThienTuong8);
            }
        }//end sao Thien Tuong
        temp=convertCungToNumber(saoThienLuong);
        if(index==temp){
            cungMenhString.add(R.string.cungMenhThienLuong1);
            String quality=saoThienLuongQuality();
            if(quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia") || quality.equalsIgnoreCase("Dac dia")){
                cungMenhString.add(R.string.cungMenhThienLuong2);
                if(nhihop==convertCungToNumber(saoTuVi) || nhihop==convertCungToNumber(saoThienPhu) || nhihop==convertCungToNumber(saoVanXuong)
                        || nhihop==convertCungToNumber(saoVuKhuc) || nhihop==convertCungToNumber(saoThienKhoi) || nhihop==convertCungToNumber(saoThienViet)
                        || nhihop==convertCungToNumber(saoTaPhu) || nhihop==convertCungToNumber(saoHuuBat) || nhihop==convertCungToNumber(saoHoaKhoa)
                        || nhihop==convertCungToNumber(saoHoaQuyen)
                        || tamhop1==convertCungToNumber(saoTuVi) || tamhop1==convertCungToNumber(saoThienPhu) || tamhop1==convertCungToNumber(saoVanXuong)
                        || tamhop1==convertCungToNumber(saoVuKhuc) || tamhop1==convertCungToNumber(saoThienKhoi) || tamhop1==convertCungToNumber(saoThienViet)
                        || tamhop1==convertCungToNumber(saoTaPhu) || tamhop1==convertCungToNumber(saoHuuBat) || tamhop1==convertCungToNumber(saoHoaKhoa)
                        || tamhop1==convertCungToNumber(saoHoaQuyen)
                        || tamhop2==convertCungToNumber(saoTuVi) || tamhop2==convertCungToNumber(saoThienPhu) || tamhop2==convertCungToNumber(saoVanXuong)
                        || tamhop2==convertCungToNumber(saoVuKhuc) || tamhop2==convertCungToNumber(saoThienKhoi) || tamhop2==convertCungToNumber(saoThienViet)
                        || tamhop2==convertCungToNumber(saoTaPhu) || tamhop2==convertCungToNumber(saoHuuBat) || tamhop2==convertCungToNumber(saoHoaKhoa)
                        || tamhop2==convertCungToNumber(saoHoaQuyen))
                {
                    cungMenhString.add(R.string.cungMenhThienLuong6);
                }
                if(index==convertCungToNumber(saoVanXuong) || index==convertCungToNumber(saoVanKhuc) || index==convertCungToNumber(saoTaPhu)
                        || index==convertCungToNumber(saoHuuBat) || index==convertCungToNumber(saoThaiTue)){
                    cungMenhString.add(R.string.cungMenhThienLuong7);
                }
                if(index==convertCungToNumber(saoTuan) || index==convertCungToNumber(saoTuan1) || index==convertCungToNumber(saoTriet)
                        || index==convertCungToNumber(saoTriet1)){
                    cungMenhString.add(R.string.cungMenhThienLuong8);
                }

            }
            else{
                if(index==5 || index==11){
                    cungMenhString.add(R.string.cungMenhThienLuong3);
                }else if(index==9){
                    cungMenhString.add(R.string.cungMenhThienLuong4);
                }
                cungMenhString.add(R.string.cungMenhThienLuong5);
            }//end ham dia
            if(index==6){
                cungMenhString.add(R.string.cungMenhThienLuong9);
            }
            if((index==3) && (index==convertCungToNumber(saoThaiDuong))){
                cungMenhString.add(R.string.cungMenhThienLuong10);
            }
            if((index==0) && (xungchieu==convertCungToNumber(saoThaiDuong)) &&
                    (nhihop==convertCungToNumber(saoVanXuong) || nhihop==convertCungToNumber(saoVanKhuc)
                    || tamhop1==convertCungToNumber(saoVanXuong) || tamhop1==convertCungToNumber(saoHoaLoc)
                    || tamhop2==convertCungToNumber(saoHoaLoc) || tamhop2==convertCungToNumber(saoVanXuong))){
                cungMenhString.add(R.string.cungMenhThienLuong11);
             }
            if((quality.equalsIgnoreCase("Ham dia")) && (nhihop==convertCungToNumber(saoThaiAm) || tamhop1==convertCungToNumber(saoThaiAm)
            || tamhop2==convertCungToNumber(saoThaiAm))){
                cungMenhString.add(R.string.cungMenhThienLuong12);
            }
        }//end sao Thien luong
        temp=convertCungToNumber(saoThatSat);
        if(index==temp){
            cungMenhString.add(R.string.cungMenhThatSat1);
            String quality=saoThatSatQuality();
            if(quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Vuong dia") || quality.equalsIgnoreCase("Dac dia")){
                cungMenhString.add(R.string.cungMenhThatSat2);
                if(nhihop==convertCungToNumber(saoTuVi) || nhihop==convertCungToNumber(saoThienPhu) || nhihop==convertCungToNumber(saoVanXuong)
                        || nhihop==convertCungToNumber(saoVuKhuc) || nhihop==convertCungToNumber(saoThienKhoi) || nhihop==convertCungToNumber(saoThienViet)
                        || nhihop==convertCungToNumber(saoTaPhu) || nhihop==convertCungToNumber(saoHuuBat) || nhihop==convertCungToNumber(saoHoaKhoa)
                        || nhihop==convertCungToNumber(saoHoaQuyen)
                        || tamhop1==convertCungToNumber(saoTuVi) || tamhop1==convertCungToNumber(saoThienPhu) || tamhop1==convertCungToNumber(saoVanXuong)
                        || tamhop1==convertCungToNumber(saoVuKhuc) || tamhop1==convertCungToNumber(saoThienKhoi) || tamhop1==convertCungToNumber(saoThienViet)
                        || tamhop1==convertCungToNumber(saoTaPhu) || tamhop1==convertCungToNumber(saoHuuBat) || tamhop1==convertCungToNumber(saoHoaKhoa)
                        || tamhop1==convertCungToNumber(saoHoaQuyen)
                        || tamhop2==convertCungToNumber(saoTuVi) || tamhop2==convertCungToNumber(saoThienPhu) || tamhop2==convertCungToNumber(saoVanXuong)
                        || tamhop2==convertCungToNumber(saoVuKhuc) || tamhop2==convertCungToNumber(saoThienKhoi) || tamhop2==convertCungToNumber(saoThienViet)
                        || tamhop2==convertCungToNumber(saoTaPhu) || tamhop2==convertCungToNumber(saoHuuBat) || tamhop2==convertCungToNumber(saoHoaKhoa)
                        || tamhop2==convertCungToNumber(saoHoaQuyen)){
                    cungMenhString.add(R.string.cungMenhThatSat4);
                }
                if( index==convertCungToNumber(saoKiepSat) ||
                        nhihop==convertCungToNumber(saoKiepSat)
                         || tamhop1==convertCungToNumber(saoKiepSat)
                        || tamhop2==convertCungToNumber(saoKiepSat))
                {
                    cungMenhString.add(R.string.cungMenhThatSat5);
                }

            }
            if((quality.equalsIgnoreCase("Mieu dia")) && (index==2 || index==8)){
                cungMenhString.add(R.string.cungMenhThatSat3);
            }
            if(quality.equalsIgnoreCase("Ham dia")){
                cungMenhString.add(R.string.cungMenhThatSat6);
                int nam=yearOfAnimal(year,month,day);
                if(nam==R.string.atdau || nam==R.string.athoi || nam==R.string.atmao || nam==R.string.atmui || nam==R.string.atsuu || nam==R.string.atty
                        || nam==R.string.tanty || nam==R.string.tansuu || nam==R.string.tanmui || nam==R.string.tanmao || nam==R.string.tandau || nam==R.string.tanhoi){
                    cungMenhString.add(R.string.cungMenhThatSat7);
                }
                if(index==convertCungToNumber(saoTaPhu) || index==convertCungToNumber(saoHuuBat) || index==convertCungToNumber(saoLongTri)
                        || index==convertCungToNumber(saoPhuongCac)
                  || nhihop==convertCungToNumber(saoTaPhu) || nhihop==convertCungToNumber(saoHuuBat) || nhihop==convertCungToNumber(saoLongTri)
                        || nhihop==convertCungToNumber(saoPhuongCac)
                  || tamhop1==convertCungToNumber(saoTaPhu) || tamhop1==convertCungToNumber(saoHuuBat) || tamhop1==convertCungToNumber(saoLongTri)
                        || tamhop1==convertCungToNumber(saoPhuongCac)
                  || tamhop2==convertCungToNumber(saoTaPhu) || tamhop2==convertCungToNumber(saoHuuBat) || tamhop2==convertCungToNumber(saoLongTri)
                        || tamhop2==convertCungToNumber(saoPhuongCac)
                       ){
                    cungMenhString.add(R.string.cungMenhThatSat8);
                }
                if(index==convertCungToNumber(saoThienHinh)){
                    cungMenhString.add(R.string.cungMenhThatSat9);
                }
            }
            if(index==2 || index==8 || index==0 || index==6){
                cungMenhString.add(R.string.cungMenhThatSat10);
            }
        }//end sao That Sat
        temp=convertCungToNumber(saoPhaQuan);
        if(index==temp){
            cungMenhString.add(R.string.cungMenhPhaQuan1);
            String quality=saoPhaQuanQuality();
            if(quality.equalsIgnoreCase("Mieu dia") || quality.equalsIgnoreCase("Dac dia") || quality.equalsIgnoreCase("Vuong dia")){
                cungMenhString.add(R.string.cungMenhPhaQuan2);
                if(nhihop==convertCungToNumber(saoTuVi) || nhihop==convertCungToNumber(saoThienPhu) || nhihop==convertCungToNumber(saoVanXuong)
                        || nhihop==convertCungToNumber(saoVuKhuc) || nhihop==convertCungToNumber(saoThienKhoi) || nhihop==convertCungToNumber(saoThienViet)
                        || nhihop==convertCungToNumber(saoTaPhu) || nhihop==convertCungToNumber(saoHuuBat) || nhihop==convertCungToNumber(saoHoaKhoa)
                        || nhihop==convertCungToNumber(saoHoaQuyen)
                        || tamhop1==convertCungToNumber(saoTuVi) || tamhop1==convertCungToNumber(saoThienPhu) || tamhop1==convertCungToNumber(saoVanXuong)
                        || tamhop1==convertCungToNumber(saoVuKhuc) || tamhop1==convertCungToNumber(saoThienKhoi) || tamhop1==convertCungToNumber(saoThienViet)
                        || tamhop1==convertCungToNumber(saoTaPhu) || tamhop1==convertCungToNumber(saoHuuBat) || tamhop1==convertCungToNumber(saoHoaKhoa)
                        || tamhop1==convertCungToNumber(saoHoaQuyen)
                        || tamhop2==convertCungToNumber(saoTuVi) || tamhop2==convertCungToNumber(saoThienPhu) || tamhop2==convertCungToNumber(saoVanXuong)
                        || tamhop2==convertCungToNumber(saoVuKhuc) || tamhop2==convertCungToNumber(saoThienKhoi) || tamhop2==convertCungToNumber(saoThienViet)
                        || tamhop2==convertCungToNumber(saoTaPhu) || tamhop2==convertCungToNumber(saoHuuBat) || tamhop2==convertCungToNumber(saoHoaKhoa)
                        || tamhop2==convertCungToNumber(saoHoaQuyen)
                        ){
                    cungMenhString.add(R.string.cungMenhPhaQuan5);
                }

            }
            if(quality.equalsIgnoreCase("Mieu dia")){
                cungMenhString.add(R.string.cungMenhPhaQuan3);
            }
            if(quality.equalsIgnoreCase("Dac dia")){
                cungMenhString.add(R.string.cungMenhPhaQuan4);
            }
            if(quality.equalsIgnoreCase("Ham dia")){
                cungMenhString.add(R.string.cungMenhPhaQuan6);
                int nam=yearOfAnimal(year,month,day);
                if(((index==3 || index==9) &&(nam==R.string.atty || nam==R.string.atsuu || nam==R.string.atmui
                || nam==R.string.atmao || nam==R.string.atdau || nam==R.string.athoi || nam==R.string.tanhoi
                || nam==R.string.tandau || nam==R.string.tanmao || nam==R.string.tanmui || nam==R.string.tansuu
                || nam==R.string.tanty || nam==R.string.quyty || nam==R.string.quysuu || nam==R.string.quymui
                || nam==R.string.quymao || nam==R.string.quydau || nam==R.string.quyty)) ||
               ((index==2 || index==8) && (nam==R.string.giapdan || nam==R.string.giapngo
               || nam==R.string.giapthan || nam==R.string.giapthin || nam==R.string.giaptuat || nam==R.string.giapty
               || nam==R.string.canhthin || nam==R.string.canhdan || nam==R.string.canhty || nam==R.string.canhngo || nam==R.string.canhthan
               || nam==R.string.canhtuat || nam==R.string.dinhty || nam==R.string.dinhsuu || nam==R.string.dinhmui || nam==R.string.dinhmao
               || nam==R.string.dinhdau || nam==R.string.dinhhoi || nam==R.string.kydau || nam==R.string.kyhoi || nam==R.string.kymao
               || nam==R.string.kymui || nam==R.string.kysuu || nam==R.string.kyty)) ||
                        ((index==0 || index==11) && (nam==R.string.maudan || nam==R.string.maungo
                        || nam==R.string.mauthan || nam==R.string.mauthin || nam==R.string.mautuat || nam==R.string.mauty))){
                    cungMenhString.add(R.string.cungMenhPhaQuan7);
                }
                if(index==0 || index==6){
                    cungMenhString.add(R.string.cungMenhPhaQuan8);
                }
            }
        }//end sao Pha quan
        temp=convertCungToNumber(saoVanXuong);
        int temp1=convertCungToNumber(saoVanKhuc);
        if(index==temp || index==temp1){
            cungMenhString.add(R.string.cungMenhVanXuongVanKhuc1);
            String quality;
            if(index==temp) quality=saoVanXuongQuality();
            else quality=saoVanKhucQuality();
           if(quality.equalsIgnoreCase("Dac dia")){
               cungMenhString.add(R.string.cungMenhVanXuongVanKhuc2);
               if(nhihop==convertCungToNumber(saoTuVi) || nhihop==convertCungToNumber(saoThienPhu) || nhihop==convertCungToNumber(saoVanXuong)
                       || nhihop==convertCungToNumber(saoVuKhuc) || nhihop==convertCungToNumber(saoThienKhoi) || nhihop==convertCungToNumber(saoThienViet)
                       || nhihop==convertCungToNumber(saoTaPhu) || nhihop==convertCungToNumber(saoHuuBat) || nhihop==convertCungToNumber(saoHoaKhoa)
                       || nhihop==convertCungToNumber(saoHoaQuyen)
                       || tamhop1==convertCungToNumber(saoTuVi) || tamhop1==convertCungToNumber(saoThienPhu) || tamhop1==convertCungToNumber(saoVanXuong)
                       || tamhop1==convertCungToNumber(saoVuKhuc) || tamhop1==convertCungToNumber(saoThienKhoi) || tamhop1==convertCungToNumber(saoThienViet)
                       || tamhop1==convertCungToNumber(saoTaPhu) || tamhop1==convertCungToNumber(saoHuuBat) || tamhop1==convertCungToNumber(saoHoaKhoa)
                       || tamhop1==convertCungToNumber(saoHoaQuyen)
                       || tamhop2==convertCungToNumber(saoTuVi) || tamhop2==convertCungToNumber(saoThienPhu) || tamhop2==convertCungToNumber(saoVanXuong)
                       || tamhop2==convertCungToNumber(saoVuKhuc) || tamhop2==convertCungToNumber(saoThienKhoi) || tamhop2==convertCungToNumber(saoThienViet)
                       || tamhop2==convertCungToNumber(saoTaPhu) || tamhop2==convertCungToNumber(saoHuuBat) || tamhop2==convertCungToNumber(saoHoaKhoa)
                       || tamhop2==convertCungToNumber(saoHoaQuyen)
                       ){
                   cungMenhString.add(R.string.cungMenhVanXuongVanKhuc3);
               }
               if(nhihop==convertCungToNumber(saoThienDong) || nhihop==convertCungToNumber(saoThienLuong)
                       || tamhop1==convertCungToNumber(saoThienDong) || tamhop1==convertCungToNumber(saoThienLuong)
                       || tamhop2==convertCungToNumber(saoThienDong) || tamhop2==convertCungToNumber(saoThienLuong)){
                   cungMenhString.add(R.string.cungMenhVanXuongVanKhuc4);
               }
               if(index==convertCungToNumber(saoVuKhuc)){
                   cungMenhString.add(R.string.cungMenhVanXuongVanKhuc5);
               }
               if(index==convertCungToNumber(saoThamLang) || index==convertCungToNumber(saoHoaTinh)
                       || nhihop==convertCungToNumber(saoThamLang) || nhihop==convertCungToNumber(saoHoaTinh)
                       || tamhop1==convertCungToNumber(saoThamLang) || tamhop1==convertCungToNumber(saoHoaTinh)
                       || tamhop2==convertCungToNumber(saoThamLang) || tamhop2==convertCungToNumber(saoHoaTinh)){
                   cungMenhString.add(R.string.cungMenhVanXuongVanKhuc6);
               }
               if(gender=="Female"){
                   cungMenhString.add(R.string.cungMenhVanXuongVanKhuc10);
               }
               if(index==convertCungToNumber(saoHoaLoc)){
                   cungMenhString.add(R.string.cungMenhVanXuongVanKhuc11);
               }
           }
            else {
               cungMenhString.add(R.string.cungMenhVanXuongVanKhuc7);
               if(index==convertCungToNumber(saoThatSat) || index==convertCungToNumber(saoKiepSat)
                       ||nhihop==convertCungToNumber(saoThatSat) || nhihop==convertCungToNumber(saoKiepSat)
                       || tamhop1==convertCungToNumber(saoThatSat) || tamhop1==convertCungToNumber(saoKiepSat)
                       || tamhop2==convertCungToNumber(saoThatSat) || tamhop2==convertCungToNumber(saoKiepSat)){
                   cungMenhString.add(R.string.cungMenhVanXuongVanKhuc8);
               }
        }
        if(index==convertCungToNumber(saoThaiTue) || index==convertCungToNumber(saoTauThu) ||index==convertCungToNumber(saoLongTri)
                || index==convertCungToNumber(saoPhuongCac)){
            cungMenhString.add(R.string.cungMenhVanXuongVanKhuc9);
        }
        }//end van xuong van khuc
        temp=convertCungToNumber(saoThienKhoi);
        temp1=convertCungToNumber(saoThienViet);
        if(index==temp || index==temp1){
            cungMenhString.add(R.string.cungMenhKhoiViet1);
            if(nhihop==convertCungToNumber(saoTuVi) || nhihop==convertCungToNumber(saoThienPhu) || nhihop==convertCungToNumber(saoVanXuong)
                    || nhihop==convertCungToNumber(saoVuKhuc) || nhihop==convertCungToNumber(saoThienKhoi) || nhihop==convertCungToNumber(saoThienViet)
                    || nhihop==convertCungToNumber(saoTaPhu) || nhihop==convertCungToNumber(saoHuuBat) || nhihop==convertCungToNumber(saoHoaKhoa)
                    || nhihop==convertCungToNumber(saoHoaQuyen)
                    || tamhop1==convertCungToNumber(saoTuVi) || tamhop1==convertCungToNumber(saoThienPhu) || tamhop1==convertCungToNumber(saoVanXuong)
                    || tamhop1==convertCungToNumber(saoVuKhuc) || tamhop1==convertCungToNumber(saoThienKhoi) || tamhop1==convertCungToNumber(saoThienViet)
                    || tamhop1==convertCungToNumber(saoTaPhu) || tamhop1==convertCungToNumber(saoHuuBat) || tamhop1==convertCungToNumber(saoHoaKhoa)
                    || tamhop1==convertCungToNumber(saoHoaQuyen)
                    || tamhop2==convertCungToNumber(saoTuVi) || tamhop2==convertCungToNumber(saoThienPhu) || tamhop2==convertCungToNumber(saoVanXuong)
                    || tamhop2==convertCungToNumber(saoVuKhuc) || tamhop2==convertCungToNumber(saoThienKhoi) || tamhop2==convertCungToNumber(saoThienViet)
                    || tamhop2==convertCungToNumber(saoTaPhu) || tamhop2==convertCungToNumber(saoHuuBat) || tamhop2==convertCungToNumber(saoHoaKhoa)
                    || tamhop2==convertCungToNumber(saoHoaQuyen)
                    ){
                cungMenhString.add(R.string.cungMenhKhoiViet2);
            }
            if((index==convertCungToNumber(saoThatSat) || index==convertCungToNumber(saoKiepSat)
                    ||nhihop==convertCungToNumber(saoThatSat) || nhihop==convertCungToNumber(saoKiepSat)
                    || tamhop1==convertCungToNumber(saoThatSat) || tamhop1==convertCungToNumber(saoKiepSat)
                    || tamhop2==convertCungToNumber(saoThatSat) || tamhop2==convertCungToNumber(saoKiepSat))
                    ||(index==convertCungToNumber(saoTuan) || index==convertCungToNumber(saoTuan1) || index==convertCungToNumber(saoTriet)
                    || index==convertCungToNumber(saoTriet1)) )
            {
                cungMenhString.add(R.string.cungMenhKhoiViet3);
            }
        }//end thien khoi, thien viet
        temp=convertCungToNumber(saoLocTon);
        if(index==temp){
            cungMenhString.add(R.string.cungMenhLocTon1);
            if(index==convertCungToNumber(saoAnQuang) || index==convertCungToNumber(saoThienQui) || index==convertCungToNumber(saoThienPhuc)
                    || index==convertCungToNumber(saoThienRieu) || index==convertCungToNumber(saoThienY)
               || nhihop==convertCungToNumber(saoAnQuang) || nhihop==convertCungToNumber(saoThienQui) || nhihop==convertCungToNumber(saoThienPhuc)
                    || nhihop==convertCungToNumber(saoThienRieu) || nhihop==convertCungToNumber(saoThienY)
               || tamhop1==convertCungToNumber(saoAnQuang) || tamhop1==convertCungToNumber(saoThienQui) || tamhop1==convertCungToNumber(saoThienPhuc)
                    || tamhop1==convertCungToNumber(saoThienRieu) || tamhop1==convertCungToNumber(saoThienY)
                    || tamhop2==convertCungToNumber(saoAnQuang) || tamhop2==convertCungToNumber(saoThienQui) || tamhop2==convertCungToNumber(saoThienPhuc)
                    || tamhop2==convertCungToNumber(saoThienRieu) || tamhop2==convertCungToNumber(saoThienY)
                    ){
                cungMenhString.add(R.string.cungmenhLocTon2);
            }
            if(index==convertCungToNumber(saoDiaKhong) || index==convertCungToNumber(saoDiaKiep)
                    || index==convertCungToNumber(saoDaiHao) || index==convertCungToNumber(saoHoaKy)
                    || index==convertCungToNumber(saoThaiTue) || index==convertCungToNumber(saoTuePha)
                || nhihop==convertCungToNumber(saoDiaKhong) || nhihop==convertCungToNumber(saoDiaKiep)
                    || nhihop==convertCungToNumber(saoDaiHao) || nhihop==convertCungToNumber(saoHoaKy)
                    || nhihop==convertCungToNumber(saoThaiTue) || nhihop==convertCungToNumber(saoTuePha)
                 || tamhop1==convertCungToNumber(saoDiaKhong) || tamhop1==convertCungToNumber(saoDiaKiep)
                    || tamhop1==convertCungToNumber(saoDaiHao) || tamhop1==convertCungToNumber(saoHoaKy)
                    || tamhop1==convertCungToNumber(saoThaiTue) || tamhop1==convertCungToNumber(saoTuePha)
                    || tamhop2==convertCungToNumber(saoDiaKhong) || tamhop2==convertCungToNumber(saoDiaKiep)
                    || tamhop2==convertCungToNumber(saoDaiHao) || tamhop2==convertCungToNumber(saoHoaKy)
                    || tamhop2==convertCungToNumber(saoThaiTue) || tamhop2==convertCungToNumber(saoTuePha)  )
            {
                cungMenhString.add(R.string.cungMenhLocTon3);
            }
            if(xungchieu==convertCungToNumber(saoPhaQuan)){
                cungMenhString.add(R.string.cungMenhLocTon4);
            }
            if(index==convertCungToNumber(saoHoaLoc)){
                cungMenhString.add(R.string.cungMenhLocTon5);
            }
        }//end loc ton
        temp=convertCungToNumber(saoTaPhu);
        temp1=convertCungToNumber(saoHuuBat);
        if(index==temp || index==temp1){
            cungMenhString.add(R.string.cungMenhTaHuu1);
            if(nhihop==convertCungToNumber(saoTuVi) || nhihop==convertCungToNumber(saoThienPhu) || nhihop==convertCungToNumber(saoVanXuong)
                    || nhihop==convertCungToNumber(saoVuKhuc) || nhihop==convertCungToNumber(saoThienKhoi) || nhihop==convertCungToNumber(saoThienViet)
                    || nhihop==convertCungToNumber(saoTaPhu) || nhihop==convertCungToNumber(saoHuuBat) || nhihop==convertCungToNumber(saoHoaKhoa)
                    || nhihop==convertCungToNumber(saoHoaQuyen)
                    || tamhop1==convertCungToNumber(saoTuVi) || tamhop1==convertCungToNumber(saoThienPhu) || tamhop1==convertCungToNumber(saoVanXuong)
                    || tamhop1==convertCungToNumber(saoVuKhuc) || tamhop1==convertCungToNumber(saoThienKhoi) || tamhop1==convertCungToNumber(saoThienViet)
                    || tamhop1==convertCungToNumber(saoTaPhu) || tamhop1==convertCungToNumber(saoHuuBat) || tamhop1==convertCungToNumber(saoHoaKhoa)
                    || tamhop1==convertCungToNumber(saoHoaQuyen)
                    || tamhop2==convertCungToNumber(saoTuVi) || tamhop2==convertCungToNumber(saoThienPhu) || tamhop2==convertCungToNumber(saoVanXuong)
                    || tamhop2==convertCungToNumber(saoVuKhuc) || tamhop2==convertCungToNumber(saoThienKhoi) || tamhop2==convertCungToNumber(saoThienViet)
                    || tamhop2==convertCungToNumber(saoTaPhu) || tamhop2==convertCungToNumber(saoHuuBat) || tamhop2==convertCungToNumber(saoHoaKhoa)
                    || tamhop2==convertCungToNumber(saoHoaQuyen)){
                cungMenhString.add(R.string.cungMenhTaHuu2);
            }
            if(index==convertCungToNumber(saoThienCo) || index==convertCungToNumber(saoThaiAm) || index==convertCungToNumber(saoThienDong) || index==convertCungToNumber(saoThienLuong)
                    || index==convertCungToNumber(saoLongTri) || index==convertCungToNumber(saoPhuongCac)
               || nhihop==convertCungToNumber(saoThienCo) || nhihop==convertCungToNumber(saoThaiAm) || nhihop==convertCungToNumber(saoThienDong) || nhihop==convertCungToNumber(saoThienLuong)
                    || nhihop==convertCungToNumber(saoLongTri) || nhihop==convertCungToNumber(saoPhuongCac)
                    || tamhop1==convertCungToNumber(saoThienCo) || tamhop1==convertCungToNumber(saoThaiAm) || tamhop1==convertCungToNumber(saoThienDong) || tamhop1==convertCungToNumber(saoThienLuong)
                    || tamhop1==convertCungToNumber(saoLongTri) || tamhop1==convertCungToNumber(saoPhuongCac)
                    || tamhop2==convertCungToNumber(saoThienCo) || tamhop2==convertCungToNumber(saoThaiAm) || tamhop2==convertCungToNumber(saoThienDong) || tamhop2==convertCungToNumber(saoThienLuong)
                    || tamhop2==convertCungToNumber(saoLongTri) || tamhop2==convertCungToNumber(saoPhuongCac))
            {
                cungMenhString.add(R.string.cungMenhTaHuu3);
            }
            if(index==convertCungToNumber(saoThatSat) || index==convertCungToNumber(saoKiepSat)
                    ||nhihop==convertCungToNumber(saoThatSat) || nhihop==convertCungToNumber(saoKiepSat)
                    || tamhop1==convertCungToNumber(saoThatSat) || tamhop1==convertCungToNumber(saoKiepSat)
                    || tamhop2==convertCungToNumber(saoThatSat) || tamhop2==convertCungToNumber(saoKiepSat))
            {
                cungMenhString.add(R.string.cungMenhTaHuu4);
            }
        }//end ta phu huu bat
       temp=convertCungToNumber(saoKinhDuong);
        if(index==temp){
            cungMenhString.add(R.string.cungMenhKinhDuong1);
            String quality=saoKinhDuongQuality();
            if(quality.equalsIgnoreCase("Dac dia")){
                cungMenhString.add(R.string.cungmenhKinhDuong2);
                if(gender=="Male"){
                    cungMenhString.add(R.string.cungMenhKinhDuong5);
                    if(index==convertCungToNumber(saoThienPhu) || index==convertCungToNumber(saoTuVi)){
                        cungMenhString.add(R.string.cungMenhKinhDuong6);
                    }
                }
                else{
                   cungMenhString.add(R.string.cungMenhKinhDuong7);
                }
            }
            else{
                cungMenhString.add(R.string.cungMenhKinhDuong3);
            }
            if(index==convertCungToNumber(saoThaiAm) || index==convertCungToNumber(saoThaiDuong)){
                cungMenhString.add(R.string.cungMenhKinhDuong4);
            }
        }//end kinh duong
        temp=convertCungToNumber(saoDala);
        if(index==temp){
            cungMenhString.add(R.string.cungMenhDala1);
            String quality=saoDaLaQuality();
            if(quality.equalsIgnoreCase("Dac dia")){
                cungMenhString.add(R.string.cungMenhDala2);
            }
        }//end da la
        temp=convertCungToNumber(saoHoaTinh);
        temp1=convertCungToNumber(saoLinhTinh);
        if(index==temp1 || index==temp){
            cungMenhString.add(R.string.cungMenhHoaLinh1);
            String quality=saoHoaTinhQuality();
            if(quality.equalsIgnoreCase("Dac dia")){
                cungMenhString.add(R.string.cungMenhHoaLinh2);
            }else{
                cungMenhString.add(R.string.cungMenhHoaLinh3);
            }
        }// end hoa tinh hay linh tinh
        temp=convertCungToNumber(saoDiaKiep);
        temp1=convertCungToNumber(saoDiaKhong);
        if(index==temp || index==temp1){
            cungMenhString.add(R.string.cungMenhDiaKiep1);
            String quality;
            if(index==temp){
                quality=saoDiaKiepQuality();
            }else quality=saoDiaKhongQuality();
            if(quality.equalsIgnoreCase("Dac dia")){
                cungMenhString.add(R.string.cungMenhDiaKiep2);
            }
            else {
                cungMenhString.add(R.string.cungMenhDiaKiep3);
            }
            if((index==convertCungToNumber(saoDiaKiep) && index==convertCungToNumber(saoDiaKhong)) && (index==5 || index==11)){
                cungMenhString.add(R.string.cungMenhDiaKiep4);
                if(index==convertCungToNumber(saoThienTuong) && index==convertCungToNumber(saoThienMa) && (index==convertCungToNumber(saoHoaKhoa)
                || xungchieu==convertCungToNumber(saoHoaKhoa))){
                    cungMenhString.add(R.string.cungMenhDiaKiep5);
                }
            }
        }//end dia kiep dia khong
        temp=convertCungToNumber(saoHoaLoc);
        if(index==temp){
            cungMenhString.add(R.string.cungMenhHoaLoc1);
            if(index==convertCungToNumber(saoThienPhu) || index==convertCungToNumber(saoTuVi) || index==convertCungToNumber(saoHoaKhoa)
                    || index==convertCungToNumber(saoHoaQuyen)
              || nhihop==convertCungToNumber(saoThienPhu) || nhihop==convertCungToNumber(saoTuVi) || nhihop==convertCungToNumber(saoHoaKhoa)
                    || nhihop==convertCungToNumber(saoHoaQuyen) || tamhop1==convertCungToNumber(saoThienPhu) || tamhop1==convertCungToNumber(saoTuVi)
                    || tamhop1==convertCungToNumber(saoHoaKhoa) || tamhop1==convertCungToNumber(saoHoaQuyen) || tamhop2==convertCungToNumber(saoThienPhu)
                    || tamhop2==convertCungToNumber(saoTuVi) || tamhop2==convertCungToNumber(saoHoaKhoa) || tamhop2==convertCungToNumber(saoHoaQuyen)){
                    cungMenhString.add(R.string.cungMenhHoaLoc2);
            }
            if(index==convertCungToNumber(saoDaiHao) || index==convertCungToNumber(saoTieuHao) || index==convertCungToNumber(saoKiepSat)
                    || index==convertCungToNumber(saoThatSat) || nhihop==convertCungToNumber(saoDaiHao) || nhihop==convertCungToNumber(saoTieuHao) || nhihop==convertCungToNumber(saoKiepSat)
                    || nhihop==convertCungToNumber(saoThatSat) || tamhop1==convertCungToNumber(saoDaiHao) || tamhop1==convertCungToNumber(saoTieuHao) || tamhop1==convertCungToNumber(saoKiepSat)
                    || tamhop1==convertCungToNumber(saoThatSat) || tamhop2==convertCungToNumber(saoDaiHao) || tamhop2==convertCungToNumber(saoTieuHao) || tamhop2==convertCungToNumber(saoKiepSat)
                    || tamhop2==convertCungToNumber(saoThatSat)){
                cungMenhString.add(R.string.cungMenhHoaLoc3);
            }
        }//end sao hoa loc
            temp=convertCungToNumber(saoHoaQuyen);
        if(index==temp){
            cungMenhString.add(R.string.cungMenhHoaQuyen1);
            if(index==convertCungToNumber(saoTuVi) || index==convertCungToNumber(saoThienPhu) ||
                    nhihop==convertCungToNumber(saoTuVi) || index==convertCungToNumber(saoThienPhu) ||
                    tamhop1==convertCungToNumber(saoTuVi) || tamhop1==convertCungToNumber(saoThienPhu) ||
                    tamhop2==convertCungToNumber(saoTuVi) || tamhop2==convertCungToNumber(saoThienPhu)){
                cungMenhString.add(R.string.cungMenhHoaQuyen2);
            }
            if(index==convertCungToNumber(saoCumon) || index==convertCungToNumber(saoVuKhuc)
                    || nhihop==convertCungToNumber(saoCumon) || nhihop==convertCungToNumber(saoVuKhuc)
                    || tamhop1==convertCungToNumber(saoCumon) || tamhop1==convertCungToNumber(saoVuKhuc)
                    || tamhop2==convertCungToNumber(saoCumon) || tamhop2==convertCungToNumber(saoVuKhuc)){
                cungMenhString.add(R.string.cungMenhHoaQuyen3);
            }
            if(index==convertCungToNumber(saoThatSat) || index==convertCungToNumber(saoKiepSat)
                    ||nhihop==convertCungToNumber(saoThatSat) || nhihop==convertCungToNumber(saoKiepSat)
                    || tamhop1==convertCungToNumber(saoThatSat) || tamhop1==convertCungToNumber(saoKiepSat)
                    || tamhop2==convertCungToNumber(saoThatSat) || tamhop2==convertCungToNumber(saoKiepSat))
            {
                cungMenhString.add(R.string.cungMenhHoaQuyen4);
            }
            if(index==convertCungToNumber(saoTuan) || index==convertCungToNumber(saoTuan1) || index==convertCungToNumber(saoTriet)
                    || index==convertCungToNumber(saoTriet1))
            {
                cungMenhString.add(R.string.cungMenhHoaQuyen5);
            }
        }//end sao hoa quyen
        temp=convertCungToNumber(saoHoaKhoa);
        if(index==temp){
            cungMenhString.add(R.string.cungMenhHoaKhoa1);
            if(nhihop==convertCungToNumber(saoTuVi) || nhihop==convertCungToNumber(saoThienPhu) || nhihop==convertCungToNumber(saoVanXuong)
                    || nhihop==convertCungToNumber(saoVuKhuc) || nhihop==convertCungToNumber(saoThienKhoi) || nhihop==convertCungToNumber(saoThienViet)
                    || nhihop==convertCungToNumber(saoTaPhu) || nhihop==convertCungToNumber(saoHuuBat) || nhihop==convertCungToNumber(saoHoaKhoa)
                    || nhihop==convertCungToNumber(saoHoaQuyen)
                    || tamhop1==convertCungToNumber(saoTuVi) || tamhop1==convertCungToNumber(saoThienPhu) || tamhop1==convertCungToNumber(saoVanXuong)
                    || tamhop1==convertCungToNumber(saoVuKhuc) || tamhop1==convertCungToNumber(saoThienKhoi) || tamhop1==convertCungToNumber(saoThienViet)
                    || tamhop1==convertCungToNumber(saoTaPhu) || tamhop1==convertCungToNumber(saoHuuBat) || tamhop1==convertCungToNumber(saoHoaKhoa)
                    || tamhop1==convertCungToNumber(saoHoaQuyen)
                    || tamhop2==convertCungToNumber(saoTuVi) || tamhop2==convertCungToNumber(saoThienPhu) || tamhop2==convertCungToNumber(saoVanXuong)
                    || tamhop2==convertCungToNumber(saoVuKhuc) || tamhop2==convertCungToNumber(saoThienKhoi) || tamhop2==convertCungToNumber(saoThienViet)
                    || tamhop2==convertCungToNumber(saoTaPhu) || tamhop2==convertCungToNumber(saoHuuBat) || tamhop2==convertCungToNumber(saoHoaKhoa)
                    || tamhop2==convertCungToNumber(saoHoaQuyen)
                    ){
                cungMenhString.add(R.string.cungMenhHoaKhoa2);
            }
        }//end sao hoa khoa
                temp=convertCungToNumber(saoHoaKy);
        if(index==temp){
            cungMenhString.add(R.string.cungMenhHoaKy1);
            String quality=saoHoaKyQuality();
            if(quality.equalsIgnoreCase("Dac dia")){
                if(index==convertCungToNumber(saoThaiDuong) || index==convertCungToNumber(saoThaiAm)){
                    cungMenhString.add(R.string.cungMenhHoaKy2);
                }
                if(index==convertCungToNumber(saoThatSat) || index==convertCungToNumber(saoKiepSat)
                        ||nhihop==convertCungToNumber(saoThatSat) || nhihop==convertCungToNumber(saoKiepSat)
                        || tamhop1==convertCungToNumber(saoThatSat) || tamhop1==convertCungToNumber(saoKiepSat)
                        || tamhop2==convertCungToNumber(saoThatSat) || tamhop2==convertCungToNumber(saoKiepSat)){
                    cungMenhString.add(R.string.cungMenhHoaKy3);
                }
                if(index==convertCungToNumber(saoVanXuong) || index==convertCungToNumber(saoVuKhuc) || index==convertCungToNumber(saoThienKhoi) || index==convertCungToNumber(saoThienViet)
                        || nhihop==convertCungToNumber(saoVanXuong) || nhihop==convertCungToNumber(saoVuKhuc) || nhihop==convertCungToNumber(saoThienKhoi) || nhihop==convertCungToNumber(saoThienViet)
                        || tamhop1==convertCungToNumber(saoVanXuong) || tamhop1==convertCungToNumber(saoVuKhuc) || tamhop1==convertCungToNumber(saoThienKhoi) || tamhop1==convertCungToNumber(saoThienViet)
                        || tamhop2==convertCungToNumber(saoVanXuong) || tamhop2==convertCungToNumber(saoVuKhuc) || tamhop2==convertCungToNumber(saoThienKhoi) || tamhop2==convertCungToNumber(saoThienViet)){
                    cungMenhString.add(R.string.cungMenhHoaKy4);
                }

            }//end ky dac dia
            if(index==convertCungToNumber(saoThaiTue) || index==convertCungToNumber(saoDala)
                    || nhihop==convertCungToNumber(saoThaiTue) || nhihop==convertCungToNumber(saoDala)
                    || tamhop1==convertCungToNumber(saoThaiTue) || tamhop1==convertCungToNumber(saoDala)
                    || tamhop2==convertCungToNumber(saoThaiTue) || tamhop2==convertCungToNumber(saoDala)){
                cungMenhString.add(R.string.cungMenhHoaKy5);
            }
            if(index==convertCungToNumber(saoDaoHoa) || index==convertCungToNumber(saoHongLoan)){
                cungMenhString.add(R.string.cungMenhHoaKy6);
            }
        }//end hoa ky
                if(index==convertCungToNumber(saoHoaLoc) && index==convertCungToNumber(saoMo)){
                    cungMenhString.add(R.string.cungMenhHoaLoc4);
                    if(index==convertCungToNumber(saoThamLang) || index==convertCungToNumber(saoVuKhuc)){
                        cungMenhString.add(R.string.cungMenhHoaLoc5);
                    }
                }
        if(index==convertCungToNumber(saoHoaLoc) && (index==2 || index==3)){
            cungMenhString.add(R.string.cungMenhHoaLoc6);
        }
        if(index==convertCungToNumber(saoHoaLoc) && index==convertCungToNumber(saoThienLuong) && saoThienLuongQuality().equalsIgnoreCase("Mieu dia")){
            cungMenhString.add(R.string.cungMenhHoaLoc7);
        }
        if(index==convertCungToNumber(saoHoaQuyen) && index==convertCungToNumber(saoThienKhoc)){
            cungMenhString.add(R.string.cungMenhHoaQuyen6);
        }
        if(index==convertCungToNumber(saoHoaKy) && (index==11 || index==0) && (index==convertCungToNumber(saoHoaKhoa) || xungchieu==convertCungToNumber(saoHoaKhoa))){
            cungMenhString.add(R.string.cungMenhHoaKy7);
        }
        if(index==convertCungToNumber(saoDaiHao) || index==convertCungToNumber(saoTieuHao)){
            cungMenhString.add(R.string.cungMenhHao1);
           if((index==convertCungToNumber(saoDaiHao) && saoDaiHaoQuality().equalsIgnoreCase("Dac dia")) ||
                   (index==convertCungToNumber(saoTieuHao) && saoTieuHaoQuality().equalsIgnoreCase("Dac dia"))){
               cungMenhString.add(R.string.cungMenhHao2);
           }
            int namsinh=convertFromNamSinh(yearOfAnimal(year,month,day));
            if((namsinh==2 || namsinh==8) && ((index==convertCungToNumber(saoDaiHao) && saoDaiHaoQuality().equalsIgnoreCase("Dac dia")) ||
                    (index==convertCungToNumber(saoTieuHao) && saoTieuHaoQuality().equalsIgnoreCase("Dac dia")))){
                cungMenhString.add(R.string.cungMenhHao3);
            }
            if(index==convertCungToNumber(saoTuyet)){
                cungMenhString.add(R.string.cungMenhHao4);
            }

        }//end dai hao tieu hao
        if(index==convertCungToNumber(saoTangMon) || index==convertCungToNumber(saoBachTo)){
            cungMenhString.add(R.string.cungMenhTangHo1);
            if((index==convertCungToNumber(saoTangMon) && saoTangMonQuality().equalsIgnoreCase("Dac dia")) ||
                    (index==convertCungToNumber(saoBachTo) && saoBachToQuality().equalsIgnoreCase("Dac dia"))){
                cungMenhString.add(R.string.cungMenhTangHo2);
            }
            if(index==convertCungToNumber(saoThatSat) || index==convertCungToNumber(saoKiepSat)
                    ||nhihop==convertCungToNumber(saoThatSat) || nhihop==convertCungToNumber(saoKiepSat)
                    || tamhop1==convertCungToNumber(saoThatSat) || tamhop1==convertCungToNumber(saoKiepSat)
                    || tamhop2==convertCungToNumber(saoThatSat) || tamhop2==convertCungToNumber(saoKiepSat)){
                cungMenhString.add(R.string.cungMenhTangHo3);
            }
            if(index==convertCungToNumber(saoKinhDuong) || index==convertCungToNumber(saoThienHinh)){
                cungMenhString.add(R.string.cungMenhTangHo4);
            }
            if(index==convertCungToNumber(saoTauThu) && index==convertCungToNumber(saoBachTo)){
                cungMenhString.add(R.string.cungMenhTangHo5);
            }
            if(index==convertCungToNumber(saoBachTo) && index==convertCungToNumber(saoPhiLiem)){
                cungMenhString.add(R.string.cungMenhTangHo6);
            }
            if(gender=="Female"){
                cungMenhString.add(R.string.cungMenhTangHo7);
            }
        }//end tang mon bach ho
        if(index==convertCungToNumber(saoThienKhoc) || index==convertCungToNumber(saoThienHu)){
            cungMenhString.add(R.string.cungMenhKhocHu1);
            if(((index==convertCungToNumber(saoThienKhoc) && saoThienKhocQuality().equalsIgnoreCase("Dac dia"))
                    || (index==convertCungToNumber(saoThienHu) && saoThienHuQuality().equalsIgnoreCase("Dac dia")))
                    && (index==0 || index==6))
                    {
                cungMenhString.add(R.string.cungMenhKhocHu2);
                        if(index==convertCungToNumber(saoThatSat) || index==convertCungToNumber(saoPhaQuan)){
                            cungMenhString.add(R.string.cungMenhKhocHu3);
                        }
            }
            if((index==convertCungToNumber(saoThienKhoc) && saoThienKhocQuality().equalsIgnoreCase("Ham dia"))
                    || (index==convertCungToNumber(saoThienHu) && saoThienHuQuality().equalsIgnoreCase("Ham dia"))){
                cungMenhString.add(R.string.cungMenhKhocHu4);
                if(index==3 || index==8){
                    if(index==convertCungToNumber(saoDala)){               cungMenhString.add(R.string.cungMenhKhocHu6);
                    }
                }
            }
            if(index==convertCungToNumber(saoThienCo) || xungchieu==convertCungToNumber(saoThienCo)){
                cungMenhString.add(R.string.cungMenhKhocHu5);
            }
            if(index==convertCungToNumber(saoThienHinh) || index==convertCungToNumber(saoThienMa)
               || nhihop==convertCungToNumber(saoThienHinh) || nhihop==convertCungToNumber(saoThienMa)
                    || tamhop1==convertCungToNumber(saoThienHinh) || tamhop1==convertCungToNumber(saoThienMa)
                    || tamhop2==convertCungToNumber(saoThienHinh) || tamhop2==convertCungToNumber(saoThienMa)){
                cungMenhString.add(R.string.cungMenhKhocHu7);
            }
            if(index==convertCungToNumber(saoThienHu)){
                cungMenhString.add(R.string.cungMenhKhocHu8);
            }
            if((index==convertCungToNumber(saoThienHu) && saoThienHuQuality().equalsIgnoreCase("Dac dia"))
                    && (index==convertCungToNumber(saoHoaLoc) || index==convertCungToNumber(saoLocTon)
            || xungchieu==convertCungToNumber(saoHoaLoc) || xungchieu==convertCungToNumber(saoLocTon))){
                cungMenhString.add(R.string.cungMenhKhocHu9);
            }

        }//endthien khoc thien hu
        if(index==convertCungToNumber(saoBachTo) && index==convertCungToNumber(saoThienRieu) && gender=="Female"){
            cungMenhString.add(R.string.cungMenhKhocHu10);
        }
    }
    ArrayList<Integer> cungPhuMauPredict(){
        ArrayList<Integer> cungPhuMauString=new ArrayList<Integer>();
        int nhat=convertCungToNumber(saoThaiDuong);
        int nguyet=convertCungToNumber(saoThaiAm);
        if((nhat==2 || nhat==3 || nhat==4 || nhat==5 || nhat==6) && (nguyet==8 || nguyet==9
        || nguyet==10 || nguyet==11 || nguyet==0)){
            if((convertCungToNumber(saoTuan)==nhat || convertCungToNumber(saoTuan1)== nhat
            || convertCungToNumber(saoTriet)==nhat || convertCungToNumber(saoTriet1)==nhat)){
                if(convertCungToNumber(saoTuan)!=nguyet && convertCungToNumber(saoTuan1)!=nguyet
                        && convertCungToNumber(saoTriet) !=nguyet && convertCungToNumber(saoTriet1)!=nguyet){
                    cungPhuMauString.add(R.string.phumau1);
                }else{
                    cungPhuMauString.add(R.string.phumau2);
                }
            }else{
                //nhat sang sua
                if(convertCungToNumber(saoTuan)!=nguyet && convertCungToNumber(saoTuan1)!=nguyet
                        && convertCungToNumber(saoTriet) !=nguyet && convertCungToNumber(saoTriet1)!=nguyet){
                    //nguyet sang sua
                    cungPhuMauString.add(R.string.phumau3);
                }
                else{
                    //nguyet mo am
                    cungPhuMauString.add(R.string.phumau4);
                }
            }
        }else if((nhat==8 || nhat==9 || nhat==10 || nhat==11 || nhat==0) && (nguyet==2 || nguyet==3 || nguyet==4 || nguyet==5 || nguyet==6)){
            if((convertCungToNumber(saoTuan)==nhat || convertCungToNumber(saoTuan1)== nhat
                    || convertCungToNumber(saoTriet)==nhat || convertCungToNumber(saoTriet1)==nhat)){
                //nhat sang sua
                if(convertCungToNumber(saoTuan)!=nguyet && convertCungToNumber(saoTuan1)!=nguyet
                        && convertCungToNumber(saoTriet) !=nguyet && convertCungToNumber(saoTriet1)!=nguyet){
                    //nguyet mo am
                    cungPhuMauString.add(R.string.phumau4);
                }else{
                    //nguyet sang sua
                    cungPhuMauString.add(R.string.phumau3);
                }
            }else{
                //nhat mo am
                if(convertCungToNumber(saoTuan)!=nguyet && convertCungToNumber(saoTuan1)!=nguyet
                        && convertCungToNumber(saoTriet) !=nguyet && convertCungToNumber(saoTriet1)!=nguyet){
                    //nguyet mo am
                    cungPhuMauString.add(R.string.phumau2);
                }else{
                    //nguyet sang sua
                    cungPhuMauString.add(R.string.phumau1);
                }
            }
        }
        else if((nhat==nguyet) && (nhat==1 || nhat==7)){
            //dong cung
            if(nhat!=convertCungToNumber(saoTuan) && nhat!=convertCungToNumber(saoTuan1) && nhat!=convertCungToNumber(saoTriet1) && nhat!=convertCungToNumber(saoTriet)){
                cungPhuMauString.add(R.string.phumau5);
            }else{
                cungPhuMauString.add(R.string.phumau6);
            }
        }
       int index=convertCungToNumber(cungPhuMau);
        int xungchieu = getXungchieu(index);
        ArrayList<Integer> tamhop = getTamhopchieu(index);
        int tamhop1 = tamhop.get(0);
        int tamhop2 = tamhop.get(1);
        int nhihop = getNhihop(index);
        //sao chinh dieu
        if(index!=convertCungToNumber(saoTuVi) && index!=convertCungToNumber(saoThienCo) && index!=convertCungToNumber(saoThaiDuong)
                && index!=convertCungToNumber(saoVuKhuc) && index!=convertCungToNumber(saoThienDong) && index!=convertCungToNumber(saoLiemTrinh)
                && index!=convertCungToNumber(saoThienPhu) && index!=convertCungToNumber(saoThaiAm) && index!=convertCungToNumber(saoThamLang)
                && index!=convertCungToNumber(saoCumon) && index!=convertCungToNumber(saoThienTuong) && index!=convertCungToNumber(saoThienLuong)
                && index!=convertCungToNumber(saoThatSat) && index!=convertCungToNumber(saoPhaQuan)){
            cungPhuMauString.add(R.string.phumau92);
            index=xungchieu;
        }

            if (index == convertCungToNumber(saoTuVi)) {
                if (index == convertCungToNumber(saoThienPhu)) {
                    cungPhuMauString.add(R.string.phumau7);
                } else if (index == convertCungToNumber(saoThienTuong)) {
                    cungPhuMauString.add(R.string.phumau8);
                } else if (index == convertCungToNumber(saoThatSat)) {
                    cungPhuMauString.add(R.string.phumau9);
                } else if (index == convertCungToNumber(saoPhaQuan)) {
                    cungPhuMauString.add(R.string.phumau10);
                } else if (index == convertCungToNumber(saoThamLang)) {
                    cungPhuMauString.add(R.string.phumau11);
                } else if (index != convertCungToNumber(saoThienPhu) && index != convertCungToNumber(saoThienTuong) && index != convertCungToNumber(saoThatSat) && index != convertCungToNumber(saoPhaQuan) && index != convertCungToNumber(saoThamLang)) {
                    if (index == 6) {
                        cungPhuMauString.add(R.string.phumau12);
                    } else if (index == 0) cungPhuMauString.add(R.string.phumau13);
                }
            }//tu vi
            if (index == convertCungToNumber(saoLiemTrinh)) {
                if (index == convertCungToNumber(saoThienPhu)) {
                    cungPhuMauString.add(R.string.phumau14);
                } else if (index == convertCungToNumber(saoThienTuong)) {
                    cungPhuMauString.add(R.string.phumau15);
                } else if (index == convertCungToNumber(saoThatSat)) {
                    cungPhuMauString.add(R.string.phumau16);
                } else if (index == convertCungToNumber(saoThamLang)) {
                    cungPhuMauString.add(R.string.phumau17);
                } else if (index != convertCungToNumber(saoThienPhu) && index != convertCungToNumber(saoThienTuong) && index != convertCungToNumber(saoThatSat) && index != convertCungToNumber(saoThamLang)) {
                    if (index == 2 || index == 8) {
                        cungPhuMauString.add(R.string.phumau18);
                    }
                }
            }//liem trinh
            if (index == convertCungToNumber(saoThienDong)) {
                if (index == convertCungToNumber(saoThienLuong)) {
                    cungPhuMauString.add(R.string.phumau19);
                } else if (index == convertCungToNumber(saoThaiAm)) {
                    if (index == 0) cungPhuMauString.add(R.string.phumau20);
                    if (index == 6) cungPhuMauString.add(R.string.phumau21);
                } else if (index == convertCungToNumber(saoCumon)) {
                    cungPhuMauString.add(R.string.phumau22);
                } else if (index != convertCungToNumber(saoThienLuong) && index != convertCungToNumber(saoThaiAm) && index != convertCungToNumber(saoCumon)) {
                    if (index == 3) cungPhuMauString.add(R.string.phumau23);
                    if (index == 9) cungPhuMauString.add(R.string.phumau24);
                    if (index == 5 || index == 11) cungPhuMauString.add(R.string.phumau25);
                    if (index == 4 || index == 10) cungPhuMauString.add(R.string.phumau26);
                }
            }
            if (index == convertCungToNumber(saoVuKhuc)) {
                cungPhuMauString.add(R.string.phumau27);
                if (index != convertCungToNumber(saoThienPhu) && index != convertCungToNumber(saoThienTuong) && index != convertCungToNumber(saoThamLang) && index != convertCungToNumber(saoPhaQuan) && index != convertCungToNumber(saoThatSat)) {
                    if (index == 4 || index == 10) cungPhuMauString.add(R.string.phumau28);
                }
                if (index == convertCungToNumber(saoThienPhu))
                    cungPhuMauString.add(R.string.phumau29);
                if (index == convertCungToNumber(saoThienTuong))
                    cungPhuMauString.add(R.string.phumau30);
                if (index == convertCungToNumber(saoThamLang))
                    cungPhuMauString.add(R.string.phumau31);
                if (index == convertCungToNumber(saoThatSat))
                    cungPhuMauString.add(R.string.phumau32);
            }//end sao vu khuc
            if (index == convertCungToNumber(saoThaiDuong)) {
                if (index == 2 || index == 3 || index == 4 || index == 5 || index == 6) {
                    cungPhuMauString.add(R.string.phumau33);
                }
                if (index == 8 || index == 9 || index == 10 || index == 11 || index == 0) {
                    cungPhuMauString.add(R.string.phumau34);
                }
                if (index == convertCungToNumber(saoThaiAm))
                    cungPhuMauString.add(R.string.phumau35);
            }
            if (index == convertCungToNumber(saoThienCo)) {
                if (index != convertCungToNumber(saoThaiAm) && index != convertCungToNumber(saoThienLuong) && index != convertCungToNumber(saoCumon)) {
                    if (index == 5 || index == 6 || index == 7)
                        cungPhuMauString.add(R.string.phumau36);
                    else if (index == 11 || index == 0 || index == 1)
                        cungPhuMauString.add(R.string.phumau37);
                }
                if (index == convertCungToNumber(saoThaiAm) && index == 8)
                    cungPhuMauString.add(R.string.phumau38);
                if (index == convertCungToNumber(saoThaiAm) && index == 2)
                    cungPhuMauString.add(R.string.phumau39);
                if (index == convertCungToNumber(saoThienLuong))
                    cungPhuMauString.add(R.string.phumau40);
                if (index == convertCungToNumber(saoCumon)) cungPhuMauString.add(R.string.phumau41);
            }
            if (index == convertCungToNumber(saoThienPhu)) {
                cungPhuMauString.add(R.string.phumau42);
                if (index != convertCungToNumber(saoTuVi) && index != convertCungToNumber(saoLiemTrinh) && index != convertCungToNumber(saoVuKhuc)) {
                    if (index == 5 || index == 11) cungPhuMauString.add(R.string.phumau43);
                    if (index == 1 || index == 3 || index == 7 || index == 9)
                        cungPhuMauString.add(R.string.phumau44);
                }
            }
            if (index == convertCungToNumber(saoThaiAm)) {
                if (index != convertCungToNumber(saoThienDong) && index != convertCungToNumber(saoThienCo) && index != convertCungToNumber(saoThaiDuong)) {
                    if (index == 9 || index == 10 || index == 11)
                        cungPhuMauString.add(R.string.phumau45);
                    if (index == 3 || index == 4 || index == 5)
                        cungPhuMauString.add(R.string.phumau46);
                }
            }
            if (index == convertCungToNumber(saoThamLang)) {
                cungPhuMauString.add(R.string.phumau47);
                if (index != convertCungToNumber(saoTuVi) && index != convertCungToNumber(saoLiemTrinh) && index != convertCungToNumber(saoVuKhuc)) {
                    if (index == 4 || index == 10) cungPhuMauString.add(R.string.phumau48);
                    if (index == 2 || index == 8) cungPhuMauString.add(R.string.phumau49);
                    if (index == 0 || index == 5) cungPhuMauString.add(R.string.phumau50);
                }
            }
            if (index == convertCungToNumber(saoCumon)) {
                cungPhuMauString.add(R.string.phumau51);
                if (index != convertCungToNumber(saoThaiDuong) && index != convertCungToNumber(saoThienDong) && index != convertCungToNumber(saoThienCo)) {
                    if (index == 0 || index == 11 || index == 6)
                        cungPhuMauString.add(R.string.phumau52);
                    if (index == 5) cungPhuMauString.add(R.string.phumau53);
                    if (index == 10 || index == 4) cungPhuMauString.add(R.string.phumau54);
                }
            }
            if (index == convertCungToNumber(saoThienTuong)) {
                cungPhuMauString.add(R.string.phumau55);
                if (index != convertCungToNumber(saoTuVi) && index != convertCungToNumber(saoLiemTrinh) && index != convertCungToNumber(saoVuKhuc)) {
                    if (index == 5 || index == 11 || index == 1 || index == 7)
                        cungMenhString.add(R.string.phumau56);
                    if (index == 3 || index == 9) cungPhuMauString.add(R.string.phumau57);
                }
            }
            if (index == convertCungToNumber(saoThienLuong)) {
                if (index != convertCungToNumber(saoThaiDuong) && index != convertCungToNumber(saoThienDong) && index != convertCungToNumber(saoThienCo)) {
                    if (index == 5 || index == 6) cungPhuMauString.add(R.string.phumau58);
                    if (index == 1 || index == 7) cungPhuMauString.add(R.string.phumau59);
                    if (index == 5 || index == 11) cungPhuMauString.add(R.string.phumau60);
                }
            }
            if (index == convertCungToNumber(saoThatSat)) {
                cungPhuMauString.add(R.string.phumau61);
                if (index != convertCungToNumber(saoTuVi) && index != convertCungToNumber(saoLiemTrinh) && index != convertCungToNumber(saoVuKhuc)) {
                    if (index == 2 || index == 8) cungPhuMauString.add(R.string.phumau62);
                    if (index == 5 || index == 6) cungPhuMauString.add(R.string.phumau63);
                    if (index == 4 || index == 10) cungPhuMauString.add(R.string.phumau64);
                }
            }
            if (index == convertCungToNumber(saoPhaQuan)) {
                cungPhuMauString.add(R.string.phumau65);
                if (index != convertCungToNumber(saoTuVi) && index != convertCungToNumber(saoLiemTrinh) && index != convertCungToNumber(saoVuKhuc)) {
                    if (index == 0 || index == 6) cungPhuMauString.add(R.string.phumau66);
                    if (index == 2 || index == 8) cungPhuMauString.add(R.string.phumau67);
                    if (index == 4 || index == 10) cungPhuMauString.add(R.string.phumau68);
                }
            }


        index=convertCungToNumber(cungPhuMau);


        //end chinh dieu
        if(index==convertCungToNumber(saoKinhDuong) || index==convertCungToNumber(saoDala)){
            cungPhuMauString.add(R.string.phumau69);
            if(index==convertCungToNumber(saoPhiLiem)) cungPhuMauString.add(R.string.phumau70);
            if(index==convertCungToNumber(saoThatSat)) cungPhuMauString.add(R.string.phumau71);
            if(index==convertCungToNumber(saoThamLang)) cungPhuMauString.add(R.string.phumau72);
        }
        if(index==convertCungToNumber(saoHoaTinh) || index==convertCungToNumber(saoLinhTinh)){
            cungPhuMauString.add(R.string.phumau73);
            if(index==convertCungToNumber(saoThamLang)) cungPhuMauString.add(R.string.phumau74);
            if(index==convertCungToNumber(saoPhaQuan)) cungPhuMauString.add(R.string.phumau75);
        }
        if(index==convertCungToNumber(saoDiaKhong) || index==convertCungToNumber(saoDiaKiep)){
            cungPhuMauString.add(R.string.phumau76);
        }
        if(index==convertCungToNumber(saoVanXuong) || index==convertCungToNumber(saoVanKhuc)){
            cungPhuMauString.add(R.string.phumau77);
        }
        if(index==convertCungToNumber(saoThienKhoi) || index==convertCungToNumber(saoThienViet)){
            cungPhuMauString.add(R.string.phumau78);
        }
        if(index==convertCungToNumber(saoTaPhu) || index==convertCungToNumber(saoHuuBat)){
            cungPhuMauString.add(R.string.phumau79);
            if(index==convertCungToNumber(saoThatSat) || index==convertCungToNumber(saoKiepSat)
                    ||nhihop==convertCungToNumber(saoThatSat) || nhihop==convertCungToNumber(saoKiepSat)
                    || tamhop1==convertCungToNumber(saoThatSat) || tamhop1==convertCungToNumber(saoKiepSat)
                    || tamhop2==convertCungToNumber(saoThatSat) || tamhop2==convertCungToNumber(saoKiepSat))
            {
                cungPhuMauString.add(R.string.phumau80);

            }
        }
        if(index==convertCungToNumber(saoLocTon)){
            cungPhuMauString.add(R.string.phumau81);
        }
        if(index==convertCungToNumber(saoHoaLoc)){
            cungPhuMauString.add(R.string.phumau82);
        }
        if(index==convertCungToNumber(saoHoaQuyen)){
            cungPhuMauString.add(R.string.phumau83);
        }
        if(index==convertCungToNumber(saoHoaKhoa)){
            cungPhuMauString.add(R.string.phumau84);
        }
        if(index==convertCungToNumber(saoHoaKy)){
            cungPhuMauString.add(R.string.phumau85);
        }
        if(index==convertCungToNumber(saoThienMa)){
            cungPhuMauString.add(R.string.phumau86);
            if(index==convertCungToNumber(saoHoaLoc)){
                cungPhuMauString.add(R.string.phumau87);
            }
            if(index==convertCungToNumber(saoDala))
                cungPhuMauString.add(R.string.phumau88);
        }
        if(index==convertCungToNumber(saoThaiTue)){
            cungPhuMauString.add(R.string.phumau89);
        }
        if(index==convertCungToNumber(saoCoThan) || index==convertCungToNumber(saoQuaTu)){
            cungPhuMauString.add(R.string.phumau90);
        }
        if(index==convertCungToNumber(saoDaoHoa) || index==convertCungToNumber(saoHongLoan)){
            cungPhuMauString.add(R.string.phumau91);
        }

        return cungPhuMauString;
    }
    ArrayList<Integer> cungPhucDucPredict() {
        ArrayList<Integer> cungPhucDucString = new ArrayList<Integer>();
        int index=convertCungToNumber(cungPhucDuc);
        int xungchieu = getXungchieu(index);
        ArrayList<Integer> tamhop = getTamhopchieu(index);
        int tamhop1 = tamhop.get(0);
        int tamhop2 = tamhop.get(1);
        int nhihop = getNhihop(index);
        if(index!=convertCungToNumber(saoTuVi) && index!=convertCungToNumber(saoThienCo) && index!=convertCungToNumber(saoThaiDuong)
                && index!=convertCungToNumber(saoVuKhuc) && index!=convertCungToNumber(saoThienDong) && index!=convertCungToNumber(saoLiemTrinh)
                && index!=convertCungToNumber(saoThienPhu) && index!=convertCungToNumber(saoThaiAm) && index!=convertCungToNumber(saoThamLang)
                && index!=convertCungToNumber(saoCumon) && index!=convertCungToNumber(saoThienTuong) && index!=convertCungToNumber(saoThienLuong)
                && index!=convertCungToNumber(saoThatSat) && index!=convertCungToNumber(saoPhaQuan)){
            cungPhucDucString.add(R.string.phucduc1);
            index=xungchieu;
        }
        if(index==convertCungToNumber(saoTuVi)){
            if(index!=convertCungToNumber(saoThienPhu) && index!=convertCungToNumber(saoThienTuong) && index!=convertCungToNumber(saoThatSat)
                    && index!=convertCungToNumber(saoPhaQuan) && index!=convertCungToNumber(saoThamLang)){
                if(index==6) cungPhucDucString.add(R.string.phucduc2);
                if(index==0) cungPhucDucString.add(R.string.phucduc3);
            }
            if(index==convertCungToNumber(saoThienPhu) || index==convertCungToNumber(saoThienTuong)) cungPhucDucString.add(R.string.phucduc4);
            if(index==convertCungToNumber(saoThatSat)) cungPhucDucString.add(R.string.phucduc5);
            if(index==convertCungToNumber(saoPhaQuan)) cungPhucDucString.add(R.string.phucduc6);
            if(index==convertCungToNumber(saoThamLang)) cungPhucDucString.add(R.string.phucduc7);
        }
        if(index==convertCungToNumber(saoLiemTrinh)){
            if(index!=convertCungToNumber(saoThienPhu) && index!=convertCungToNumber(saoThienTuong) && index!=convertCungToNumber(saoPhaQuan)
                    && index!=convertCungToNumber(saoThamLang) && index!=convertCungToNumber(saoThatSat)){
                if(index==2 || index==8) cungPhucDucString.add(R.string.phucduc8);
            }
            if(index==convertCungToNumber(saoThienPhu)){
                cungPhucDucString.add(R.string.phucduc9);
            }
            if(index==convertCungToNumber(saoThienTuong)) cungPhucDucString.add(R.string.phucduc10);
            if(index==convertCungToNumber(saoPhaQuan)) cungPhucDucString.add(R.string.phucduc11);
            if(index==convertCungToNumber(saoThamLang)) cungPhucDucString.add(R.string.phucduc12);
            if(index==convertCungToNumber(saoThatSat)) cungPhucDucString.add(R.string.phucduc13);
        }
        if(index==convertCungToNumber(saoThienDong)){
            if(index!=convertCungToNumber(saoCumon) && index!=convertCungToNumber(saoThaiAm) && index!=convertCungToNumber(saoThienLuong)){
                if(index==3) cungPhucDucString.add(R.string.phucduc14);
                if(index==9) cungPhucDucString.add(R.string.phucduc15);
            }
        }



         index=convertCungToNumber(cungPhucDuc);
        return cungPhucDucString;
    }
}




