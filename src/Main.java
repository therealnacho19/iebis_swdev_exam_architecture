import java.util.ArrayList;

/**
 * Try to modify this class only where is mentioned
 * Follow the instructions in the GitHub Readme.md
 */


public class Main {

    public static void main(String[] args) {
        User angelica = new User("Angelica", "", 23, "", "", "", User.Gender.Female);

        Show gameThrones = new Show("Game of Thrones"); // The argument is the name of the TV Show
        Season gtSeason1 = new Season(1); // The argument is the number of the season

        gtSeason1.addFullSeason(createGotSeason1Episodes());
        gameThrones.addSeason(gtSeason1);

        // -----------------------
        // Implement here the code to make Angelica subscribes to Game of Thrones because is her favourite TV Show
        // Add your code here


        // -----------------------


        // New episode in season1
        Episode episodeExtra = new Episode(3000, "The making of Season 1"); // 3000 -> length of the episode in seconds(int), and Title of the episode
        gtSeason1.addEpisode(episodeExtra);

        // Because of the new episode added Angelica should receive a notification (for simplicity just print out the message in the console)

        // Fearing a leak of episodes HBO releases the whole season overnight
        System.out.println("------------- One year has passed -------------");
        Season gtSeason2 = new Season(2);
        gtSeason2.addFullSeason(createGotSeason2Episodes());
        gameThrones.addSeason(gtSeason2);

        // Because of the full season added Angelica should receive a whole set of notifications regarding season 2
    }


    public static ArrayList<Episode> createGotSeason1Episodes() {
        ArrayList<Episode> episodes = new ArrayList<>();

        Episode episode1 = new Episode(3600, "Winter is Coming");
        episodes.add(episode1);
        Episode episode2 = new Episode(3600, "The Kingsroad");
        episodes.add(episode2);
        Episode episode3 = new Episode(3600, "Lord Snow");
        episodes.add(episode3);
        Episode episode4 = new Episode(3600, "The wolf and the lion");
        episodes.add(episode4);
        Episode episode5 = new Episode(3600, "A Golden Crown");
        episodes.add(episode5);
        Episode episode6 = new Episode(3600, "You win or you die");
        episodes.add(episode6);
        Episode episode7 = new Episode(3600, "The pointy end");
        episodes.add(episode7);
        Episode episode8 = new Episode(3600, "Fire and blood");
        episodes.add(episode8);

        return episodes;
    }

    public static ArrayList<Episode> createGotSeason2Episodes() {
        ArrayList<Episode> episodes = new ArrayList<>();

        Episode episode1 = new Episode(3600, "The North remembers");
        episodes.add(episode1);
        Episode episode2 = new Episode(3600, "The Night Lands");
        episodes.add(episode2);
        Episode episode3 = new Episode(3600, "What is Dead May Never Die");
        episodes.add(episode3);
        Episode episode4 = new Episode(3600, "Garde of Bones");
        episodes.add(episode4);
        Episode episode5 = new Episode(3600, "The Ghost of Harrenhal");
        episodes.add(episode5);
        Episode episode6 = new Episode(3600, "The Old Gods and the New");
        episodes.add(episode6);
        Episode episode7 = new Episode(3600, "A Man Without Honor");
        episodes.add(episode7);
        Episode episode8 = new Episode(3600, "The Price of Winterfell");
        episodes.add(episode8);

        return episodes;
    }
}
