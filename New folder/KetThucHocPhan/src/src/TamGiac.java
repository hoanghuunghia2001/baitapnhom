package src;

public class TamGiac {
	private DoanThang canh1;
	private DoanThang canh2;
	private DoanThang canh3;
	double c1;
	double c2;
	double c3;
	
	//hàm khởi tạo tam giác, nhận vào 3 cạnh là 3 đối tượng lớp DoanThang
	public TamGiac(DoanThang canh1, DoanThang canh2, DoanThang canh3) {
		this.canh1 = canh1;
		this.canh2 = canh2;
		this.canh3 = canh3;
		c1 = canh1.tinhDoDai();
		c2 = canh2.tinhDoDai();
		c3 = canh3.tinhDoDai();
	}
	
	//check xem 3 cạnh có tạo thành tam giác không
	public boolean laTamGiac() {
		if (c1 + c2 == c3 || c1+ c3 == c2 || c2 + c3 == c1) {
			System.out.println("Ba diem thang hang");
			return false;
		} else {
			System.out.println("Ba diem khong thang hang, tao thanh tam giac");
			return true;
		}
	}
	
	//hàm tính chu vi của tam giác, chỉ tính khi hàm laTamGiac() trả về true, tức là 3 cạnh không thẳng hàng
	public void tinhChuVi() {
		if (this.laTamGiac()) {
			double chuVi = c1 + c2 + c3;
			System.out.println("Chu vi tam giac la: " + chuVi);
		} else {
			System.out.println("Khong phai la tam giac, khong tinh duoc chu vi");
		}
	}
	
	//hàm tính diện tích của tam giác, chỉ tính khi hàm laTamGiac() trả về true, tức là 3 cạnh không thẳng hàng
	public void tinhDienTich() {
		if (this.laTamGiac()) {
			double p = 0.5 * (c1 + c2 + c3);
			double dienTich = Math.round(Math.sqrt(p * (p-c1) * (p-c2) * (p-c3)));
			System.out.println("Dien tich tam giac la: " + dienTich);
		} else {
			System.out.println("Khong phai la tam giac, khong tinh duoc dien tich");
		}
	}

	//get và set để dùng khi cần
	public void setC3(double c3) {
		this.c3 = c3;
	}

	public DoanThang getCanh1() {
		return canh1;
	}

	public DoanThang getCanh2() {
		return canh2;
	}

	public DoanThang getCanh3() {
		return canh3;
	}

	public double getC1() {
		return c1;
	}

	public double getC2() {
		return c2;
	}

	public double getC3() {
		return c3;
	}

}
