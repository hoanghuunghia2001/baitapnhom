package src;

public class KetThucHocPhan {

	public static void main(String[] args) {
		//khởi tạo 3 điểm
		Diem A = new Diem(4,0);
		Diem B = new Diem(-1,-1);
		Diem C = new Diem(-1,2);
		//dùng điểm để khởi tạo 3 đoạn thẳng
		DoanThang AB = new DoanThang(A, B);
		DoanThang BC = new DoanThang(B, C);
		DoanThang AC = new DoanThang(A, C);
		System.out.println("----------------------------");
		//dùng 3 đoạn thẳng để khởi tạo tam giác
		TamGiac ABC = new TamGiac(AB, BC, AC);
		//check xem ABC có phải tam giác không
		System.out.println("ABC la tam giac? " + ABC.laTamGiac());
		System.out.println("----------------------------");
		//in ra độ dài 3 cạnh
		System.out.println("Do dai canh thu nhat = " + AB.tinhDoDai());
		System.out.println("Do dai canh thu nhat = " + BC.tinhDoDai());
		System.out.println("Do dai canh thu nhat = " + AC.tinhDoDai());
		//tính chu vi và diện tích (nếu có)
		ABC.tinhChuVi();
		ABC.tinhDienTich();
		System.out.println("----------------------------");
	}

}
