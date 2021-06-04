package HinhHoc_DaHinh;
import java.util.ArrayList;

public abstract class DaGiac extends HinhHoc {
    protected int SoDinh;
    protected ArrayList<Diem> DSDinh;
    DaGiac(){ DSDinh = new ArrayList<Diem>(); SoDinh = 0;}
    DaGiac(ArrayList<Diem> ds)
    {
    	SoDinh = ds.size();
    	DSDinh = ds;
    }
    public Diem ThongTinDinh(int vitri){ return DSDinh.get(vitri);}
    public String toString()
    {
     String rs = "Da giac co tat ca "+ SoDinh + " dinh\n";
     rs += "Thong tin cac dinh:\n";
     for(Diem d : DSDinh)
       rs += d.toString() + "\n";
     return rs;
    }
    
}
