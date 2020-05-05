package com.zhy.bean;

/**
 * @ClassName: Emp
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/5 11:18
 * @Version: 1.0
 **/
public class Emp {
    private Integer empno;
    private String ename;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }


    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                '}';
    }
}
