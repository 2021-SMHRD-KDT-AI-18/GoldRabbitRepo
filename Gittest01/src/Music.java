
public class Music {

	//class는 내가 저장하고 싶은 데이터를 저장할 수 있는 데이터 타입이다
		//
		private String singer; //가수
	    private	String title;//제목 
		private int time;//시간
		private String path; // 실제 노래 경로
		//생성자 특징
//		1.리턴타입이없다
//		2.클래스명과 동일하다
//		3.객체를 생성할때 한번만 호출된다

		
		public Music(String singer, String title, int time,String path) {

			this.singer = singer;
			this.title = title;
			this.time = time;
			this.path=path;
		}
		public void play() {
			mp3.play;
		}
		

		public void setPath(String path) {
			this.path = path;
		}

		public String  getPath() {
			return path;
		}


		public void setSinger(String singer) {
			this.singer =singer;
		}
			
			public String getSinger() {
				return singer;
			}
			
			
		     	
		
		
		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public int getTime() {
			return time;
		}


		public void setTime(int time) {
			this.time = time;
		}

	
}
