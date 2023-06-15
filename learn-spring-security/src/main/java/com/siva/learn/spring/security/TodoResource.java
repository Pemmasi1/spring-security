package com.siva.learn.spring.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {

    private static final List<Todo> TODO_LIST = List.of(new Todo("in28minutes", "Learn AWS"),
            new Todo("in28minutes", "Learn Java"));

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos() {
        return List.of(new Todo("in28minutes", "Learn AWS"),
        new Todo("in28minutes", "Learn Java"));
    }

    @GetMapping("/users/{username}/todos")
    public Todo retrieveAllTodosForin28minutes(@PathVariable String username) {
        return TODO_LIST.get(0);
    }

    @PostMapping("/users/{username}/todos")
    public void postTodo(@PathVariable String username, @RequestBody Todo todo) {
        logger.info("Creating {} fot this {}", todo, todo.userName);

    }


    record Todo (String userName, String description) {}
}