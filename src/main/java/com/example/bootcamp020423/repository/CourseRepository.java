package com.example.bootcamp020423.repository;

import com.example.bootcamp020423.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CourseRepository {
    private List<Course> courses = new ArrayList<>();

    private String csv = """
            1,Java Programming,Learn Java from scratch,John Doe,4.5,Java
            2,Python Basics,Introduction to Python,Emma Smith,4.0,Python
            3,Web Development,Master web development,Michael Johnson,4.8,Web Development
            4,Database Design,Database fundamentals,Sophia Lee,4.2,Database
            5,Data Science with Python,Learn data science,David Wang,4.6,Data Science
            6,Mobile App Development,Build mobile apps,Olivia Chen,4.4,Mobile Development
            7,Artificial Intelligence,Intro to AI,William Jones,4.7,Artificial Intelligence
            8,Front-end Web Development,HTML, CSS, JS basics,Ava Wilson,4.3,Front-end Development
            9,Backend Web Development,Server-side programming,James Brown,4.5,Backend Development
            10,UI/UX Design,Designing user interfaces,Emily Davis,4.1,UI/UX Design
            11,Agile Project Management,Scrum, Kanban, Agile methods,Daniel Thomas,4.2,Agile Project Management
            12,Software Testing,Quality assurance,Grace Lee,4.0,Software Testing
            13,Cloud Computing,Introduction to cloud computing,Lucas Martinez,4.3,Cloud Computing
            14,Network Security,Secure network communications,Ava Thompson,4.4,Network Security
            15,Data Visualization,Visualizing data,Leo Wilson,4.6,Data Visualization
            16,Machine Learning,Intro to ML,Julia Smith,4.7,Machine Learning
            17,Cybersecurity Fundamentals,Basics of cybersecurity,Oliver Johnson,4.2,Cybersecurity
            18,Blockchain Technology,Understanding blockchain,Chloe Davis,4.3,Blockchain
            19,DevOps Essentials,DevOps principles and practices,Leo Chen,4.5,DevOps
            20,Internet of Things (IoT),Introduction to IoT,Grace Wilson,4.0,Internet of Things
            21,Big Data Analytics,Analyzing large datasets,Thomas Moore,4.1,Big Data Analytics
            22,Cloud Native Development,Developing cloud-native apps,Natalie Harris,4.4,Cloud Native Development
            23,Embedded Systems,Designing embedded systems,Ethan Jackson,4.2,Embedded Systems
            24,Data Warehousing,Managing data warehouses,Lily Brown,4.3,Data Warehousing
            25,Software Architecture,Designing software systems,Oscar Martinez,4.5,Software Architecture
            26,Computer Networks,Understanding network protocols,Samantha Thompson,4.6,Computer Networks
            27,Full Stack Web Development,End-to-end web development,Liam Davis,4.7,Full Stack Development
            28,Data Engineering,Designing data pipelines,Nathan Wilson,4.2,Data Engineering
            29,Cloud Security,Securing cloud environments,Harper Johnson,4.3,Cloud Security
            30,Quantum Computing,Intro to quantum computing,Ella Smith,4.4,Quantum Computing
                """;

    public CourseRepository() {
        courses = csv.lines()
                .map(Course::new)
                .collect(Collectors.toList());
    }

    //        courses.add(new Course(101l,"Java", "Learn Java today", "Terry", 5.0f,"Java"));
//        courses.add(new Course(102l,"Perl", "Super old language - don't do it!", "Larry Wall", 2.0f,"language"));
//        courses.add(new Course(103l,"Swift", "iOS Anyone?", "Can't Recall", 5.0f,"iOS"));
//        courses.add(new Course(104l,"C++", "Just won't die will it?", "Stroustrup", 3.0f,"die"));
//        courses.add(new Course(105l,"Assembly Language", "Are you serious?", "Terry", 1.0f,"serious"));
//        courses.add(new Course(106l,"Javascript", "Taking over the world", "Some Guy", 4.0f,"taking"));


    public List<Course> getCourses() {
        return courses;
    }

    public List<Course> findByKeyword(String keyword) {
//    public List<Course> findByKeyword(String keyword, int page, int pageSize) {
        return courses.stream()
//                .skip(pageSize * page)
//                .limit(pageSize)
                .filter(c -> c.toString().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}
