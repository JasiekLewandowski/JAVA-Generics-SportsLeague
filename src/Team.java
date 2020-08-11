public abstract class Team<T> implements Comparable<Team<T>> {
    private String name;
    private int score;

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    @Override
    public int compareTo(Team<T> opponents) {
        if (this.score > opponents.getScore())
            return -1;
        else if (this.score == opponents.getScore())
            return 0;
        else
            return 1;
    }
}
