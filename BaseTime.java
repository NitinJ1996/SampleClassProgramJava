public class BaseTime {
	
	private int hour,minute,second;
	public BaseTime() {
		this(0,0,0);
	}
	public BaseTime(int h) {
		this(h,0,0);
	}
	public BaseTime(int h, int m) {
		this(h,m,0);
	}
	public BaseTime(int h, int m, int s) {
		setTime(h,m,s);
	}
	public void setTime(int h, int m, int s) {
		hour = ((h>=0&&h<24)?h:0);
		minute = ((m>=0&&m<60)?m:0);
		second = ((s>=0&&s<60)?s:0);
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking constructors using Objects
		BaseTime sample1 = new BaseTime();
		BaseTime sample2 = new BaseTime(2);
		BaseTime sample3 = new BaseTime(2,4);
		BaseTime sample4 = new BaseTime(5,25,35);
		
		System.out.println(sample1.toMilitary());
		System.out.println(sample2.toMilitary());
		System.out.println(sample3.toMilitary());
		System.out.println(sample4.toMilitary());
		
	}

}
