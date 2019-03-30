package day4_25march_111017_FS;

public class Player {
	private String name;
	private String country;
	private Skill skill;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	public Player() {
		super();
	}
	
	public Player(String name, String country, Skill skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	public String toString() {
		return String.format("%-15s %-15s %-15s", name, country, skill.toString());
	}
}

class Skill {
	private String skillName;
	
	public Skill(String skillName) {
		super();
		this.skillName = skillName;
	}

	public String getSkillName() {
		return skillName;
	}
	
	public String toString() {
		return String.format("%-15s", skillName);
	}
}