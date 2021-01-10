package src;

public class DoanThang {
	private Diem begin;
	private Diem end;

	//khởi tạo đoạn thẳng
	public DoanThang(Diem begin, Diem end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	//trả về độ dài của đoạn thẳng được tạo
	public double tinhDoDai() {
		double doDai = Math.sqrt(((end.getX() - begin.getX()) * (end.getX() - begin.getX()) + (end.getY() - begin.getY()) * (end.getY() - begin.getY())));
		return ((double) Math.round(doDai * 1000) / 1000);
	}


	//get và set để dùng khi cần
	public Diem getBegin() {
		return begin;
	}


	public void setBegin(Diem begin) {
		this.begin = begin;
	}


	public Diem getEnd() {
		return end;
	}


	public void setEnd(Diem end) {
		this.end = end;
	}

	
}
