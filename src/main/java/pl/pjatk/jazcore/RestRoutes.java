package pl.pjatk.jazcore;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/homework")
public class RestRoutes {

    @GetMapping("/user/{username}")
    public ResponseEntity<User> getUserVar(@PathVariable String username) {
        return new ResponseEntity<>(new User(username), HttpStatus.OK);
    }
    @GetMapping("/user")
    public ResponseEntity<User> getUserParam(@RequestParam String username) {
        return new ResponseEntity<>(new User(username), HttpStatus.OK);
    }
    @PutMapping("/user/{username}")
    public ResponseEntity<User> putUserVar(@PathVariable String username) {
        return new ResponseEntity<>(new User(username), HttpStatus.OK);
    }
    @PutMapping("/user")
    public ResponseEntity<User> putUserBody(@RequestBody User u) {
        return new ResponseEntity<>(u, HttpStatus.OK);
    }
    @PostMapping("/user")
    public ResponseEntity<User> postUserBody(@RequestBody User u) {
        return new ResponseEntity<>(u, HttpStatus.OK);
    }
    @DeleteMapping("/user/{username}")
    public ResponseEntity<User> deleteUserVar(@PathVariable String username) {
        User u = new User(username);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}