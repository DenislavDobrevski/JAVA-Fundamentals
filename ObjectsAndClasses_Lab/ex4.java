package ObjectsAndClasses_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int songsNumber = Integer.parseInt(scan.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < songsNumber; i++) {
            String[] data = scan.nextLine().split("_");
            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String typeList = scan.nextLine();

        if (typeList.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if(song.getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }
            }
        }

    }
}
