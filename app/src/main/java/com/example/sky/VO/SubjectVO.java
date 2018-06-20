package com.example.sky.VO;

import com.sky.util.Subjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sky on 05-Jul-15.
 */
public class SubjectVO implements Serializable {
    public ArrayList<String> subjectsList;

    public ArrayList<String> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(ArrayList<String> subjectsList) {
        this.subjectsList = subjectsList;
    }
}
