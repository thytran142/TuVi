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
    public String cuc="";
    public String saoTuVi="";
    public String saoLiemTrinh="";
    public String saoThienDong="";
    public String saoVuKhuc="";
    public String saoThienCo="";
    public String saoThaiDuong="";
    public String saoThienPhu="";
    public String saoThaiAm="";
    public String saoThamLang="";
    public String saoCumon="";
    public String saoThienTuong="";
    public String saoThienLuong="";
    public String saoThatSat="";
    public String saoPhaQuan="";
    public String saoThaiTue="";
    public String saoThieuDuong="";
    public String saoTangMon="";
    public String saoThieuAm="";
    public String saoQuanPhu="";
    public String saoTuPhu="";
    public String saoTuePha="";
    public String saoLongDuc="";
    public String saoBachTo="";
    public String saoPhucDuc="";
    public String saoDieuKhach="";
    public String saoTrucPhu="";
    public String saoLocTon="";
    public String saoLucSi="";
    public String saoThanhLong="";
    public String saoTieuHao="";
    public String saoTuongQuan="";
    public String saoTauThu="";
    public String saoPhiLiem="";
    public String saoHiThan="";
    public String saoBenhPhu="";
    public String saoDaiHao="";
    public String saoPhucBinh="";
    public String saoQuanPhu2="";
    public String saoTruongSinh="";
    public String saoMocDuc="";
    public String saoQuanDoi="";
    public String saoLamQuan="";
    public String saoDeVuong="";
    public String saoSuy="";
    public String saoBenh="";
    public String saoTu="";
    public String saoMo="";
    public String saoTuyet="";
    public String saoThai="";
    public String saoDuong="";
    public String saoKinhDuong="";
    public String saoDala="";
    public String saoDiaKiep="";
    public String saoDiaKhong="";
    public String saoHoaTinh="";
    public String saoLinhTinh="";
    public String saoTaPhu="";
    public String saoHuuBat="";
    public String saoVanXuong="";
    public String saoVanKhuc="";
    public String saoLongTri="";
    public String saoPhuongCac="";
    public String saoThienKhoi="";
    public String saoThienViet="";
    public String saoThienKhoc="";
    public String saoThienHu="";
    public String saoTamThai="";
    public String saoBatToa="";
    public String saoAnQuang="";
    public String saoThienQui="";
    public String saoThienDuc="";
    public String saoNguyetDuc="";
    public String saoThienHinh="";
    public String saoThienRieu="";
    public String saoThienY="";
    public String saoHongLoan="";
    public String saoThienHi="";
    public String saoQuocAn="";
    public String saoDuongPhu="";
    public String saoThienGiai="";
    public String saoDiaGiai="";
    public String saoGiaiThan="";
    public String saoThaiPhu="";
    public String saoPhongCao="";
    public String saoThienTai="";
    public String saoThienTho="";
    public String saoThienThuong="";
    public String saoThienSu="";
    public String saoThienLa="";
    public String saoDiaVong="";
    public String saoHoaLoc="";
    public String saoHoaQuyen="";
    public String saoHoaKhoa="";
    public String saoHoaKy="";
    public String saoCoThan="";
    public String saoQuaTu="";
    public String saoThienQuan="";
   public String saoThienPhuc="";
    public String saoDaoHoa="";
    public String saoThienMa="";
    public String saoPhaToai="";
    public String saoKiepSat="";
    public String saoHoaCai="";
    public String saoLuuHa="";
    public String saoThienTru="";
    public String saoLuuNienVanTinh="";
    public String saoBacSi="";
    public String saoDauQuan="";
    public String saoThienKhong="";
    public String saoTuan="";
    public String saoTuan1="";
    public String saoTriet="";
    public String saoTriet1="";
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
        lapcuc(cungMenh,yearOfAnimal(year,month,day));
        anTuvitinhhe(cuc,chineseDate);
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
        ancungkhac.setText("An cung menh o "+cungMenh+", an cung phu mau o "+cungPhuMau+", an cung Phuc duc o "+cungPhucDuc
                + ", an cung Dien Trach o "+cungDienTrach+ ", an cung Quan loc o "+ cungQuanloc+ ", an cung No boc o "+cungNoBoc
                +", an cung Thien di o "+cungThienDi+", an cung tat ach o "+cungTatAch+", an cung tai bach o "+cungTaiBach
                +", an cung Tu tuc o "+cungTuTuc+", an cung The thiep o "+cungTheThiep+". An cung than tai "+cungThan+". Cuc: "+cuc+". Sao Tu vi an tai: "+saoTuVi +". Sao Liem Trinh an tai: "+saoLiemTrinh

        +". Sao Thien dong an tai: "+saoThienDong+ ". Sao Vu khuc an tai "+saoVuKhuc + ". Sao Thai Duong an tai: "+saoThaiDuong
        +". Sao Thien co an tai: "+saoThienCo+". Sao Thien Phu an tai: "+saoThienPhu+", sao thai am an tai: "+saoThaiAm+", sao Tham lang an tai: "+saoThamLang
        +", sao Cu Mon an tai: "+saoCumon + ", sao Thien Tuong an tai: "+saoThienTuong+", sao Thien Luong: "+saoThienLuong
        +", sao That sat:  "+saoThatSat+", sao Pha quan: "+saoPhaQuan+". Thai tue: "+saoThaiTue
        +", Thieu Duong: "+saoThieuDuong+", Tang mon: "+saoTangMon+", Thieu am: "+saoThieuAm+", Quan phu: "+saoQuanPhu
        +", Tu Phu: "+saoTuPhu +", Tue Pha: "+saoTuePha+", Long Duc: "+saoLongDuc+", Bach to:"+saoBachTo
        +", Phuc Duc: "+saoPhucDuc+", Dieu Khach: "+saoDieuKhach+",Truc Phu: "+saoTrucPhu+". Loc ton: "+saoLocTon
        +", Luc si: "+saoLucSi+ ", Thanh Long: "+saoThanhLong+", Tieu Hao: "+saoTieuHao+", Tuong Quan: "+saoTuongQuan
        +", Tau Thu: "+saoTauThu+", Phi Liem: "+saoPhiLiem+", Hi Than: "+saoHiThan+", Benh phu: "+saoBenhPhu+",Dai hao: "+saoDaiHao
        +", Phuc binh: "+saoPhucBinh+", Quan phu: "+saoQuanPhu2+". Truong Sinh: "+saoTruongSinh+", Moc duc: "+saoMocDuc
        +", Quan doi: "+saoQuanDoi +", Lam quan: "+saoLamQuan+", De Vuong: "+saoDeVuong+",Benh: "+saoBenh+", Tu: "+saoTu
        +", Mo: "+saoMo+", Tuyet: "+saoTuyet+", Thai: "+saoThai+", Duong: "+saoDuong+", Suy: "+saoSuy
        +", Kinh Duong: "+saoKinhDuong+", Da la: "+saoDala+", Dia kiep: "+saoDiaKiep+", Dia khong: "+saoDiaKhong
        +", Hoa tinh: "+saoHoaTinh+", Linh tinh: "+saoLinhTinh+". Ta phu: "+saoTaPhu+",Huu bat: "+saoHuuBat
        +". Van Xuong: "+saoVanXuong+". Van Khuc: "+saoVanKhuc+". Long Tri: "+saoLongTri+". Phuong Cac: "+saoPhuongCac
        +". Thien Khoi: "+saoThienKhoi+". Thien Viet: "+saoThienViet+". Thien khoc: "+saoThienKhoc + ",Thien hu: "+saoThienHu
        +". Tam Thai: "+saoTamThai+". Bat toa: "+saoBatToa+". An Quang: "+saoAnQuang+". Thien Qui: "+saoThienQui
        +". Thien Duc: "+saoThienDuc+". Nguyet Duc: "+saoNguyetDuc+". Thien Hinh: "+saoThienHinh+".Thien Rieu, Thien Y: "+saoThienRieu
        +". Hong loan: "+saoHongLoan+". Thien hi: "+saoThienHi +". Quoc an: "+saoQuocAn+". Duong Phu: "+saoDuongPhu
        +".Thien giai: "+saoThienGiai+". Dia giai: "+saoDiaGiai + ".Giai Than: "+saoGiaiThan
        +"\n Sao Thai phu: "+ saoThaiPhu+". Sao Phong Cao: "+saoPhongCao+". Thien tai: "+saoThienTai+". Thien Tho: "+saoThienTho
       +"\n Thien Thuong: "+saoThienThuong+", Thien Su: "+saoThienSu
        +"\n Thien La: "+saoThienLa+". Dia vong: "+saoDiaVong
        +"\n Hoa Loc: "+saoHoaLoc+". Hoa Quyen "+saoHoaQuyen +". Hoa KHoa: "+saoHoaKhoa + ". Hoa Ky: "+saoHoaKy
        +"\n Co than:"+ saoCoThan+". Qua tu: "+saoQuaTu
        +"\n Thien Quan: "+saoThienQuan+".Thien Phuc: "+saoThienPhuc
        +"\n Dao hoa: "+saoDaoHoa
        +"\n Thien ma: "+saoThienMa+". Pha toai: "+saoPhaToai+". Kiep sat: "+saoKiepSat+".Hoa Cai: "+saoHoaCai +". Luu ha: "+saoLuuHa+". Thien Tru: "+saoThienTru
        +"\n Dau quan: "+saoDauQuan+".Thien khong: "+saoThienKhong+". Bac si: "+saoBacSi+".Tuan tai: "+saoTuan+","+saoTuan1+". Triet tai: "+saoTriet+","+saoTriet1);
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
        else if(12+temp>=0) return 12+temp;
        else return 24+temp;

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
    public void lapcuc(String menh,int d){
        if(d==R.string.giapngo || d==R.string.giapthin || d==R.string.giaptuat || d==R.string.giapdan || d==R.string.giapthan || d==R.string.giapty
        || d==R.string.kydau || d==R.string.kymao || d==R.string.kysuu || d==R.string.kymui || d==R.string.kyhoi || d==R.string.kyty
        )
        {
         if(menh.equalsIgnoreCase("Ty1") || menh.equalsIgnoreCase("Suu"))
             cuc="Thuy nhi cuc";
         else if (menh.equalsIgnoreCase("Dan")|| menh.equalsIgnoreCase("Mao") || menh.equalsIgnoreCase("Tuat") || menh.equalsIgnoreCase("Hoi"))
             cuc="Hoa luc cuc";
         else if(menh.equalsIgnoreCase("Thin") || menh.equalsIgnoreCase("Ty5"))
             cuc="Moc tam cuc";
         else if(menh.equalsIgnoreCase("Ngo") || menh.equalsIgnoreCase("Mui"))
             cuc="Tho ngu cuc";
         else if(menh.equalsIgnoreCase("Than") || menh.equalsIgnoreCase("Dau"))
             cuc="Kim tu cuc";
        }
        else if (d==R.string.atty || d==R.string.athoi || d==R.string.atdau || d==R.string.atmao || d==R.string.atmui || d==R.string.atsuu
         || d==R.string.canhtuat || d==R.string.canhty || d==R.string.canhngo || d==R.string.canhthan || d==R.string.canhdan || d==R.string.canhthin)
        {
          if(menh.equalsIgnoreCase("Ty1") || menh.equalsIgnoreCase("Suu"))
              cuc="Hoa luc cuc";
          else if(menh.equalsIgnoreCase("Dan") || menh.equalsIgnoreCase("Mao") || menh.equalsIgnoreCase("Tuat") || menh.equalsIgnoreCase("Hoi"))
              cuc="Tho ngu cuc";
          else if(menh.equalsIgnoreCase("Thin") || menh.equalsIgnoreCase("Ty5"))
              cuc="Kim tu cuc";
            else if(menh.equalsIgnoreCase("Ngo") || menh.equalsIgnoreCase("Mui"))
              cuc="Moc tam cuc";
            else if(menh.equalsIgnoreCase("Than") || menh.equalsIgnoreCase("Dau"))
              cuc="Thuy nhi cuc";
        }
        else if(d==R.string.binhthin || d==R.string.binhtuat || d==R.string.binhthan || d==R.string.binhngo || d==R.string.binhdan || d==R.string.binhty
                || d==R.string.tansuu || d==R.string.tanmui || d==R.string.tandau || d==R.string.tanmao || d==R.string.tanhoi || d==R.string.tanty)
        {
            if(menh.equalsIgnoreCase("Ty1") || menh.equalsIgnoreCase("Suu"))
                cuc="Tho ngu cuc";
            else if(menh.equalsIgnoreCase("Dan") || menh.equalsIgnoreCase("Mao") || menh.equalsIgnoreCase("Tuat") || menh.equalsIgnoreCase("Hoi"))
                cuc="Moc tam cuc";
            else if(menh.equalsIgnoreCase("Thin") || menh.equalsIgnoreCase("Ty5"))
                cuc="Thuy nhi cuc";
            else if(menh.equalsIgnoreCase("Ngo") || menh.equalsIgnoreCase("Mui"))
                cuc="Kim tu cuc";
            else if(menh.equalsIgnoreCase("Than") || menh.equalsIgnoreCase("Dau"))
                cuc="Hoa luc cuc";
        }
        else if(d==R.string.dinhhoi || d==R.string.dinhty || d==R.string.dinhdau || d==R.string.dinhmao || d==R.string.dinhmui || d==R.string.dinhsuu
                || d==R.string.nhamtuat || d==R.string.nhamthin || d==R.string.nhamty || d==R.string.nhamngo || d==R.string.nhamdan || d==R.string.nhamthan)
        {
            if(menh.equalsIgnoreCase("Ty1") || menh.equalsIgnoreCase("Suu"))
                cuc="Moc tam cuc";
            else if(menh.equalsIgnoreCase("Dan") || menh.equalsIgnoreCase("Mao") || menh.equalsIgnoreCase("Tuat") || menh.equalsIgnoreCase("Hoi"))
                cuc="Kim tu cuc";
            else if(menh.equalsIgnoreCase("Thin") || menh.equalsIgnoreCase("Ty5"))
                cuc="Hoa luc cuc";
            else if(menh.equalsIgnoreCase("Ngo") || menh.equalsIgnoreCase("Mui"))
                cuc="Thuy nhi cuc";
            else if(menh.equalsIgnoreCase("Than")|| menh.equalsIgnoreCase("Dau"))
                cuc="Tho ngu cuc";
        }
        else if(d==R.string.mauthan || d==R.string.maudan || d==R.string.mauty || d==R.string.maungo || d==R.string.mauthin || d==R.string.mautuat
                || d==R.string.quyty || d==R.string.quysuu || d==R.string.quymui || d==R.string.quymao || d==R.string.quydau || d==R.string.quyhoi)
        {
            if(menh.equalsIgnoreCase("Ty1") || menh.equalsIgnoreCase("Suu"))
                cuc="Kim tu cuc";
            else if(menh.equalsIgnoreCase("Dan") || menh.equalsIgnoreCase("Mao") || menh.equalsIgnoreCase("Tuat") || menh.equalsIgnoreCase("Hoi"))
                cuc="Thuy nhi cuc";
            else if(menh.equalsIgnoreCase("Thin") || menh.equalsIgnoreCase("Ty5"))
                cuc="Tho ngu cuc";
            else if(menh.equalsIgnoreCase("Ngo")|| menh.equalsIgnoreCase("Mui"))
                cuc="Hoa luc cuc";
            else if(menh.equalsIgnoreCase("Than") || menh.equalsIgnoreCase("Dau"))
                cuc="Moc tam cuc";
        }
    }
    public void anTuvitinhhe(String cuc, int ngaySinh)
    {
        //an saoTuVi
        if(cuc.equalsIgnoreCase("Thuy nhi cuc"))
        {
            if(ngaySinh==22 || ngaySinh==23) saoTuVi=cung[0];
            else if(ngaySinh==1 || ngaySinh==25 || ngaySinh==24) saoTuVi=cung[1];
            else if(ngaySinh==2 || ngaySinh==3 || ngaySinh==26 || ngaySinh==27) saoTuVi=cung[2];
            else if(ngaySinh==4 || ngaySinh==5 || ngaySinh==28 || ngaySinh==29) saoTuVi=cung[3];
            else if(ngaySinh==6 || ngaySinh==7 || ngaySinh==30) saoTuVi=cung[4];
            else if(ngaySinh==8 || ngaySinh==9) saoTuVi=cung[5];
            else if(ngaySinh==10 || ngaySinh==11) saoTuVi=cung[6];
            else if(ngaySinh==12 || ngaySinh==13) saoTuVi=cung[7];
            else if(ngaySinh==14 || ngaySinh==15) saoTuVi=cung[8];
            else if(ngaySinh==16 || ngaySinh==17) saoTuVi=cung[9];
            else if(ngaySinh==18 || ngaySinh==19) saoTuVi=cung[10];
            else if(ngaySinh==20 || ngaySinh==21) saoTuVi=cung[11];
        }
        else if(cuc.equalsIgnoreCase("Moc tam cuc"))
        {
            if(ngaySinh==25) saoTuVi=cung[0];
            else if(ngaySinh==2 || ngaySinh==28) saoTuVi=cung[1];
            else if(ngaySinh==3 || ngaySinh==5) saoTuVi=cung[2];
            else if(ngaySinh==6 || ngaySinh==8) saoTuVi=cung[3];
            else if(ngaySinh==1 || ngaySinh==9 || ngaySinh==11) saoTuVi=cung[4];
            else if(ngaySinh==4 || ngaySinh==12 || ngaySinh==14) saoTuVi=cung[5];
            else if(ngaySinh==7 || ngaySinh==15 || ngaySinh==17) saoTuVi=cung[6];
            else if(ngaySinh==10 || ngaySinh==18 || ngaySinh==20) saoTuVi=cung[7];
            else if(ngaySinh==13 || ngaySinh==21 || ngaySinh==23) saoTuVi=cung[8];
            else if(ngaySinh==16 || ngaySinh==24 || ngaySinh==26) saoTuVi=cung[9];
            else if(ngaySinh==19 || ngaySinh==27 || ngaySinh==29) saoTuVi=cung[10];
            else if(ngaySinh==22 || ngaySinh==30) saoTuVi=cung[11];
        }
        else if(cuc.equalsIgnoreCase("Kim tu cuc"))
        {
            if(ngaySinh==5) saoTuVi=cung[0];
            else if(ngaySinh==3 || ngaySinh==9) saoTuVi=cung[1];
            else if(ngaySinh==4 || ngaySinh==7 || ngaySinh==13) saoTuVi=cung[2];
            else if(ngaySinh==8 || ngaySinh==11 || ngaySinh==17) saoTuVi=cung[3];
            else if(ngaySinh==2 || ngaySinh==12 || ngaySinh==15 || ngaySinh==21) saoTuVi=cung[4];
            else if(ngaySinh==6 || ngaySinh==16 || ngaySinh==19 || ngaySinh==25) saoTuVi=cung[5];
            else if(ngaySinh==10 || ngaySinh==20 || ngaySinh==23 || ngaySinh==29) saoTuVi=cung[6];
            else if(ngaySinh==14 || ngaySinh==24 || ngaySinh==27) saoTuVi=cung[7];
            else if(ngaySinh==18 || ngaySinh==28) saoTuVi=cung[8];
            else if(ngaySinh==22) saoTuVi=cung[9];
            else if(ngaySinh==26) saoTuVi=cung[10];
            else if(ngaySinh==1 || ngaySinh==30) saoTuVi=cung[11];
        }
        else if(cuc.equalsIgnoreCase("Tho ngu cuc"))
        {
            if(ngaySinh==7) saoTuVi=cung[0];
            else if(ngaySinh==4 || ngaySinh==12) saoTuVi=cung[1];
            else if(ngaySinh==5 || ngaySinh==9 || ngaySinh==17) saoTuVi=cung[2];
            else if(ngaySinh==10 || ngaySinh==14 || ngaySinh==22) saoTuVi=cung[3];
            else if(ngaySinh==3 || ngaySinh==15 || ngaySinh==19 || ngaySinh==27) saoTuVi=cung[4];
            else if(ngaySinh==8 || ngaySinh==20 || ngaySinh==24) saoTuVi=cung[5];
            else if(ngaySinh==1 || ngaySinh==13 || ngaySinh==25 || ngaySinh==29) saoTuVi=cung[6];
            else if(ngaySinh==6 || ngaySinh==18 || ngaySinh==30) saoTuVi=cung[7];
            else if(ngaySinh==11 || ngaySinh==23) saoTuVi=cung[8];
            else if(ngaySinh==16 || ngaySinh==28) saoTuVi=cung[9];
            else if(ngaySinh==21) saoTuVi=cung[10];
            else if(ngaySinh==2 || ngaySinh==26) saoTuVi=cung[11];
        }
        else if(cuc.equalsIgnoreCase("Hoa luc cuc"))
        {
            if(ngaySinh==9 || ngaySinh==19) saoTuVi=cung[0];
            else if(ngaySinh==5 || ngaySinh==15 || ngaySinh==25) saoTuVi=cung[1];
            else if(ngaySinh==6 || ngaySinh==11 || ngaySinh==21) saoTuVi=cung[2];
            else if(ngaySinh==12 || ngaySinh==17 || ngaySinh==27) saoTuVi=cung[3];
            else if(ngaySinh==4 || ngaySinh==18 || ngaySinh==23) saoTuVi=cung[4];
            else if(ngaySinh==10 || ngaySinh==24 || ngaySinh==29) saoTuVi=cung[5];
            else if(ngaySinh==2 || ngaySinh==16 || ngaySinh==30) saoTuVi=cung[6];
            else if(ngaySinh==8 || ngaySinh==22 ) saoTuVi=cung[7];
            else if(ngaySinh==14 || ngaySinh==28) saoTuVi=cung[8];
            else if(ngaySinh==1 || ngaySinh==20) saoTuVi=cung[9];
            else if(ngaySinh==7 || ngaySinh==26) saoTuVi=cung[10];
            else if(ngaySinh==3 || ngaySinh==13) saoTuVi=cung[11];
        }
        int temp=convertCungToNumber(saoTuVi);
        temp=counterClockwise(temp,5);
        saoLiemTrinh=cung[temp];
        temp=convertCungToNumber(saoLiemTrinh);
        temp=counterClockwise(temp,4);
        saoThienDong=cung[temp];
        temp=convertCungToNumber(saoThienDong);
        temp=counterClockwise(temp,2);
        saoVuKhuc=cung[temp];
        temp=convertCungToNumber(saoVuKhuc);
        temp=counterClockwise(temp,2);
        saoThaiDuong=cung[temp];
        temp=convertCungToNumber(saoThaiDuong);
        temp=counterClockwise(temp,3);
        saoThienCo=cung[temp];

    }
    public int convertCungToNumber(String cung){
        if(cung.equalsIgnoreCase("Ty1")) return 0;
        else if(cung.equalsIgnoreCase("Suu")) return 1;
        else if(cung.equalsIgnoreCase("Dan")) return 2;
        else if(cung.equalsIgnoreCase("Mao")) return 3;
        else if(cung.equalsIgnoreCase("Thin")) return 4;
        else if(cung.equalsIgnoreCase("Ty5")) return 5;
        else if(cung.equalsIgnoreCase("Ngo")) return 6;
        else if(cung.equalsIgnoreCase("Mui")) return 7;
        else if(cung.equalsIgnoreCase("Than")) return 8;
        else if(cung.equalsIgnoreCase("Dau")) return 9;
        else if(cung.equalsIgnoreCase("Tuat")) return 10;
        else if(cung.equalsIgnoreCase("Hoi")) return 11;
        else return 0;
    }
    public void anThienphutinhhe(String tuvi){
        int index=convertCungToNumber(tuvi);
        if(index==0) saoThienPhu=cung[4];
        else if(index==1) saoThienPhu=cung[3];
        else if(index==2) saoThienPhu=cung[2];
        else if(index==3) saoThienPhu=cung[1];
        else if(index==4) saoThienPhu=cung[0];
        else if(index==5) saoThienPhu=cung[11];
        else if(index==6) saoThienPhu=cung[10];
        else if(index==7) saoThienPhu=cung[9];
        else if(index==8) saoThienPhu=cung[8];
        else if(index==9) saoThienPhu=cung[7];
        else if(index==10) saoThienPhu=cung[6];
        else if(index==11) saoThienPhu=cung[5];
        index=convertCungToNumber(saoThienPhu);
        index=counterClockwise(index,2);
        saoThaiAm=cung[index];
        index=convertCungToNumber(saoThaiAm);
        index=counterClockwise(index,2);
        saoThamLang=cung[index];
        index=convertCungToNumber(saoThamLang);
        index=counterClockwise(index,2);
        saoCumon=cung[index];
        index=convertCungToNumber(saoCumon);
        index=counterClockwise(index,2);
        saoThienTuong=cung[index];
        index=convertCungToNumber(saoThienTuong);
        index=counterClockwise(index,2);
        saoThienLuong=cung[index];
        index=convertCungToNumber(saoThienLuong);
        index=counterClockwise(index,2);
        saoThatSat=cung[index];
        index=convertCungToNumber(saoThatSat);
        index=counterClockwise(index,5);
        saoPhaQuan=cung[index];
    }
    public void anThaitinhhe(){
        int index=yearOfAnimal(year,month,day);
        if(index==R.string.giapty || index==R.string.nhamty || index==R.string.binhty ||index==R.string.mauty ||index==R.string.canhty)
            saoThaiTue=cung[0];
        else if(index==R.string.atsuu || index==R.string.quysuu || index==R.string.dinhsuu || index==R.string.kysuu|| index==R.string.tansuu)
            saoThaiTue=cung[1];
        else if(index==R.string.nhamdan || index==R.string.canhdan || index==R.string.giapdan || index==R.string.binhdan || index==R.string.maudan)
            saoThaiTue=cung[2];
        else if(index==R.string.quymao || index==R.string.tanmao || index==R.string.atmao || index==R.string.dinhmao || index==R.string.kymao)
            saoThaiTue=cung[3];
        else if(index==R.string.canhthin || index==R.string.mauthin || index==R.string.nhamthin || index==R.string.giapthin || index==R.string.binhthin)
            saoThaiTue=cung[4];
        else if(index==R.string.tanty || index==R.string.kyty || index==R.string.quyty || index==R.string.atty || index==R.string.dinhty)
            saoThaiTue=cung[5];
        else if(index==R.string.giapngo || index==R.string.nhamngo || index==R.string.binhngo || index==R.string.maungo || index==R.string.canhngo)
            saoThaiTue=cung[6];
        else if(index==R.string.atmui || index==R.string.quymui || index==R.string.dinhmui || index==R.string.kymui || index==R.string.tanmui)
            saoThaiTue=cung[7];
        else if(index==R.string.nhamthan || index==R.string.canhthan || index==R.string.giapthan || index==R.string.binhthan || index==R.string.mauthan)
            saoThaiTue=cung[8];
        else if(index==R.string.quydau || index==R.string.tandau || index==R.string.atdau || index==R.string.dinhdau || index==R.string.kydau)
            saoThaiTue=cung[9];
        else if(index==R.string.canhtuat || index==R.string.mautuat || index==R.string.nhamtuat || index==R.string.giaptuat || index==R.string.binhtuat)
            saoThaiTue=cung[10];
        else saoThaiTue=cung[11];
        index=convertCungToNumber(saoThaiTue);
        index=counterClockwise(index,2);
        saoThieuDuong=cung[index];
        index=convertCungToNumber(saoThieuDuong);
        index=counterClockwise(index,2);
        saoTangMon=cung[index];
        index=convertCungToNumber(saoTangMon);
        index=counterClockwise(index,2);
        saoThieuAm=cung[index];
        index=convertCungToNumber(saoThieuAm);
        index=counterClockwise(index,2);
        saoQuanPhu=cung[index];
        index=convertCungToNumber(saoQuanPhu);
        index=counterClockwise(index,2);
        saoTuPhu=cung[index];
        index=convertCungToNumber(saoTuPhu);
        index=counterClockwise(index,2);
        saoTuePha=cung[index];
        index=convertCungToNumber(saoTuePha);
        index=counterClockwise(index,2);
        saoLongDuc=cung[index];
        index=convertCungToNumber(saoLongDuc);
        index=counterClockwise(index,2);
        saoBachTo=cung[index];
        index=convertCungToNumber(saoBachTo);
        index=counterClockwise(index,2);
        saoPhucDuc=cung[index];
        index=convertCungToNumber(saoPhucDuc);
        index=counterClockwise(index,2);
        saoDieuKhach=cung[index];
        index=convertCungToNumber(saoDieuKhach);
        index=counterClockwise(index,2);
        saoTrucPhu=cung[index];

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
        public void anTruongsinhtinhhe(){
        //an sao truong sinh
            if(cuc.equalsIgnoreCase("Kim tu cuc"))
                saoTruongSinh=cung[5];
            else if(cuc.equalsIgnoreCase("Moc tam cuc"))
                saoTruongSinh=cung[11];
            else if(cuc.equalsIgnoreCase("Hoa luc cuc"))
                saoTruongSinh=cung[2];
            else if(cuc.equalsIgnoreCase("Thuy nhi cuc"))
                saoTruongSinh=cung[8];
            else
                saoTruongSinh=cung[8];
            int amhayduong = amduong(yearOfAnimal(year, month, day));
            if ((gender.equalsIgnoreCase("Male") && amhayduong == R.string.duong) || (gender.equalsIgnoreCase("Female") && amhayduong == R.string.am)) {
                //duong nam am nu theo chieu thuan
                int index=convertCungToNumber(saoTruongSinh);
                index=counterClockwise(index,2);
                saoMocDuc=cung[index];
                index=convertCungToNumber(saoMocDuc);
                index=counterClockwise(index,2);
                saoQuanDoi=cung[index];
                index=convertCungToNumber(saoQuanDoi);
                index=counterClockwise(index,2);
                saoLamQuan=cung[index];
                index=convertCungToNumber(saoLamQuan);
                index=counterClockwise(index,2);
                saoDeVuong=cung[index];
                index=convertCungToNumber(saoDeVuong);
                index=counterClockwise(index,2);
                saoSuy=cung[index];
                index=convertCungToNumber(saoSuy);
                index=counterClockwise(index,2);
                saoBenh=cung[index];
                index=convertCungToNumber(saoBenh);
                index=counterClockwise(index,2);
                saoTu=cung[index];
                index=convertCungToNumber(saoTu);
                index=counterClockwise(index,2);
                saoMo=cung[index];
                index=convertCungToNumber(saoMo);
                index=counterClockwise(index,2);
                saoTuyet=cung[index];
                index=convertCungToNumber(saoTuyet);
                index=counterClockwise(index,2);
                saoThai=cung[index];
                index=convertCungToNumber(saoThai);
                index=counterClockwise(index,2);
                saoDuong=cung[index];

            }
            else{
                //duong nu, am nam
                int index=convertCungToNumber(saoTruongSinh);
                index=antiClockwise(index,2);
                saoMocDuc=cung[index];
                index=convertCungToNumber(saoMocDuc);
                index=antiClockwise(index,2);
                saoQuanDoi=cung[index];
                index=convertCungToNumber(saoQuanDoi);
                index=antiClockwise(index,2);
                saoLamQuan=cung[index];
                index=convertCungToNumber(saoLamQuan);
                index=antiClockwise(index,2);
                saoDeVuong=cung[index];
                index=convertCungToNumber(saoDeVuong);
                index=antiClockwise(index,2);
                saoSuy=cung[index];
                index=convertCungToNumber(saoSuy);
                index=antiClockwise(index,2);
                saoBenh=cung[index];
                index=convertCungToNumber(saoBenh);
                index=antiClockwise(index,2);
                saoTu=cung[index];
                index=convertCungToNumber(saoTu);
                index=antiClockwise(index,2);
                saoMo=cung[index];
                index=convertCungToNumber(saoMo);
                index=antiClockwise(index,2);
                saoTuyet=cung[index];
                index=convertCungToNumber(saoTuyet);
                index=antiClockwise(index,2);
                saoThai=cung[index];
                index=convertCungToNumber(saoThai);
                index=antiClockwise(index,2);
                saoDuong=cung[index];
            }
    }
    public void anLucSat(){
        int index=convertCungToNumber(saoLocTon);
        index=counterClockwise(index,2);
        saoKinhDuong=cung[index];
        index=convertCungToNumber(saoLocTon);
        index=counterClockwise(index,2);
        saoDala=cung[index];
        //an dia kiep: hoi theo chieu thuan den h sinh
        index=antiClockwise(11,sogio(gioSinh(time)));
        saoDiaKiep=cung[index];
        index=antiClockwise(11,sogio(gioSinh(time)));
        saoDiaKhong=cung[index];
        int amhayduong = amduong(yearOfAnimal(year, month, day));
        if ((gender.equalsIgnoreCase("Male") && amhayduong == R.string.duong) || (gender.equalsIgnoreCase("Female") && amhayduong == R.string.am)) {
        //duong nam am nu
            index=yearOfAnimal(year,month,day);
            if(index==R.string.giapdan || index==R.string.nhamdan || index==R.string.canhdan || index==R.string.binhdan || index==R.string.maudan
                    || index==R.string.giapngo || index==R.string.nhamngo || index==R.string.binhngo || index==R.string.maungo || index==R.string.canhngo
                    || index==R.string.canhtuat || index==R.string.mautuat || index==R.string.nhamtuat || index==R.string.giaptuat || index==R.string.binhtuat)
            {
                int temp=counterClockwise(1,sogio(gioSinh(time)));
                saoHoaTinh=cung[temp];
                temp=antiClockwise(3,sogio(gioSinh(time)));
                saoLinhTinh=cung[temp];
            }
            else if(index==R.string.nhamthan || index==R.string.canhthan || index==R.string.giapthan || index==R.string.binhthan || index==R.string.mauthan
                    || index==R.string.giapty || index==R.string.nhamty || index==R.string.binhty || index==R.string.mauty || index==R.string.canhty
                    || index==R.string.canhthin || index==R.string.mauthin || index==R.string.nhamthin || index==R.string.giapthin || index==R.string.binhthin)
            {
                int temp=counterClockwise(2,sogio(gioSinh(time)));
                saoHoaTinh=cung[temp];
                temp=antiClockwise(10,sogio(gioSinh(time)));
                saoLinhTinh=cung[temp];
            }
            else if(index==R.string.tanty || index==R.string.kyty || index==R.string.quyty || index==R.string.atty || index==R.string.dinhty
                    || index==R.string.quydau || index==R.string.tandau || index==R.string.atdau || index==R.string.dinhdau || index==R.string.kydau
                    || index==R.string.atsuu || index==R.string.quysuu || index==R.string.dinhsuu || index==R.string.kysuu || index==R.string.tansuu )
            {
                int temp=counterClockwise(3,sogio(gioSinh(time)));
                saoHoaTinh=cung[temp];
                temp=antiClockwise(10,sogio(gioSinh(time)));
                saoLinhTinh=cung[temp];
            }
            else if(index==R.string.tanhoi || index==R.string.kyhoi || index==R.string.quyhoi || index==R.string.athoi || index==R.string.dinhhoi
                    || index==R.string.quymao || index==R.string.tanmao || index==R.string.atmao || index==R.string.dinhmao || index==R.string.kymao
                    || index==R.string.atmui || index==R.string.quymui || index==R.string.dinhmui || index==R.string.kymui || index==R.string.tanmui)
            {
                int temp=counterClockwise(2,sogio(gioSinh(time)));
                saoHoaTinh=cung[temp];
                temp=antiClockwise(10,sogio(gioSinh(time)));
                saoLinhTinh=cung[temp];
            }

        }else{
            index=yearOfAnimal(year,month,day);
            if(index==R.string.giapdan || index==R.string.nhamdan || index==R.string.canhdan || index==R.string.binhdan || index==R.string.maudan
                    || index==R.string.giapngo || index==R.string.nhamngo || index==R.string.binhngo || index==R.string.maungo || index==R.string.canhngo
                    || index==R.string.canhtuat || index==R.string.mautuat || index==R.string.nhamtuat || index==R.string.giaptuat || index==R.string.binhtuat)
            {
                int temp=antiClockwise(1,sogio(gioSinh(time)));
                saoHoaTinh=cung[temp];
                temp=counterClockwise(3,sogio(gioSinh(time)));
                saoLinhTinh=cung[temp];
            }
            else if(index==R.string.nhamthan || index==R.string.canhthan || index==R.string.giapthan || index==R.string.binhthan || index==R.string.mauthan
                    || index==R.string.giapty || index==R.string.nhamty || index==R.string.binhty || index==R.string.mauty || index==R.string.canhty
                    || index==R.string.canhthin || index==R.string.mauthin || index==R.string.nhamthin || index==R.string.giapthin || index==R.string.binhthin)
            {
                int temp=antiClockwise(2,sogio(gioSinh(time)));
                saoHoaTinh=cung[temp];
                temp=counterClockwise(10,sogio(gioSinh(time)));
                saoLinhTinh=cung[temp];
            }
            else if(index==R.string.tanty || index==R.string.kyty || index==R.string.quyty || index==R.string.atty || index==R.string.dinhty
                    || index==R.string.quydau || index==R.string.tandau || index==R.string.atdau || index==R.string.dinhdau || index==R.string.kydau
                    || index==R.string.atsuu || index==R.string.quysuu || index==R.string.dinhsuu || index==R.string.kysuu || index==R.string.tansuu )
            {
                int temp=antiClockwise(3,sogio(gioSinh(time)));
                saoHoaTinh=cung[temp];
                temp=counterClockwise(10,sogio(gioSinh(time)));
                saoLinhTinh=cung[temp];
            }
            else if(index==R.string.tanhoi || index==R.string.kyhoi || index==R.string.quyhoi || index==R.string.athoi || index==R.string.dinhhoi
                    || index==R.string.quymao || index==R.string.tanmao || index==R.string.atmao || index==R.string.dinhmao || index==R.string.kymao
                    || index==R.string.atmui || index==R.string.quymui || index==R.string.dinhmui || index==R.string.kymui || index==R.string.tanmui)
            {
                int temp=antiClockwise(2,sogio(gioSinh(time)));
                saoHoaTinh=cung[temp];
                temp=counterClockwise(10,sogio(gioSinh(time)));
                saoLinhTinh=cung[temp];
            }
        }//end else

    }
    public void anTahuu(){
        int temp=counterClockwise(4,chineseMonth);
        saoTaPhu=cung[temp];
        temp=antiClockwise(10,chineseMonth);
        saoHuuBat=cung[temp];
    }
    public void anXuongkhuc(){
        int temp=antiClockwise(10,sogio(gioSinh(time)));
        saoVanXuong=cung[temp];
        temp=counterClockwise(4,sogio(gioSinh(time)));
        saoVanKhuc=cung[temp];
    }
    public int convertFromNamSinh(int index){
        if(index==R.string.giapty || index==R.string.nhamty || index==R.string.binhty || index==R.string.mauty || index==R.string.canhty)
            return 0;
        else if(index==R.string.atsuu || index==R.string.quysuu || index==R.string.dinhsuu || index==R.string.kysuu || index==R.string.tansuu)
            return 1;
        else if(index==R.string.nhamdan || index==R.string.canhdan || index==R.string.giapdan || index==R.string.binhdan || index==R.string.maudan)
            return 2;
        else if(index==R.string.quymao || index==R.string.tanmao || index==R.string.atmao || index==R.string.dinhmao || index==R.string.kymao)
            return 3;
        else if(index==R.string.canhthin || index==R.string.mauthin || index==R.string.nhamthin || index==R.string.giapthin || index==R.string.binhthin)
            return 4;
        else if(index==R.string.tanty || index==R.string.kyty || index==R.string.quyty || index==R.string.atty || index==R.string.dinhty)
            return 5;
        else if(index==R.string.giapngo || index==R.string.nhamngo || index==R.string.binhngo || index==R.string.maungo || index==R.string.canhngo)
            return 6;
        else if(index==R.string.atmui || index==R.string.quymui || index==R.string.dinhmui || index==R.string.kysuu || index==R.string.tanmui)
            return 7;
        else if(index==R.string.nhamthan || index==R.string.canhthan || index==R.string.giapthan || index==R.string.binhthan || index==R.string.mauthan)
            return 8;
        else if(index==R.string.quydau || index==R.string.tandau || index==R.string.atdau || index==R.string.dinhdau || index==R.string.kydau)
            return 9;
        else if(index==R.string.canhtuat || index==R.string.mautuat || index==R.string.nhamtuat || index==R.string.giaptuat || index==R.string.binhtuat)
            return 10;
        else
            return 11;
       }
    public void anLongphuong(){
        int temp=counterClockwise(4,convertFromNamSinh(yearOfAnimal(year,month,day))+1);
        saoLongTri=cung[temp];
        temp=antiClockwise(10,convertFromNamSinh(yearOfAnimal(year,month,day))+1);
        saoPhuongCac=cung[temp];
    }
    public void anKhoiviet(){
        int index=yearOfAnimal(year,month,day);
        if(index==R.string.giapdan || index==R.string.giaptuat || index==R.string.giapthin || index==R.string.giapthan || index==R.string.giapngo || index==R.string.giapty
                || index==R.string.mauthan || index==R.string.mautuat || index==R.string.maungo || index==R.string.mauthin || index==R.string.maudan || index==R.string.mauty)
        {
            saoThienKhoi=cung[1];
            saoThienViet=cung[7];
        }
        else if(index==R.string.atdau || index==R.string.atmui || index==R.string.atty || index==R.string.atmao || index==R.string.athoi || index==R.string.atsuu
                || index==R.string.kysuu || index==R.string.kyty || index==R.string.kymao || index==R.string.kymui || index==R.string.kyhoi || index==R.string.kydau)
        {
            saoThienKhoi=cung[0];
            saoThienViet=cung[8];
        }
        else if(index==R.string.canhthan || index==R.string.canhngo || index==R.string.canhthin || index==R.string.canhdan || index==R.string.canhtuat || index==R.string.canhty
                || index==R.string.tandau || index==R.string.tanmui || index==R.string.tanty || index==R.string.tanmao || index==R.string.tanhoi || index==R.string.tansuu)
        {
            saoThienKhoi=cung[6];
            saoThienViet=cung[2];
        }
        else if(index==R.string.binhtuat || index==R.string.binhthan || index==R.string.binhngo || index==R.string.binhthin || index==R.string.binhdan || index==R.string.binhty
                || index==R.string.dinhdau || index==R.string.dinhmui || index==R.string.dinhty || index==R.string.dinhmao || index==R.string.dinhhoi || index==R.string.dinhty)
        {
            saoThienKhoi=cung[11];
            saoThienViet=cung[9];
        }
        else if(index==R.string.nhamdan || index==R.string.nhamtuat || index==R.string.nhamthan || index==R.string.nhamngo || index==R.string.nhamthin || index==R.string.nhamty
                || index==R.string.quydau || index==R.string.quymui || index==R.string.quyty || index==R.string.quymao || index==R.string.quyhoi || index==R.string.quysuu)
        {
            saoThienKhoi=cung[3];
            saoThienViet=cung[5];
        }
    }
    public void anKhochu(){
        int index=counterClockwise(6,convertFromNamSinh(yearOfAnimal(year,month,day))+1);
        saoThienKhoc=cung[index];
        index=convertCungToNumber(saoTuePha);
        saoThienHu=cung[index];
     }
    public void anThaitoa(){
        int index=convertCungToNumber(saoTaPhu);
        index=counterClockwise(index,chineseDate);
        saoTamThai=cung[index];
        int temp=convertCungToNumber(saoHuuBat);
        temp=antiClockwise(temp,chineseDate);
        saoBatToa=cung[temp];
    }
    public void anQuangqui(){
        int index=convertCungToNumber(saoVanXuong);
        index=counterClockwise(index,chineseDate-1);
        saoAnQuang=cung[index];
        index=convertCungToNumber(saoVanKhuc);
        index=antiClockwise(index,chineseDate-1);
        saoThienQui=cung[index];
    }
    public void anThiennguyetduc(){
        int index=convertFromNamSinh(yearOfAnimal(year,month,day));
        int temp=counterClockwise(9,index+1);
        saoThienDuc=cung[temp];
        temp=counterClockwise(5,index+1);
        saoNguyetDuc=cung[temp];
     }
    public void anHinhrieuy(){
        int index=counterClockwise(9,chineseMonth);
        saoThienHinh=cung[index];
        index=counterClockwise(0,chineseMonth+1);
        saoThienRieu=cung[index];
        saoThienY=cung[index];

    }
    public int cungDoi(int index){
        if(index==0) return 6;
        else if(index==1) return 7;
        else if(index==2) return 8;
        else if(index==3) return 9;
        else if(index==4) return 10;
        else if(index==5) return 11;
        else if(index==6) return 0;
        else if(index==7) return 1;
        else if(index==8) return 2;
        else if(index==9) return 3;
        else if(index==10) return 4;
        else return 5;
    }
    public void anHonghi(){
        int index=antiClockwise(3,convertFromNamSinh(yearOfAnimal(year,month,day))+1);
        saoHongLoan=cung[index];
        index=cungDoi(index);
        saoThienHi=cung[index];
    }
    public void anAnphu(){
        int index=convertCungToNumber(saoLocTon);
        index=counterClockwise(index,9);
        saoQuocAn=cung[index];
        index=convertCungToNumber(saoLocTon);
        index=antiClockwise(index,8);
        saoDuongPhu=cung[index];
    }
    public void anThiendiagiaithan(){
        int index=counterClockwise(8,chineseMonth);
        saoThienGiai=cung[index];
        index=counterClockwise(7,chineseMonth);
        saoDiaGiai=cung[index];
        index=convertCungToNumber(saoPhuongCac);
        saoGiaiThan=cung[index];
    }
    public void anPhucao(){
        int index=convertCungToNumber(saoVanKhuc);
        index=counterClockwise(index,3);
        saoThaiPhu=cung[index];
        index=convertCungToNumber(saoVanKhuc);
        index=antiClockwise(index,3);
        saoPhongCao=cung[index];
    }
    public void anTaitho(){
        int index=convertCungToNumber(cungMenh);
        index=counterClockwise(index,convertFromNamSinh(yearOfAnimal(year,month,day))+1);
        saoThienTai=cung[index];
        index=convertCungToNumber(cungThan);
        index=counterClockwise(index,convertFromNamSinh(yearOfAnimal(year,month,day))+1);
        saoThienTho=cung[index];
    }
    public void anThuongsu(){
        int index=convertCungToNumber(cungNoBoc);
        saoThienThuong=cung[index];
        index=convertCungToNumber(cungTatAch);
        saoThienSu=cung[index];
    }
    public void anLavong(){
        saoThienLa=cung[4];
        saoDiaVong=cung[10];
    }
    public void anTuhoa(){
        int index=yearOfAnimal(year,month,day);
        if(index==R.string.giapdan || index==R.string.giapty || index==R.string.giapthin || index==R.string.giapngo || index==R.string.giapthan || index==R.string.giaptuat){
            int temp=convertCungToNumber(saoLiemTrinh);
            saoHoaLoc=cung[temp];
            temp=convertCungToNumber(saoPhaQuan);
            saoHoaQuyen=cung[temp];
            temp=convertCungToNumber(saoVuKhuc);
            saoHoaKhoa=cung[temp];
            temp=convertCungToNumber(saoThaiDuong);
            saoHoaKy=cung[temp];
        }
        else if(index==R.string.atsuu || index==R.string.athoi || index==R.string.atmao || index==R.string.atty || index==R.string.atdau || index==R.string.atmui)
        {
            int temp=convertCungToNumber(saoThienCo);
            saoHoaLoc=cung[temp];
            temp=convertCungToNumber(saoThienLuong);
            saoHoaQuyen=cung[temp];
            temp=convertCungToNumber(saoTuVi);
            saoHoaKhoa=cung[temp];
            temp=convertCungToNumber(saoThaiAm);
            saoHoaKy=cung[temp];
        }
        else if(index==R.string.binhty || index==R.string.binhdan || index==R.string.binhthin || index==R.string.binhngo || index==R.string.binhthan || index==R.string.binhtuat){
            int temp=convertCungToNumber(saoThienDong);
            saoHoaLoc=cung[temp];
            temp=convertCungToNumber(saoThienCo);
            saoHoaQuyen=cung[temp];
            temp=convertCungToNumber(saoVanXuong);
            saoHoaKhoa=cung[temp];
            temp=convertCungToNumber(saoLiemTrinh);
            saoHoaKy=cung[temp];
        }
        else if(index==R.string.dinhhoi || index==R.string.dinhmao || index==R.string.dinhty || index==R.string.dinhmui || index==R.string.dinhdau || index==R.string.dinhsuu){
            int temp=convertCungToNumber(saoThaiAm);
            saoHoaLoc=cung[temp];
            temp=convertCungToNumber(saoThienDong);
            saoHoaQuyen=cung[temp];
            temp=convertCungToNumber(saoThienCo);
            saoHoaKhoa=cung[temp];
            temp=convertCungToNumber(saoCumon);
            saoHoaKy=cung[temp];
        }
        else if(index==R.string.mauthan || index==R.string.mauty || index==R.string.maudan || index==R.string.mauthin || index==R.string.maungo || index==R.string.mautuat){
            int temp=convertCungToNumber(saoThamLang);
            saoHoaLoc=cung[temp];
            temp=convertCungToNumber(saoThaiAm);
            saoHoaQuyen=cung[temp];
            temp=convertCungToNumber(saoHuuBat);
            saoHoaKhoa=cung[temp];
            temp=convertCungToNumber(saoThienCo);
            saoHoaKy=cung[temp];
        }
        else if(index==R.string.kydau || index==R.string.kyhoi || index==R.string.kymui || index==R.string.kymao || index==R.string.kysuu || index==R.string.kyty){
            int temp=convertCungToNumber(saoVuKhuc);
            saoHoaLoc=cung[temp];
            temp=convertCungToNumber(saoThamLang);
            saoHoaQuyen=cung[temp];
            temp=convertCungToNumber(saoThienLuong);
            saoHoaKhoa=cung[temp];
            temp=convertCungToNumber(saoVuKhuc);
            saoHoaKy=cung[temp];
        }
        else if(index==R.string.canhty || index==R.string.canhtuat || index==R.string.canhdan || index==R.string.canhthin || index==R.string.canhngo || index==R.string.canhthan){
            int temp=convertCungToNumber(saoThaiDuong);
            saoHoaLoc=cung[temp];
            temp=convertCungToNumber(saoVuKhuc);
            saoHoaQuyen=cung[temp];
            temp=convertCungToNumber(saoThaiAm);
            saoHoaKhoa=cung[temp];
            temp=convertCungToNumber(saoThienDong);
            saoHoaKy=cung[temp];
        }
        else if(index==R.string.tansuu || index==R.string.tanhoi || index==R.string.tanmao || index==R.string.tanty || index==R.string.tandau || index==R.string.tanmui){
            int temp=convertCungToNumber(saoCumon);
            saoHoaLoc=cung[temp];
            temp=convertCungToNumber(saoThienLuong);
            saoHoaQuyen=cung[temp];
            temp=convertCungToNumber(saoVuKhuc);
            saoHoaKhoa=cung[temp];
            temp=convertCungToNumber(saoVanXuong);
            saoHoaKy=cung[temp];
        }
        else if(index==R.string.nhamdan || index==R.string.nhamty || index==R.string.nhamthin || index==R.string.nhamngo || index==R.string.nhamthan || index==R.string.nhamtuat){
            int temp=convertCungToNumber(saoThienLuong);
            saoHoaLoc=cung[temp];
            temp=convertCungToNumber(saoTuVi);
            saoHoaQuyen=cung[temp];
            temp=convertCungToNumber(saoTaPhu);
            saoHoaKhoa=cung[temp];
            temp=convertCungToNumber(saoVuKhuc);
            saoHoaKy=cung[temp];
        }
        else{
            int temp=convertCungToNumber(saoPhaQuan);
            saoHoaLoc=cung[temp];
            temp=convertCungToNumber(saoCumon);
            saoHoaQuyen=cung[temp];
            temp=convertCungToNumber(saoThaiAm);
            saoHoaKhoa=cung[temp];
            temp=convertCungToNumber(saoThamLang);
            saoHoaKy=cung[temp];
        }
    }
    public void anCoqua(){
        int index=convertFromNamSinh(yearOfAnimal(year,month,day));
        if(index==11 || index==0 || index==1){
            saoCoThan=cung[2];
            saoQuaTu=cung[10];
        }
        else if(index==2 || index==3 || index==4){
            saoCoThan=cung[5];
            saoQuaTu=cung[1];
        }else if(index==5 || index==6 || index==7){
            saoCoThan=cung[8];
            saoQuaTu=cung[4];
        }
        else{
            saoCoThan=cung[11];
            saoQuaTu=cung[7];
        }
     }
    public void anQuanphuc(){
        int index=yearOfAnimal(year,month,day);
        if(index==R.string.giapdan || index==R.string.giapty || index==R.string.giapthin || index==R.string.giapngo || index==R.string.giapthan || index==R.string.giaptuat){
           saoThienQuan=cung[7];
           saoThienPhuc=cung[9];
        }
        else if(index==R.string.atsuu || index==R.string.athoi || index==R.string.atmao || index==R.string.atty || index==R.string.atdau || index==R.string.atmui)
        {
            saoThienQuan=cung[4];
            saoThienPhuc=cung[8];
        }
        else if(index==R.string.binhty || index==R.string.binhdan || index==R.string.binhthin || index==R.string.binhngo || index==R.string.binhthan || index==R.string.binhtuat){
            saoThienQuan=cung[5];
            saoThienPhuc=cung[0];
        }
        else if(index==R.string.dinhhoi || index==R.string.dinhmao || index==R.string.dinhty || index==R.string.dinhmui || index==R.string.dinhdau || index==R.string.dinhsuu){
            saoThienQuan=cung[2];
            saoThienPhuc=cung[11];
        }
        else if(index==R.string.mauthan || index==R.string.mauty || index==R.string.maudan || index==R.string.mauthin || index==R.string.maungo || index==R.string.mautuat){
            saoThienQuan=cung[3];
            saoThienPhuc=cung[3];
        }
        else if(index==R.string.kydau || index==R.string.kyhoi || index==R.string.kymui || index==R.string.kymao || index==R.string.kysuu || index==R.string.kyty){
            saoThienQuan=cung[9];
            saoThienPhuc=cung[2];
        }
        else if(index==R.string.canhty || index==R.string.canhtuat || index==R.string.canhdan || index==R.string.canhthin || index==R.string.canhngo || index==R.string.canhthan){
            saoThienQuan=cung[11];
            saoThienPhuc=cung[6];
        }
        else if(index==R.string.tansuu || index==R.string.tanhoi || index==R.string.tanmao || index==R.string.tanty || index==R.string.tandau || index==R.string.tanmui) {
            saoThienQuan = cung[9];
            saoThienPhuc = cung[5];
        }
        else if(index==R.string.nhamdan || index==R.string.nhamty || index==R.string.nhamthin || index==R.string.nhamngo || index==R.string.nhamthan || index==R.string.nhamtuat){
            saoThienQuan=cung[10];
            saoThienPhuc=cung[6];
        }
        else{
            saoThienQuan=cung[6];
            saoThienPhuc=cung[5];
        }
    }
    public void anDaohoa(){
        int index=convertFromNamSinh(yearOfAnimal(year,month,day));
        if(index==5 || index==9 || index==1) saoDaoHoa=cung[6];
        else if(index==11 || index==3 || index==7) saoDaoHoa=cung[0];
        else if(index==8 || index==0 || index==4) saoDaoHoa=cung[9];
        else saoDaoHoa=cung[3];
    }
    public void anThienma(){
        int index=convertFromNamSinh(yearOfAnimal(year,month,day));
        if(index==5 || index==9 || index==1) saoThienMa=cung[11];
        else if(index==11 || index==3 || index==7) saoThienMa=cung[5];
        else if(index==8 || index==0 || index==4) saoThienMa=cung[2];
        else saoThienMa=cung[8];
    }
    public void anPhatoai(){
        int index=convertFromNamSinh(yearOfAnimal(year,month,day));
        if(index==0 || index==6 || index==3 || index==9) saoPhaToai=cung[5];
        else if(index==2 || index==8 || index==5 || index==11) saoPhaToai=cung[9];
        else saoPhaToai=cung[1];
    }
    public void anKiepsat(){
        int index=convertFromNamSinh(yearOfAnimal(year,month,day));
        if(index==5 || index==9 || index==11) saoKiepSat=cung[2];
        else if(index==11 || index==3 || index==7) saoKiepSat=cung[8];
        else if(index==2 || index==6 || index==10) saoKiepSat=cung[11];
        else saoKiepSat=cung[5];
    }
    public void anHoacai(){

        int index=convertFromNamSinh(yearOfAnimal(year,month,day));
        if(index==5 || index==9 || index==11) saoHoaCai=cung[1];
        else if(index==11 || index==3 || index==7) saoHoaCai=cung[7];
        else if(index==2 || index==6 || index==10) saoHoaCai=cung[10];
        else saoHoaCai=cung[4];
    }
    public void anLuuha(){
        int index=yearOfAnimal(year,month,day);
        if(index==R.string.giapdan || index==R.string.giapty || index==R.string.giapthin || index==R.string.giapngo || index==R.string.giapthan || index==R.string.giaptuat){
           saoLuuHa=cung[9];
        }
        else if(index==R.string.atsuu || index==R.string.athoi || index==R.string.atmao || index==R.string.atty || index==R.string.atdau || index==R.string.atmui)
        {
           saoLuuHa=cung[10];
        }
        else if(index==R.string.binhty || index==R.string.binhdan || index==R.string.binhthin || index==R.string.binhngo || index==R.string.binhthan || index==R.string.binhtuat){
            saoLuuHa=cung[7];
        }
        else if(index==R.string.dinhhoi || index==R.string.dinhmao || index==R.string.dinhty || index==R.string.dinhmui || index==R.string.dinhdau || index==R.string.dinhsuu){
            saoLuuHa=cung[4];
        }
        else if(index==R.string.mauthan || index==R.string.mauty || index==R.string.maudan || index==R.string.mauthin || index==R.string.maungo || index==R.string.mautuat){
            saoLuuHa=cung[5];
        }
        else if(index==R.string.kydau || index==R.string.kyhoi || index==R.string.kymui || index==R.string.kymao || index==R.string.kysuu || index==R.string.kyty){
           saoLuuHa=cung[6];
        }
        else if(index==R.string.canhty || index==R.string.canhtuat || index==R.string.canhdan || index==R.string.canhthin || index==R.string.canhngo || index==R.string.canhthan){
            saoLuuHa=cung[8];
        }
        else if(index==R.string.tansuu || index==R.string.tanhoi || index==R.string.tanmao || index==R.string.tanty || index==R.string.tandau || index==R.string.tanmui) {
            saoLuuHa=cung[3];
        }
        else if(index==R.string.nhamdan || index==R.string.nhamty || index==R.string.nhamthin || index==R.string.nhamngo || index==R.string.nhamthan || index==R.string.nhamtuat){
           saoLuuHa=cung[11];
        }
        else{
            saoLuuHa=cung[2];
        }
    }
    public void anThientru(){
        int index=yearOfAnimal(year,month,day);
        if(index==R.string.giapdan || index==R.string.giapty || index==R.string.giapthin || index==R.string.giapngo || index==R.string.giapthan || index==R.string.giaptuat){
            saoThienTru=cung[5];
        }
        else if(index==R.string.atsuu || index==R.string.athoi || index==R.string.atmao || index==R.string.atty || index==R.string.atdau || index==R.string.atmui)
        {
            saoThienTru=cung[6];
        }
        else if(index==R.string.binhty || index==R.string.binhdan || index==R.string.binhthin || index==R.string.binhngo || index==R.string.binhthan || index==R.string.binhtuat){
            saoThienTru=cung[0];
        }
        else if(index==R.string.dinhhoi || index==R.string.dinhmao || index==R.string.dinhty || index==R.string.dinhmui || index==R.string.dinhdau || index==R.string.dinhsuu){
            saoThienTru=cung[5];
        }
        else if(index==R.string.mauthan || index==R.string.mauty || index==R.string.maudan || index==R.string.mauthin || index==R.string.maungo || index==R.string.mautuat){
            saoThienTru=cung[6];
        }
        else if(index==R.string.kydau || index==R.string.kyhoi || index==R.string.kymui || index==R.string.kymao || index==R.string.kysuu || index==R.string.kyty){
            saoThienTru=cung[8];
        }
        else if(index==R.string.canhty || index==R.string.canhtuat || index==R.string.canhdan || index==R.string.canhthin || index==R.string.canhngo || index==R.string.canhthan){
            saoThienTru=cung[2];
        }
        else if(index==R.string.tansuu || index==R.string.tanhoi || index==R.string.tanmao || index==R.string.tanty || index==R.string.tandau || index==R.string.tanmui) {
            saoThienTru=cung[6];
        }
        else if(index==R.string.nhamdan || index==R.string.nhamty || index==R.string.nhamthin || index==R.string.nhamngo || index==R.string.nhamthan || index==R.string.nhamtuat){
            saoThienTru=cung[9];
        }
        else{
            saoThienTru=cung[10];
        }
    }
    public void anLuunienvantinh(){
        int index=yearOfAnimal(year,month,day);
        if(index==R.string.giapdan || index==R.string.giapty || index==R.string.giapthin || index==R.string.giapngo || index==R.string.giapthan || index==R.string.giaptuat){
            saoLuuNienVanTinh=cung[5];
        }
        else if(index==R.string.atsuu || index==R.string.athoi || index==R.string.atmao || index==R.string.atty || index==R.string.atdau || index==R.string.atmui)
        {
            saoLuuNienVanTinh=cung[6];
        }
        else if(index==R.string.binhty || index==R.string.binhdan || index==R.string.binhthin || index==R.string.binhngo || index==R.string.binhthan || index==R.string.binhtuat){
            saoLuuNienVanTinh=cung[8];
        }
        else if(index==R.string.dinhhoi || index==R.string.dinhmao || index==R.string.dinhty || index==R.string.dinhmui || index==R.string.dinhdau || index==R.string.dinhsuu){
            saoLuuNienVanTinh=cung[9];
        }
        else if(index==R.string.mauthan || index==R.string.mauty || index==R.string.maudan || index==R.string.mauthin || index==R.string.maungo || index==R.string.mautuat){
            saoLuuNienVanTinh=cung[8];
        }
        else if(index==R.string.kydau || index==R.string.kyhoi || index==R.string.kymui || index==R.string.kymao || index==R.string.kysuu || index==R.string.kyty){
            saoLuuNienVanTinh=cung[9];
        }
        else if(index==R.string.canhty || index==R.string.canhtuat || index==R.string.canhdan || index==R.string.canhthin || index==R.string.canhngo || index==R.string.canhthan){
            saoLuuNienVanTinh=cung[11];
        }
        else if(index==R.string.tansuu || index==R.string.tanhoi || index==R.string.tanmao || index==R.string.tanty || index==R.string.tandau || index==R.string.tanmui) {
            saoLuuNienVanTinh=cung[0];
        }
        else if(index==R.string.nhamdan || index==R.string.nhamty || index==R.string.nhamthin || index==R.string.nhamngo || index==R.string.nhamthan || index==R.string.nhamtuat){
            saoLuuNienVanTinh=cung[2];
        }
        else{
            saoLuuNienVanTinh=cung[3];
        }
    }
    public void anBacsi(){
        int index=convertCungToNumber(saoLocTon);
        saoBacSi=cung[index];
    }
    public void anDauquan(){
        int index=convertCungToNumber(saoThaiTue);
        index=antiClockwise(index,chineseMonth+1);
        index=counterClockwise(index,sogio(gioSinh(time))+1);
        saoDauQuan=cung[index];

    }
    public void anThienkhong(){
        int index=convertCungToNumber(saoThaiTue);
        index=counterClockwise(index,2);
        saoThienKhong=cung[index];

    }
    public boolean fallInTheRange(int year1, int month1, int day1, int year2, int month2, int day2){
        Date birthday=convertDate(year,month,day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        boolean result=false;
        try{
            Date date1=convertDate(year1,month1,day1);
            Date date2=convertDate(year2,month2,day2);
            if((birthday.after(date1)|| birthday.equals(date1)) && (birthday.before(date2) || birthday.equals(date2))){
                result=true;
            }
        }catch(Exception e){
        }
        return result;
    }
    public void anTuantriet(){
      if(fallInTheRange(1984,2,2,1994,2,9)){
          //giap ty den quy dau
          saoTuan=cung[10];
          saoTuan1=cung[11];
      }else if(fallInTheRange(1994,2,10,2004,1,21))
      {
          //giap tuat den quy mui
          saoTuan=cung[8];
          saoTuan1=cung[9];
      }
        else if(fallInTheRange(1944,1,25,1954,2,2)|| fallInTheRange(2004,1,2,2014,1,30))
      {
          saoTuan=cung[6];
          saoTuan1=cung[7];
      }
        else if(fallInTheRange(1954,2,3,1964,2,12)){
          saoTuan=cung[4];
          saoTuan=cung[5];
      }else if(fallInTheRange(1964,2,13,1974,1,22)){
          saoTuan=cung[3];
          saoTuan=cung[2];
      }else{
          saoTuan=cung[0];
          saoTuan1=cung[1];
      }

        //an sao triet
        int index=yearOfAnimal(year,month,day);
        if(index==R.string.giapdan || index==R.string.giaptuat ||index==R.string.giapthin || index==R.string.giapthan || index==R.string.giapngo || index==R.string.giapty
                || index==R.string.kyty || index==R.string.kysuu || index==R.string.kymao || index==R.string.kymui || index==R.string.kydau || index==R.string.kyhoi)
        {
            saoTriet=cung[8];
            saoTriet1=cung[9];
        }
        else if(index==R.string.atmui || index==R.string.atdau || index==R.string.atty || index==R.string.atmao || index==R.string.athoi || index==R.string.atsuu
                || index==R.string.canhthan || index==R.string.canhngo || index==R.string.canhthin || index==R.string.canhdan || index==R.string.canhtuat || index==R.string.canhty){
            saoTriet=cung[6];
            saoTriet1=cung[7];
        }
        else if(index==R.string.binhtuat || index==R.string.binhthan || index==R.string.binhngo || index==R.string.binhthin || index==R.string.binhdan || index==R.string.binhty
                || index==R.string.tanmui || index==R.string.tandau || index==R.string.tanty || index==R.string.tanmao || index==R.string.tanhoi || index==R.string.tansuu){
            saoTriet=cung[4];
            saoTriet1=cung[5];

        }
        else if(index==R.string.dinhsuu || index==R.string.dinhdau || index==R.string.dinhmui || index==R.string.dinhty || index==R.string.dinhhoi || index==R.string.dinhmao
                || index==R.string.mauthan || index==R.string.mautuat || index==R.string.maungo || index==R.string.mauthin || index==R.string.maudan || index==R.string.mauty){
            saoTriet=cung[2];
            saoTriet1=cung[3];
        }else
        {
            saoTriet=cung[0];
            saoTriet1=cung[1];
        }
    }
    public String saoTuViQuality(){
        int index=convertCungToNumber(saoTuVi);
        if(index==5 || index==6 || index==2 || index==8)
            return "Mieu dia";
        else if(index==10 || index==4) return "Vuong dia";
        else if(index==7 || index==1) return "Dac dia";
        else return "Binh hoa";
    }

    public String saoLiemTrinhQuality(){
        int index=convertCungToNumber(saoLiemTrinh);
        if(index==4 || index==10)
            return "Mieu dia";
        else if(index==0 || index==2 || index==6 || index==8) return "Vuong dia";
        else if(index==1 || index==7) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThienDongQuality() {
        int index = convertCungToNumber(saoThienDong);
        if (index==2 || index==8)
            return "Mieu dia";
        else if (index== 0) return "Vuong dia";
        else if (index==3 || index==5 || index==11) return "Dac dia";
        else return "Ham dia";
    }

    public String saoVuKhucQuality() {
        int index = convertCungToNumber(saoVuKhuc);
        if (index==1 || index==4 || index==7 || index==10)
            return "Mieu dia";
        else if (index==0 || index==2 || index==6 || index==8) return "Vuong dia";
        else if (index==3 || index==9) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThaiDuongQuality() {
        int index = convertCungToNumber(saoThaiDuong);
        if (index==5 || index==6)
            return "Mieu dia";
        else if (index==2 || index==3 || index==4) return "Vuong dia";
        else if (index==1 || index==7) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThienCoQuality() {
        int index = convertCungToNumber(saoThienCo);
        if (index==3 || index==4 || index==9 || index==10)
            return "Mieu dia";
        else if (index==5 || index==8) return "Vuong dia";
        else if (index==0 || index==1 || index==6 || index==7) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThienPhuQuality() {
        int index = convertCungToNumber(saoThienPhu);
        if (index==0 || index==2 || index==6 || index==8)
            return "Mieu dia";
        else if (index==4 || index==10) return "Vuong dia";
        else if (index==5 || index==7 || index==11) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThaiAmQuality() {
        int index = convertCungToNumber(saoThaiAm);
        if (index==9 || index==10 || index==11)
            return "Mieu dia";
        else if (index==0 || index==8) return "Vuong dia";
        else if (index==1 || index==7) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThamLangQuality() {
        int index = convertCungToNumber(saoThamLang);
        if (index==1 || index==7)
            return "Mieu dia";
        else if (index==4 || index==10) return "Vuong dia";
        else if (index==2 || index==8) return "Dac dia";
        else return "Ham dia";
    }

    public String saoCuMonQuality() {
        int index = convertCungToNumber(saoCumon);
        if (index==3 || index==9)
            return "Mieu dia";
        else if (index==0 || index==2 || index==6) return "Vuong dia";
        else if (index==8 || index==11) return "Dac dia";
        else return "Ham dia";
    }

    public String saoThienTuongQuality() {
        int index = convertCungToNumber(saoThienTuong);
        if (index==2 || index==8)
            return "Mieu dia";
        else if (index==0 || index==4 || index==6 || index==10) return "Vuong dia";
        else if (index==1 || index==5 || index==7 || index==11) return "Dac dia";
        else return "Ham dia";
    }

}


