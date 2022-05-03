package com.hu.pojo;

public class c_course {
    private Integer id;
    private String name;
    private String hours;
    private String schools;
    private String coursepic;
//设置有参构造 alt+insert快捷键

    public c_course(Integer id, String name, String hours, String schools, String coursepic) {
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.schools = schools;
        this.coursepic = coursepic;
    }

//    设置无参构造，方法同上选择select none

    public c_course() {
    }
//    设置set方法 get方法 与to string方法


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHours() {
        return hours;
    }

    public String getSchools() {
        return schools;
    }

    public String getCoursepic() {
        return coursepic;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public void setSchools(String schools) {
        this.schools = schools;
    }

    public void setCoursepic(String coursepic) {
        this.coursepic = coursepic;
    }

    @Override
    public String toString() {
        return "c_course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hours='" + hours + '\'' +
                ", schools='" + schools + '\'' +
                ", coursepic='" + coursepic + '\'' +
                '}';
    }
}
