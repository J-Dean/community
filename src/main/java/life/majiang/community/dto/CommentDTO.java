package life.majiang.community.dto;

import lombok.Data;

/**
 * Created by dean on 2019/8/17 14:28.
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
