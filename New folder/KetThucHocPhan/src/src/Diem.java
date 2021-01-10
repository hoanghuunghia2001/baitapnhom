package src;

public class Diem {
	private int X;
	private int Y;
	
	//khởi tạo điểm
	public Diem(int _X, int _Y) {
		this.X = _X;
		this.Y = _Y;
	}

	//get và set để dùng khi cần
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	
}
