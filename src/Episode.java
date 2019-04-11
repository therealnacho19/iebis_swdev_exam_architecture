public class Episode {

    public Episode(EpisodeBuilder episodeBuilder) {
    }

    public Episode(int i, String the_north_remembers) {
    }

    public static class EpisodeBuilder {
        int id;
        String episodeName;

        public EpisodeBuilder(int id, String episodeName) {
            this.id = id;
            this.episodeName = episodeName;
        }

        public Episode build() {

            return new Episode(this);
        }



    }

}
