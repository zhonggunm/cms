package springfive.cms.domain.resources;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import springfive.cms.domain.models.News;
import springfive.cms.domain.models.Review;
import springfive.cms.domain.service.NewsService;
import springfive.cms.domain.vo.NewsRequest;

@RestController
@RequestMapping("/api/news")
public class NewsResource {
  /*
  private final NewsService newsService;

  public NewsResource(NewsService newsService) {
    this.newsService = newsService;
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Mono<News>> findOne(@PathVariable("id") String id)
  {
    return ResponseEntity.ok(new Mono<News>());
  }

  @GetMapping
  public ResponseEntity<Flux<News>> findAll()
  {
    return ResponseEntity.ok(this.newsService.findAll());
  }

  @PostMapping
  public ResponseEntity<News> newNews(NewsRequest news){
    return new ResponseEntity<>(new News(), HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void removeNews(@PathVariable("id") String id){
  }

  @PutMapping("/{id}")
  public ResponseEntity<News> updateNews(@PathVariable("id") String id,NewsRequest news){
    return new ResponseEntity<>(new News(), HttpStatus.OK);
  }

  @GetMapping(value = "/{id}/review/{userId}")
  public ResponseEntity<Review> review(@PathVariable("id") String id,@PathVariable("userId") String userId){
    return ResponseEntity.ok(new Review());
  }

  @GetMapping(value = "/revised")
  public ResponseEntity<List<News>> revisedNews(){
    return ResponseEntity.ok(Arrays.asList(new News(),new News()));
  }
*/
}
