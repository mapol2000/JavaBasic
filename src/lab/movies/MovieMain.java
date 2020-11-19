package lab.movies;

public class MovieMain {

    public static void main(String[] args) {

        String[] genre = {"Biography", "Crime", "Drama"};
        String[] dirtor = {"Steven Spielberg"};
        String[] actor = {"Leonardo DiCaprio", "Tom Hanks", "Christopher Walken"};
        String summary = "Barely 21 yet, Frank is a skilled forger who has passed as a doctor, lawyer and pilot. FBI agent Carl, becomes obsessed with tracking down the con man. But Frank not only eludes capture, he revels in the pursuit.";
        String desc = "A true story about Frank Abagnale Jr. who, before his 19th birthday, successfully conned millions of dollars worth of checks as a Pan Am pilot, doctor, and legal prosecutor. An FBI agent makes it his mission to put him behind bars. But Frank not only eludes capture, he revels in the pursuit.";

        Movie catchMeIfYouCan = new Movie("Catch Me If You Can", "2002", 141, "Steven Spielberg", genre, dirtor, actor, summary, desc);

        System.out.println(catchMeIfYouCan.getTitle());
        System.out.println(catchMeIfYouCan.getYear());
        System.out.println(catchMeIfYouCan.getRunTime());
        System.out.println(catchMeIfYouCan.getPrdtin());
        // 참조형 변수이므로 배열의 내용 대신
        // 내용이 저장된 위치가 출력: 바본묵으로 이용해서 처리
        for (int i = 0; i < genre.length; i++) {
            System.out.println(catchMeIfYouCan.getGenre()[i]);
        }
        for (int i = 0; i < dirtor.length; i++) {
            System.out.println(catchMeIfYouCan.getDirtor()[i]);
        }
        for (int i = 0; i < actor.length; i++) {
            System.out.println(catchMeIfYouCan.getActor()[i]);
        }
        System.out.println(catchMeIfYouCan.getSummary());
        System.out.println(catchMeIfYouCan.getDesc());

    }

}
