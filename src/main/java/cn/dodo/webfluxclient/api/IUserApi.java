package cn.dodo.webfluxclient.api;

import cn.dodo.webfluxclient.bean.User;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import cn.dodo.webfluxclient._help.annotation.ApiServer;

@ApiServer("http://localhost:8080/user")
public interface IUserApi {

    @GetMapping("/")
    Flux<User> getAllUser();

    @GetMapping("/{id}")
    Mono<User> getUserById(@PathVariable("id") String id);

    @DeleteMapping("/{id}")
    Mono<Void> deleteUserById(@PathVariable("id") String id);

    @PostMapping("/")
    Mono<User> createUser(@RequestBody Mono<User> user);
}
