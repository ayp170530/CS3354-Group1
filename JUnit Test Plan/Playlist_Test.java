/* 			PLAYLIST_TEST CLASS
 * 
 * Purpose: Performs JUnit testing on the Playlist's addSong() and removeSong() methods
 * 			to make sure they are functioning properly.
 * 
 */

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class Playlist_Test {

	@Test
	public void testAddSong() {
		
		System.out.println("Adding song to playlist Test...");
		
		//Test playlist object
		Playlist test = new Playlist();
		
		//Songs to be added
		Song song1 = new Song("Sandstorm","Darude",3,52);
		Song song2 = new Song("Call_Me_Maybe","Carly_Rae_Jepsen",3,19 );
		Song song3 = new Song("Photograph","Nickelback",4,21);
		
		//Performing method to be tested
			test.addSong(song1);
			test.addSong(song2);
			test.addSong(song3);
		
		//Expected results ArrayList that will be compared with base class results	
		ArrayList<Song> expectedResults = new ArrayList<Song>();
		
		//Adding the expected songs
			expectedResults.add(song1);
			expectedResults.add(song2);
			expectedResults.add(song3);
		
		//Testing if our base playlist results match the expected
		assertArrayEquals(expectedResults.toArray(), test.songs.toArray());
		
		System.out.println("AddSong() Test complete...");
	}
	
	@Test
	public void testRemoveSong() {
		
		System.out.println("Removing song from playlist Test...");
		
		//Playlist object being tested
		Playlist test = new Playlist();
		
		//Songs to be added
		Song song1 = new Song("Sandstorm","Darude",3,52);
		Song song2 = new Song("Call_Me_Maybe","Carly_Rae_Jepsen",3,19 );
		Song song3 = new Song("Photograph","Nickelback",4,21);
				
		//Performing method to be tested
			test.addSong(song1);
			test.addSong(song2);
			test.addSong(song3);
				
		//Removing song2
			test.removeSong(song2);
			
		//Expected results ArrayList that will be compared with base class results	
		ArrayList<Song> expectedResults = new ArrayList<Song>();
				
		//Adding the expected songs
			expectedResults.add(song1);
			expectedResults.add(song3);
		
		//Testing if our base playlist results match the expected
		assertArrayEquals(expectedResults.toArray(), test.songs.toArray());
		
		System.out.println("removeSong() Test complete...");
		
	}

}
