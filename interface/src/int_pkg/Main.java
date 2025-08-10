package int_pkg;

public class Main {

	public static void main(String[] args) {
		Playable audioplay = new AudioPlayer();
        Recordable audiorecord = new AudioPlayer();
        
        Playable videoplay = new VideoPlayer();
        Streamable videostream = new VideoPlayer();
  
        Recordable camerarecord = new Camera();
        Streamable camerastream = new Camera();
        
        audioplay.play();
        audiorecord.record();
        videoplay.play();
        videostream.stream();
        camerarecord.record();
        camerastream.stream();
	}

}
