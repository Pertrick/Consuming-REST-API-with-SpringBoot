package com.campipal.campipal;

import com.campipal.campipal.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PostController {

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    private String getPost(PostService postService, Model model){
        model.addAttribute("posts", postService.getPosts());
        //System.out.println(postService.getPosts());
       return  "index";
    }
}
