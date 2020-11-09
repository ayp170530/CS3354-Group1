/* 			SONG CLASS
 * 
 * Purpose: Implementation of a song for our music application. It stores the name, artist, and time
 * 			of the song which can be customizable to allow for users to upload their own audio 
 * 
 */

public class Song {
	
	private String name;						//Name of the song
	private String artist;						//Artist name
	private int timeSeconds;					//Implied as minute:seconds structure where this variable represents the seconds portion of the format
	private int timeMinutes;					//Implied as minute:seconds structure where this variable represents the minutes portion of the format
	
	
	
	//Constructor of song that specifys Name, Artist, and time as minute:seconds format
	public Song(String n, String a, int m, int s) {
		
		this.name = n;
		this.artist = a;
		this.timeMinutes = m;
		this.timeSeconds = s;
		
	}
	
	//Getter for name of song
	public String getName() {
		
		return this.name;
		
	}
	
	//setter for name of song
	public void setName(String n) {
		
		this.name = n;
		
	}
	
	//returns time as string in desired Minutes:seconds format
	public String getFormattedTime() {
		
		String min = Integer.toString(this.timeMinutes);
		String sec = Integer.toString(this.timeSeconds);
		
		return (min + ":" + sec);
		
	}
	
	//sets the seconds of the minute:seconds format of the song
	public void setTimeSeconds(int s) {
		
		this.timeSeconds = s;
		
	}
	
	//getter for seconds of minute:seconds format of the song
	public int getTimeSeconds() {
		
		return this.timeSeconds;
		
	}
	
	//sets the minutes of the minute:seconds format of the song
	public void setTimeMinutes(int m) {
		
		this.timeMinutes = m;
		
	}
	
	//getter for minutes of minute:seconds format of the song
	public int getTimeMinutes() {
		
		return this.timeMinutes;
		
	}


}
