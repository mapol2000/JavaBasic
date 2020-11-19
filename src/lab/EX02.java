package lab;

public class EX02 {

    public static void main(String[] args) {
        Student std = new Student();
        System.out.println(std);
        System.out.println(std.name);
        System.out.println(std.address);
        System.out.println(std.birth);


       Movie movie = new Movie("Silence of Lambs", 1993, 90, "Paramount", "horror", "Kim", "Anthony Hopkins", "blahblah", "yeah yeah" );
        System.out.println(movie.title);
        System.out.println(movie.year);
        System.out.println(movie.min);
        System.out.println(movie.producer);
        System.out.println(movie.genre);
        System.out.println(movie.directors);
        System.out.println(movie.starrings);
        System.out.println(movie.plot);
    }

}
