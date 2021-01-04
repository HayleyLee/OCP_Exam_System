package com.OCP_Practice_Exam.Service.Impl;

import com.OCP_Practice_Exam.DAO.OCPMapper;
import com.OCP_Practice_Exam.Entity.OCP;
import com.OCP_Practice_Exam.Entity.Score;
import com.OCP_Practice_Exam.Service.OCPService;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

@Service("OCP_Service")
public class OCPServiceImpl implements OCPService {
    @Resource
    private OCPMapper ocpMapper;

    @Override
    public JSONArray OCP_Exam() throws Exception {
        ArrayList<Object> resList = new ArrayList<>();
        ArrayList<OCP> tempList = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<OCP> list = ocpMapper.OCP_Exam();
        if(list.size()>0){
            resList.add("success");
            int max = list.size() - 1;
            for(int j=0;j<85;j++){
                int number = new Random().nextInt(max) + 1;
                if(nums.contains(number)){
                    --j;
                }
                else {
                    nums.add(number);
                }
            }
            for (Integer num : nums) {
                OCP ocp = list.get(num);
                ocp.setQuestion(ocp.getQuestion().replaceAll("\\\\g", "\n"));
                ocp.setOptionA(ocp.getOptionA().replaceAll("\\\\g", "\n"));
                ocp.setOptionB(ocp.getOptionB().replaceAll("\\\\g", "\n"));
                ocp.setOptionC(ocp.getOptionC().replaceAll("\\\\g", "\n"));
                ocp.setOptionD(ocp.getOptionD().replaceAll("\\\\g", "\n"));
                ocp.setAnswer(ocp.getAnswer().replaceAll("\\\\g", "\n"));
                tempList.add(ocp);
            }
            resList.add(tempList);
        }
        else{
            resList.add("error");
            throw new Exception("查询不到任何数据，请检查数据库");
        }
        return JSONArray.fromObject(resList);
    }

    @Override
    public JSONArray submitScore(Integer score) {
        ArrayList<String> list = new ArrayList<>();
        if(score>-1){
            String updateTime = LocalDateTime.now().toString();
            Integer res = ocpMapper.submitScore(new Score(0, score, updateTime));
            if(res>0){
                list.add("success");
            }
            else list.add("error");
        }
        else list.add("error");
        return JSONArray.fromObject(list);
    }

    @Override
    public JSONArray checkScore() {
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Score> resList = ocpMapper.check_score();
        if(resList.size()>0){
            list.add("success");
            list.add(resList);
        }
        else list.add("error");
        return JSONArray.fromObject(list);
    }

}
