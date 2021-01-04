package com.OCP_Practice_Exam.Entity;

public class Score {
    private Integer id;
    private Integer score;
    private String time;

    public Score(Integer id, Integer score, String time) {
        this.id = id;
        this.score = score;
        this.time = time;
    }

    public Score() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
