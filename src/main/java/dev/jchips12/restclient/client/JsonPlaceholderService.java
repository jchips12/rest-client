package dev.jchips12.restclient.client;

import dev.jchips12.restclient.post.Post;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

public interface JsonPlaceholderService {

    @GetExchange("/posts")
    List<Post> readAll();

    @GetExchange("/posts/{id}")
    Post readById(@PathVariable Integer id);

    @PostExchange("/posts")
    Post create(@RequestBody Post post);

    @PutExchange("/posts/{id}")
    Post update(@PathVariable Integer id, @RequestBody Post post);

    @DeleteExchange("/posts/{id}")
    void delete(@PathVariable Integer id);
}
