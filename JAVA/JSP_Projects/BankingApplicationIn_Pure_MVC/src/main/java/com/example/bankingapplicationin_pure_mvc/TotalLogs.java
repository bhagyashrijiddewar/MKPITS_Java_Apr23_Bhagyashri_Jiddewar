package com.example.bankingapplicationin_pure_mvc;

import java.sql.Timestamp;

public class TotalLogs {
    private String userId;
    private Timestamp logTime;
    private String taskDone;

    public TotalLogs() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Timestamp getLogTime() {
        return logTime;
    }

    public void setLogTime(Timestamp logTime) {
        this.logTime = logTime;
    }

    public String getTaskDone() {
        return taskDone;
    }

    public void setTaskDone(String taskDone) {
        this.taskDone = taskDone;
    }
}
