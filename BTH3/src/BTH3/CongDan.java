package BTH3;

public class CongDan {
	private  String HoTen;
	private static long NamSinh;
	private static String GioiTinh;
	private long SoCMND;
	private static String NVQS;
	CongDan(){HoTen=GioiTinh=NVQS=null;NamSinh=SoCMND=0;}
	CongDan(String HT, long NS, String GT, long CMND, String QS){
		HoTen=HT; NamSinh=NS; setGT(GT); SoCMND=CMND; setQS(QS);
	}
	public String getGT() {return GioiTinh;}
	public void setGT(String GT) {GioiTinh=GT=="Nam"?"Nam":"Nu";}
	public String getQS() {return NVQS;}
	public void setQS(String QS) {NVQS=QS=="Chua"?"Chua":"Da";}
	public String toString() {
		return HoTen+" sinh nam "+NamSinh+" co gioi tinh "+GioiTinh+", So CMND la "+SoCMND+", "+NVQS+" thuc hien NVQS.";
	}
	
	public static boolean GoiThiHanhNVQS(long namnay) {
		
		if(NVQS=="Chua" && namnay-NamSinh>=18 && GioiTinh=="Nam")
			return true;
		else
			return false;
	}
    public static boolean TongDongVien(long namnay) {
		
		if(GioiTinh=="Nam" && namnay-NamSinh>=18 && namnay-NamSinh<=30)
			return true;
		else
			return false;
	}
    public static String XacNhanThiHanhNVQS() {
    	if(GioiTinh=="Nam" && NVQS=="Da")
    		return "Da hoan thanh";
    	else
    		return "Co sai sot ve ly lich";
    }
    public static void main(String[] args) {
    	CongDan CD = new CongDan("An", 2000, null, 123456789, null);
    	System.out.println(CD);
    	CD.setGT("Nu");
    	System.out.println(CD);
    	CD.setQS("Da");
    }

}
