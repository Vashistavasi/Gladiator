package com.lti.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
@Entity
@NamedQuery(name = "fetch-all", query = "select e from Exam_Db as e")
public class Exam_dtb {
	
	
		@Id
		@GeneratedValue
		private int exam_id;
	    private String exam_name;
	    private int passing_score_level1;
	    private int passing_score_level2;
	    private int passing_score_level3;
	    private int duration_level1;
	    private int duration_level2;
	    private int duration_level3; 
	    public int getExam_id() {
			return exam_id;
		}
		public void setExam_id(int exam_id) {
			this.exam_id = exam_id;
		}
		public String getExam_name() {
			return exam_name;
		}
		public void setExam_name(String exam_name) {
			this.exam_name = exam_name;
		}
		public int getPassing_score_level1() {
			return passing_score_level1;
		}
		public void setPassing_score_level1(int passing_score_level1) {
			this.passing_score_level1 = passing_score_level1;
		}
		public int getPassing_score_level2() {
			return passing_score_level2;
		}
		public void setPassing_score_level2(int passing_score_level2) {
			this.passing_score_level2 = passing_score_level2;
		}
		public int getPassing_score_level3() {
			return passing_score_level3;
		}
		public void setPassing_score_level3(int passing_score_level3) {
			this.passing_score_level3 = passing_score_level3;
		}
		public int getDuration_level1() {
			return duration_level1;
		}
		public void setDuration_level1(int duration_level1) {
			this.duration_level1 = duration_level1;
		}
		public int getDuration_level2() {
			return duration_level2;
		}
		public void setDuration_level2(int duration_level2) {
			this.duration_level2 = duration_level2;
		}
		public int getDuration_level3() {
			return duration_level3;
		}
		public void setDuration_level3(int duration_level3) {
			this.duration_level3 = duration_level3;
		}
		
	}

