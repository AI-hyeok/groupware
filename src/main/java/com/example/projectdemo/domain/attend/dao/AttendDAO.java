package com.example.projectdemo.domain.attend.dao;

import com.example.projectdemo.domain.attend.dto.AttendDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Repository
public class AttendDAO {

    @Autowired
    private SqlSession mybatis;

    public List<AttendDTO> selectByEmpId(int empId) {
        return mybatis.selectList("com.example.projectdemo.domain.attend.dao.AttendDAO.getAttendById", empId);
    }

    public List<AttendDTO> selectByEmpIdAndDate(int empId) {
        return mybatis.selectList("com.example.projectdemo.domain.attend.dao.AttendDAO.selectByEmpIdAndDate", empId);
    }

    public List<Map<String, Object>> getAttendanceStatisticsByYear(int empId) {
        return mybatis.selectList("com.example.projectdemo.domain.attend.dao.AttendDAO.getAttendanceStatisticsThisYear", empId);
    }

    // 총 근무 시간 조회
    public BigDecimal getTotalWorkHoursThisYear(int empId) {
        return mybatis.selectOne("com.example.projectdemo.domain.attend.dao.AttendDAO.selectTotalWorkHoursThisYear", empId);
    }

    // 근무 일수 조회
    public int getWorkDaysThisYear(int empId) {
        return mybatis.selectOne("com.example.projectdemo.domain.attend.dao.AttendDAO.selectWorkDaysThisYear", empId);
    }
    // 근무 일정 조회
    public List<Map<String, Object>> getWorkSchedules(int empId) {
        return mybatis.selectList("com.example.projectdemo.domain.attend.dao.AttendDAO.getWorkSchedules", empId);
    }

}
