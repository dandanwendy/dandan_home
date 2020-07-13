package dandan.wendy.community.controller;

import dandan.wendy.community.dto.QuestionDTO;
import dandan.wendy.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;

   /* @Autowired
    private CommentService commentService;*/

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") int id, Model model) {

        QuestionDTO questionDTO = questionService.getById(id);

        model.addAttribute("question", questionDTO);

        //model.addAttribute("comments", comments);
        //model.addAttribute("relatedQuestions", relatedQuestions);

        return "question";
    }
}
