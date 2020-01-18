package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * tb_user
 * @author 
 */
@Data
public class TbUser implements Serializable {
    private Integer userId;

    private String username;

    private String password;

    private String name;

    private String sex;

    private String nickname;

    private String del;

    private String email;

    private String description;

    /**
     * 1表示管理员 0表示普通用户
     */
    private Integer isadmin;

    private static final long serialVersionUID = 1L;
}