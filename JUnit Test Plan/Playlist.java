/* 			PLAYLIST CLASS
 * 
 * Purpose: Serves as a song playlist in our music application to where a 
 * 			user can add/remove desired songs and change the name to their 
 * 			liking.
 */
import java.util.ArrayList;

public class Playlist {
	
	private String name;							//Name of the playlist
	private int size;								//# of songs within the playlist
	protected ArrayList<Song> songs;				//list of songs in the playlist
	
	
	//Constructor for playlist with default values
	public Playlist() {
		
		this.name = "Default Playlist";
		this.size = 0;
		songs = new ArrayList<Song>();
		
	}
	
	//returns the amount of songs in the playlist
	public int getSize() {
		
		return this.size;
		
	}
	
	//returns name of playlist
	public String getName() {
		
		return this.name;
		
	}
	
	//setter for name of the playlist
	public void setName(String playlist_name) {
		
		this.name = playlist_name;
		
	}
	
	//method adds a song to the playlist
	public void addSong(Song s) {
		
		this.songs.add(s);
		this.size++;
		
	}
	
	//method removes a song from the playlist
	public void removeSong(Song s) {
		
		this.songs.remove(s);
		this.size--;
			
	}
	
	
}
