package springfive.cms.domain.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import springfive.cms.domain.models.Category;
import springfive.cms.domain.service.CategoryService;
import springfive.cms.domain.vo.CategoryRequest;

@RestController
//@RequestMapping("/api/category")
@RequestMapping("/category")
//@Api(tags = "category", description = "Category API")
public class CategoryResource {

  private final CategoryService categoryService;

  public CategoryResource(CategoryService categoryService) {
    this.categoryService = categoryService;
  }

  @GetMapping(value = "/{id}")
  /*
  @ApiOperation(value = "Find category",notes = "Find the Category by ID")
  @ApiResponses(value = {
      @ApiResponse(code = 200,message = "Category found"),
      @ApiResponse(code = 404,message = "Category not found"),
  })
   */
  public ResponseEntity<Mono<Category>> findOne(@PathVariable("id") String id){
    return ResponseEntity.ok(this.categoryService.findOne(id));
  }


  @GetMapping
  /*
  @ApiOperation(value = "List categories",notes = "List all categories")
  @ApiResponses(value = {
      @ApiResponse(code = 200,message = "Categories found"),
      @ApiResponse(code = 404,message = "Categories not found")
  })
  */
  public ResponseEntity<Flux<Category>> findAll(){
    return ResponseEntity.ok(this.categoryService.findAll());
  }


  @PostMapping
  /*
  @ApiOperation(value = "Create category",notes = "It permits to create a new category")
  @ApiResponses(value = {
      @ApiResponse(code = 201,message = "Category created successfully"),
      @ApiResponse(code = 400,message = "Invalid request")
  })

   */
  public ResponseEntity<Mono<Category>> newCategory(@RequestBody CategoryRequest category){
    return new ResponseEntity<>(this.categoryService.create(category), HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  /*
  @ResponseStatus(HttpStatus.NO_CONTENT)
  @ApiOperation(value = "Remove category",notes = "It permits to remove a category")
  @ApiResponses(value = {
      @ApiResponse(code = 200,message = "Category removed successfully"),
      @ApiResponse(code = 404,message = "Category not found")
  })
   */
  public void removeCategory(@PathVariable("id") String id){
    this.categoryService.delete(id);
  }

  @PutMapping("/{id}")
  /*
  @ResponseStatus(HttpStatus.NO_CONTENT)
  @ApiOperation(value = "Update category",notes = "It permits to update a category")
  @ApiResponses(value = {
      @ApiResponse(code = 200,message = "Category update successfully"),
      @ApiResponse(code = 404,message = "Category not found"),
      @ApiResponse(code = 400,message = "Invalid request")
  })
   */
  public ResponseEntity<Mono<Category>> updateCategory(@PathVariable("id") String id,CategoryRequest category){
    return new ResponseEntity<>(this.categoryService.update(id, category), HttpStatus.OK);
  }

}
