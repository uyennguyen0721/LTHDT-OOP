package SONGDIENTHOAI;
import java.util.*;

/*Vi trong qua trinh lam em cho test thu may yeu cau cua thay  
 * Nen bai kiem tra thuc hanh lan nay em khong lam menu
 * Do vay nen nhin co hoi lon xon a... em xin loi thay */

public class Main {
	static ArrayList<TramPhatSong> DSTram = new ArrayList<TramPhatSong>();
	static ArrayList<DienThoai> DSDienThoai = new ArrayList<DienThoai>();
	//Khai bao mot so tram phat song
	static {
		DSTram.add(new TramPhatSong(1, 2, 3, "A", 2, 3, DSDienThoai));
		DSTram.add(new TramPhatSong(2, 3, 4, "B", 3, 4, DSDienThoai));
		DSTram.add(new TramPhatSong(3, 4, 5, "C", 4, 2, DSDienThoai));
		
	}
	public static void main(String[] args) {
		//Khai bao mot so dien thoai
		{
			DSDienThoai.add(new DienThoai(false, 2, 5, "123456789", DSTram));
			DSDienThoai.add(new DienThoai(false, 3, 5, "123456780", DSTram));
			DSDienThoai.add(new DienThoai(false, 4, 3, "123456700", DSTram));
			DSDienThoai.add(new DienThoai(false, 5, 5, "123456000", DSTram));
			DSDienThoai.add(new DienThoai(false, 1, 3, "123450000", DSTram));
			DSDienThoai.add(new DienThoai(false, 3, 2, "123400000", DSTram));
		}
		
		//Bat tat ca cac dien thoai
		for(int i = 0; i < DSDienThoai.size(); i++) {
			DSDienThoai.get(i).BatDienThoai();
		}
		
		//Liet ke thong tin cua tung dien thoai
		System.out.println("Thong tin cua tung dien thoai: ");
		for(int i = 0; i < DSDienThoai.size(); i++) {
			System.out.println(DSDienThoai.get(i).toString() + "\n");
		}
		
		//Liet ke thong tin cua tung tram phat song
		System.out.println("Thong tin cua tung tram phat song: ");
		for(int i = 0; i < DSTram.size(); i++) {
			System.out.println(DSTram.get(i).toString() + "\n");
		}
		
		//Tat mot dien thoai bat ki, vd tat dien thoai thu 3
		DSDienThoai.get(2).TrangThai = false;
		
		//Xuat thong tin tram phat song vua phuc vu dien thoai nay (dien thoai thu 3)
		for(int i = 0; i < DSTram.size(); i++) {
			if(DSDienThoai.get(2).MaTram.equalsIgnoreCase(DSTram.get(i).MaTram)) {
				System.out.println(DSTram.get(i));
			}
		}
		
		//Them mot dien thoai nam trong it nhat 2 tram phat song
		DSDienThoai.add(new DienThoai(true, 2, 4, "123400000", DSTram));
		//Xuat thong tin dien thoai de kiem tra
		System.out.println(DSDienThoai.get(DSDienThoai.size() - 1));
		
		//Them mot dien thoai khong nam trong vung phu song
		DSDienThoai.add(new DienThoai(true, 6, 3, "123000000", DSTram));
		//Xuat thong tin dien thoai de kiem tra
		System.out.println(DSDienThoai.get(DSDienThoai.size() - 1));
		
		//Them mot dien thoai nam trong 1 vung phu song va kiem tra xem den mot luc nao do khi vuot qua so may toi da phuc vu
		DSDienThoai.add(new DienThoai(true, 1, 1, "120000000", DSTram));
		//Xuat thong tin dien thoai de kiem tra
		System.out.println(DSDienThoai.get(DSDienThoai.size() - 1));	
	}

}
