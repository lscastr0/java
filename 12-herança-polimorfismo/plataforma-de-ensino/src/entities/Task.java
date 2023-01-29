package entities;

public class Task extends Lesson {

	private String description;
	private Integer questionCount;

	public Task() {

	}

	public Task(String title, String description, int questionCount) {
		super(title);
		this.description = description;
		this.questionCount = questionCount;
	}

	public String getDescription() {
		return description;
	}

	public Integer getQuestionCount() {
		return questionCount;
	}

	public Integer duration() {
		return questionCount * 5 * 60;
	}
}
