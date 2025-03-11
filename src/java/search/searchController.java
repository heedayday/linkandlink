@Slf4j // 이것을 선언했으므로, 더는 logger를 new 해서 쓰지 않아도 된다.
@RestController
@RequestMapping("") // @RequestMapping("api")를 입력하면, http://[ip]:[port]/api 와 같이 url이 매핑된다.
public class searchController {

    @Autowired
    private BoardService boardService;
    //@ResponseBody
	/*
	 * 	@ResponseBody 를 사용하면 java 객체를 json으로 안바꿔줘도 됨. resp 객체에 직접 담을 일이 없음.
	@ResponseBody 를 이용하면 자바객체 그대로 반환하여 사용 가능.
	@Controller 대신 @RestController 를 쓰면 @ResponseBody를 선언하지 않아도 된다
	 * */

    //게시판 목록 불러오기
    @GetMapping(value = "/search")
    public String Search() {
        log.info("boardList == " + boardList);
        return "null";
    }

    /*//게시판 목록 불러오기
    @GetMapping(value = "/boardList", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<BoardDto>> boardList(Model model) {
        List<BoardDto> boardList = this.boardService.findAll();
        log.info("boardList == " + boardList);
        return new ResponseEntity<List<BoardDto>>(boardList, HttpStatus.OK);
    }*/
}