
public class Position {
	private double x;
	private double y;
	private double px;
	private double py;
	
	public Position(double px, double py){
		this.px=px;
		this.py=py;
		x=px*0.66+0.338;
		y=py*0.3768+0.2732;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	public double getPX(){
		return px;
	}
	
	public double getPY(){
		return py;
	}
	public boolean equals(Position p){
		return (this.x==p.x && this.y==p.y);
	}

	public void setPY(double y) {
		// TODO Auto-generated method stub
		this.py = y;
		this.y=y*0.3768+0.2732;
	}

	public void setPX(double x) {
		// TODO Auto-generated method stub
		this.px = x;
		this.x=x*0.66+0.338;
	}
	
	public String toString(){
		return ""+ px +" "+ py + ";"+x+" "+y;
	}
}
