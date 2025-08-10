package int_pkg;

class AudioPlayer implements Playable,Recordable{
	public void play() {
		System.out.println("AudioPlayer playing audio");
	}
	public void record() {
		System.out.println("AudioPlayer recording audio");
	}

}
class VideoPlayer implements Playable,Streamable{
	public void play() {
		System.out.println("VideoPlayer playing video");
	}
	public void stream() {
		System.out.println("VideoPlayer recording video");
	}

}
class Camera implements Recordable,Streamable{
	public void record() {
		System.out.println("Camera recording video");
	}
	public void stream() {
		System.out.println("Camera streaming live video");
	}
}

