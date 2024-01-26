
import javazoom.jl.player.MP3Player;
import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import javazoom.jl.player.MP3Player;
public class MusicPlayer {

   public static void main(String[] args) {
      // 뮤직플레이어
      // 노래정보 - 가수(String), 제목(String), 시간초(int)
      // 노래객체 하나 생성해보기
      // 객체 = 레퍼런스 변수
      // 데이터타입 변수명 = new 데이터타입();

      // 노래정보를 ArrayList에 저장
      ArrayList<Music> list = new ArrayList<Music>();
      
      Music m2 = new Music("하이", "NO ONE", 180, "C:\\music_v2\\하이 - 하이.mp3");
      Music m1 = new Music("타자", " bad guy", 180, "C:\\music_v2\\타자 - 타자.mp3");
     

      list.add(m1);
      list.add(m2);
     
      
      
      Scanner sc = new Scanner(System.in);

      int point = 0; // 현재 노래 위치저장변수
      
      // mp3 파일을 실행해주는 객체
      MP3Player mp3 = new MP3Player();
      //mp3.play("C:\\music_v2\\Mena Massoud, Naomi Scott - A Whole New World.mp3");

      while (true) {
    	  mp3.play(list.get(point).getPath());
         System.out.print("1.목록 2.재생 3.이전곡 4.다음곡 5.종료 >> ");
         int menu = sc.nextInt();

          if (true) {
            System.out.println("====== 재생 ======");
            System.out.print(point + 1 + "." + list.get(point).getSinger() + "-");
            System.out.print(list.get(point).getTitle() + "(");
            System.out.println(list.get(point).getTime() + "초)");
            
            if(mp3.isPlaying()) {
               mp3.stop();
            }
            
            mp3.play(list.get(point).getPath());

         } else if (menu == 3) {

            if (point > 0) {
               point--;
               System.out.print(point + 1 + "." + list.get(point).getSinger() + "-");
               System.out.print(list.get(point).getTitle() + "(");
               System.out.println(list.get(point).getTime() + "초)");
            } else {
               System.out.println("이전곡이 없습니다.");
            }
            
            if(mp3.isPlaying()) {
               mp3.stop();
            }
            
            mp3.play(list.get(point).getPath());
            

         } else if (menu == 4) {
            System.out.println("====== 다음곡 ======");

            if (point < list.size() - 1) {
               point++;
               System.out.print(point + 1 + "." + list.get(point).getSinger() + "-");
               System.out.print(list.get(point).getTitle() + "(");
               System.out.println(list.get(point).getTime() + "초)");
            } else {
               System.out.println("다음곡이 없습니다.");
            }
            
            if(mp3.isPlaying()) {
               mp3.stop();
            }
            
            mp3.play(list.get(point).getPath());
            
            

         } else if (menu == 5) {
            System.out.println("프로그램을 종료합니다...");
            
            if(mp3.isPlaying()) {
               mp3.stop();
            }
            
            break;
        
         }

      }

   }

}