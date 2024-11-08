public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int newHour = hours; 
		String amPm = "";
		String newminute = "";
		if (hours == 12) {
			newHour = hours;
			amPm = "PM";
		}
		if (hours < 12) {
			newHour = hours;
			amPm = "AM";
		}
		if (hours > 12) {
			newHour = hours - 12;
			amPm = "PM";
		}
		if (minutes < 10) {
		   newminute = "0" + minutes;
		} else {
			newminute = String.valueOf(minutes);
		}
		System.out.println((String.valueOf(newHour)) + ":" + newminute + " " + amPm);
	}		
}

	

	