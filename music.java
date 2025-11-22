import java.util.LinkedList; import java.util.Scanner;

// A simple Music Playlist Manager using LinkedList public class MusicPlaylistManager {

private LinkedList<String> playlist;

public MusicPlaylistManager() {
    playlist = new LinkedList<>();
}

// Add a song to the playlist
public void addSong(String song) {
    playlist.add(song);
    System.out.println("Song added: " + song);
}

// Remove a song from the playlist
public void removeSong(String song) {
    if (playlist.remove(song)) {
        System.out.println("Song removed: " + song);
    } else {
        System.out.println("Song not found in playlist.");
    }
}

// Display all songs
public void displayPlaylist() {
    if (playlist.isEmpty()) {
        System.out.println("Playlist is empty.");
    } else {
        System.out.println("\nYour Playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i));
        }
    }
}

// Play first song
public void playFirstSong() {
    if (playlist.isEmpty()) {
        System.out.println("Playlist is empty.");
    } else {
        System.out.println("Now Playing: " + playlist.getFirst());
    }
}

// Play last song
public void playLastSong() {
    if (playlist.isEmpty()) {
        System.out.println("Playlist is empty.");
    } else {
        System.out.println("Now Playing: " + playlist.getLast());
    }
}

// Main menu
public static void main(String[] args) {
    MusicPlaylistManager manager = new MusicPlaylistManager();
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
        System.out.println("\n==== Music Playlist Manager ====");
        System.out.println("1. Add Song");
        System.out.println("2. Remove Song");
        System.out.println("3. View Playlist");
        System.out.println("4. Play First Song");
        System.out.println("5. Play Last Song");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter song name to add: ");
                String songToAdd = sc.nextLine();
                manager.addSong(songToAdd);
                break;
            case 2:
                System.out.print("Enter song name to remove: ");
                String songToRemove = sc.nextLine();
                manager.removeSong(songToRemove);
                break;
            case 3:
                manager.displayPlaylist();
                break;
            case 4:
                manager.playFirstSong();
                break;
            case 5:
                manager.playLastSong();
                break;
            case 6:
                System.out.println("Exiting... Goodbye!");
                break;
            default:
                System.out.println("Invalid choice! Try again.");
        }
    } while (choice != 6);

    sc.close();
}

}