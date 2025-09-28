package com.example.quiz.service;

import com.example.quiz.model.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class QuizService {

    public List<Question> getQuizQuestions() {
        List<Question> quiz = new ArrayList<>();

        quiz.add(new Question(1, "What is an SLO?",
                List.of("Service Level Objective", "Service Log Output", "System Level Operation", "None"), "Service Level Objective"));

        quiz.add(new Question(2, "What does 'error budget' mean?",
                List.of("Allowed failures within SLA", "Budget for server costs", "Time for deployment", "Testing time"), "Allowed failures within SLA"));

        quiz.add(new Question(3, "Which tool is commonly used for monitoring?",
                List.of("Prometheus", "Docker", "Git", "Jenkins"), "Prometheus"));

        quiz.add(new Question(4, "What is an SLI?",
                List.of("Service Level Indicator", "System Log Info", "Server Latency Index", "Service Log Input"), "Service Level Indicator"));

        quiz.add(new Question(5, "What does 'blameless postmortem' mean?",
                List.of("No blame for incidents", "Team meeting", "Logging errors", "Automated rollback"), "No blame for incidents"));

        quiz.add(new Question(6, "Which of these is used for alerting?",
                List.of("Grafana Alerting", "GitHub Actions", "Jira", "Node.js"), "Grafana Alerting"));

        quiz.add(new Question(7, "What is chaos engineering?",
                List.of("Injecting failures to test resilience", "Stress testing CPU", "Code reviews", "Continuous integration"), "Injecting failures to test resilience"));

        quiz.add(new Question(8, "What does 'on-call rotation' mean?",
                List.of("Team responsible for incidents periodically", "Random assignment", "Automated deployments", "Code merging"), "Team responsible for incidents periodically"));

        quiz.add(new Question(9, "What is the purpose of a runbook?",
                List.of("Documented steps for operations", "Code style guide", "Meeting notes", "Database schema"), "Documented steps for operations"));

        quiz.add(new Question(10, "Which is a common incident metric?",
                List.of("MTTR (Mean Time to Recovery)", "CPU Usage", "Memory Leak", "Disk IO"), "MTTR (Mean Time to Recovery)"));

        // Shuffle options for each question
        for (Question q : quiz) {
            List<String> options = new ArrayList<>(q.getOptions());
            Collections.shuffle(options);

            // Keep track of correct answer after shuffling
            q.setOptions(options); // replace options
        }

        return quiz;
    }
}
