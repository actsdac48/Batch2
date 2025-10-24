package day3;

import consoleInput.GetInput;

public class Date {
	
	int day=1;
	int month=1;
	int year=2025;
	
	int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Date(int day, int month, int year) {
		setDate(day,month,year);
	}
	
	public void setDate(int day, int month, int year){
		setDay(day);
		setMonth(month);
		setYear(year);
	}


	public void setDay(int day) {
		this.day = day;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public void setYear(int year) {
		if(year > 2500 || year < 1900)
			this.year = 2025;
		else
			this.year = year;
	}

	private boolean isLeapYear(int year) {
		if(year%4==0)
			return true;
		else 
			return false;
	}

	public void addDay(int addDays) {
		int totalDays= this.day + addDays;
		
		while(totalDays > daysInMonth[this.month]) {
			if(isLeapYear(this.year))
				daysInMonth[2]=29;
			else 
				daysInMonth[2]=28;
			
			//Fill the Month
			totalDays -= daysInMonth[this.month];
			setMonth(this.month  + 1);
			
			//reset month and increase year
			if(this.month ==12) {
				this.month=1;
				if(totalDays > daysInMonth[this.month]) {
					this.year=year+1;
				}
			}
		}
		this.day = totalDays;
	}
	
	public void addMonth(int newMonth) {
		int newMonthValue = month + newMonth;
		if(newMonthValue > 12) {
			int count = newMonth % 12;   //3
			setMonth(count);
			
			int addYear = (int) Math.floor(newMonth / 12);
			setYear(year+addYear);
		}
		
		
		
    }
	
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	
	void display(){
		System.out.println("Date is : " + getDay() + "/" + getMonth() + "/" + getYear());
	}
}
