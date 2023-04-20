package aula15;

public class Set {
	
	
	private Time time1;
	private Time time2;
	
	public Set () {
		
	}
	
	public Set(Time time1, Time time2) {
		this.time1 = time1;
		this.time2 = time2;
	}

	public Time getTime1() {
		return time1;
	}

	public void setTime1(Time time1) {
		this.time1 = time1;
	}

	public Time getTime2() {
		return time2;
	}

	public void setTime2(Time time2) {
		this.time2 = time2;
	}
	
	public boolean continuarSet() {
		int pt1 = this.time1.getPontos();
		int pt2 = this.time2.getPontos();
		
		if (pt1 > pt2 && pt1 - pt2 >= 2 && pt1 >= 25 || pt2 > pt1 && pt2 - pt1 >= 2 && pt2 >= 25) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public Time obterVencedor() {
		int pt1 = this.time1.getPontos();
		int pt2 = this.time2.getPontos(); 
		
		if (pt1 > pt2) {
			return this.time1;
		} else {
			return this.time2;
		}
	}

	@Override
	public String toString() {
		return "Time 01: " + this.time1 +
			"\nTime 02" + this.time2;
	}	
}

