package entities;

public class Video extends Lesson {

	private String url;
	private Integer seconds;

	public Video() {
		super();
	}

	public Video(String title, String url, int seconds) {
		super(title);
		this.url = url;
		this.seconds = seconds;
	}

	public String getUrl() {
		return url;
	}

	public Integer getSeconds() {
		return seconds;
	}

	@Override
	public Integer duration() {
		return seconds;
	}
}
