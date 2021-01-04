package com.OCP_Practice_Exam.Service;

import net.sf.json.JSONArray;

public interface OCPService {
    JSONArray OCP_Exam() throws Exception;

    JSONArray submitScore(Integer score);

    JSONArray checkScore();
}
