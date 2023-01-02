package jp.gihyo.projava.tasklist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@RestController
public class HomeRestController {

//    record TaskItem(String id, String task, String deadline, boolean done){}
//    private List<TaskItem> taskItems = new ArrayList<>();

    private static final Logger logger = LoggerFactory.getLogger(HomeRestController.class);

    @RequestMapping(value = "/resthello")
    String hello() {
        return """
                Hello.
                It works!
                現在時刻は%sです。
                """.formatted(LocalDateTime.now());
    }



//    @GetMapping("/tasklist")
//    String listItems() {
//        String result = taskItems.stream()
//                .map(TaskItem::toString)
//                .collect(Collectors.joining(","));
//        return result;
//    }
}
