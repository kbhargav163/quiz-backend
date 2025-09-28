package com.example.quiz.controller;

import com.example.quiz.model.Question;
import com.example.quiz.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
@CrossOrigin(origins = "http://localhost:3000")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public List<Question> getQuiz() {
        return quizService.getQuizQuestions();
    }
}
